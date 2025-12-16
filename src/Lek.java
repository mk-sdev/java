import java.util.Date;
import java.util.Calendar;

public class Lek {
    private String nazwa;
    private Date dataWaznosci;

    public Lek(String nazwa) {
        this.nazwa = nazwa;

        // utwórz instancję Calendar i ustaw ją na aktualną datę
        Calendar calendar = Calendar.getInstance();
        // dodaj 1 rok do bieżącej daty
        calendar.add(Calendar.YEAR, 1);

        // przypisz datę ważności
        this.dataWaznosci = calendar.getTime();
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getDataWaznosci() {
        return dataWaznosci;
    }

    @Override
    public String toString() {
        return "Lek{" +
                "nazwa='" + nazwa + '\'' +
                ", dataWaznosci=" + dataWaznosci +
                '}';
    }
}
