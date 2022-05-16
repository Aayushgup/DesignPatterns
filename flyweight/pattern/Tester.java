package flyweight.pattern;

public class Tester implements Employee {
    String job="Test the issue";
    String skill;
    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with skill: " + this.skill + " with Job: " + job);

    }
}
