package tes;

/**
 * Created by DYAH on 10/06/2015.
 */
public class TestClass {

    public static void main(String[] args) {
      Penulis Dyah = new Penulis("Dyah","Jl. Pelan-Pelan",'P',"Single",20);
      Penulis Kirana = new Penulis("Kirana", "Jl. Kenangan",'P',"single",20);

      Buku Haha = new Buku("Haha", Dyah);
        System.out.println(Haha.toString());
    }

}
