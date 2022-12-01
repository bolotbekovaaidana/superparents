package person;

public class Dancer extends Person {
    private String dance;

    public Dancer(String name, String lastname, int age, String danse) {
        super(name, lastname, age);
        this.dance = danse;
    }

    public Dancer() {

    }

    public void dance1() {
        System.out.println("Dancers are dancing");
    }

    public String getDance() {
        return dance;
    }

    public void setDance(String dance) {
        this.dance = dance;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "dance='" + dance + '\'' +super.toString();
    }
}
