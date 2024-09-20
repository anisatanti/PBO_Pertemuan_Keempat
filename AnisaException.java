/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankeempat;

/**
 *
 * @author LENOVO
 */
public class AnisaException extends ArithmeticException {
    public AnisaException(String message) {
        super(message);
    }
    public static void hitungKeuntungan(double pendapatan, double biaya) throws AnisaException {
        double keuntungan = pendapatan - biaya;

        if (keuntungan <= 0) {
            throw new AnisaException("Keuntungan tidak boleh nol atau negatif!");
        } else {
            System.out.println("Keuntungan: " + keuntungan);
        }
    }

    public static void main(String[] args) {
        try {
            hitungKeuntungan(1000, 1500); // Contoh keuntungan negatif
        } catch (AnisaException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
        
        try {
            hitungKeuntungan(2000, 1000); // Contoh keuntungan positif
        } catch (AnisaException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}

