public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int cuteness;
    private int creation;

    public Ravenclaw(String fullName, int powerOfMagic, int transgressionRange, int wisdom, int cuteness, int creation) {
        super(fullName, powerOfMagic, transgressionRange);
        this.wisdom = wisdom;
        this.cuteness = cuteness;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCuteness() {
        return cuteness;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int sumOfSkills() {
        return wisdom+creation+cuteness;
    }
    public void compareTo(Ravenclaw student) {
        int sum1 = this.sumOfSkills();
        int sum2 = student.sumOfSkills();
        if (sum1 > sum2) {
            System.out.println("Когтевранец "+this.getFullName()+ " лучше чем "+student.getFullName());
        } else if (sum1 < sum2) {
            System.out.println("Когтевранец " +student.getFullName() + " лучше чем "+this.getFullName());
        }else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "Когтевран{" +
                " мудрость = " + wisdom +
                ", остроумие = " + cuteness +
                ", творчество = " + creation +
                '}';
    }
}
