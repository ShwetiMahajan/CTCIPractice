package Ch16;

/**
 * Created by shwetimahajan on 1/30/18.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LivingPeople {
    public static class People {
        int birthYear;
        int deathYear;
        People(int x, int y) {birthYear = x; deathYear = y;}
    }

    public static void main(String args[]) {
        List<People> l = new ArrayList<>();
        l.add(new People(1909,1910));
        l.add(new People(1920, 1993));
        l.add(new People(1945, 1986));
        l.add(new People(1934, 2000));
        l.add(new People(1926, 1945));
        System.out.println(getYearWithMaxAlive(l));

    }

    public static int getYearWithMaxAlive(List<People> l) {
        int max_year = 0;
        int max_alive = 0;
        int current_alive = 0;
        ArrayList<Integer> birthYears = getBirthYearsList(l);
        ArrayList<Integer> deathYears = getDeathYearsList(l);
        int i = 0; int j = 0;
        while(i < birthYears.size() && j < deathYears.size()) {
            if(birthYears.get(i) <= deathYears.get(j)) {
                current_alive += 1;
                if(current_alive > max_alive) {
                    max_alive = current_alive;
                    max_year = birthYears.get(i);
                }
                i++;
            }
            else {
                current_alive -= 1;
                j++;
            }
        }
        return max_year;
    }

    public static ArrayList<Integer> getBirthYearsList(List<People> l) {
        ArrayList<Integer> birthYears = new ArrayList<>();

        for(int i = 0; i < l.size(); i++) {
            birthYears.add(l.get(i).birthYear);
        }
        Collections.sort(birthYears);

        return birthYears;
    }

    public static ArrayList<Integer> getDeathYearsList(List<People> l) {
        ArrayList<Integer> deathYears = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            deathYears.add(l.get(i).deathYear);
        }
        Collections.sort(deathYears);
        return deathYears;
    }
}
