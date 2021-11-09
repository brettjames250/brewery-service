package com.springmicroservices.breweryservice.services;

import com.springmicroservices.breweryservice.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Milk Stout")
                .beerStyle("Dark")
                .build();
    }

    @Override
    public BeerDto addNewBeer(BeerDto beer) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Lawless")
                .beerStyle("Light")
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beer) {
     // TODO Implement this
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer....");
    }
}
