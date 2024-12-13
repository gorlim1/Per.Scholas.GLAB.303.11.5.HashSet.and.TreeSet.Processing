import java.util.TreeSet;

public class TreeSetExampleCom {

    public static void main(String[] args) {

        TreeSet<String> cities = new TreeSet<>(new CitiesComparator());

        cities.add("London");
        cities.add("New York");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Dubai");
        cities.add("Moscow");
        cities.add("Beijing");
        cities.add("Singapore");
        cities.add("Sydney");

        System.out.println("TreeSet: " + cities);
    }
}