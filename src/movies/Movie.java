package movies;

import util.Input;

public class Movie {
    private String name;//this will change so dont make it static?
    private String category;

    //constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " -- " + category;
    }

    //accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
