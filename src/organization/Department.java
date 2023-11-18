package organization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Department {
    private String name;
    private int countOfEmployees;

    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public Department(String name){
        this.name = name;
        this.countOfEmployees = 0;
    }

    public Department(ArrayList<Employee> employees){
        this.employees.addAll(employees);
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public int getCountOfEmployees(){
        this.countOfEmployees = this.employees.size();
        return this.countOfEmployees;
    }

    public int getSumSalary(){
        int sum = 0;

        for (Employee employee:this.employees) {
            sum += employee.getSalary();
        }

        return sum;
    }

    public Employee getEmployeeByName(String firstName, String lastName){
        for (Employee employee: this.employees) {
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)){
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(String firstName, String lastName, String jobTitle){
        int index = 0;
        for (Employee employee: this.employees) {
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)
            && employee.getJobTitle().equals(jobTitle)){
                this.employees.remove(index);
                System.out.println(firstName + "/" + lastName + "/" + jobTitle + " deleted" );
                return;
            }
            index++;
        }
        System.out.println("Employee did not found");
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return this.employees;
    }

    public ArrayList<Employee> getSortedEmployees(){
        Collections.sort(this.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int lastNameComparison = employee1.getLastName().compareTo(employee2.getLastName());
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                } else {
                    return employee1.getFirstName().compareTo(employee2.getFirstName());
                }
            }
        });
        return this.employees;
    }

}
