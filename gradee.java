package com.example.grade;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class gradee {
    ArrayList <String> gradee=new ArrayList<>();
    @GetMapping("/grade")
    public ArrayList getgrade(){
        return gradee;
    }
    @PostMapping("/grade")
    public String addgrade(@RequestBody String grade){
        gradee.add(grade);
        return "New grade added to the list";
    }
    @PutMapping("/grade/{index}")
      public String updategrade(@PathVariable int index,@RequestBody String grade){
        gradee.set(index,grade);
        return "grades updated";
    }
    @DeleteMapping("/grade/{index}")
    public String deletegrade(@PathVariable int index){
        gradee.remove(index);
        return "grade deleted from the list";
    }
            
}
