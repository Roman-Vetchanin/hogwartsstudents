public class Gryffindor extends Hogwarts {
    protected int nobility;
    protected int honor;
    protected int bravery;

    public Gryffindor(String fullName, int powerOfMagic, int transgressionRange, int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int sumOfSkills() {
        return nobility+honor+bravery;
    }
    public void compareTo(Gryffindor student) {
        int sum1 = this.sumOfSkills();
        int sum2 = student.sumOfSkills();
        if (sum1 > sum2) {
            System.out.println("Грифиндорец "+this.getFullName()+ " лучше чем "+student.getFullName());
        } else if (sum1 < sum2) {
            System.out.println("Грифиндорец " +student.getFullName() + " лучше чем "+this.getFullName());
        }else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Гриффиндор {" +
                " благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                '}';
    }

}
