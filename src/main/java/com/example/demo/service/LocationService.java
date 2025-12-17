import java.util.*;
package com.example.demo.service;

import com.example.demo.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity location);

    List<LocationEntity> getalllocation();

    
}
