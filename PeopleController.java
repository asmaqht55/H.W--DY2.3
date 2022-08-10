package com.example.createperson;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {
    ArrayList pepole = new ArrayList<>();

    @GetMapping("/pepole")
    public ArrayList getuser() {
        return pepole;
    }

    @PostMapping("/people")
    public String addUser(@RequestBody String peoples) {
        pepole.add(peoples);
        return "New Name added to the list";
    }

    @PutMapping("/people/{index}")
    public String updateUser(@PathVariable int index, @RequestBody String name) {
        pepole.set(index, name);
        return "list updated";
    }

    @DeleteMapping("/people/{index}")
    public String deleteuser(@PathVariable int index) {
        pepole.remove(index);
        return "name deleted from the list";

    }
}
