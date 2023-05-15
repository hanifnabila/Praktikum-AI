package Variabel;

public class GradePointAverage {
    public static double gradePointAverage;
    private static double titik1 = 0;
    private static double titik2 = 2.2;
    private static double titik3 = 3.0;
    private static double titik4 = 3.8;

    public static double getGPA() {
        return gradePointAverage;
    }

    public static void setGPA(double gpa) {
        GradePointAverage.gradePointAverage = gpa;
    }

    public static double low() {
        if (gradePointAverage >= titik1 && gradePointAverage <= titik2) {
            return 1;
        } else if (gradePointAverage > titik2 && gradePointAverage < titik3) {
            return (titik3 - gradePointAverage) / (titik3 - titik2);
        } else {
            return 0;
        }
    }

    public static double medium() {
        if (gradePointAverage > titik2 && gradePointAverage < titik3) {
            return (gradePointAverage - titik2) / (titik3 - titik2);
        } else if (gradePointAverage >= titik3 && gradePointAverage <= titik4) {
            return (gradePointAverage - titik3) / (titik4 - titik3);
        } else {
            return 0;
        }
    }

    public static double high() {
        if (gradePointAverage > titik3 && gradePointAverage < titik4) {
            return (gradePointAverage - titik3) / (titik4 - titik3);
        } else if (gradePointAverage >= titik4) {
            return 1;
        } else {
            return 0;
        }
    }
}