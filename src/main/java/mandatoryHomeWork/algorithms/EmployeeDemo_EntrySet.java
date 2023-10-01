package mandatoryHomeWork.algorithms;
import java.util.*;

class Employee {
    private String name;
    private int age;
    private int empId;

    public Employee(String name, int age, int empId) {
        this.name = name;
        this.age = age;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmpId() {
        return empId;
    }
}

public class EmployeeDemo_EntrySet {
    public static void main(String[] args) {
        // Create 10 employees
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Employee1", 25, 101);
        employees[1] = new Employee("Employee2", 30, 102);
        employees[2] = new Employee("Employee3", 28, 103);
        employees[3] = new Employee("Employee4", 35, 104);
        employees[4] = new Employee("Employee5", 22, 105);
        employees[5] = new Employee("Employee6", 29, 106);
        employees[6] = new Employee("Employee7", 31, 107);
        employees[7] = new Employee("Employee8", 27, 108);
        employees[8] = new Employee("Employee9", 26, 109);
        employees[9] = new Employee("Employee10", 33, 110);
        
//        System.out.println(employees[1]);

        // Create an Entry Set with employee information
        Set<Map.Entry<String, String>> employeeEntrySet = new HashSet<>();
        for (Employee employee : employees) {
            Map<String, String> entry = new HashMap<>();
            entry.put("Name", employee.getName());
            entry.put("Age", String.valueOf(employee.getAge()));
            entry.put("EmpId", String.valueOf(employee.getEmpId()));
            employeeEntrySet.add(entry.entrySet().iterator().next());
        }

        // Display the Entry Set
        for (Map.Entry<String, String> entry : employeeEntrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
