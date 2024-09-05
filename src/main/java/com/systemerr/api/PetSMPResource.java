package com.systemerr.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetSMPResource {
//    private List<String> players = List.of("SYSTEM_ERR_05", "SYSTEM_ERR_06");
//    private Map<String, String> pets = Map.of("SYSTEM_ERR_05", "(1) Test");

    @GetMapping("/petsmp/howtoplay")
    public String howToPlay() {
        return """
                - The PetSMP revolves around pets, animals you can find and tame!
                - These animals grant you Special Effects
                - Pets have a 10% spawn rate. That means for every 10 pets that are attempted to spawn, only one of them will spawn!
                - Whereupon moving 10 blocks away from the player, a Pet will teleport to your previously penultimate block. Essentially, moving 10 blocks away makes a pet teleport to you.""";
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
