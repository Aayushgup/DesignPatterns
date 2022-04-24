package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyHead implements Employee{

    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private long empId;
    private String position;

    public CompanyHead(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public void showDetails()
    {   System.out.println(empId+" " +name+" "+position);
        for(Employee emp:employeeList)
        {
            emp.showDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

    // Class may have some more functioning and rights.
}
