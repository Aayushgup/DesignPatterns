package flyweight.pattern;

public class Developer implements Employee {
    String job="Fix the Issue";
    String skill;
    @Override
    public void assignSkill(String skill) {
      this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("Developer with skill: " + this.skill + " and Job is to: " + job);

    }
}
