package com.example.testproject.model;

public class Cards {

    private String Id;
    private String Name;
    private String Flavor;
    private String Artist;

    public Cards() {
    }

    public Cards(String id, String name, String flavor, String artist) {
        Id = id;
        Name = name;
        Flavor = flavor;
        Artist = artist;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getFlavor() {
        return Flavor;
    }

    public String getArtist() {
        return Artist;
    }


    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setFlavor(String flavor) {
        Flavor = flavor;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }
}
