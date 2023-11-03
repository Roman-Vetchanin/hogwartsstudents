public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 65, 65, 66, 72, 80);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 70, 70, 65, 61, 76);
        Gryffindor ron = new Gryffindor("Рональд Уизли", 45, 45, 65, 68, 60);
        Slytherin draco = new Slytherin("Драко Малфой", 50, 50, 60, 41, 70);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 55, 55, 45, 60, 65);
        Slytherin gregory = new Slytherin("Грегори Гойл", 32, 32, 35, 50, 40);
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 52, 52, 51, 66, 58);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 66, 66, 58, 80, 78);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 48, 48, 56, 60, 51);
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 45, 45, 51, 60, 71);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 51, 51, 55, 48, 60);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 41, 41, 60, 71, 54);
        ron.compareTo(harry);
        harry.compareTo(draco);
    }

    // это на новый год xD
   /* private static void printAllStudent() {
        for (int i = 0; i < students.length; i++) {
            Hogwarts student = students[i];
            System.out.println(student);
        }
    }

    private static void equalsStudent(String student1, String student2) {
        int sum1 = Integer.MIN_VALUE;
        int sum2 = Integer.MIN_VALUE;
        for (int i = 0; i < students.length; i++) {
            Hogwarts student = students[i];
            if (student.getFullName().equals(student1)) {
                sum1 = student.getPowerOfMagic() + student.getTransgressionRange();
            }
            if (student.getFullName().equals(student2)) {
                sum2 = student.getPowerOfMagic() + student.getTransgressionRange();
            }
        }
        if (sum1 > sum2) {
            System.out.println(student1 + " обладает бОльшей мощностью магии чем " + student2);
        } else {
            System.out.println(student2 + " обладает бОльшей мощностью магии чем " + student1);
        }
    }

    private static Hogwarts[] students = new Hogwarts[]{
            new Gryffindor("Гарри Поттер", 65, 65, 66, 72, 80),
            new Gryffindor("Гермиона Грейнджер", 70, 70, 65, 61, 76),
            new Gryffindor("Рональд Уизли", 45, 45, 65, 68, 60),
            new Slytherin("Драко Малфой", 50, 50, 60, 41, 70),
            new Slytherin("Грэхэм Монтегю", 55, 55, 45, 60, 65),
            new Slytherin("Грегори Гойл", 32, 32, 35, 50, 40),
            new Hufflepuff("Захария Смит", 52, 52, 51, 66, 58),
            new Hufflepuff("Седрик Диггори", 66, 66, 58, 80, 78),
            new Hufflepuff("Джастин Финч-Флетчли", 48, 48, 56, 60, 51),
            new Ravenclaw("Чжоу Чанг", 45, 45, 51, 60, 71),
            new Ravenclaw("Падма Патил", 51, 51, 55, 48, 60),
            new Ravenclaw("Маркус Белби", 41, 41, 60, 71, 54)
    };*/
    //
}