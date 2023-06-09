/*
?????????? ????????? ?????????? ????? ? ??????? HashMap, ????????, ??? 1 ??????? ????? ????? ????????? ?????????.
???????? ??????? 1) ?????????? ??????
2) ????? ?????
??????:
? ?????: 1
?: ??????? ???????
?: ??????
?: ??????? ?????
?: 1242353
?: ??????? 1) ?????????? ??????
2) ????? ?????
? ?????: 1
?: ??????? ???????
?: ??????
?: ??????? ?????
?: 547568
?: ??????? 1) ?????????? ??????
2) ????? ?????
?: 2
??????: 1242353, 547568
*/

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    
    private Map<String, List<String>> phoneBook;
    
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    
    public void addNumber(String name, String number) {
        if (phoneBook.containsKey(name)) {
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
            phoneBook.put(name, numbers);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }
    
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.print(name + ": ");
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("??????? 1 ??? ?????????? ?????? ??? 2 ??? ?????? ?????");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("??????? ???????");
                String name = scanner.next();
                System.out.println("??????? ?????");
                String number = scanner.next();
                phoneBook.addNumber(name, number);
            } else if (choice == 2) {
                phoneBook.printAll();
            } else {
                break;
            }
        }
    }
}