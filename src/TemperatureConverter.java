import java.util.Scanner;

/**
 * Kelas TemperatureConverter digunakan untuk mengonversi suhu dari Celsius ke Fahrenheit.
 * Program ini meminta pengguna memasukkan suhu dalam Celsius dan menampilkan hasil konversinya.
 *
 * <p>Contoh:
 * Jika pengguna memasukkan 25, maka hasilnya adalah 77°F.</p>
 *
 * @author Grenda
 * @version 1.1
 * @since 2025-10-25
 */
public class TemperatureConverter {

    /** Menyimpan nilai suhu dalam Celsius. */
    private double celsius;

    /**
     * Method utama untuk menjalankan program konversi suhu.
     *
     * @param args argumen dari command line (tidak digunakan di sini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = toFahrenheit(celsius);

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        input.close();
    }

    /**
     * Mengonversi suhu dari Celsius ke Fahrenheit.
     *
     * @param celsius nilai suhu dalam derajat Celsius.
     * @return nilai suhu yang sudah dikonversi ke Fahrenheit.
     */
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Mengambil nilai suhu dalam Celsius.
     *
     * @return nilai suhu dalam derajat Celsius.
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * Mengatur nilai suhu dalam Celsius.
     *
     * @param celsius nilai suhu yang akan diset.
     */
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
