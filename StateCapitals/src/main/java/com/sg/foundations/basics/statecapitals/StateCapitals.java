/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author merin
 */
public class StateCapitals {

    public static void main(String[] args) {

        // create a map that maps a state to its capital
        Map<String, String> stateCapitals = new HashMap<>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");

        // get the Set of keys from the map
        Set<String> keys = stateCapitals.keySet();

        System.out.println("STATES:");
        System.out.println("==================");

        for (String state : keys) {
            System.out.println(state);
        }
        System.out.println("\n");
        // get the Collection of values from the Map
        Collection<String> capitalName = stateCapitals.values();

        // list all of the capital
        System.out.println("CAPITALS:");
        System.out.println("==================");

        for (String capital : capitalName) {
            System.out.println(capital);
        }
        System.out.println("\n");

        // print the states and capitals to the screen
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("==================");

        for (String state : keys) {
            System.out.println("The population of " + state + " is " + stateCapitals.get(state));
        }

    }

}
