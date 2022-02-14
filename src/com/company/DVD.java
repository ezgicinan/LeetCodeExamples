package com.company;

// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }



    public static void main(String[] args) {
        // write your code here
        // The actual code for creating an Array to hold DVD's.
        DVD[] dvdCollection = new DVD[1];
        dvdCollection[0] = new DVD("Harry Potter and Goblet of Fire", 2005, "David Yates");
        dvdCollection[0].toString();

    }
}