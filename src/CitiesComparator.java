import java.util.Comparator;

public class CitiesComparator implements Comparator<String> {

    @Override
    public int compare(String citiesOne, String citiesTwo) {

        int value = citiesOne.compareTo(citiesTwo);

        if (value > 0) {

            return -1;

        } else if (value < 0) {

            return 1;

        } else {

            return 0;
        }
    }
}