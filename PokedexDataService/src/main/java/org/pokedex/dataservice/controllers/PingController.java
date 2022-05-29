package org.pokedex.dataservice.controllers;

import org.pokedex.dataservice.openapi.PingApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PingController implements PingApi
{
    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @Override
    public ResponseEntity<String> ping()
    {
        log.info("people are testing me");
        return ResponseEntity.ok("i'm alive");
    }
}
