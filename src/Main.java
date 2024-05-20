public class Main {
    public static void main(String[] args) {
        System.out.println("GACHAMIGUERO GIT V2\n--------------------");
        for (int numero = 1; numero <= 100; numero++) {
            System.out.println(termomixLidl(numero));
        }
    }
    public static String termomixLidl(int numero) {
        String resultado = Integer.toString(numero);
        if (numero%3 == 0) resultado = "Gacha";
        if (numero%5 == 0) resultado = "Miga";
        if (numero%15 == 0) resultado = "GachaMiga";
        return resultado;
    }
}