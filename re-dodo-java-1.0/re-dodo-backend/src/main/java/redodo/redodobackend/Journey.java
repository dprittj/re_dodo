package redodo.redodobackend;

import java.util.Map;

public class Journey {
//    change class to "JourneyChoices" (to separate from a likely later class that builds a sepcific journey from the broader choice selections)?

//    fields
    int coords;
    int radius;
    Map<String> interests;
    int cost;
    int stops;

//    constructors

    public Journey (int aCoords, int aRadius, Map<String> aInterests, int aCost, int aStops) {
        this.coords = aCoords;
        this.radius = aRadius;
        this.interests = aInterests;
        this.cost = aCost;
        this.stops = aStops;
    }

    public Journey() {

    }


}
