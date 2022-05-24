package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class AnimalGroupName {

    private final Map<String, String> animals = new HashMap<>();

    public AnimalGroupName() {
        getAnimals().put("rhino", "Crash");
        getAnimals().put("giraffe", "Tower");
        getAnimals().put("elephant", "Herd");
        getAnimals().put("lion", "Pride");
        getAnimals().put("crow", "Murder");
        getAnimals().put("pigeon", "Kit");
        getAnimals().put("flamingo", "Pat");
        getAnimals().put("deer", "Herd");
        getAnimals().put("dog", "Pack");
        getAnimals().put("crocodile", "Float");
    }

    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "Herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * GetHerd("giraffe") → "Tower"
     * GetHerd("") -> "unknown"
     * GetHerd("walrus") -> "unknown"
     * GetHerd("Rhino") -> "Crash"
     * GetHerd("rhino") -> "Crash"
     * GetHerd("elephants") -> "unknown"
     *
     */
    public String getHerd(String animalName) {

        if (animalName != null && getAnimals().containsKey(animalName.toLowerCase())) {
            return getAnimals().get(animalName.toLowerCase());
        } else {
            return "unknown";
        }

        // this is an easier way of doing what we did above
        //return animals.getOrDefault(animalName.toLowerCase(),"unknown");
    }

    public Map<String, String> getAnimals() {
        return animals;
    }
}
