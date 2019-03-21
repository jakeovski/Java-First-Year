/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notebook;
import java.util.*;
/**
 *A model of a notebook
 * @author Pierre
 * @version 1.0 23/03/2019
 */
public class Notebook {
    
    /**
     * Notes
     */
    private ArrayList<String> notes;
    
    /**
     * Default constructor
     */
    public Notebook() {
        notes = new ArrayList<>();
    }
    
    //--------Getter------------

    /**
     * Gets the ArrayList
     * @return ArrayList
     */
    public ArrayList<String> getNotes() {
        return notes;
    }
    
    //---------Other-----------
    
    /**
     * Adds a note to an arraylist
     * @param note Note to be added
     */
    public void addNote(String note) {
        notes.add(note);
    }
    
    /**
     * Removes a note based on its index
     * @param i index of the note to be removed
     */
    public void removeNote(int i) {
        if ( i < 0 || i > notes.size()) {
            System.out.println("Error! The index you have entered is incorrect");
        }
        else {
            notes.remove(i);
        }
    }
    
    /**
     * toString method
     * @return Information in the current arraylist
     */
    public String listNotes(){
        String output = "Current notes:\n";
        int i = 0;
        for(String note : notes) {
            output +=  i + " : " + note + "\n";
            i++;
        }
        return output;
    }
    
    /**
     * Prints out a note based on its index
     * @param i index of the note to be printed
     * @return Note based on its index
     */
    public String showNote(int i) {
        if (i < 0 || i > notes.size()){
            return "Error! The index you have entered is incorrect!";
        }
        else {
            return notes.get(i);
        }
    }
    
    /**
     * Searches through the entire list and prints out all the occurances
     * @param str Search term
     */
    public void fullSearch(String str) {
        int count = 0;
        int i = 0;
        for (String note : notes ) {
            if (note.equals(str)) {
                System.out.println( i + " : " + note);
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("Search term is not found");
        }
    }
    
    /**
     * Searches through the list and prints out the first occurance
     * @param str Seacrh term
     */
    public void searchForString(String str) {
        boolean found = false;
        int index = 0;
        int i = 0;
        while(found == false && index != notes.size() ) {
            if (notes.get(index) == str) {
                System.out.println("First occurance:\n" + index + " : " + notes.get(index));
                found = true;
            }
            index++;       
        }
        if (found == false) {
            System.out.println("Search term is not found!");
        }
    }
}
