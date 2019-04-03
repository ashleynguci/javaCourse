import java.util.Scanner;
import java.util.ArrayList;

public class CityProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<City> cities = new ArrayList<City>();
		System.out.println("=== Enter cities (empty city ends) ===");
		System.out.print("Enter city name: ");
		String cityName = input.nextLine();
		String country = "";
		int population = 0;
		while (cityName.length() != 0) {
			System.out.print("Enter population: ");
			population = Integer.parseInt(input.nextLine());
			System.out.print("Enter country: ");
			country = input.nextLine();
			cities.add(new City(cityName, population, country));
			System.out.println();
			System.out.println();
			System.out.print("Enter city name: ");
			cityName = input.nextLine();
		}

		System.out.println("\n\n=== City info ===");
		if (cities.size() == 0) {
			System.out.println("Sorry there is no any data to show.");
		} else {
			int indexMostPopular = 0;
			for (int i = 0; i < cities.size(); i++) {

				int mostPopular = cities.get(indexMostPopular).getPopulation();
				if (cities.get(i).getPopulation() > mostPopular) {
					mostPopular = cities.get(i).getPopulation();
					indexMostPopular = i;
				}
			}

			int indexLeastPopular = 0;
			for (int i = 0; i < cities.size(); i++) {

				int leastPopular = cities.get(indexLeastPopular).getPopulation();
				if (cities.get(i).getPopulation() < leastPopular) {
					leastPopular = cities.get(i).getPopulation();
					indexLeastPopular = i;
				}
			}
			int percentageDifferent = (cities.get(indexMostPopular).getPopulation()
					- cities.get(indexLeastPopular).getPopulation()) * 100
					/ cities.get(indexLeastPopular).getPopulation();
			if (cities.size() == 1) {
				System.out.println("The most populated city is " + cities.get(indexMostPopular).getCityName() + ".");
				System.out.println("It is the only country to compare.");
			} else {
				System.out.println("The most populated city is " + cities.get(indexMostPopular).getCityName() + ".");
				System.out.println(
						"It has " + percentageDifferent + " % more inhabitants than the least populated city.");
			}
			System.out.println();
			System.out.println();

			for (int i = cities.size() - 1; i >= 0; i--) {
				System.out.println(cities.get(i).getCityName() + " in " + cities.get(i).getCountryName() + " has "
						+ cities.get(i).getPopulation() + " inhabitants.");
			}
		}
		input.close();
	}

}
