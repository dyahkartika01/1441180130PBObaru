package tugas;

/**
 * Created by DYAH on 11/06/2015.
 */
public class Sim {
    private String namaSim;
    private int kodeSim;
    private String jenisSim;

    public Sim() {
    }

    public Sim(String namaSim, int kodeSim) {
        this.namaSim = namaSim;
        this.kodeSim = kodeSim;
    }

    public Sim(String namaSim, int kodeSim, String jenisSim) {
        this.namaSim = namaSim;
        this.kodeSim = kodeSim;
        this.jenisSim = jenisSim;
    }

    public String getNamaSim() {
        return namaSim;
    }

    public void setNamaSim(String namaSim) {
        this.namaSim = namaSim;
    }

    public int getKodeSim() {
        return kodeSim;
    }

    public void setKodeSim(int kodeSim) {
        this.kodeSim = kodeSim;
    }

    public String getJenisSim() {
        return jenisSim;
    }

    public void setJenisSim(String jenisSim) {
        this.jenisSim = jenisSim;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "namaSim='" + namaSim + '\'' +
                ", kodeSim=" + kodeSim +
                ", jenisSim='" + jenisSim + '\'' +
                '}';
    }
}
