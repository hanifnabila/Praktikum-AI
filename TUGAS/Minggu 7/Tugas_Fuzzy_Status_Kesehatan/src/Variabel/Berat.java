/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author entin
 */
public class Berat {

    public static double berat;

    // baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk
    // mengganti nilai ketika ada perubahan

    private static double titik1 = 0;
    private static double titik2 = 40;
    private static double titik3 = 45;
    private static double titik4 = 50;
    private static double titik5 = 55;
    private static double titik6 = 60;
    private static double titik7 = 65;
    private static double titik8 = 80;
    private static double titik9 = 85;

    // buat method untuk mengakses nilai pada variabel persediaan
    public static double getBerat() {

        return berat;
    }

    // buat method untuk memberikan nilai pada variabel persediaan
    public static void setBerat(double berat) {
        Berat.berat = berat;
    }

    // method fungsi sedikit
    public static double sangatkurus() {
        if (berat >= titik1 && berat <= titik2) {
            return 1;
        } else if (berat > titik2 && berat < titik3) {
            return (titik3 - berat) / (titik3 - titik2);
        } else {
            return 0;
        }
    }

    // method fungsi banyak
    public static double kurus() {
        if (berat > titik2 && berat < titik3) {
            return (berat - titik2) / (titik3 - titik2);
        } else if (berat >= titik3 && berat <= titik4) {
            return 1;
        } else if (berat > titik4 && berat < titik5) {
            return (titik5 - berat) / (titik5 - titik4);
        } else {
            return 0;
        }
    }

    public static double biasa() {
        if (berat > titik4 && berat < titik5) {
            return (berat - titik4) / (titik5 - titik4);
        } else if (berat >= titik5 && berat <= titik6) {
            return 1;
        } else if (berat > titik6 && berat < titik7) {
            return (titik7 - berat) / (titik7 - titik6);
        } else {
            return 0;
        }
    }

    public static double berat() {
        if (berat > titik6 && berat < titik7) {
            return (berat - titik6) / (titik7 - titik6);
        } else if (berat >= titik7 && berat <= titik8) {
            return 1;
        } else if (berat > titik8 && berat < titik9) {
            return (titik9 - berat) / (titik9 - titik8);
        } else {
            return 0;
        }
    }

    public static double sangatberat() {
        if (berat > titik8 && berat < titik9) {
            return (berat - titik8) / (titik9 - titik8);
        } else if (berat >= titik9) {
            return 1;
        } else {
            return 0;
        }
    }
}
