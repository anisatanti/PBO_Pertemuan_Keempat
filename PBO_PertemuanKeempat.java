/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuankeempat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PBO_PertemuanKeempat {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/PBO_Pertemuan4";
    String user = "postgres";
    String password = "1234";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

   public void tambah() {
    try {
        Class.forName(driver);
        conn = DriverManager.getConnection(koneksi, user, password);
        conn.setAutoCommit(false); // Nonaktifkan otomatis commit

        String sql = "INSERT INTO Paspor VALUES(?,?,?,?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);

        boolean selesai = false;
        while (!selesai) {
            System.out.println("MASUKKAN DATA PASPOR ");
            System.out.print("ID Paspor : ");
            String id_Paspor = input.readLine().trim();
            System.out.print("Nama Lengkap : ");
            String nama_pemilik = input.readLine().trim();
            System.out.print("Kewarganegaraan : ");
            String kewarganegaraan = input.readLine().trim();
            System.out.print("Tanggal Lahir (YYYY-MM-DD): ");
            String tanggal_lahir = input.readLine().trim();
            System.out.print("Jenis Kelamin : ");
            String jenis_kelamin = input.readLine().trim();
            System.out.print("Tanggal Terbit (YYY-MM-DD) : ");
            String tanggal_terbit = input.readLine().trim();
            System.out.print("Tanggal Kedaluarsa (YYY-MM-DD) : ");
            String tanggal_kedaluarsa = input.readLine().trim();
            System.out.print("Negara Penerbit : ");
            String negara_penerbit = input.readLine().trim();

            pstmt.setString(1, id_Paspor);
            pstmt.setString(2, nama_pemilik);
            pstmt.setString(3, kewarganegaraan);
            pstmt.setDate(4, java.sql.Date.valueOf(tanggal_lahir));
            pstmt.setString(5, jenis_kelamin);
            pstmt.setDate(6, java.sql.Date.valueOf(tanggal_terbit));
            pstmt.setDate(7, java.sql.Date.valueOf(tanggal_kedaluarsa));
            pstmt.setString(8, negara_penerbit);
            pstmt.executeUpdate();

            System.out.print("Apakah Anda ingin memasukkan data pemilik Paspor lainnya? (iya/tidak): ");
            String pilihan = input.readLine().trim();
            if (!pilihan.equalsIgnoreCase("iya")) {
                selesai = true; // Ubah ke true agar loop berhenti jika tidak ingin memasukkan data lagi
            }
        }

        conn.commit(); // Commit transaksi setelah sejumlah operasi insert berhasil
        pstmt.close();
        conn.close();
        System.out.println("Sukses dalam satu transaksi.");
    } catch (ClassNotFoundException | SQLException | IOException ex) {
        System.out.println("Terjadi kesalahan saat melakukan operasi insert dalam loop.");
        ex.printStackTrace();
        try {
            if (conn != null) {
                conn.rollback(); // Batalkan transaksi jika terjadi kesalahan
            }
        } catch (SQLException e) {
            System.out.println("Gagal melakukan rollback transaksi.");
            e.printStackTrace();
        }
    }
}


    public void tampil() {
        try {
            Class.forName(driver);
            String sql = "SELECT * FROM Paspor";
            conn = DriverManager.getConnection(koneksi, user, password);
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) 
                        + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7)+ " " + rs.getString(8));
            }
            conn.close();
            stmt.close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hapus() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);

            System.out.print("Masukkan ID Paspor yang akan dihapus : ");
            String idPasporToDelete = input.readLine().trim();

            String deleteSql = "DELETE FROM Paspor WHERE id_Paspor = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setString(1, idPasporToDelete);  // Menggunakan setString karena ID Paspor adalah alfanumerik
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("ID Paspor " + idPasporToDelete + " berhasil dihapus!");
            } else {
                System.out.println("ID Paspor " + idPasporToDelete + " tidak ditemukan.");
            }

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
    try {
        Class.forName(driver);
        String sql = "UPDATE Paspor SET nama_pemilik = ?, kewarganegaraan = ?, tanggal_lahir = ?, "
                + "jenis_kelamin = ?, tanggal_terbit = ?, tanggal_kedaluarsa = ?, negara_penerbit = ? WHERE id_Paspor = ?";
        conn = DriverManager.getConnection(koneksi, user, password);
        pstmt = conn.prepareStatement(sql);

        System.out.print("Masukkan ID Paspor yang akan diupdate: ");
        String idPaspor = input.readLine().trim();
        System.out.print("Nama Pemilik Paspor baru: ");
        String namaPemilikBaru = input.readLine().trim();
        System.out.print("Kewarganegaraan baru: ");
        String kewarganegaraanBaru = input.readLine().trim();
        System.out.print("Tanggal lahir baru (YYYY-MM-DD): ");
        String tanggalLahirBaru = input.readLine().trim();
        System.out.print("Jenis kelamin baru: ");
        String jenisKelaminBaru = input.readLine().trim();
        System.out.print("Tanggal terbit baru (YYYY-MM-DD): ");
        String tanggalTerbitBaru = input.readLine().trim();
        System.out.print("Tanggal kedaluarsa baru (YYYY-MM-DD): ");
        String tanggalKedaluarsaBaru = input.readLine().trim();
        System.out.print("Negara Penerbit baru: ");
        String negaraPenerbitBaru = input.readLine().trim();

        // Validasi format tanggal
        if (!tanggalLahirBaru.matches("\\d{4}-\\d{2}-\\d{2}") || !tanggalTerbitBaru.matches("\\d{4}-\\d{2}-\\d{2}") || 
                !tanggalKedaluarsaBaru.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("Format tanggal salah! Harus sesuai format YYYY-MM-DD.");
            return;  // Menghentikan eksekusi jika format salah
        }

        pstmt.setString(1, namaPemilikBaru);
        pstmt.setString(2, kewarganegaraanBaru);
        pstmt.setDate(3, java.sql.Date.valueOf(tanggalLahirBaru)); 
        pstmt.setString(4, jenisKelaminBaru);
        pstmt.setDate(5, java.sql.Date.valueOf(tanggalTerbitBaru)); 
        pstmt.setDate(6, java.sql.Date.valueOf(tanggalKedaluarsaBaru)); 
        pstmt.setString(7, negaraPenerbitBaru);
        pstmt.setString(8, idPaspor);

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        pstmt.close();
        conn.close();
    } catch (ClassNotFoundException | SQLException | IOException ex) {
        Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void menu() {
        boolean running = true;  // Tambahkan flag untuk menentukan apakah program terus berjalan
        while (running) {  // Loop sampai pengguna memilih untuk keluar
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Update Data");
        System.out.println("0. Keluar");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    running = false;  // Ubah flag menjadi false untuk keluar dari loop
                    System.out.println("Terima kasih, program selesai.");
                    break;
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    hapus();
                    break;
                case 4:
                    update();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (IOException ex) {
            Logger.getLogger(PBO_PertemuanKeempat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    public static void main(String[] args) {
        new PBO_PertemuanKeempat().menu();
    }
}
