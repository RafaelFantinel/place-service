package br.com.rafaelfantinel.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.rafaelfantinel.placeservice.domain.PlaceRepository;
import br.com.rafaelfantinel.placeservice.domain.PlaceService;


@Configuration  
@EnableR2dbcAuditing
public class PlaceServiceConfig {
  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }
} 

