package tugas;

/**
 * Created by DYAH on 11/06/2015.
 */
public class TesClass {

    public static void main(String[] args) {
        Sim simpati = new Sim("Simpati", 345,"micro");
        Sim as = new Sim("As", 234, "micro");
        Sim xl = new Sim("Xl", 123 ,"macro");

        Hp nokia = new Hp("Nokia","Kotak","Hitam",45,simpati);
        Hp samsung = new Hp("Samsung", "Oval","Putih",35,as);
        System.out.println(nokia.toString());
        System.out.println(samsung.toString());
    }
}
