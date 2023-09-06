package br.com.rafaelfantinel.placeservice.web;

import br.com.rafaelfantinel.placeservice.api.PlaceResponse;
import br.com.rafaelfantinel.placeservice.domain.Place;

public class PlaceMapper {
  public static PlaceResponse fromPlaceToResponse(Place place) {
    return new PlaceResponse(place.name(),place.slug(), place.state(), 
        place.createdAt(), place.updatedAt());
  }
  
}
