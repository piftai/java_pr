public class IncapsulationLesson {
    public static void main(String args[]) {
        Worker u1 = new Worker();
        u1.setAge(23);


        u1.speak();
    }
}

class Worker {
    private String profession;
    private int age;
    private int exp;
    public String getProfession() {
        return profession;
    }
    public void setProfession(String userProf) {
        profession = userProf;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int userAge) {
        age = userAge;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int userExp) {
        exp = userExp;
    }
    void speak() {
        System.out.println("Привет, я " + profession + ", мне " + age + " лет, и у меня " + exp + " трудового стажа.");
    }
}