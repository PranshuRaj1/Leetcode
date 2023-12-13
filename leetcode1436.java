import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1436 {
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );
        System.out.println(paths);


        System.out.println(destCity(paths));

    }

    static String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }
        for (List<String> path : paths){
            String destination = path.get(1);
            if (!cities.contains(destination)){
                return destination;
            }
        }

        return "";
    }
}
