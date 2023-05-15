package Variabel;

public class GraduateRecordExamination {
   public static double graduateRecordExamination;
   private static double titik1 = 0;
   private static double titik2 = 800;
   private static double titik3 = 1200;
   private static double titik4 = 1800;

   public static double getGRE() {
      return graduateRecordExamination;
   }

   public static void setGRE(double gre) {
      GraduateRecordExamination.graduateRecordExamination = gre;
   }

   public static double low() {
      if (graduateRecordExamination >= titik1 && graduateRecordExamination <= titik2) {
         return 1;
      } else if (graduateRecordExamination > titik2 && graduateRecordExamination < titik3) {
         return (titik3 - graduateRecordExamination) / (titik3 - titik2);
      } else {
         return 0;
      }
   }

   public static double medium() {
      if (graduateRecordExamination > titik2 && graduateRecordExamination < titik3) {
         return (graduateRecordExamination - titik2) / (titik3 - titik2);
      } else if (graduateRecordExamination >= titik3 && graduateRecordExamination <= titik4) {
         return (graduateRecordExamination - titik3) / (titik4 - titik3);
      } else {
         return 0;
      }
   }

   public static double high() {
      if (graduateRecordExamination > titik3 && graduateRecordExamination < titik4) {
         return (graduateRecordExamination - titik3) / (titik4 - titik3);
      } else if (graduateRecordExamination >= titik4) {
         return 1;
      } else {
         return 0;
      }
   }
}