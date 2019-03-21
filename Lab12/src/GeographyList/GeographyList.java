package GeographyList;


import java.util.*;

/**
 * A model of the geography list
 * @author Vladimir Bardadom
 * @version 1.0 21/03/2019
 */

public class GeographyList {
    /**
     * Countries
     */
    private ArrayList<String> countries;
    
    /**
     * Default constructor
     */
    public GeographyList(){
        countries = new ArrayList<>();
    }
    
    //--------Getters---------------

    /**
     * Gets an array list of countris
     * @return ArrayList of countries
     */
    public ArrayList<String> getCountries() {
        return countries;
    }
    
    
    //---------Other----------------
    
    /**
     * Adds country to an arrayList
     * @param country Country you want to add
     */
    public void addCountry(String country) {
        countries.add(country);
    }
    
    /**
     * toString method
     * @return Info in the fields
     */
    public String toString(){
        String output = "List of countries:\n";
        for(String country : countries) {
            output += country + "\n";
        }
        return output;
    }
    
    /**
     * Removes duplicates from list of countries
     */
    public void removeDuplicates() {
        for (int i = 0; i < countries.size(); i++) {
            for (int y = i + 1; y < countries.size(); y++) {
                if(countries.get(i) == countries.get(y)) {
                    countries.remove(y);
                }
            }
        }
    }
    
    /**
     * Sorts the arraylist in alphabetic order
     */
    public void alphabet(){
        Collections.sort(countries);
    }
    
    /**
     * Removes the initial and the final entry
     */
    public void removeTwo() {
        countries.remove(0);
        countries.remove(countries.size() - 1);
    }
    
    /**
     * Adds two countries instead of the removed ones
     * @param country Country to add
     * @param country1 Country to add
     */
    public void replaceTwo(String country, String country1) {
        removeTwo();
        countries.add(0, country);
        countries.add(countries.size(), country1);
    }
    
    /**
     * Puts the list into reverse alphabetic order
     */
    public void reverseOrder() {
        Collections.sort(countries);
        Collections.reverse(countries);
    }
}