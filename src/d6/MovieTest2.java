package d6;

import java.util.Arrays;

public class MovieTest2 {

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[6];
		movies[0] = new Movie("A",6,4);
		movies[1] = new Movie("A",7,2);
		movies[2] = new Movie("A",5,2);
		movies[3] = new Movie("M",4,5);
		movies[4] = new Movie("M",3,4);
		movies[5] = new Movie("M",3,2);
		
		System.out.println(Arrays.toString(movies));
		
		//target
		Movie target = new Movie("",4,4);
		
		for (int i = 0; i < movies.length; i++) {
			
			double distance = movies[i].calcDistance(target.action, target.kiss);
			System.out.println(distance);
		}
		
	}
}
