package prj5;

import java.util.Iterator;
import java.util.LinkedList;


public class DemographicsSorter {

	private LinkedList<Student> list;
	
	//integer opinion arrays
	private int[] readOpinions;
	private int[] sportsOpinions;
	private int[] artOpinions;
	private int[] musicOpinions;

	
	
	public DemographicsSorter(LinkedList<Student> list) {
		this.list = list;
	}

	/**
	 * Sorts through each student in LinkedList parameter using an iterator
	 * checks which hobbie the student has and makes updates in the
	 * opinion arrays accordingly using opinionsSorter()
	 * 
	 * @return a matrix that contains 4 integer arrays
	 * (readOpinions, sportsOpinions, artOpinions, musicOpinions)
	 */
	public int[][] sortByHobbie() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();
        
        int arraySize = currentStudent.getOpinions().size();
        readOpinions = new int[arraySize + (arraySize / 2)];
    	sportsOpinions = new int[arraySize + (arraySize / 2)];
    	artOpinions = new int[arraySize + (arraySize / 2)];
        musicOpinions = new int[arraySize + (arraySize / 2)];
        //has 3 indexes for each song (an int for heard, valid student, and liked)
        //from those values the two percentages for each song will be calculated
        
        while (iter.hasNext()) {
        	currentStudent = iter.next();
        	if (currentStudent.getHobbie() == "read") {
        		readOpinions = opinionsSort(currentStudent.getOpinions(), readOpinions);	
        	}
        	else if (currentStudent.getHobbie() == "sports") {
        		sportsOpinions = opinionsSort(currentStudent.getOpinions(), sportsOpinions);	

        	}
        	else if (currentStudent.getHobbie() == "art") {
        		artOpinions = opinionsSort(currentStudent.getOpinions(), artOpinions);	

        	}
        	else {                             //music
        		musicOpinions = opinionsSort(currentStudent.getOpinions(), musicOpinions);
        	}
        }
        int[][] fullArray = {readOpinions, sportsOpinions, artOpinions, musicOpinions};
        return fullArray;
	}
	
	/**
	 * Helper method to sortByHobbie, sortByRedion, sortByMajor
	 * opinionsSort updates the integer opinion arrays for each student
	 * 
	 * @param opinions an individual student's opinions
	 * @param array the correct opinion array for the particular students hobbie
	 * @return and updated version if the given integer opinion array
	 */
	private int[] opinionsSort(LinkedList<String> opinions, int[] array) {
		int j = 0;
		for (int i= 0; i< opinions.size(); i= i+ 2) {
			if (opinions.get(i) == "yes") {
				array[j]++;	//heard++
				array[j + 1]++;	//valid student++

				if (opinions.get(i+ 1) == "yes") {
					array[j + 2]++; //liked++
				}
			}
			else if (opinions.get(i) == "no") {
				array[j + 1]++;	//valid student++
			}
			j = j + 3;
		}
		
	}
	
}
