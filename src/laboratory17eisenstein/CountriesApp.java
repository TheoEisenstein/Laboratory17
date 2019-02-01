package laboratory17eisenstein;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;





public class CountriesApp {
	
		

		public static void main(String[] args) throws IOException {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please make a choie: ");
			System.out.println("1. Would you like to view a list of countries that have been saved in a file?");
			System.out.println("2. Would you like to enter a country to the file?");
			System.out.println("3. Would you like to leave?");
			
			
			int number = Validator.getInt(scan, "Please choose.", 1, 3);
			
			if(number == 1) {
				System.out.println(CountriesTextFile.readFile2());
			
			
			}if(number == 3) {
				System.out.println("Bye");
				return;
			
			}if(number == 2) {
			
			System.out.println("Please enter a country name: ");
			String name = scan.nextLine();
			System.out.println("Please enter the country population: ");
			int population = scan.nextInt();
			
			
			
			Country c1 = new Country(name, population);
		
		
		CountriesTextFile.appendToFile(c1);
		System.out.println(CountriesTextFile.readFile());
		
		//List<Country> listOCountries = CountriesTextFile.readFile();
		for(Country c : CountriesTextFile.readFile()) {
			System.out.println(c);

}
		scan.close();
}
}
}
