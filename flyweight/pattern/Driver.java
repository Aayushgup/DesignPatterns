package flyweight.pattern;

public class Driver {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            if(i%2==0){
                Employee e = EmployeeFactory.getEmployee("Developer");
                e.assignSkill("Java");
                e.task();
            }

            else{
                Employee e = EmployeeFactory.getEmployee("Tester");
                e.assignSkill("C++");
                e.task();
            }


        }
    }
}
