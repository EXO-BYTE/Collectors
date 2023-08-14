package com.collector;

public class Location {
    private String locationName;
    private String state;
    
    
	public Location(String locationName, String state) {
		super();
		this.locationName = locationName;
		this.state = state;
	}
	public Location() {
		
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
    
}