
package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity location);

    List<LocationEntity> getalllocation();

    
}
