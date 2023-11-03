abstract class Hogwarts {
    private String fullName;
    private int powerOfMagic;
    private int transgressionRange;


    public Hogwarts(String fullName, int powerOfMagic, int transgressionRange) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    private int sumOfSkills() {
        return powerOfMagic + transgressionRange;
    }
    private void print(){
        System.out.println(this);
    }
    public void compareTo(Hogwarts student) {
        int sum1 = this.sumOfSkills();
        int sum2 = student.sumOfSkills();
        if (sum1 > sum2) {
            System.out.println("Студент "+this.fullName + " обладает бОльшей мощьностью магии чем "+student.getFullName());
        } else if (sum1 < sum2) {
            System.out.println("Студент " +student.getFullName() + " обладает бОльшей мощьностью магии чем "+this.fullName);
        }else {
            System.out.println("Студенты равны");
        }
    }
    @Override
    public String toString() {
        return "Hogwarts{" +
                " Имя и фмилия = '" + fullName + '\'' +
                ", сила магии = " + powerOfMagic +
                ", дальность телепортаци = " + transgressionRange +
                '}';
    }
}
