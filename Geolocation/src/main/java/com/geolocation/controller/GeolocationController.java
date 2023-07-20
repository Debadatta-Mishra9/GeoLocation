package com.geolocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geolocation.model.Location;
import com.geolocation.service.GeolocationService;

@RestController
@RequestMapping("/geolocation")
public class GeolocationController {

	@Autowired
	private GeolocationService geolocationService;
	
	@GetMapping("/{cityName}")
    public ResponseEntity<Location> getGeolocationByCityName(@PathVariable String cityName) {
        Location location = geolocationService.getCitylocationData(cityName);
        return new ResponseEntity<Location>(location, HttpStatus.OK);
    }
	
	@PostMapping
    public ResponseEntity<Location> saveCityDetails(@RequestBody Location location) {
        Location savedlocation = geolocationService.saveCityDetails(location);
        return new ResponseEntity<Location>(savedlocation, HttpStatus.CREATED);
    }
	
}
