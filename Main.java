/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==============Tugas PBO Sesi 9=============");
        System.out.println("================POLIMORFISME===============");
        System.out.println("");
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println(" Apakah Hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println(" Apakah Hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println(" Apakah Hewan IS-A Kucing -> " + (hewan instanceof Kucing));
 
        System.out.println("-------------------------------------------");
 
        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println(" Apakah Hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println(" Apakah Kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println(" Apakah Kucing IS-A Kucing -> " + (kucing instanceof Kucing));
 
        System.out.println("-------------------------------------------");
 
        hewan.makan();
        kucing.makan();
        kucing.makan(" Daging Ikan");
 
        System.out.println("-------------------------------------------");
 
        Kucing meow = new Kucing("Ocicat", "Tropis");
        Kucing puss = new Kucing("Ocicat", "Subtropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        System.out.println(" Meow Equals Puss ? " + meow.equals(puss));
        System.out.println(" Meow Equals Popo ? " + meow.equals(popo));
        System.out.println("");
        System.out.println("===========Muhammad Rifqi Darmawan=========");
        System.out.println("================Reguler TI20A==============");
        System.out.println("");
    }
}