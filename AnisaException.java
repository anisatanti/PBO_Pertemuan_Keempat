/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuankeempat;

/**
 *
 * @author LENOVO
 */
public class AnisaException extends Exception {
    public AnisaException(String message) {
        super(message);
    }

    // Metode utama untuk menjalankan contoh
    public static void main(String[] args) {
        try {
            // Menggunakan Exception kustom
            throw new AnisaException("Ini adalah pesan yang salah");
        } catch (AnisaException e) {
            // Menangkap Exception kustom
            System.err.println("Exception ditangkap:");
            System.out.println(e.getMessage());
        }
    }
    
}
