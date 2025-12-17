import java.util.*;
package com.example.demo1.service;

import com.example.demo1.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity location)

    List<LocationEntity> getalllocation();

    
}
