import java.util.ArrayList;

public class Pacjent extends Osoba {
    private ArrayList<Lek> leki;

    public Pacjent(String imie, String nazwisko) {
        super(imie, nazwisko);
        leki = new ArrayList<>();
    }

    public ArrayList<Lek> getLeki() {
        return leki;
    }

    public void dodajLek(Lek nowyLek) {
        leki.add(nowyLek);
    }

    @Override
    public String toString() {
        return super.toString() + ", leki=" + leki;
    }
}
