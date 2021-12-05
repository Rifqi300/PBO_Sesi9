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
public class Kucing extends Hewan {
 
    private String ras;
    private String habitat;
    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return " Kucing Ras: " + ras + ", Habitat: " + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }
 
    public Kucing() {
        //super(); // akan tetap memanggil constructor dari parent Class
        System.out.println(" Construct Kucing");
    }
 
    public void makan() { // overriding
        System.out.println(" Kucing Sedang Makan");
    }
 
    public void makan(String food) { // overloading
        System.out.println(" Kucing Makan " + food);
    }
}