package Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by shwetimahajan on 1/22/18.
 */

//Question : Employee Importance
public class example22 {
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.importance = 5;
        emp1.subordinates = new ArrayList<>();
        emp1.subordinates.add(2);
        emp1.subordinates.add(3);
        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.importance = 3;
        emp2.subordinates = new ArrayList<>();
        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.importance = 3;
        emp3.subordinates = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(getImportance(employees, 1));
    }
    public static int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> hme = new HashMap<>();
        for(Employee emp : employees) {
            if(!hme.containsKey(emp.id)) {
                hme.put(emp.id, emp);
            }
        }
        Employee emp = hme.get(id);
        int sum = emp.importance;
        if(emp.subordinates == null) return sum;
        for(int i : emp.subordinates) {
            sum+=getImportance(employees,i);
        }
        return sum;
    }
}
