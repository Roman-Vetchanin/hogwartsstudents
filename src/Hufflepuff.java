public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int powerOfMagic, int transgressionRange, int hardWork, int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionRange);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int sumOfSkills() {
        return hardWork+loyalty+honesty;
    }
    public void compareTo(Hufflepuff student) {
        int sum1 = this.sumOfSkills();
        int sum2 = student.sumOfSkills();
        if (sum1 > sum2) {
            System.out.println("Пуффендуец "+this.getFullName()+ " лучше чем "+student.getFullName());
        } else if (sum1 < sum2) {
            System.out.println("Пуффендуец " +student.getFullName() + " лучше чем "+this.getFullName());
        }else {
            System.out.println("Студенты равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Пуффендуй {" +
                " трудолюбие = " + hardWork +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                '}';
    }
}
