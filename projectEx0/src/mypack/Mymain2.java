package mypack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;


public class Mymain2 {

public static double distance(double lat1, double lon1, double lat2, double lon2) {
		
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		return dist * 60 * 1.1515 * 1.609344;
	}
	
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
	
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	public static void main(String[] args)  throws DataException{
		
		Csv Ariel=new Csv("C:\\Users\\Rachel Plaksin\\Desktop\\Ariel");
		Ariel.writescan("take2");
		Tokml kml=new Tokml("take2.csv");
        kml.CreateKmlByFilter("circle");
	}
}


