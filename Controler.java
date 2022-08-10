package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @RequestMapping(path = "/hey",method= RequestMethod.GET)
    public String getHey(){
        return "HEY FROM SPRING";

    }

    @RequestMapping(path ="/bye",method =RequestMethod.GET )
    public String getBye(){
        return "BYE";
    }
    @RequestMapping(path ="/check/status",method = RequestMethod.GET)
    public String check(){
        return "Everything OK !";
    }
    @RequestMapping(path="helth",method = RequestMethod.GET)
    public String helth(){
        return "server health is up and running";
    }
}
