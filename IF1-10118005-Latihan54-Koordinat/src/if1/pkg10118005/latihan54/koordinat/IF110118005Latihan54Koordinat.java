/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan54.koordinat;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan koordinat beserta warnanya
 */
public class IF110118005Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(4, 10, "Jingga");
        System.out.println("Warna Koordinat: " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x: " + wk.getX() +", y: "+wk.getY() );
    }
    
}
