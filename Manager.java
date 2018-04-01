import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Program: Milestone4
 * File:Manager.java
 * Summary: Manager Class displays 6 players to console
 * Author: Brandon Labat
 * Date: April 1, 2018
 */

public class Manager{// begin Manager Class
	
	

//begin manager class
	public static void main(String[]args) {//begin Main method
		
		//Instantiate OffensivePlayer object, initializes the OffensivePlayer class variable
		Player player1 = new OffensivePlayer();
		player1.setName("Tom Brady");
		player1.setCollege("Michigan State");
		player1.setHighschool("Serra HS");
		player1.setPosition("QB");
		player1.setTeam("NE Patriots");
		player1.setAge(40);
		player1.setNumber(12);
		player1.setExperience(19);
		player1.setWeight(225);
		player1.setPassyard(4577);
		player1.setRushyard(28);
		player1.setRecyard(0);
		player1.setHeight(76);
		//Instantiate OffensivePlayer object, initializes the OffensivePlayer class variable
		Player player2 =new OffensivePlayer();
		player2.setName("Philip Rivers");
		player2.setCollege("North Carolina State");
		player2.setHighschool("Athens HS");
		player2.setPosition("QB");
		player2.setTeam("LA Chargers");
		player2.setAge(36);
		player2.setNumber(15);
		player2.setExperience(17);
		player2.setWeight(228);
		player2.setPassyard(4517);
		player2.setRushyard(-2);
		player2.setRecyard(0);
		player2.setHeight(77);
		
		//Instantiate OffensivePlayer object, initializes the OffensivePlayer class variable
		Player player3 =  new OffensivePlayer();
		player3.setName("Kareem Hunt");
		player3.setCollege("Toledo");
		player3.setHighschool("South HS");
		player3.setPosition("RB");
		player3.setTeam("KC Chiefs");
		player3.setAge(27);
		player3.setNumber(22);
		player3.setExperience(2);
		player3.setWeight(216);
		player3.setPassyard(0);
		player3.setRushyard(1327);
		player3.setRecyard(455);
		player3.setHeight(70);
		//Instantiate OffensivePlayer object, initializes the OffensivePlayer class variable
		Player player4 = new OffensivePlayer();
		player4.setName("Todd Gurley");
		player4.setCollege("Georgia");
		player4.setHighschool("Tarboro HS");
		player4.setPosition("RB");
		player4.setTeam("LA Rams");
		player4.setAge(30);
		player4.setNumber(23);
		player4.setExperience(4);
		player4.setWeight(227);
		player4.setPassyard(0);
		player4.setRushyard(788);
		player4.setRecyard(152);
		player4.setHeight(73);
		//Instantiate DefensivePlayers object, initializes the DefensivePlayers class variable
		Player player5 = new DefensivePlayers("Preston Brown","Louiseville", "Northwest HS","LB","Cinc Bengals",
				5,0, 25,"6ft 1in", 251, 0, 144, 0);
		player5.setName("Preston Brown");
		player5.setCollege("Louiseville");
		player5.setHighschool("Northwest HS");
		player5.setPosition("LB");
		player5.setTeam("Cinc Bengals");
		player5.setAge(25);
		player5.setNumber(0);
		player5.setExperience(5);
		player5.setWeight(251);
		player5.setTackles(144);
		player5.setSacks(0);
		player5.setInterceptions(0);
		player5.setHeight(73);
		//Instantiate DefensivePlayers object, initializes the DefensivePlayers class variable
		Player player6 = new DefensivePlayers();
		player6.setName("Blake Martinez");
		player6.setCollege("Stanford");
		player6.setHighschool("Canyon del Oro HS");
		player6.setPosition("LB");
		player6.setTeam("GB Packers");
		player6.setAge(24);
		player6.setNumber(50);
		player6.setExperience(3);
		player6.setWeight(237);
		player6.setTackles(144);
		player6.setSacks(1);
		player6.setInterceptions(1);
		player6.setHeight(74);
		
		//Places player in an array list
		ArrayList<Player> player = new ArrayList <Player>();
		player.add(player1);
		player.add(player2);
		player.add(player3);
		player.add(player4);
		player.add(player5);
		player.add(player6);
		//Display ArrayList to console
		System.out.println(player.toString());
		}// end Main Method
}//end Manager Class
			
			
	




