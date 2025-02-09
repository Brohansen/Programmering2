import java.util.ArrayList;

public class Student {

    private String forNavn;
    private String etterNavn;
    private ArrayList<Kurs> kursListe;

    public Student(String forNavn,String etterNavn){
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.kursListe = new ArrayList<>();
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEtterNavn(){
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn){
        this.etterNavn = etterNavn;
    }

    public void leggTilKurs(Kurs kurs){
        kursListe.add(kurs);
    }

    public void visKurs(){
        System.out.print("\nKurs for " + forNavn + ":");
        for (Kurs kurs : kursListe){
            kurs.visInfo();
        }
    }

    public void fjernKurs(Kurs kurs){
        kursListe.remove(kurs);
    }


}
