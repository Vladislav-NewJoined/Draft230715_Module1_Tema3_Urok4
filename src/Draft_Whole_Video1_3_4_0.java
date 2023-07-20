public class Draft_Whole_Video1_3_4_0 {
    public static void main(String[] args) {
        //  закончил видео мин в конце

        //  видео мин 00 48 - Создадим класс printer
        //  видео мин 09 34 - Этот метод существует толко у экземпляров класса
        //  видео мин 17 10 - Появилось слово this
        //  видео мин 19 22 - This это по сути указательный...
        //  видео мин 25 27 - decreasePrice

        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();

        printer1.maker = "HP";
        printer1.price = 300;
        printer2.maker = "Canon";
        printer2.price = 500;
        printer3.maker = "Xerox";
        printer3.price = 700;

//        printHello();
//        printer2.myMethod();
        printer2.writePrinterInfo();
//        printer2.myMethod();
//        printer3.myMethod();

        printer1.decreasePrice();
        printer3.decreasePrice();
        System.out.println(printer1);
        System.out.println(printer3);

    }

    static void printHello() {
        System.out.println("Hello");
        int x = 3;
    }


}