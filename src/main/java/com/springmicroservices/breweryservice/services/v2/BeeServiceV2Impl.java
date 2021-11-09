package com.springmicroservices.breweryservice.services.v2;

import com.springmicroservices.breweryservice.web.model.BeerDto;
import com.springmicroservices.breweryservice.web.model.v2.BeerDtoV2;
import com.springmicroservices.breweryservice.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeeServiceV2Impl implements BeerServiceV2{

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerStyle(BeerStyleEnum.AMBER)
                .build();
    }

    @Override
    public BeerDtoV2 addNewBeer(BeerDtoV2 beer) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName(beer.getBeerName())
                .beerStyle(beer.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beer) {
        // TODO Implement this
        log.debug("Updating a beer....");
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer....");
    }
}
