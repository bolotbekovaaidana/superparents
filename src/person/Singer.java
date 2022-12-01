package person;

public class Singer extends Person{
    private String job;

    public Singer() {
        super();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void sing(){
        System.out.println("the job of a singer requires a good voice");
    }

    public Singer(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "job='" + job + '\'' +super.toString();
    }
}
