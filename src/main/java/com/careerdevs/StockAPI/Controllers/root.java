package com.careerdevs.StockAPI.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {

    @GetMapping("/")
    public ResponseEntity<?> rootRoute(){
        //return new ResponseEntity<>("Root Route", HttpStatus.OK);
        return ResponseEntity.ok("Root Route");
    }

}
