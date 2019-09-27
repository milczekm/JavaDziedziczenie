package zpo;

public class Menedzer extends Pracownik {

    private int kontrakt;

    public Menedzer(String imie, String nazwisko, int wiek, int kontrakt) {
        super(imie, nazwisko, wiek, 0);
        this.kontrakt = kontrakt;
    }

    @Override
    public int roczneZarobki() {
        return kontrakt;
    }
}
