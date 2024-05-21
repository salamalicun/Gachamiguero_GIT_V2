public class Gachamiguero {
    private static final int CANTIDAD_NUMEROS = 100;
    private static int numero = 0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("GACHAMIGUERO GIT V3\n--------------------");
        Thread.sleep(100);
        String load = "";
        System.out.print("Loading    ( 0% )    ");
        while (numero <= CANTIDAD_NUMEROS) {
            load += "#";
            System.out.print(load);
            Thread.sleep(200);
            numero += 10;
        }
        System.out.print("    ( 100% )    Loaded :)");
        Thread.sleep(750);
        numero = 0;
        System.out.println("\n--------------------");

        while (numero < CANTIDAD_NUMEROS) {
            ++numero;
            System.out.println(cocinar(numero));
            Thread.sleep(25);
        }
        System.out.println("--------------------");
    }

    public static String cocinar(int ingrediente) {
        return (ingrediente % 3 == 0) ? ((ingrediente % 5 == 0) ? "GachaMiga" : "Gacha")
                : ((ingrediente % 5 == 0) ? "Miga" : String.valueOf(ingrediente));
    }
}