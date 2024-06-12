package com.scaler.demo.project.demoProd.controller;

import org.springframework.web.bind.annotation.*;

/*
*
*
*
* */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{from}/{to}")
    public String getUser(@PathVariable String from, @PathVariable String to) {
        return "Hello World from "+from+" to "+to;
    }
    @GetMapping()
    public String getUserByRequestParm(@RequestParam(name = "fromV") String from, @RequestParam(required = false,defaultValue = "world") String to){
        return "Hello World from "+from+" to "+to;
    }


}
