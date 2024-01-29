package org.example.entity;

import org.example.exception.NotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Town {

    private List<String> towns;
    private String townSearched;

    public Town(){
        towns = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver",
                "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong",
                "Dubaï", "Rome", "Istanbul");
    }

    public List <String>findTown(String args) throws NotFoundException {

        if (args.length() < 2){
            throw new NotFoundException("Your search must contains 2 char min");
        }


        List<String> result = new ArrayList<>();



        return result;
    }

    public List<String> getTowns() {
        return towns;
    }

    public void setTowns(List<String> towns) {
        this.towns = towns;
    }

    public String getTownSearched() {
        return townSearched;
    }

    public void setTownSearched(String townSearched) {
        this.townSearched = Arrays.toString(new String[]{townSearched});
    }
}
