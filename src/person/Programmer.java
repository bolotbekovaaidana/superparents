package person;

public class Programmer extends Person {
    private String sit;

    public Programmer(String name, String lastname, int age, String sit) {
        super(name, lastname, age);
        this.sit = sit;
    }

    public Programmer() {

    }

    public void wage() {
        System.out.println("good wage");
    }

    public String getSit() {
        return sit;
    }

    public void setSit(String sit) {
        this.sit = sit;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "sit='" + sit + '\'' +super.toString();
    }
}
