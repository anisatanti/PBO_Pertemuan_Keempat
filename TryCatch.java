/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankeempat;

/**
 *
 * @author LENOVO
 */
public class TryCatch {
      public void hitungKeuntunganDenganTryCatch(double pendapatan, double biaya) {
        try {
            // Menghitung keuntungan
            double keuntungan = pendapatan - biaya;

            // Mengecek apakah keuntungan nol atau negatif
            if (keuntungan <= 0) {
                throw new ArithmeticException("Keuntungan tidak boleh nol atau negatif");
            }
            System.out.println("Keuntungan yang diperoleh: " + keuntungan);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TryCatch contoh = new TryCatch();
        double pendapatan = 50000; 
        double biaya = 60000;      

        contoh.hitungKeuntunganDenganTryCatch(pendapatan, biaya);
    }
}

