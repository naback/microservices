package org.pokedex.dataservice.controllers;

import org.pokedex.dataservice.openapi.CreatePokemonRequest;
import org.pokedex.dataservice.openapi.CreatePokemonResponse;
import org.pokedex.dataservice.openapi.PokemonApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PokemonController implements PokemonApi
{
    @Override
    public ResponseEntity<CreatePokemonResponse> getPokemon(String apiKey, CreatePokemonRequest createPokemonRequest)
    {
        return PokemonApi.super.getPokemon(apiKey, createPokemonRequest);
    }


}
