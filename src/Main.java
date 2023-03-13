import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        System.out.println("Создадим список покупок?");
        String selectOperation;
        while (true) {

            System.out.print("""
                    Введите номер операции:
                    \t 1. Добавить покупку
                    \t 2. Показать все покупки
                    \t 3. Удалить покупку
                    \t 4. Закончить работу
                    >>""");
            selectOperation = scanner.next();

            if (selectOperation.equals("4")) {
                System.out.println("Досвидания");
                break;
            }


            switch (selectOperation) {
                case "1":
                    System.out.print("Введите какую покупку вы хотите совершить: \n>>");
                    String addItem = scanner.next();
                    shoppingList.add(addItem);
                    System.out.println("Итого в списке покупок: " + shoppingList.size());
                    break;
                case "2":
                    System.out.println("Список покупок:");
                    for (int j = 0; j < shoppingList.size(); j++) {
                        System.out.println((j + 1) + ". " + shoppingList.get(j));
                    }
                    break;
                case "3":
                    System.out.println("Список покупок:");
                    for (int j = 0; j < shoppingList.size(); j++) {
                        System.out.println((j + 1) + ". " + shoppingList.get(j));
                    }
                    System.out.print("Какую покупку вы хотите удалить? Введите номер или название \n>>");
                    try {
                        int removeNumber = scanner.nextInt();
                        shoppingList.remove(removeNumber - 1);
                    } catch (RuntimeException e) {
                        String removeItem = scanner.next();
                        shoppingList.remove(removeItem);
                    }
                    break;
                default:
                    System.out.println("Такой операции не существует");
                    break;
            }
        }


    }
}

