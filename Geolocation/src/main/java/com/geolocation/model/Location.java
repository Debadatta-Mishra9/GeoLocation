package com.geolocation.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cityId;
	
	@NotNull
	private String cityName;
	@NotNull
	private Double latitude;
	@NotNull
	private Double longitude;
	@NotNull
	private Double elevation;
	public Location() {	}
	public Location(String cityName, Double latitude, Double longitude, Double elevation) {
		this.cityName = cityName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
	}
	
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getElevation() {
		return elevation;
	}
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	@Override
	public String toString() {
		return "Location [cityId=" + cityId + ", cityName=" + cityName + ", latitude=" + latitude + ", longitude="
				+ longitude + ", elevation=" + elevation + "]";
	}
	

}
