package com.geolocation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geolocation.model.Location;

@Repository
public interface GeolocationRepository extends JpaRepository<Location, Integer>{
	
	

}
