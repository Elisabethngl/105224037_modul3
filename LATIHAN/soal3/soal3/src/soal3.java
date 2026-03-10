import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        System.out.println("Deret angka 1-50 (tanpa kelipatan 3 atau 5):");

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            

            System.out.print(i + " ");
        }
    }
}
