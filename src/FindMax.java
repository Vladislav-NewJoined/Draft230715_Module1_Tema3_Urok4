import java.util.Scanner;


//        Пример _ ППППППППППППППППППППППППППППППППППП
public class FindMax {
    Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter integer a: ");
//    int a = scanner.nextInt();
//        System.out.print("Please enter integer b: ");
//    int b = scanner.nextInt();
//        System.out.print("Please enter integer c: ");
//    int c = scanner.nextInt();
//    int a = 3;
//    int b = 8;
//    int c = 5;
    int[] inputList;/* = {a, b, c};*/
    int max;/* = inputList[0];*/

    void inputIntegers() {
        this.scanner = scanner;
        System.out.print("Please enter integer a: ");
        int a = this.scanner.nextInt();
        System.out.print("Please enter integer b: ");
        int b = this.scanner.nextInt();
        System.out.print("Please enter integer c: ");
        int c = this.scanner.nextInt();

//        this.a = a;
//        this.b = b;
//        this.c = c;

        this.inputList = new int[]{a, b, c};
        this.max = max;

//        for (int i = 0; i < inputList.length; i++) {
//            if (max < inputList[i]) {
//                max = inputList[i];
        for (int i = 0; i < this.inputList.length; i++) {
            if (this.max < this.inputList[i]) {
                this.max = this.inputList[i];
            }
        }
//        System.out.println("The max number is: " + this.max);


    }

    void printResult() {
        System.out.println("The max number is: " + this.max);
    }

}
//        Конец Примера _ КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class FindMax {
//    int a = 3;
//    int b = 8;
//    int c = 5;
//    int[] inputList = {a, b, c};
//    int max = inputList[0];
//
//    void inputIntegers() {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//
//        this.inputList = inputList;
//        this.max = max;
//
////        for (int i = 0; i < inputList.length; i++) {
////            if (max < inputList[i]) {
////                max = inputList[i];
//        for (int i = 0; i < this.inputList.length; i++) {
//            if (this.max < this.inputList[i]) {
//                this.max = this.inputList[i];
//            }
//        }
//        System.out.println("The max number is: " + this.max);
//
//
//    }
//
//    void writePrinterInfo() {
//        System.out.println("I am printer");
////        System.out.println("My price is " + this.price);
//    }
//
//}
////        Конец Примера 1 КККККККККККККККК







