/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Luas Persegi Panjang
        PersegiPanjang p1 = new PersegiPanjang ();
        System.out.println("1. Menghitung Luas Persegi Panjang");
        System.out.println("   a. p : 10    l : 5   Luas = " + p1.hitungLuas(10, 5));
        System.out.println("   b. p : 3.6   l : 8   Luas = " + p1.hitungLuas(3.6, 8));
        System.out.println("   c. p : 6     l : 8.3 Luas = " + p1.hitungLuas(6, 8.3));
        System.out.println("   d. p : 5.6   l : 8.8 Luas = " + p1.hitungLuas(5.6, 8.8));
        
        //Keliling Persegi Panjang
        System.out.println("2. Menghitung Keliling Persegi Panjang");
        System.out.println("   a. p : 10    l : 5   Keliling = " + p1.hitungKeliling(10, 5));
        System.out.println("   b. p : 3.6   l : 8   Keliling = " + p1.hitungKeliling(3.6, 8));
        System.out.println("   c. p : 6     l : 8.3 Keliling = " + p1.hitungKeliling(6, 8.3));
        System.out.println("   d. p : 5.6   l : 8.8 Keliling = " + p1.hitungKeliling(5.6, 8.8));
        
        //Luas Persegi
        Persegi persegi1 = new Persegi();
        System.out.println("3. Menghitung Luas Persegi");
        System.out.println("   a. sisi : 4.5    Luas = " + persegi1.hitungLuas(4.5));
        System.out.println("   b. sisi : 7      Luas = " + persegi1.hitungLuas(7));
        
        //Keliling Persegi
        System.out.println("4. Menghitung Keliling Persegi");
        System.out.println("   a. sisi : 4.5    Keliling = " + persegi1.hitungKeliling(4.5));
        System.out.println("   b. sisi : 7      Keliling = " + persegi1.hitungKeliling(7));
        
        //Luas Lingkaran
        Lingkaran l1 = new Lingkaran();
        System.out.println("5. Menghitung Luas Lingkaran");
        System.out.println("   a. jejari : 5    Luas = " + l1.hitungLuas(5));
        System.out.println("   b. jejari : 7.4  Luas = " + l1.hitungLuas(7.4));
        
        //Keliling Lingkaran
        System.out.println("6. Menghitung Keliling Lingkaran");
        System.out.println("   a. jejari : 5    Keliling = " + l1.hitungKeliling(5));
        System.out.println("   b. jejari : 7.4  Keliling = " + l1.hitungKeliling(7.4));
       
        //Luas Segitiga
        Segitiga s1 = new Segitiga();
        System.out.println("7. Menghitung Luas Segitiga");
        System.out.println("   a. a : 8     t : 10      Luas = " + s1.hitungLuas(8, 10));
        System.out.println("   b. a : 8     t : 11.5    Luas = " + s1.hitungLuas(8, 11.5));
        System.out.println("   c. a : 12.2  t : 9,      Luas = " + s1.hitungLuas(12.2, 9));
        System.out.println("   d. a : 13.9  t : 20.7,   Luas = " + s1.hitungLuas(13.9, 20.7));
    }   
}
