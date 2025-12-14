package assignments;
import java.util.*;

public class Assignment5_ArraysAndCollections {

	public static void main(String[] args) {
		// 1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
		List<Double> cityAreas = new ArrayList<>();
		cityAreas.add(100.0);
		cityAreas.add(200.0);
		cityAreas.add(300.0);
		cityAreas.add(400.0);
		cityAreas.add(500.0);
		
		//Print the total area of the 3rd and 4th cities combined.
		double totalArea = cityAreas.get(2)+ cityAreas.get(3);
		System.out.println("Total area of the 3rd and 4th cities combined: "+totalArea+"sq.km");
		System.out.println("*******************************************************************");
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.

		Set<String> touristPlaces =  new HashSet<>();
		touristPlaces.add("Eiffel Tower,Paris");
		touristPlaces.add("Colosseum,Rome");
		touristPlaces.add("Sagrada Familia,Spain");
		touristPlaces.add("Great Wall of China,China");
		touristPlaces.add("Louvre Museum,France");
		touristPlaces.add("Taj Mahal,India");
		touristPlaces.add("Burj Khalifa,UAE");
		touristPlaces.add("Acropolis of Athens,Greece");
		touristPlaces.add("Anne Frank House,Netherlands");
		touristPlaces.add("Statue of Liberty,USA");
		
		System.out.println(touristPlaces.size()+" Tourist Attraction Places in the World: "+touristPlaces);
		System.out.println("*******************************************************************");
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		double average = (numbers[4] + numbers[5])/2.0;
		
		System.out.println("Average of 5th and 6th Value: "+average);
		System.out.println("*******************************************************************");
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> movieList = new ArrayList<>();
		movieList.add("Jumanji");
		movieList.add("Freaky friday");
		movieList.add("Harry Potter And The Goblet Of Fire");
		movieList.add("Pirates of The Carribean");
		movieList.add("Jurassic Park");
		
		System.out.println("Third highest-grossing movies of all time: "+movieList.get(2));
		System.out.println("*******************************************************************");
		
		
	}

	
}
