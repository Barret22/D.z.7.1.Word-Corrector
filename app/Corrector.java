package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String str : strs) {
            // Перевіряємо, чи містить слово літеру 'b', і якщо так — замінюємо на 'o'
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }

            // Збільшуємо лічильник та додаємо до рядка виведення
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(str)
                    .append("\n");
        }

        return stringBuilder.toString();
    }
}