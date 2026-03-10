import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        double saldo = 500000;
        int pilih;

        do {
            System.out.println("\n=== MENU UTAMA ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("Saldo saat ini: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setor tunai: Rp ");
                    double setor = input.nextDouble();
                    saldo += setor;
                    System.out.println("Setoran berhasil. Saldo terbaru: Rp " + saldo);
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: Rp ");
                    double tarik = input.nextDouble();
                    
                    // Validasi: saldo setelah penarikan tidak boleh kurang dari Rp 50.000
                    if (saldo - tarik < 50000) {
                        System.out.println("Transaksi Dibatalkan!");
                        System.out.println("Peringatan: Saldo minimal setelah penarikan harus Rp 50.000.");
                    } else {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil. Sisa saldo: Rp " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilih != 4); // Loop berhenti jika pengguna memilih opsi 4

        input.close();
    }
}