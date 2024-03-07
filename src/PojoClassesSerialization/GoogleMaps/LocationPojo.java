package PojoClassesSerialization.GoogleMaps;

public class LocationPojo {
	
	public double lat;
	public double lon;
	
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	@Override
	public String toString() {
		return "LocationPojo [lat=" + lat + ", lon=" + lon + "]";
	}
	
	
	
	
	

}
