package org.pokedex.dataservice.controllers;

import org.pokedex.dataservice.openapi.PingApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PingController implements PingApi
{
    @Override
    public ResponseEntity<String> ping()
    {
        return ResponseEntity.ok("i'm alive");
    }
}
