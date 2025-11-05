/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihansoaluklnommor5;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class LatihansoalUKLnommor5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai; // tambahkan ke total
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== Rekapitulasi Nilai Ujian Produktif RPL ===");
        System.out.println("Jumlah Siswa : " + jumlahSiswa);
        System.out.println("Total Nilai  : " + totalNilai);
        System.out.println("Rata-rata    : " + rataRata);
    }
}
