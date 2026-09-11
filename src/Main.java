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

        System.out.print("Nama barang 2 : ");
        String namaBarang2 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga2 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah2 = input.nextInt();
        input.nextLine();

        System.out.print("Nama barang 3 : ");
        String namaBarang3 = input.nextLine();

        System.out.print("Harga satuan  : ");
        int harga3 = input.nextInt();

        System.out.print("Jumlah        : ");
        int jumlah3 = input.nextInt();


        int subtotal1 = harga1 * jumlah1;
        int subtotal2 = harga2 * jumlah2;
        int subtotal3 = harga3 * jumlah3;

        int totalBelanja = subtotal1 + subtotal2 + + subtotal3;

        System.out.print("Uang dibayar  : ");
        int uangDibayar = input.nextInt();

        int kembalian = uangDibayar - totalBelanja;


        System.out.println();
        System.out.println("===== STRUK BELANJA =====");

        System.out.println(namaBarang1 + "  " + jumlah1 + " x " + harga1 + " = " + subtotal1);
        System.out.println(namaBarang2 + "  " + jumlah2 + " x " + harga2 + " = " + subtotal2);
        System.out.println(namaBarang3 + "  " + jumlah3 + " x " + harga3 + " = " + subtotal3);

        System.out.println("-------------------------");
        System.out.println("Total belanja = " + totalBelanja);
        System.out.println("Uang dibayar  = " + uangDibayar);
        System.out.println("Kembalian     = " + kembalian);

        }
    }
