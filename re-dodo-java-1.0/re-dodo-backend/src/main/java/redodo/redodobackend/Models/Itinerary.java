package redodo.redodobackend.Models;

import java.util.Calendar;
import java.util.Set;

public class Itinerary {

    private static int id;

    private static User user;

    private static String currentLocation;

    private static String title;

    private static Set<Interest> appliedInterests;

    private static Set<Place> appliedPlaces;

    private static Calendar dayTime;


    public Itinerary() {
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Itinerary.user = user;
    }

    public static String getCurrentLocation() {
        return currentLocation;
    }

    public static void setCurrentLocation(String currentLocation) {
        Itinerary.currentLocation = currentLocation;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Itinerary.title = title;
    }

    public static Set<Interest> getAppliedInterests() {
        return appliedInterests;
    }

    public static void setAppliedInterests(Set<Interest> appliedInterests) {
        Itinerary.appliedInterests = appliedInterests;
    }

    public static Set<Place> getAppliedPlaces() {
        return appliedPlaces;
    }

    public static void setAppliedPlaces(Set<Place> appliedPlaces) {
        Itinerary.appliedPlaces = appliedPlaces;
    }

    public static Calendar getDayTime() {
        return dayTime;
    }

    public static void setDayTime(Calendar dayTime) {
        Itinerary.dayTime = dayTime;
    }
}
