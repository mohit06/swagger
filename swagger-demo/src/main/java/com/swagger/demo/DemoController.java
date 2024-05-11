package com.swagger.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("home");
    }

    @PostMapping("/home")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> home(@RequestBody String str){
        return ResponseEntity.ok(str);
    }
}
