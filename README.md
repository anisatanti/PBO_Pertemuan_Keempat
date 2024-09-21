# **TUGAS TM 4 PBO (CRUD DAN EXCEPTION)**
___
## **_Deskripsi_:**
Dalam proyek ini terdapat 5 kelas yakni kelas PBO_PertemuanKeempat sebagai tugas CRUD, kelas TryCatch sebagai kelas yang mengimplementasikan penggunaan Exception yang ditangani dengan try catch, kelas Throws sebagai kelas yang mengimplementasikan penggunaan Exception yang ditangani dengan Throws, serta kelas AnisaException sebagai kelas exception custom yang mengextends ArithmeticException. Dalam kelas TryCatch, Throws, dan AnisaException berisi studi kasus penanganan exception yang sama yakni mengenai ArithmeticException.
___
### **Informasi Tambahan**:

**Definisi CRUD**: CRUD merupakan serangkaian fungsionalitas mendasar yang digunakan dalam  manajemen database. CRUD adalah akronim dari Create, Read, Update, Delete. Fungsi Create digunakan untuk membuat atau menambahkan data baru, fungsi Read digunakan untuk membaca data, fungsi Update digunakan untuk memperbarui data, dan fungsi Delete digunakan untuk menghapus data.

**Netbeans** berfungsi sebagai IDE (Integrated Development Environtment) yang menyediakan berbagai fitur untuk berinteraksi dengan PostgreSQL seperti koneksi database, editor sql, visual database editor serta JDBC (Java Database Connectivity).

**PostgreSQL** berperan sebagai basis data yang menyimpan, mengatur, dan mengambil data yang digunakan dalam aplikasi yang dibuat menggunakan NetBeans.
___
## **Kelas PBO_PertemuanKeempat**

### **Proyek CRUD Tabel Paspor**

### **Deskripsi**
Proyek ini diimplementasikan menggunakan Java NetBeans dan terhubung ke database PostgreSQL. Program ini memungkinkan pengguna untuk melakukan operasi CRUD pada tabel **Paspor**.
Dalam kelas ini terdapat kode program CRUD (Create, Read, Update, Delete) yang mengelola tabel **Paspor** dari database **pertemuan4**. Tabel **Paspor** berisi kolom-kolom berikut:

- **id_Paspor**: ID unik untuk setiap paspor.
- **nama_pemilik**: Nama lengkap pemilik paspor.
- **kewarganegaraan**: Kewarganegaraan pemilik paspor.
- **tanggal_lahir**: Tanggal lahir pemilik paspor (format: YYYY-MM-DD).
- **jenis_kelamin**: Jenis kelamin pemilik paspor.
- **tanggal_terbit**: Tanggal penerbitan paspor (format: YYYY-MM-DD).
- **tanggal_kedaluarsa**: Tanggal kedaluwarsa paspor (format: YYYY-MM-DD).
- **negara_penerbit**: Negara yang menerbitkan paspor.

## **Kelas TryCatch**

### **_Deskripsi_:**
Kelas TryCatch ini mengimplementasikan penanganan exception dengan jenis ArithmeticException. Dalam kode program ini berisi studi kasus menghitung keuntungan dengan exception keuntungan tidak boleh nol atau negatif. kode menerima dua parameter yakni pendapatan dan biaya. Pada blok try menghitung keuntungan yang diperoleh dari pendapatan dikurangi biaya dan mengecek apakah keuntungan <= 0 Jika ya, melempar ArithmeticException dengan pesan "Keuntungan tidak boleh nol atau negatif." Jika keuntungan valid, mencetak nilai keuntungan. Pada blok catch Menangkap ArithmeticException jika terjadi dan Mencetak pesan error yang diambil dari exception. Program tersebut mencetak pesan error: “Keuntungan tidak boleh nol atau negatif” karena 50000-60000 = -10000 yang artinya rugi 10000
___
## **Kelas Throws**

### **_Deskripsi:_**
Kelas Throws ini mengimplementasikan penanganan exception dengan jenis ArithmeticException dengan studi kasus menghitung keuntungan yang tidak boleh nol atau negatif. Kode program ini menerima dua parameter yakni pendapatan dan biaya. Keuntungan diperoleh dari pendapatan dikurangi biaya. Keuntungan tidak boleh <= 0. Jika keuntungan tidak valid (bernilai <=0), metode melemparkan ArithmeticException dan program akan mencetak output “Keuntungan tidak boleh nol atau negatif”. Jika keuntungan bernilai valid maka program akan mencetak hasil keuntungan. Dalam kasus tersebut mencetak “Keuntungan tidak boleh nol atau negatif” karena 50000-60000 = -10000  yang berarti rugi 10000.
___
### **Kelas AnisaException**

### **_Deskripsi:_**
Kelas AnisaException merupakan kelas exception custom yang mengextends ArithmeticException, digunakan untuk menangani kondisi di mana keuntungan tidak valid (bernilai nol atau negatif). Dalam metode hitungKeuntungan, program menghitung keuntungan dengan mengurangkan biaya dari pendapatan. input pertama di definisikan sebagai pendapatan dan input kedua di definisikan sebagai biaya. Jika keuntungan bernilai <=0, metode melemparkan AnisaException dengan pesan error: “Keuntungan tidak boleh nol atau negatif”. Di dalam metode main, dilakukan dua percobaan: pertama, menghitung keuntungan dari input 1000 dan 1500, yang akan menghasilkan exception karena keuntungan bernilai negatif. Kedua, menghitung keuntungan dari input 2000 dan 1000, yang bernilai valid dan mencetak hasil keuntungan  sebesar 1000 . 



