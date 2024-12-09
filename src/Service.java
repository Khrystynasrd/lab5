import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<String> countries;

    public Service() {
        countries = new ArrayList<>();
        countries.add("Україна");
        countries.add("Канада");
        countries.add("Німеччина");
        countries.add("Японія");
    }


    public String findCountry(String countryName) throws FoundException {
        if (!countries.contains(countryName)) {
            throw new FoundException("Країна '" + countryName + "' не знайдена!");
        }
        return "Країна '" + countryName + "' знайдена у списку.";
    }
}