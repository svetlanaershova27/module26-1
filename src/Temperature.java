public class Temperature {
    public static void getResult(double result) {
        result = Math.pow(result, 2); //← здесь
        result = result - 34;
        result = result / 3;
        result = Math.round(result);
        System.out.println("Сейчас " + result + " градусов");
    }
}
