package com.geolocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.geolocation.model.Location;
import com.geolocation.repo.GeolocationRepository;
@Service
public class GeolocationServiceImpl implements GeolocationService{
	
	@Autowired
	GeolocationRepository geolocationRepository;
	@Value("${google.geolocation.api.key}")
    private String apiKey;

	@Override
	public Location saveCityDetails(Location location) {
		
		Location savedLocation = geolocationRepository.save(location);
		
		return savedLocation;
	}
	

	@Override
    public Location getCitylocationData(String city) {
        String apiUrl = "https://maps.googleapis.com/maps/api/geocode/json?address=" + city + "&key=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        Location cityLocation = restTemplate.getForObject(apiUrl, Location.class);
        return cityLocation;

}
}
