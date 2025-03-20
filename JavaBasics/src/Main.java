public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(3+5);
        System.out.println(8+7);

        System.out.println("\nVariables----------------------");
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        System.out.println("\nData types----------------------");
        int number1 = 7;
        short number2 = 7;
        byte number3 = 8;
        long result1 = number1 + number2 + number3;
        float fl1 = 1.55f;
        float fl2 = 2.33f;
        float result2 = fl1+fl2;
        double db1 = 3.33333333333;
        double db2 = 6.66666666666;
        double result3 = db1 + db2;
        boolean t = true;
        boolean f = false;
        char a = 'a';
        System.out.println("long: " + result1 + "| float: " + result2 + "| double: " + result3);

        System.out.println("\nLiterals----------------------");
        int bin = 0b101;
        System.out.println(bin);
        int hex = 0xAD;
        System.out.println(hex);
        int read = 1_000_000;
        System.out.println(read);
        double usee = 12e11;
        System.out.println(usee);
        char b = 'b';
        System.out.println(--b);
        System.out.println(++b);

        System.out.println("\nConversion&Casting----------------------");
        byte dwd = 127;
        int et = 555;
        et = dwd;
        et = 12;
        dwd = (byte)et;
        System.out.println(dwd);
        et = 555;
        dwd = (byte)et; //555%256=dwd
        System.out.println(dwd);
        float rg = 6.6f;
        int rgg = (int)rg;
        System.out.println(rgg); //6 so rounding, but rounding down
        byte ok = 5;
        byte not = 6;
        int roknot = ok * not;
        System.out.println(roknot);
    }
}