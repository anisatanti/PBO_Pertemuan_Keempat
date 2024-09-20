/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankeempat;

/**
 *
 * @author LENOVO
 */
public class Throws {
     public void hitungKeuntungan(double pendapatan, double biaya) throws ArithmeticException {
        double keuntungan = pendapatan - biaya;

        if (keuntungan <= 0) {
            throw new ArithmeticException("Keuntungan tidak boleh nol atau negatif.");
        }
        System.out.println("Keuntungan yang diperoleh: " + keuntungan);
    }

    public static void main(String[] args) {
        Throws contoh = new Throws();
        double pendapatan = 50000;  
        double biaya = 60000;       
        try {
            contoh.hitungKeuntungan(pendapatan, biaya);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
