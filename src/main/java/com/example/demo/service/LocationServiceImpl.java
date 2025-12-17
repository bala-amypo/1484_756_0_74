package com.example.demo1.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo1.entity.LocationEntity;
import com.example.demo1.repository.LocationRepository;

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
}
