import java.util.Scanner;

public class FindMax {
    int a = 3;
    int b = 8;
    int c = 5;
    int[] inputList = {a, b, c};
    int max = inputList[0];

    void inputIntegers() {
        this.a = a;
        this.b = b;
        this.c = c;

        this.inputList = inputList;
        this.max = max;

//        for (int i = 0; i < inputList.length; i++) {
//            if (max < inputList[i]) {
//                max = inputList[i];
        for (int i = 0; i < this.inputList.length; i++) {
            if (this.max < this.inputList[i]) {
                this.max = this.inputList[i];
            }
        }
        System.out.println("The max number is: " + this.max);


    }

    void writePrinterInfo() {
        System.out.println("I am printer");
//        System.out.println("My price is " + this.price);
    }

}
