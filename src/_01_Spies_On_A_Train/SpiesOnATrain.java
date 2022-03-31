package _01_Spies_On_A_Train;

import java.util.Arrays;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	Node<TrainCar> head = train.getHead();
    	System.out.println(Arrays.deepToString(clues));
    	//int clueNumber, 3 clues not always filled
    	while(head.getNext() != null) {
    		int index = 14;
    		String clue = "";
    		String[] concat = head.getValue().questionPassenger().split(" ");
    		while(index < concat.length) {
    			clue += concat[index] + " ";
    			index++;
    		}
    		clue = clue.substring(0, clue.length()-2);
    		if(clue.equalsIgnoreCase(clues[0])) {
    			
    		}
    		
    	head = head.getNext();
    	}
        return "";

    }

}
