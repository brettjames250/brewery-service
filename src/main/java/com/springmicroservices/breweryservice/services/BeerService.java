package com.springmicroservices.breweryservice.services;

import com.springmicroservices.breweryservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto addNewBeer(BeerDto beer);

    void updateBeer(UUID id, BeerDto beer);

    void deleteBeerById(UUID beerId);
}
