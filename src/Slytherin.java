public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String fullName, int powerOfMagic, int transgressionRange, int cunning, int determination, int ambition) {
        super(fullName, powerOfMagic, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    private int sumOfSkills() {
        return cunning+determination+ambition;
    }
    public void compareTo(Slytherin student) {
        int sum1 = this.sumOfSkills();
        int sum2 = student.sumOfSkills();
        if (sum1 > sum2) {
            System.out.println("Слизеринец "+this.getFullName()+ " лучше чем "+student.getFullName());
        } else if (sum1 < sum2) {
            System.out.println("Слизеринец " +student.getFullName() + " лучше чем "+this.getFullName());
        }else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Слизерин {" +
                " хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                '}';
    }
}
