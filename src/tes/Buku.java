package tes;

/**
 * Created by DYAH on 10/06/2015.
 */
public class Buku {
    private String namaBuku;
    private Double hargaBuku;
    private String penerbitBuku;
    private Penulis createdBy;

    public Buku() {
    }

    public Buku(String namaBuku, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.createdBy = createdBy;
    }

    public Buku(Double hargaBuku, String namaBuku, Penulis createdBy, String penerbitBuku) {
        this.hargaBuku = hargaBuku;
        this.namaBuku = namaBuku;
        this.createdBy = createdBy;
        this.penerbitBuku = penerbitBuku;
    }

    public Buku(String namaBuku, Double hargaBuku, String penerbitBuku) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbitBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(Double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    public Penulis getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Penulis createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", hargaBuku=" + hargaBuku +
                ", penerbitBuku='" + penerbitBuku + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
