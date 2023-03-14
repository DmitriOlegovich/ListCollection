import java.util.List;
import java.util.Scanner;

public class InputOptions{
    public static void addPurchase(Scanner scanner, List<String> shoppingList) {
        System.out.print("Введите какую покупку вы хотите совершить: \n>>");
        String addItem = scanner.next();
        shoppingList.add(addItem);
        System.out.println("Итого в списке покупок: " + shoppingList.size());
        return;
    }

    public static void listShop(List<String> shoppingList) {
        System.out.println("Список покупок:");
        for (int j = 0; j < shoppingList.size(); j++) {
            System.out.println((j + 1) + ". " + shoppingList.get(j));
        }
        return;
    }

    public static void removingProduct(Scanner scanner, List<String> shoppingList) {
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
        return;
    }
}