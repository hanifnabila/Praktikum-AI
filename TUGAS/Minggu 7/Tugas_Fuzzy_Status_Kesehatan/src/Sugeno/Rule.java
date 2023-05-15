/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sugeno;

/**
 *
 * @author entin
 */
import Variabel.*;
import java.util.Scanner;

public class Rule {
    private static double[] u_Status = new double[25];
    private static String[] z_Status = {
            "Sangat Sehat", "Sehat", "Agak Sehat", "Tidak Sehat", "TidakSehat",
            "Sehat", "Sangat Sehat", "Sehat", "Agak Sehat", "Tidak Sehat",
            "Agak Sehat", "Sangat Sehat", "Sangat Sehat", "Agak Sehat", "Tidak Sehat",
            "Tidak Sehat", "Sehat", "Sangat Sehat", "Sehat", "Tidak Sehat",
            "Tidak Sehat", "Agak Sehat", "Sangat Sehat", "Sehat", "Agak Sehat" };

    private static String status;

    // rule
    public static void hitung_u() {
        u_Status[0] = Math.min(Tinggi.sangatpendek(), Berat.sangatkurus());
        u_Status[1] = Math.min(Tinggi.sangatpendek(), Berat.kurus());
        u_Status[2] = Math.min(Tinggi.sangatpendek(), Berat.biasa());
        u_Status[3] = Math.min(Tinggi.sangatpendek(), Berat.berat());
        u_Status[4] = Math.min(Tinggi.sangatpendek(), Berat.sangatberat());
        u_Status[5] = Math.min(Tinggi.pendek(), Berat.sangatkurus());
        u_Status[6] = Math.min(Tinggi.pendek(), Berat.kurus());
        u_Status[7] = Math.min(Tinggi.pendek(), Berat.biasa());
        u_Status[8] = Math.min(Tinggi.pendek(), Berat.berat());
        u_Status[9] = Math.min(Tinggi.pendek(), Berat.sangatberat());
        u_Status[10] = Math.min(Tinggi.sedang(), Berat.sangatkurus());
        u_Status[11] = Math.min(Tinggi.sedang(), Berat.kurus());
        u_Status[12] = Math.min(Tinggi.sedang(), Berat.biasa());
        u_Status[13] = Math.min(Tinggi.sedang(), Berat.berat());
        u_Status[14] = Math.min(Tinggi.sedang(), Berat.sangatberat());
        u_Status[15] = Math.min(Tinggi.tinggi(), Berat.sangatkurus());
        u_Status[16] = Math.min(Tinggi.tinggi(), Berat.kurus());
        u_Status[17] = Math.min(Tinggi.tinggi(), Berat.biasa());
        u_Status[18] = Math.min(Tinggi.tinggi(), Berat.berat());
        u_Status[19] = Math.min(Tinggi.tinggi(), Berat.sangatberat());
        u_Status[20] = Math.min(Tinggi.sangattinggi(), Berat.sangatkurus());
        u_Status[21] = Math.min(Tinggi.sangattinggi(), Berat.kurus());
        u_Status[22] = Math.min(Tinggi.sangattinggi(), Berat.biasa());
        u_Status[23] = Math.min(Tinggi.sangattinggi(), Berat.berat());
        u_Status[24] = Math.min(Tinggi.sangattinggi(), Berat.sangatberat());
    }

    public static double hitung_z() {
        int i;
        double max = 0;

        for (i = 0; i < u_Status.length; i++)
            if (max < u_Status[i]) {
                max = u_Status[i];
                status = z_Status[i];
            }
        return max;
    }
    // end of rule

    // cari nilai bobot (tsukamoto)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Berat Badan: ");
        Berat.berat = sc.nextDouble();
        System.out.print("Masukan Tinggi Badan: ");
        Tinggi.tinggi = sc.nextDouble();
        hitung_u();
        for (int i = 0; i < 24; i++) {
            System.out.println("u_ke-" + i + " : " + u_Status[i]);
        }
        System.out.println("Bobot : " + hitung_z() + " dengan status kesehatan :" + status);
    }
}
