/*
    Lab 22
    Jason Chen
    112515450
 */
public class Person {
    String name, address, phone, email;
    public String toString(){
        return "name: " + name +
                "\naddress: " + address +
                "\nphone number: " + phone +
                "\nemail address: " + email;
    }
}
class Student extends Person{
    final String freshman = "freshman";
    final String sophomore = "sophomore";
    final String junior = "junior";
    final String senior = "senior";
    String status;
    public String toString(){
        return "Student" +
                "\nname: " + super.name +
                "\nstatus: " + status;
    }
}
class Employee extends Person{
    String office;
    double salary;
    int experience;
    public String toString(){
        return "Employee" +
                "\nname: " + name +
                "\noffice:  " + office +
                "\nsalary: " + salary +
                "\nexperience: " + experience + " years";
    }
}
class Faculty extends Employee{
    String rank;
    public String toString(){
        return "Faculty" +
                "\nname: " + name +
                "\nrank: " + rank + "\n";
    }
}
class Staff extends Employee{
    String title;
    public String toString(){
        return "Staff" +
                "\nname: " + name +
                "\ntitle: " + title + "\n";
    }
}