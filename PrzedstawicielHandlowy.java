package zpo;

public class PrzedstawicielHandlowy extends Pracownik {

    private int procent;
    private int lacznaWartoscTowaru;

    public PrzedstawicielHandlowy(String imie, String nazwisko, int wiek, int pensja, int procent) {
        super(imie, nazwisko, wiek, pensja);
        this.procent = procent;
    }

    @Override
    public int roczneZarobki() {
        return super.roczneZarobki() + (procent * lacznaWartoscTowaru) / 100;
    }

    public void sprzedajTowar(int wartoscTowaru) {
        lacznaWartoscTowaru += wartoscTowaru;
    }
}
