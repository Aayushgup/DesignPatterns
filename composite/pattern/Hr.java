package composite.pattern;

public class Hr implements Employee{
    private String name;
    private long empId;
    private String position;

    public Hr(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
    @Override
    public void showDetails() {
        System.out.println(empId+" " +name+" "+position);
    }
}
