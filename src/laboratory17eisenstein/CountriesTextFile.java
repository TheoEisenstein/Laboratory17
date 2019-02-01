package laboratory17eisenstein;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class CountriesTextFile {

	private static Path filePath = Paths.get("countries.txt");
	
	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
	
		//String country1 = country.getName() + "," + country.getPopulation();
		List<String> countryList = Arrays.asList(country.toString());
		
		Files.write(filePath,  countryList, StandardOpenOption.APPEND);
		
	}
	
	public static List<String> readFile2() throws IOException{
		List<String> lines = Files.readAllLines(filePath);
		List<String> CountryList = Arrays.asList(lines.toString());
		return CountryList;
	}
	
	
	public static List<Country> readFile() throws IOException{
		List<String> lines = Files.readAllLines(filePath);
		List<Country> countries = new ArrayList<>();
		for (String line: lines) {
			String[] parts = line.split(",");
			Country c = new Country(parts[0], Integer.parseInt(parts[1]));
			countries.add(c);

		}
		return countries;
}

	
}