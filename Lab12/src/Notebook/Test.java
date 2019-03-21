/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notebook;

/**
 * Test class for Notebook class
 * @author Pierre
 * @version 1.0 23/03/2019
 */
public class Test {
    
    public static void main(String[] args) {
        
        //Creating an instance
        Notebook book1 = new Notebook();
        
        //Test for addNote() method
        book1.addNote("Breakfast");
        book1.addNote("Lunch");
        book1.addNote("University");
        book1.addNote("Gym");
        book1.addNote("Drawing");
        book1.addNote("Music");
        book1.addNote("Play a game");
        book1.addNote("Gym");
        book1.addNote("Music");
        
        //Test for toString method
        System.out.println(book1.listNotes());
        
        //Test for removeNote() method
        book1.removeNote(6);
        System.out.println(book1.listNotes());
        
        //Test for show note method
        System.out.println(book1.showNote(3));
        
        //Test for fullSearch() method
        book1.fullSearch("Music");
        
        //Test for SearchForString() method
        book1.searchForString("Gym");
    }
}
