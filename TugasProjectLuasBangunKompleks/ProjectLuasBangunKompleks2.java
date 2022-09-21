/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author user
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi2 persegi2 = new Persegi2 ();
        Lingkaran2 ling2 = new Lingkaran2();
        
        double LingkaranBesar = ling2.hitungLuas(28/2)/2;
        double LingkaranKecil = ling2.hitungLuas(14/2);
        
        double LuasAbuAbu = LingkaranBesar - LingkaranKecil;
        System.out.println("Luas daerah yang berwarna abu-abu adalah : " + LuasAbuAbu );
    }
}
    
