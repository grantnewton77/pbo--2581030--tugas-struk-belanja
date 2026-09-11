//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama barang 1 : ");
        String namaBarang1 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga1 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah1 = input.nextInt();
        input.nextLine();

        int subtotal1 = harga1 * jumlah1;

        int totalBelanja = subtotal1;

        System.out.print("Uang dibayar  : ");
        int uangDibayar = input.nextInt();

        int kembalian = uangDibayar - totalBelanja;

        System.out.println();
        System.out.println("===== STRUK BELANJA =====");

        System.out.println(namaBarang1 + "  " + jumlah1 + " x " + harga1 + " = " + subtotal1);

        System.out.println("-------------------------");
        System.out.println("Total belanja = " + totalBelanja);
        System.out.println("Uang dibayar  = " + uangDibayar);
        System.out.println("Kembalian     = " + kembalian);

        }
    }
