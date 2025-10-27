# 🌡️ Program Konversi Suhu (TemperatureConverter.java)

## 🧩 Deskripsi Program
Program ini dibuat menggunakan bahasa **Java** dengan konsep **Pemrograman Berorientasi Objek (OOP)**.  
Fungsinya untuk **mengonversi suhu dari Celsius ke Fahrenheit dan sebaliknya**.

Program ini berisi satu class utama bernama `TemperatureConverter` yang memiliki atribut dan method untuk melakukan proses konversi suhu.

---

---

## 🧠 Penjelasan Class dan Method

### 🔸 Class: `TemperatureConverter`
Merupakan class utama yang digunakan untuk menjalankan program konversi suhu.

### 🔹 Attribute:
- `double celsius`  
  Menyimpan nilai suhu dalam derajat Celsius yang akan dikonversi atau digunakan sebagai referensi.

### 🔹 Method:
- `main(String[] args)`  
  Method utama yang menjalankan alur program.  
  Program akan meminta input suhu dari pengguna dan menentukan jenis konversi.

- `toFahrenheit(double celsius)`  
  Mengubah suhu dari Celsius ke Fahrenheit menggunakan rumus:


Fahrenheit = (Celsius × 9 / 5) + 32


- `toCelsius(double fahrenheit)`  
  Mengubah suhu dari Fahrenheit ke Celsius menggunakan rumus:


Celsius = (Fahrenheit - 32) × 5 / 9


- `getCelsius()`  
  Mengambil (mengembalikan) nilai suhu dalam Celsius.

- `setCelsius(double celsius)`  
  Mengatur (menyimpan) nilai suhu dalam Celsius ke atribut.

---

## 🔄 Alur Program
1. Program dijalankan melalui method `main`.
2. Pengguna memilih jenis konversi:
- 1 → Celsius ke Fahrenheit
- 2 → Fahrenheit ke Celsius
3. Program meminta pengguna memasukkan nilai suhu.
4. Hasil konversi ditampilkan di layar.

---

## 💡 Contoh Output



=== KONVERSI SUHU ===

Celsius ke Fahrenheit

Fahrenheit ke Celsius
Pilih jenis konversi (1/2): 1
Masukkan suhu dalam Celsius: 25
Hasil: 77.0°F


---

## 🧾 Kesimpulan
Class `TemperatureConverter` menerapkan konsep dasar **OOP (Encapsulation dan Method)**.  
Struktur kode ini dapat dikembangkan lebih lanjut, misalnya dengan menambahkan validasi input atau konversi ke satuan suhu lain (Reamur, Kelvin, dll).

---

**Nama:** Grenda Agriansyah  
**Tanggal:** 27 Oktober 2025  
**Versi:** 2.0