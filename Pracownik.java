package zpo;

public class Pracownik extends Osoba {

    private int pensja;

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        super(imie, nazwisko, wiek);
        this.pensja = pensja;
    }

    public int roczneZarobki() {
        return 12 * pensja;
    }
}
