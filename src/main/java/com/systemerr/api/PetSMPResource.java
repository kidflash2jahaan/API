package com.systemerr.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetSMPResource {
//    private List<String> players = List.of("SYSTEM_ERR_05", "SYSTEM_ERR_06");
//    private Map<String, String> pets = Map.of("SYSTEM_ERR_05", "(1) Test");

    @GetMapping("/petsmp/howtoplay")
    public String howToPlay() {
        return "This is howtoplay\ntesting";
    }

//    @GetMapping("/petsmp/pets/{username}")
//    public String getPets(@PathVariable String username) {
//        return Objects.requireNonNullElse(pets.get(username), "This player does not have any pets!");
//    }
//
//    @PostMapping("/petsmp/pets")
//    public void setPets(@RequestBody Map<String, String> update) {
//        pets = update;
//    }
//
//    @GetMapping("/petsmp/players")
//    public List<String> getPlayers() {
//        return players;
//    }
//
//    @PostMapping("/petsmp/players")
//    public void setPlayers(@RequestBody List<String> update) {
//        players = update;
//    }
}
