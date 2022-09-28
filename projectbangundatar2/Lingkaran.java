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
public class Lingkaran {
    //Luas Lingkaran
    double hitungLuas(int r){
        double luas = 3.14 * r * r;
        return luas;
    }
    double hitungLuas(double r){
        double luas = 3.14 * r * r;
        return luas;
    }
    //Keliling Lingkaran
    double hitungKeliling (int r){
        double keliling = 3.14 * (2*r);
        return keliling;
    }
    double hitungKeliling (double r){
        double keliling = 3.14 * (2*r);
        return keliling;
    }
}
