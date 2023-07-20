import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft_Task1_3_4_4 {
    public static void main(String args[]) {
        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");

//        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
//                "без this в нашем случае результат будет null, т.е. некорректным.");
//        Draft_Task1_3_4_4 s1 = new Draft_Task1_3_4_4();
//        s1.result(max);
//        s1.print();
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter integer b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter integer c: ");
        int c = scanner.nextInt();

        int[] inputList = {a, b, c};
        int max = inputList[0];

        for (int i = 0; i < inputList.length; i++) {
            if (max < inputList[i]) {
                max = inputList[i];
            }
        }
        System.out.println("The max number is: " + max);

        FindMax findMax = new FindMax();
        findMax.inputIntegers();


//        void result (int max) {
//            this.max = max;
//        }
//        void print () {
//            System.out.println("With \"this\", name is: "/* + name*/);
//        }
    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 1 ППППППППППППППППППППППППППППППППППП Из задания 2.
//public class Draft_Task1_3_4_4 {
//    String name;
//
//    void result(String name) {
//        this.name = name;
//    }
//    void print() {
//        System.out.println("With \"this\", name is: " + name);
//    }
//    public static void main(String args[]) {
//        System.out.println("Задание: \n4.  Создайте класс, который находит наибольшее из трех чисел. " +
//                "\nКо всем переменным обращаться можно ТОЛЬКО используя this\n\nРешение: ");
//
//        System.out.println("Можно обратиться без слова this. Ниже два примера, с this, и без this, но " +
//                "без this в нашем случае результат будет null, т.е. некорректным.");
//        Draft_Task1_3_4_4 s1 = new Draft_Task1_3_4_4();
//        s1.result("Alex");
//        s1.print();
//    }
//}
////        Конец Примера 1 КККККККККККККККК







