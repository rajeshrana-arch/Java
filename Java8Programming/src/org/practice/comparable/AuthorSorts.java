package org.practice.comparable;
import java.util.ArrayList;
import java.util.Collections;

class Country implements Comparable<Country> {
    private String name;
    private int population;
    Country(String name, int population) {
        this.name=name;
        this.population=population;
    }
    @Override
    public String toString() {
        return "CountryName:" + this.name + " Population:" + this.population;
    }

    @Override
    public int compareTo(Country o) {
        if(this.population==o.population)
            return 1;
        if(this.population > o.population)
            return 1;
        else
            return -1;
    }
}

class Author implements Comparable<Author >{
    String firstName;
    String lastName;
    String bookName;
    Author(String first, String last, String book){
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }

    @Override
    public int compareTo(Author o) {
        int last = this.lastName.compareTo(o.lastName);
        return last==0 ? this.firstName.compareTo(o.firstName):last;
    }
    @Override
    public String toString() {
        return "FirstName:" + this.firstName + " LastName:" + this.lastName + " BookName:" + this.bookName;
    }
}

public class AuthorSorts {
    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("Henry","EMiller", "Tropic of Cancer"));
        authors.add(new Author("Nalo","DHopkinson", "Brown Girl in the Ring"));
        authors.add(new Author("Frank","CMiller", "300"));
        authors.add(new Author("Deborah","BHopkinson", "Sky Boys"));
        authors.add(new Author("George R. R.","AMartin", "Song of Ice and Fire"));
        Collections.sort(authors);
        for(Author au:authors) {
            System.out.println(au);
        }
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("India", 5000));
        countries.add(new Country("USA", 1000));
        countries.add(new Country("RUSSIA", 1000));
        countries.add(new Country("CHINA", 500));
        countries.add(new Country("JAPAN", 200));
        countries.add(new Country("NEPAL", 100));
        Collections.sort(countries);
        for(Country country: countries) {
            System.out.println(country);
        }
        Collections.reverse(countries);
        for(Country country: countries) {
            System.out.println(country);
        }

    }
}