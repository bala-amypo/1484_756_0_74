package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;


public class LocationServiceImpl implements LocationService{
    @Autowired
    LocationRepository LocationRepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return LocationRepo.save(le);

    }
    public List<LocationEntity> getall(){
        return LocationRepo.findAll();
    }
    @Override
    public List<LocationEntity> getalllocation() {
        throw new UnsupportedOperationException("Unimplemented method 'getalllocation'");
    }
}
