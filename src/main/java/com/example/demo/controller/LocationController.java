package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.LocationEntity;
import com.example.demo1.service.LocationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class LocationController {
    @Autowired
    LocationService locationService;
    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le) {
        
        
        return locationService.createlocation(le);
    }
    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationService.getalllocation();
    }
    
    
}
