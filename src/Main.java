//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacjent p_Janek = new Pacjent("Janek", "Jankowski");
        Pacjent p_Edek = new Pacjent("Edek", "Kowalski");
        Pacjent p_Franek = new Pacjent("Franek", "Nowak");

        Lekarz lekarz = new Lekarz("Stanisław", "Wiśniewski");

        String[] leki = {"paracetamol", "apap", "syrop", "xanax"};

        lekarz.wypiszLek(leki[0], p_Janek);
        lekarz.wypiszLek(leki[1], p_Janek);
        lekarz.wypiszLek(leki[2], p_Edek);
        lekarz.wypiszLek(leki[3], p_Franek);
        lekarz.wypiszLek(leki[1], p_Franek);

        System.out.println(p_Janek.toString());
        System.out.println(p_Edek.toString());
        System.out.println(p_Franek.toString());
    }
}