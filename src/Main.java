public class Main {
    public static void main(String[] args) {

        // стоимость билета //
        int x = 1500;

        // количество рублей для одной бонусной мили //
        int y = 20;

        int bonus = x / y;

        System.out.println("Количество бонусов:" + bonus);
    }
}