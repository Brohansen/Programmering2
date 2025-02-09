public class Kurs {

    private String kursNavn;
    private int kursId;

    public Kurs(String kursNavn,int kursId){
        this.kursNavn = kursNavn;
        this.kursId = kursId;

    }

    public void visInfo() {
        System.out.print("\n"+kursId + " - " + kursNavn);
    }

}
