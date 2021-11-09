package com.springmicroservices.breweryservice.services.v2;

import com.springmicroservices.breweryservice.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 addNewBeer(BeerDtoV2 beer);

    void updateBeer(UUID beerId, BeerDtoV2 beer);

    void deleteBeerById(UUID beerId);
}
