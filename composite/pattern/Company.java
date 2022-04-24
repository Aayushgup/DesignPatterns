package composite.pattern;

public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Developer(100, "Aayush", "Web Developer");
        Employee emp2 = new Developer(101, "Vinay Sharma", "Java Developer");

        Employee emp3 = new Hr(140, "Saumya", "Hr Trainee");
        Employee emp4 = new Hr(141, "Kritika", "Talent acquisition partner");

        Manager m1 = new Manager(200, "Kushagra", "Project Manager");
        m1.addEmployee(emp1);
        m1.addEmployee(emp2);

        Manager m2 = new Manager(201, "Vikram", "HR Manager");
        m2.addEmployee(emp3);
        m2.addEmployee(emp4);

        CompanyHead CEO=new CompanyHead(999, "Aalok Singh","CEO");
        CEO.addEmployee(m1);
        CEO.addEmployee(m2);

        CEO.showDetails();


    }
}
//                                      CEO   -- composite
//                                    /      \
//                                  m1        m2
//                                /    \     /   \
//                              emp1  emp2  emp3   emp4  ----leaf