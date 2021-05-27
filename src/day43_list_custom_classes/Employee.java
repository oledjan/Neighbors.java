package day43_list_custom_classes;

public class Employee {
    // data: name, jobTitle
    // behaviour: work
    String name;
    String jobTitle;

    // instance/object method
    public void work() {
        System.out.println(name + " works as " + jobTitle);
    }

}
