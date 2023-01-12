import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        List<String> equalsArray = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite uma palavra para o array " + i + ", deixe vazio para finalizar o array!");
            while (true) {
                String word = scan.nextLine();
                if ("".equals(word)) {
                    break;
                } else {
                    if (i == 1) array1.add(word);
                    if (i == 2) array2.add(word);
                }
            }
        }

        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                equalsArray.add(array1.get(i));
            }
        }

        System.out.println("array1: " + array1);
        System.out.println("array2: " + array2);
        System.out.println("duplicated elements: " + equalsArray);
    }
}