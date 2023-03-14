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
                    InputOptions.addPurchase(scanner, shoppingList);
                    break;
                case "2":
                    InputOptions.listShop(shoppingList);
                    break;
                case "3":
                    InputOptions.removingProduct(scanner, shoppingList);
                    break;
                default:
                    System.out.println("Такой операции не существует");
                    break;
            }
        }


    }
}
