# 🌡️ TemperatureConverter

## 📖 Deskripsi Program
Program **TemperatureConverter** berfungsi untuk mengonversi suhu dari **Celsius ke Fahrenheit**.  
Pengguna diminta memasukkan nilai suhu dalam derajat Celsius, kemudian program akan menghitung dan menampilkan hasil konversinya dalam Fahrenheit.

Program ini ditulis menggunakan bahasa **Java** dengan konsep **Pemrograman Berorientasi Objek (OOP)** sederhana, serta menerapkan atribut dan method dalam satu kelas utama.

---

## 🧩 Struktur Kelas dan Penjelasan

### 🏷️ Class: `TemperatureConverter`
Kelas ini merupakan kelas utama yang menjalankan seluruh proses konversi suhu.  
Kelas ini memiliki satu atribut dan beberapa method untuk mendukung proses input, perhitungan, dan output hasil konversi.

#### 🔹 Atribut:
- **`private double celsius`**  
  Atribut yang menyimpan nilai suhu dalam satuan derajat Celsius.  
  Bersifat **private** agar hanya bisa diakses melalui method getter dan setter (penerapan *encapsulation*).

#### 🔹 Method:
1. **`public static void main(String[] args)`**  
   Method utama yang menjadi titik awal eksekusi program.
    - Meminta input suhu dalam Celsius dari pengguna.
    - Memanggil method `toFahrenheit()` untuk melakukan konversi.
    - Menampilkan hasil konversi ke layar.

   **Contoh eksekusi:**
   Masukkan suhu dalam Celsius: 30
   Suhu dalam Fahrenheit: 86.0

markdown
Copy code

2. **`public static double toFahrenheit(double celsius)`**  
   Method untuk mengonversi suhu dari Celsius ke Fahrenheit menggunakan rumus:  
   \[
   Fahrenheit = (Celsius \times \frac{9}{5}) + 32
   \]  
   Method ini bersifat **static** agar dapat dipanggil langsung dari method `main()` tanpa membuat objek baru.

3. **`public double getCelsius()`**  
   Method getter yang digunakan untuk **mengambil nilai** suhu dalam Celsius dari atribut `celsius`.

4. **`public void setCelsius(double celsius)`**  
   Method setter yang digunakan untuk **mengatur nilai** suhu dalam Celsius ke atribut `celsius`.

---

## 💻 Contoh Output Program
Masukkan suhu dalam Celsius: 25
Suhu dalam Fahrenheit: 77.0

Copy code
Masukkan suhu dalam Celsius: 100
Suhu dalam Fahrenheit: 212.0

yaml
Copy code

---

## 📘 Informasi Program
| Informasi | Keterangan |
|------------|------------|
| **Nama Program** | TemperatureConverter |
| **Tujuan** | Mengonversi suhu dari Celsius ke Fahrenheit |
| **Bahasa Pemrograman** | Java |
| **Konsep Utama** | Encapsulation & Method |
| **Author** | Grenda Agriansyah |
| **Versi** | 1.1 |
| **Tanggal** | 25 Oktober 2025 |

---

## 📖 Kesimpulan
Kelas **TemperatureConverter** menunjukkan penerapan konsep dasar dalam **Pemrograman Berorientasi Objek (OOP)**.  
Dengan satu atribut dan beberapa method pendukung, program ini memperlihatkan bagaimana:
- Data (suhu) disimpan dalam atribut privat,
- Perhitungan dilakukan melalui method khusus, dan
- Hasilnya ditampilkan melalui interaksi dengan pengguna.

Program ini sederhana namun efektif untuk memahami alur data, logika perhitungan, serta struktur dasar kelas dalam Java.