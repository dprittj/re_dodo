package redodo.redodobackend.Models;

import java.util.Set;

public class Place {

    private static int id;

    private static String name;

    private static String costRange;
//    using "$", "$$", etc. as the range estimates?

    private static boolean nowOpen;

    private static String location;

    private static Set<Interest> interestTags;

    public Place(){

    }

//    no setters are written for class as the information will be provided via GoogleMapsAPI

    public static Integer getId(){
        return id;
    }

    public static String getName(){
        return name;
    }

    public static String getCostRange(){
        return costRange;
    }

    public static boolean getNowOpen(){
        return nowOpen;
    }

    public static String getLocation(){
        return location;
    }


}
