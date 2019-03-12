package Task2;


/**
 * Test Class for FootballTeam class
 * @author Vladimir Bardadom
 * @version 1.0 07/03/2019
 */

public class TestClass {
    
    public static void main(String[] args) {
        
        //Creating an instance of FootballTeam
        FootballTeam team1 = new FootballTeam(new String[] {"Dolboeb", "Dolboeb2 "},"red", 2, true);
        
        //Test or getters
        System.out.println("Lineup: " + team1.getPlayers());
        System.out.println("Color of the kit: " + team1.getColor());
        System.out.println("Goal difference: " + team1.getGoal());
        System.out.println("Knocked Out? : " + team1.isKnockedOut());
        
        //Test the setters
        team1.setColor("Bright red");
        System.out.println("Color of the kit: " + team1.getColor());
        team1.setGoal(3);
        System.out.println("Goal difference: " + team1.getGoal());
        team1.setKnockedOut(false);
        System.out.println("Knocked Out? : " + team1.isKnockedOut());
        
        //Test add players method
        System.out.println(team1.addPlayer("Kerzhakov"));
        System.out.println(team1.addPlayer("Kokorin"));
        System.out.println(team1.addPlayer("Mamaev"));
        System.out.println(team1.addPlayer("Golovin"));
        System.out.println(team1.addPlayer("Dzyuba"));
        System.out.println(team1.addPlayer("Maddyson"));
        
        //Test remove player method
        System.out.println("Remove Player 2 from the team: " + team1.removePlayer(2));
        
        //Test searc item method 
        System.out.println("Checking if holy Dzyuba is in the team: " + team1.searchItem("Dzyuba"));
        
        //Test replace method
        System.out.println("Checking if replacement of Kokorin to Maddyson was successful: " + team1.replace("Kokorin", "Maddyson"));
        
        //Test competition method
        System.out.println("Checking if team is still in competition: " + team1.competition());
        
        //Test toString method
        System.out.println(team1.toString());
        
        
    }
}