package org.example.solutionThree;

import java.util.HashMap;

public class SolutionThree {

    public int[] indecesOfSum(int[] valuesInArray,int target){
        HashMap<Integer, Integer> mapOfNumbers = new HashMap<>();
        for (int i = 0; i < valuesInArray.length; i++) {
            int difference = target - valuesInArray[i];

            if(mapOfNumbers.containsKey(difference)){
                // index of already existing key that is difference here it is 4
                return new int[] { mapOfNumbers.get(difference), i };
            }
            mapOfNumbers.put(valuesInArray[i],i);

        }
        return null;
    }

}
