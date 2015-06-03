import java.util.Scanner;  
  
public class menu  
  
{  
  
    public static void main(String args[])  
  
    {  int bilangan1;
        int bilangan2;
        int input;
        for (int f=1; f<999;f++){
  
                System.out.println("Menu :");  
  
                System.out.println("1. Penjumlahan");  
  
                System.out.println("2. Pengurangan");  
  
                System.out.println("3. Perkalian");  
  
                System.out.println("4. Pembagian");  
  
                System.out.println("5. Exit");  

            

                System.out.println("Masukkan Angka Pertama :");
                Scanner a1 = new Scanner(System.in);
                bilangan1 = a1.nextInt();

                System.out.println("Masukkan Angka Kedua :");
                Scanner a2 = new Scanner(System.in);
                bilangan2 = a2.nextInt();
  
                System.out.print("Masukkan Pilihan anda : ");  
                Scanner in = new Scanner(System.in);
                input = in.nextInt();
               
   
  
                System.out.println("====================");  
                
        
  
                switch(input)  
  
                {   
  
                    case 1 : System.out.println("Penjumlahan");
                            System.out.print("Hasil penjumlahan dari :"+bilangan1+"+"+bilangan2+"=");
                            System.out.println(bilangan1+bilangan2);
  
                    break;  
  
                    case 2 : System.out.println("Pengurangan");
                            System.out.print("Hasil pengurangan dari :"+bilangan1+"-"+bilangan2+"=");
                            System.out.println(bilangan1-bilangan2);
                    break;  
  
                    case 3 : System.out.println("Perkalian");
                            System.out.print("Hasil perkalian dari :"+bilangan1+"*"+bilangan2+"=");
                            System.out.println(bilangan1*bilangan2);
  
                    break;  
  
                    case 4 : System.out.println("Pembagian");
                            System.out.print("Hasil pembagian dari :"+bilangan1+"/"+bilangan2+"=");
                            System.out.println(bilangan1/bilangan2);;  
  
                    break;  
  
                    case 5 : System.out.println("Keluar");  
  
                             System.exit(0);  
  
                    break;  
  
                    default: System.out.println("Maaf pilihan tidak ada");  
  
                    break;  
  
                }  
                
                System.out.println("====================");  
                  }
              }
  
    }  
  