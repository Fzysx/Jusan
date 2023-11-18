package organization;

public class Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int salary;

    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = "Инженер";
        this.salary = 30_000;

    }

    public Employee(String firstName, String lastName, String jobTitle, int salary){
        this(firstName, lastName);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.getFirstName() + "/" + this.getLastName() + "/" + this.getJobTitle() + "/" + this.salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setSurname(String lastName){
        this.lastName = lastName;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public void setJobTitle(String name){
        this.jobTitle = jobTitle;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}
