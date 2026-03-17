import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Ujian: ");
        int nilai = input.nextInt();
        System.out.print("Masukkan Persentase Absensi (0-100): ");
        int absensi = input.nextInt();

        // Menggunakan satu baris Ternary Operator sesuai instruksi
        String status = (nilai >= 75 && absensi > 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status: " + status);

        input.close();
    }
}