import java.util.Scanner;

/**
 * Kelas {@code TemperatureConverter} digunakan untuk melakukan konversi suhu antara
 * Celsius dan Fahrenheit.
 *
 * <p>Program ini dapat:
 * <ul>
 *     <li>Mengonversi suhu dari Celsius ke Fahrenheit</li>
 *     <li>Mengonversi suhu dari Fahrenheit ke Celsius</li>
 * </ul>
 *
 * <p>Pengguna dapat memilih jenis konversi melalui menu interaktif di terminal.</p>
 *
 * @author Grenda
 * @version 2.0
 * @since 2025-10-26
 */
public class TemperatureConverter {

    /** Menyimpan nilai suhu dalam Celsius. */
    private double celsius;

    /**
     * Method utama untuk menjalankan program konversi suhu.
     *
     * <p>Program ini akan menampilkan menu pilihan untuk melakukan konversi suhu
     * dari Celsius ke Fahrenheit atau sebaliknya.</p>
     *
     * @param args argumen dari command line (tidak digunakan di sini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KONVERSI SUHU ===");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih jenis konversi (1/2): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = toFahrenheit(celsius);
            System.out.println("Hasil: " + fahrenheit + "°F");
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = toCelsius(fahrenheit);
            System.out.println("Hasil: " + celsius + "°C");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    /**
     * Mengonversi suhu dari Celsius ke Fahrenheit.
     *
     * <p>Rumus:</p>
     * <pre>
     * Fahrenheit = (Celsius × 9 / 5) + 32
     * </pre>
     *
     * @param celsius nilai suhu dalam derajat Celsius.
     * @return hasil konversi dalam derajat Fahrenheit.
     */
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
//1
    /**
     * Mengonversi suhu dari Fahrenheit ke Celsius.
     *
     * <p>Rumus:</p>
     * <pre>
     * Celsius = (Fahrenheit - 32) × 5 / 9
     * </pre>
     *
     * @param fahrenheit nilai suhu dalam derajat Fahrenheit.
     * @return hasil konversi dalam derajat Celsius.
     */
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
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
