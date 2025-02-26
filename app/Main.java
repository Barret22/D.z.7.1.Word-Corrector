package app;

public class Main {


    public static void main(String[] args) {
        // Отримуємо масив слів із DataProvider
        String[] data = new DataProvider().getData();

        // Створюємо екземпляр Corrector та передаємо масив слів на обробку
        String output = new Corrector().handleData(data);

        // Виводимо результат у консоль
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}