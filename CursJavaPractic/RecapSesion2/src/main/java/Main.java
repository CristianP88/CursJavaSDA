import java.util.*;

public class Main {

    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Introduceti numerele");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            linkedList.add(number);
            arrayList.add(number);
        }

        displayNumbers(linkedList);
        removeEvenNumbers(linkedList);
        removeElementsOnOddPosition(arrayList);
*/

        char[] cuv = {'a', 'm', 'm', 'a','s'};

        checkIfPalindrome(cuv);

    }

    static void removeEvenNumbers(LinkedList<Integer> linkedList) {
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            int number = (Integer) iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("LinkedList ul dupa eliminarea nr pare");
        displayNumbers(linkedList);
    }

    static void displayNumbers(LinkedList<Integer> linkedList) {
        for (Integer numbers : linkedList) {
            System.out.println(numbers);
        }
    }

    static void removeElementsOnOddPosition(ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("ArrayList ul fara pozitii impare:");
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }
    }

    static void checkIfPalindrome(char[] array) {
        boolean palindrome = false;
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] == array[j]) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("Is the word a palindrome?");
        System.out.println(palindrome);

    }
}
