

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jonas","Johansen");

        Kurs kurs1 = new Kurs("Databaser", 342556);
        Kurs kurs2 = new Kurs("Programmering2",643262);

        student1.leggTilKurs(kurs1);
        student1.leggTilKurs(kurs2);

        student1.visKurs();

        student1.fjernKurs(kurs1);

        student1.visKurs();




    }

}