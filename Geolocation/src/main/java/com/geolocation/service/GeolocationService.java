package com.geolocation.service;

import org.springframework.stereotype.Service;

import com.geolocation.model.Location;

@Service
public interface GeolocationService {

	public Location saveCityDetails(Location location);
	
	public Location getCitylocationData(String city);
}
