package tugas;

/**
 * Created by DYAH on 11/06/2015.
 */
public class Hp {
    private String namaHp;
    private String bentukHp;
    private String warnaHp;
    private int ukuranLayarHp;
    private Sim kartuHp;

    public Hp() {
    }

    public Hp(String namaHp, String bentukHp, String warnaHp) {
        this.namaHp = namaHp;
        this.bentukHp = bentukHp;
        this.warnaHp = warnaHp;
    }

    public Hp(String namaHp, String bentukHp, String warnaHp, int ukuranLayarHp, Sim kartuHp) {
        this.namaHp = namaHp;
        this.bentukHp = bentukHp;
        this.warnaHp = warnaHp;
        this.ukuranLayarHp = ukuranLayarHp;
        this.kartuHp = kartuHp;
    }

    public String getNamaHp() {
        return namaHp;
    }

    public void setNamaHp(String namaHp) {
        this.namaHp = namaHp;
    }

    public String getBentukHp() {
        return bentukHp;
    }

    public void setBentukHp(String bentukHp) {
        this.bentukHp = bentukHp;
    }

    public String getWarnaHp() {
        return warnaHp;
    }

    public void setWarnaHp(String warnaHp) {
        this.warnaHp = warnaHp;
    }

    public int getUkuranLayarHp() {
        return ukuranLayarHp;
    }

    public void setUkuranLayarHp(int ukuranLayarHp) {
        this.ukuranLayarHp = ukuranLayarHp;
    }

    public Sim getKartuHp() {
        return kartuHp;
    }

    public void setKartuHp(Sim kartuHp) {
        this.kartuHp = kartuHp;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "namaHp='" + namaHp + '\'' +
                ", bentukHp='" + bentukHp + '\'' +
                ", warnaHp='" + warnaHp + '\'' +
                ", ukuranLayarHp=" + ukuranLayarHp +
                ", kartuHp=" + kartuHp +
                '}';
    }
}
