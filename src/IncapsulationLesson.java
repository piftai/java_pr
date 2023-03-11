public class IncapsulationLesson {
    public static void main(String args[]) {
        Worker u1 = new Worker("Java-разработчик", 18, 1);
        u1.speak();
    }
}

class Worker {
    private String profession;
    private int age;
    private int exp;
    public Worker(String profession, int age, int exp) {
        this.profession = profession;
        this.age = age;
        this.exp = exp;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    void speak() {
        System.out.println("Привет, я " + profession + ", мне " + age + " лет, и у меня " + exp + " год трудового стажа.");
    }
}