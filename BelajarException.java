/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankeempat;

/**
 *
 * @author LENOVO
 */
public class BelajarException {
     // Metode throws
    public void bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        System.out.println("Hasil bagi: " + (a / b));
    }
    //metode try catch
    public static void main(String[] args) {
        BelajarException belajar = new BelajarException();

        try {
            // Memanggil metode bagi dengan pembagi yang valid
            belajar.bagi(10, 5);
        } catch (ArithmeticException e) {
            // Menangkap pengecualian dan menampilkan pesan kesalahan
            System.err.println("Kesalahan: " + e.getMessage());
        }

        try {
            // Memanggil metode bagi dengan pembagi nol
            belajar.bagi(10, 0);
        } catch (ArithmeticException e) {
            System.err.println("Kesalahan: " + e.getMessage());
        }
    }
}
