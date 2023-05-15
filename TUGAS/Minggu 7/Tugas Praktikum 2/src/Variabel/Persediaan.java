package Variabel;

public class Persediaan {
    public static double persediaan;
    private static double titik1 = 0;
    private static double titik2 = 100;
    private static double titik3 = 600;

    public static double getPersediaan() {
        return persediaan;
    }

    public static void setPersediaan(double persediaan) {
        Persediaan.persediaan = persediaan;
    }

    public static double sedikit() {
        if (persediaan >= titik1 && persediaan <= titik2)
            return 1;
        else if (persediaan > titik2 && persediaan < titik3)
            return (titik3 - persediaan) / (titik3 - titik2);
        else
            return 0;
    }

    public static double banyak() {
        if (persediaan > titik2 && persediaan < titik3)
            return (persediaan - titik2) / (titik3 - titik2);
        else if (persediaan >= titik3)
            return 1;
        else
            return 0;
    }
}