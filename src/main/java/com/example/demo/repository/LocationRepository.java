package com.example.demo1.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Long>{
    
}
