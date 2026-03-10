 import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pin = "123456";
        int percobaan = 0;
        int batasmaksimalpercobaan = 3;
        boolean loginBerhasil = false;

        while (percobaan < batasmaksimalpercobaan) {
            System.out.print("Masukkan PIN Anda: ");
            String inputPin = input.next();
            percobaan++;

            if (inputPin.equals(pin)) {
                System.out.println("Login Berhasil!");
                loginBerhasil = true;
                break; 
            } else {
                if (percobaan < batasmaksimalpercobaan) {
                    System.out.println("PIN salah. Sisa percobaan: " + (batasmaksimalpercobaan - percobaan));
                }
            }
        }

        if (!loginBerhasil) {
            System.out.println("Akun diblokir.");
        }

        input.close();
    }
}
    