/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi jum = new Operasi();
        System.out.println("3 + 4 = " + jum.jumlahkan (3, 4));
        System.out.println("4 + 7 + (-9) = "+jum.jumlahkan (4, 7, -9));
        System.out.println("3.4 + (-0.0002) + 0.12313 = " +  jum.jumlahkan (3.4, -0.0002, 0.12313));
        
    }
    
}
