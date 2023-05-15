/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author entin
 */
public class Tinggi {
    public static double tinggi;

    // baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk
    // mengganti nilai ketika ada perubahan
    private static double titik1 = 0;
    private static double titik2 = 115;
    private static double titik3 = 120;
    private static double titik4 = 140;
    private static double titik5 = 145;
    private static double titik6 = 160;
    private static double titik7 = 165;
    private static double titik8 = 180;
    private static double titik9 = 185;

    // buat method untuk mengakses nilai pada variabel persediaan
    public static double getTinggi() {
        return tinggi;
    }

    // buat method untuk memberikan nilai pada variabel persediaan
    public static void setTinggi(double tinggi) {
        Tinggi.tinggi = tinggi;
    }

    // method fungsi sedikit
    public static double sangatpendek() {
        if (tinggi >= titik1 && tinggi <= titik2)
            return 1;

        else if (tinggi > titik2 && tinggi < titik3)
            return (titik3 - tinggi) / (titik3 - titik2);
        else
            return 0;
    }

    // method fungsi banyak
    public static double pendek() {
        if (tinggi > titik2 && tinggi < titik3)
            return (tinggi - titik2) / (titik3 - titik2);
        else if (tinggi >= titik3 && tinggi <= titik4)
            return 1;
        else if (tinggi > titik4 && tinggi < titik5)
            return (titik5 - tinggi) / (titik5 - titik4);
        else
            return 0;
    }

    public static double sedang() {
        if (tinggi > titik4 && tinggi < titik5)
            return (tinggi - titik4) / (titik5 - titik4);
        else if (tinggi >= titik5 && tinggi <= titik6)
            return 1;
        else if (tinggi > titik6 && tinggi < titik7)
            return (titik7 - tinggi) / (titik7 - titik6);
        else
            return 0;
    }

    public static double tinggi() {
        if (tinggi > titik6 && tinggi < titik7)
            return (tinggi - titik6) / (titik7 - titik6);
        else if (tinggi >= titik7 && tinggi <= titik8)
            return 1;
        else if (tinggi > titik8 && tinggi < titik9)
            return (titik9 - tinggi) / (titik9 - titik8);
        else
            return 0;
    }

    public static double sangattinggi() {
        if (tinggi > titik8 && tinggi < titik9)
            return (tinggi - titik8) / (titik9 - titik8);
        else if (tinggi >= titik9)
            return 1;
        else
            return 0;
    }
}
