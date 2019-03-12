package Task2;

import java.util.Arrays;


/**
 * A model of the Football Team
 * @author Vladimir Bardadom
 * @verison 1.0 7/03/2019
 */

public class FootballTeam {
    
    /**
     * Surnames of the players
     */
    private String[] players;
    
    /**
     * Color of the football kit
     */
    private String color;
    
    /**
     * Goal difference
     */
    private int goal;
    
    /**
     * Whether the team is knocked out from Trophy Challange
     */
    private boolean knockedOut;

    /**
     * Default constructor for the football team
     */
    public FootballTeam() {
        players = new String[5];
        color = "red";
        goal = 0;
        knockedOut = false;
    }
    
    /**
     * Parametric constructor
     * @param aPlayers Players
     * @param aColor Color
     * @param aGoal Goal differrence
     * @param isKnockedOut If team still in the competition
     */
    public FootballTeam(String[] aPlayers, String aColor, int aGoal, boolean isKnockedOut){
        players = Arrays.copyOf(aPlayers,5);
        color = aColor;
        goal = aGoal;
        knockedOut = isKnockedOut;
    }

    //-------------------Getter Methods-------------------
    
    /**
     * Gets player surnames
     * @return Array of player surnames
     */
    public String getPlayers() {
        return Arrays.toString(players);
    }

    /**
     * Gets color of the football kit
     * @return Color of the football kit
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets goal difference
     * @return Goal difference
     */
    public int getGoal() {
        return goal;
    }

    /**
     * Gets the boolean if the team has been knocked out
     * @return true if team is knocked out and false if not
     */
    public boolean isKnockedOut() {
        return knockedOut;
    }

    //----------------------Setter Methods-----------------------
    
    /**
     * Sets color of the football kit
     * @param aColor Color of the football kit
     */
    public void setColor(String aColor) {
        color = aColor;
    }

    /**
     * Sets goal difference
     * @param aGoal Goal difference
     */
    public void setGoal(int aGoal) {
        goal = aGoal;
    }

    /**
     * Sets if the team was knocked out or not
     * @param aKnockedOut true if knocked out, false if not
     */
    public void setKnockedOut(boolean aKnockedOut) {
        knockedOut = aKnockedOut;
    }
    
    
    //--------------------Other Methods----------------------------
    
    /**
     * Adds player to the team
     * @param player Player you want to add
     * @return Array of the updated team
     */
    public String addPlayer(String player) {
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;
            }
            else {
               count++; 
            }
        }
        if (count == 5) {
            return "No more space to add players!";
        }
        else {
            return Arrays.toString(players);
        }
    }
    
    /**
     * Removes player from a team
     * @param index Index of the player
     * @return Message if the operatiomn was successful
     */
    public String removePlayer(int index) {
        if (players[index] == null) {
            return "There is nobody on that possition!";
        }
        else {
            players[index] = "not assigned";
            return "Removal was successful!";
        }
    }
    
    
    /**
     * Searches for a player in a team
     * @param Item Player's surname
     * @return true if found, false if not
     */
    public boolean searchItem(String Item) {
        boolean found = false;
        for (String player : players) {
            if (player.equals(Item)) {
                found = true;
            }
        }
        return found;
    }
    
    /**
     * Replaces one player with another
     * @param player Player you want to replace
     * @param newPlayer Player you want to add instead
     * @return Message of completion and new lineup of the team
     */
    public String replace(String player, String newPlayer) {
        boolean found = false;
        for (int i = 0; i < players.length; i++) {
            if (players[i].equals(player)) {
                players[i]= newPlayer;
                found = true;
            }
        }
        if (found = true) {
            return "Replacement successful! New lineup: " + Arrays.toString(players);
        }
        else {
            return "Player not found!";
        }
    }
    
    /**
     * Checks if team is still in the competition
     * @return Message if the team is still in the competition
     */
    public String competition() {
        if (knockedOut == true) {
            return "The team has been knocked out!";
        }
        else {
            return "The team is still going!";
        }
    }
    
    /**
     * toString method
     * @return Information in the fields
     */
    public String toString() {
        return "Team's lineup: " + getPlayers() + "\nColor of the football kit: " + getColor() + "\nCurrent goal difference: " + getGoal() + "\nStatus: " + competition();
    }
}