package GeographyList;

import java.util.Arrays;


/**
 * A test class for the GeographyList class
 * @author Vladimir Bardadom
 * @verison 1.0 23/03/2019
 */

public class Test{
    
    public static void main(String[] args) {
        
        /**
         * Creating instance
         */
        GeographyList list = new GeographyList();
        
        //addCountry test
        list.addCountry("Estonia");
        list.addCountry("Estonia");
        list.addCountry("Latvia");
        list.addCountry("Cyprus");
        list.addCountry("Latvia");
        list.addCountry("Cyprus");
        list.addCountry("Russia");
        
        //Testing toString method
        System.out.println(list.toString());
        
        //Test for getter
        //System.out.println(list.getCountries());
        
        //RemoveDuplicates test
        list.removeDuplicates();
        System.out.println(list.toString());
        
        //Test for alphabet() method
        list.alphabet();
        System.out.println(list.toString());
        
        //Test for removeTwo() method
        list.replaceTwo("Russia", "USA");
        System.out.println(list.toString());
        
        //Test for reverseOrder() method
        list.reverseOrder();
        System.out.println(list.toString());
    }
}