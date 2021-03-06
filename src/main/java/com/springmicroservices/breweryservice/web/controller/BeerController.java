package com.springmicroservices.breweryservice.web.controller;

import com.springmicroservices.breweryservice.services.BeerService;
import com.springmicroservices.breweryservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/*
"v1" is the API version
- v1 first release
- v2 - second release, notify customers when v1 is deprecated
- v3 - remove v1, notify v2 is deprecated

Semantic versioning
MAJOR - major breaking changes
MINOR - new features / backwards compatible code
PATCH - bug fixes typically

URLs tend to only referene MAJOR versions e.g v1
 */

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}") // GET - beer by id
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping() // POST - create new beer
    public ResponseEntity addBeer(@RequestBody BeerDto beer){
        BeerDto newBeer = beerService.addNewBeer(beer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + newBeer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beer){
        beerService.updateBeer(beerId, beer);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteBeerById(beerId);
    }
}
