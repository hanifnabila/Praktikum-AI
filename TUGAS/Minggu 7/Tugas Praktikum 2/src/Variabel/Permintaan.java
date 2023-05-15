package Variabel;

public class Permintaan {
   public static double permintaan;
   private static double titik1 = 0;
   private static double titik2 = 1000;
   private static double titik3 = 5000;

   public static double getPermintaan() {
      return permintaan;
   }

   public static void setPermintaan(double permintaan) {
      Permintaan.permintaan = permintaan;
   }

   public static double turun() {
      if (permintaan >= titik1 && permintaan <= titik2)
         return 1;
      else if (permintaan > titik2 && permintaan < titik3)
         return (titik3 - permintaan) / (titik3 -
               titik2);
      else
         return 0;
   }

   public static double naik() {
      if (permintaan > titik2 && permintaan < titik3)
         return (permintaan - titik2) / (titik3 - titik2);
      else if (permintaan >= titik3)
         return 1;
      else
         return 0;
   }
}