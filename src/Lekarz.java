public class Lekarz extends Osoba {

    public Lekarz(String imie, String nazwisko){
        super(imie, nazwisko);
    }

    public void wypiszLek(String nazwaLeku, Pacjent pacjent){
        Lek lek = new Lek(nazwaLeku);
        pacjent.dodajLek(lek);
        System.out.println("Wypisano lek " + lek.getNazwa() + " pacjentowi " + pacjent.getImie() + " " + pacjent.getNazwisko());
    }
}
