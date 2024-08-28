package com.systemerr.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetSMPResource {
    @GetMapping("/petsmp/howtoplay")
    public String howToPlay() {
        return "This is testing\ntesting";
    }
}
