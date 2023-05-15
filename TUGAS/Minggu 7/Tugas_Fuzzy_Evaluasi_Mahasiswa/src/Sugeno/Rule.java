package Sugeno;

import java.util.Scanner;
import Variabel.*;

public class Rule {
    private static double[] uStatus = new double[25];
    private static String[] zStatus = {
            "Excellent", "Very Good", "Fair ", "Good", "Good", "Poor ", "Fair ", "Poor ", "Poor " };
    private static String status;

    public static void hitungU() {
        uStatus[0] = Math.min(GradePointAverage.high(), GraduateRecordExamination.high());
        uStatus[1] = Math.min(GradePointAverage.high(), GraduateRecordExamination.medium());
        uStatus[2] = Math.min(GradePointAverage.high(), GraduateRecordExamination.low());
        uStatus[3] = Math.min(GradePointAverage.medium(), GraduateRecordExamination.high());
        uStatus[4] = Math.min(GradePointAverage.medium(), GraduateRecordExamination.medium());
        uStatus[5] = Math.min(GradePointAverage.medium(), GraduateRecordExamination.low());
        uStatus[6] = Math.min(GradePointAverage.low(), GraduateRecordExamination.high());
        uStatus[7] = Math.min(GradePointAverage.low(), GraduateRecordExamination.medium());
        uStatus[8] = Math.min(GradePointAverage.low(), GraduateRecordExamination.low());
    }

    public static double hitungZ() {
        int i;
        double max = 0;
        for (i = 0; i < uStatus.length; i++)
            if (max < uStatus[i]) {
                max = uStatus[i];
                status = zStatus[i];
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan GPA: ");
        GradePointAverage.gradePointAverage = sc.nextDouble();
        System.out.print("Masukan GRE: ");
        GraduateRecordExamination.graduateRecordExamination = sc.nextDouble();
        hitungU();
        for (int i = 0; i < 24; i++) {
            System.out.println(" u_ke-" + i + " : " + uStatus[i]);
        }
        System.out.println("Bobot : " + hitungZ() + " dengan status evaluasi : " + status);
    }
}