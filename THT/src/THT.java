import java.util.Scanner;

public class THT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stok_VIP = 5;
        int stok_festival = 25;
        int stok_tribune = 35;
    
        int harga_VIP = 1500000;
        int harga_festival = 800000;
        int harga_tribune = 500000;

        boolean mesin_nyala = true;

        while (mesin_nyala) {
            System.out.println("\n--- UNIVERSITAS PERTAMINA SOUNDFEST 2026 ---");
            System.out.println("Sisa Stok: VIP (" + stok_VIP + "), Festival (" + stok_festival + "), Tribune (" + stok_tribune + ")");
            System.out.println("1. Beli Tiket VIP (Min. 18 thn)");
            System.out.println("2. Beli Tiket Festival (Min. 15 thn)");
            System.out.println("3. Beli Tiket Tribune (Semua Usia)");
            System.out.println("4. Matikan Mesin (Teknisi)");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                mesin_nyala = false; 
                System.out.println("Mesin dimatikan...");
                break;
            }

            int stok_tersedia = 0, harga_tiket = 0, min_usia = 0;
            String kategori = "";

            if (pilihan == 1) {
                stok_tersedia = stok_VIP; harga_tiket = harga_VIP; min_usia = 18; kategori = "VIP";
            } else if (pilihan == 2) {
                stok_tersedia = stok_festival; harga_tiket = harga_festival; min_usia = 15; kategori = "Festival";
            } else if (pilihan == 3) {
                stok_tersedia = stok_tribune; harga_tiket = harga_tribune; min_usia = 0; kategori = "Tribune";
            } else {
                System.out.println("Menu tidak valid!");
                continue;
            }

            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlah_beli = input.nextInt();

            if (jumlah_beli > stok_tersedia) {
                System.out.println("Gagal: Stok tiket tidak mencukupi! (Sisa stok " + kategori + ": " + stok_tersedia + ")");
                continue; 
            }

            int tiket_berhasil = 0;
            boolean tiket_batal = false;
        
            for (int i = 1; i <= jumlah_beli; i++) {
                int usia;
                while (true) {
                    System.out.print("Masukkan usia untuk Tiket ke-" + i + " (Ketik -1 untuk batal): ");
                    usia = input.nextInt();

                    if (usia == -1) { 
                        tiket_batal = true;
                        break;
                    }
                    if (usia > 0 && usia <= 120) { 
                        break;
                    }
                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                }

                if (tiket_batal) break;

                if (usia >= min_usia) {
                    System.out.println("> Tiket ke-" + i + " Berhasil diverifikasi.");
                    tiket_berhasil++;
                } else {
                    System.out.println("> Tiket ke-" + i + " Gagal: Usia tidak memenuhi syarat.");
                }
            }

            if (tiket_batal) {
                System.out.println("Transaksi dibatalkan oleh pengguna.");
                continue;
            }

            if (tiket_berhasil > 0) {
                if (pilihan == 1) stok_VIP -= tiket_berhasil;
                else if (pilihan == 2) stok_festival -= tiket_berhasil;
                else if (pilihan == 3) stok_tribune -= tiket_berhasil;

                System.out.println("\n--- STRUK PEMBAYARAN ---");
                System.out.println("Kategori: " + kategori);
                System.out.println("Jumlah Berhasil: " + tiket_berhasil);
                System.out.println("Total Tagihan: Rp " + (tiket_berhasil * harga_tiket));
            } else {
                System.out.println("Tidak ada tiket yang berhasil diproses.");
            }
        }
    }
}