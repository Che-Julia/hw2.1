public class Main {
    public static void main(String[] args) {

        // стоимость билета //
        int ticketPrice = 1500;

        // количество рублей для одной бонусной мили //
        int amount = 20;

        int bonus = ticketPrice / amount;

        System.out.println("Количество бонусов:" + bonus);
    }
}