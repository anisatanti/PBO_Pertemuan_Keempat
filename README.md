# **TUGAS TM 4 PBO (CRUD DAN EXCEPTION)**
___
## **Deskripsi Project:**
Dalam project ini terdapat 3 kelas yakni kelas PBO_PertemuanKeempat sebagai tugas CRUD, kelas AnisaException sebagai tugas exception sederhana, dan kelas BelajarException yang berisi throws dan try catch dalam menangani masalah exception.
___
### **Informasi Tambahan**:

**Definisi CRUD**: CRUD merupakan serangkaian fungsionalitas mendasar yang digunakan dalam  manajemen database. CRUD adalah akronim dari Create, Read, Update, Delete. Fungsi Create digunakan untuk membuat atau menambahkan data baru, fungsi Read digunakan untuk membaca data, fungsi Update digunakan untuk memperbarui data, dan fungsi Delete digunakan untuk menghapus data.

**Netbeans** berfungsi sebagai IDE (Integrated Development Environtment) yang menyediakan berbagai fitur untuk berinteraksi dengan PostgreSQL seperti koneksi database, editor sql, visual database editor serta JDBC (Java Database Connectivity).

**PostgreSQL** berperan sebagai basis data yang menyimpan, mengatur, dan mengambil data yang digunakan dalam aplikasi yang dibuat menggunakan NetBeans.
___
## **Class PBO_PertemuanKeempat**

### **Proyek CRUD Tabel Paspor**

### **Deskripsi**
Proyek ini diimplementasikan menggunakan Java dengan lingkungan pengembangan NetBeans dan terhubung ke database PostgreSQL. Program ini memungkinkan pengguna untuk melakukan operasi CRUD pada tabel **Paspor**.
Dalam kelas ini terdapat kode program CRUD (Create, Read, Update, Delete) yang mengelola tabel **Paspor** dari database **pertemuan4**. Tabel **Paspor** berisi kolom-kolom berikut:

- **id_Paspor**: ID unik untuk setiap paspor.
- **nama_pemilik**: Nama lengkap pemilik paspor.
- **kewarganegaraan**: Kewarganegaraan pemilik paspor.
- **tanggal_lahir**: Tanggal lahir pemilik paspor (format: YYYY-MM-DD).
- **jenis_kelamin**: Jenis kelamin pemilik paspor.
- **tanggal_terbit**: Tanggal penerbitan paspor (format: YYYY-MM-DD).
- **tanggal_kedaluarsa**: Tanggal kedaluwarsa paspor (format: YYYY-MM-DD).
- **negara_penerbit**: Negara yang menerbitkan paspor.

## **Class AnisaException**

### **Deskripsi:**
Kelas **AnisaException** merupakan subclass dari Exception, yang dirancang untuk melempar dan menangkap kesalahan yang spesifik dalam aplikasi. Kelas ini memiliki konstruktor yang menerima parameter String message dan memanggil konstruktor superclass (super(message)) untuk menyimpan pesan kesalahan.

### **Implementasi**

Dalam metode main, terdapat blok try-catch yang mendemonstrasikan penggunaan AnisaException:

1. **Blok Try**: 
   - Sebuah instance dari AnisaException dilempar dengan pesan "Ini adalah pesan yang salah". 
   - Pembuatan dan pelemparan exception kustom dilakukan dengan:
     throw new AnisaException("Ini adalah pesan yang salah");
    

2. **Blok Catch**: 
   - Menangkap AnisaException yang dilempar dalam blok try.
   - Ketika exception ditangkap, program mencetak "Exception ditangkap:" ke aliran kesalahan (System.err).
   - Pesan kesalahan diambil dari exception menggunakan e.getMessage(), yang dalam hal ini adalah "Ini adalah pesan yang salah".
___
## **Class BelajarException**

### **Deskripsi:**
Kelas **BelajarException** berisi metode untuk melakukan pembagian dan menangani potensi kesalahan yang terkait dengan operasi pembagian. Kelas ini dirancang untuk mendemonstrasikan penggunaan pengecualian dalam Java, khususnya pengecualian aritmatika.
  
### **Implementasi**

1. **Metode bagi(int a, int b)**:
   - Menerima dua parameter: a dan b.
   - Menggunakan throws ArithmeticException untuk menandakan bahwa pengecualian dapat terjadi.
   - Jika b adalah 0, metode ini melempar ArithmeticException dengan pesan "Pembagi tidak boleh nol!".
   - Jika b tidak 0, hasil pembagian a / b dicetak ke konsol.

2. **Metode main**:
   - Membuat instance dari BelajarException.
   - Blok try pertama memanggil belajar.bagi(10, 5), yang valid dan hasilnya 2 dicetak ke konsol.
   - Blok try kedua memanggil belajar.bagi(10, 0), yang melempar ArithmeticException.
   - Blok catch menangkap pengecualian dan mencetak pesan kesalahan menggunakan e.getMessage().
     


