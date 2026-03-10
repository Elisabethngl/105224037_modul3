import java.util.Scanner;

public class PreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Usia (tahun): ");
        int usia = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan Kadar Hemoglobin (g/dL): ");
        double kadarHb = input.nextDouble();

        System.out.println("\n--- Hasil Evaluasi ---");

        // Evaluasi menggunakan Nested If (Percabangan Bersarang)
        if (usia >= 17 ) {
            System.out.println("Status: LAYAK menjadi donor darah.");
                } else {
                    System.out.println("Alasan: Usia tidak memenuhi syarat.");
                }
            if (beratBadan >= 45) {
                System.out.println("Status: LAYAK menjadi donor darah.");
                } else {
                System.out.println("Alasan: beratBadan tidak memenuhi syarat.");
                }
                if (kadarHb >= 12.5 && kadarHb <= 17.0) {
                    System.out.println("Status: LAYAK menjadi donor darah.");
                }  else {
                System.out.println("Alasan: Kadar Hemoglobin tidak memenuhi syarat.");
                }
        input.close();
    }
}