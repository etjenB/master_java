import Classes.Calculator;
import Classes.Inheritance.AdvCalc;
import Classes.Inheritance.Calc;
import Classes.Student;

import java.util.Random;

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

        System.out.println("\nSwitch----------------------");
        switch (ok){
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                break;
        }

        System.out.println("\nFor----------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("|");
        }

        System.out.println("\nByte op----------------------");
        int hn = 3;
        int nnh = 6;
        int rhnnnh = (~hn & nnh) | (hn & ~nnh);
        System.out.println(rhnnnh);

        System.out.println("\nOOP----------------------");
        Calculator calculator = new Calculator();
        System.out.println(calculator.Addition(3,2));
        System.out.println(calculator.Addition(3,3,null));
        System.out.println(calculator.Addition(3,3,3));
        System.out.println(calculator.Addition(3.3f, 3.4f));

        System.out.println("\nArrays----------------------");
        int[] nums = new int[4];
        nums = new int[]{3, 4, 5, 9};
        System.out.println(nums[2]);
        nums[2] = (int)3.4;
        System.out.println(nums[2]);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println(nums); //pointer duh...
        for (int n : nums){
            System.out.print(n);
        }
        System.out.println();
        int[] nums2 = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = (new Random()).nextInt(0, 100);
        }
        for (int n : nums2){
            System.out.print(n + " ");
        }
        System.out.println();
        Student[] students = new Student[4];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].MatrikulationNumber = (new Random()).nextInt(100000, 999999);
            students[i].Name = "";
            for (int j = 0; j < 5; j++) {
                students[i].Name += (char)(new Random()).nextInt(65, 90);
            }
        }
        for (Student s : students) {
            System.out.println(s.Name + " " + s.MatrikulationNumber);
        }

        System.out.println("\nStrings----------------------");
        String fe = "grdgrd"; //Immutable - stored in memory as a constant and cannot be changed
        StringBuffer rhdr = new StringBuffer("grdgrd"); //Mutable
        rhdr.append(" hhh");
        System.out.println(rhdr);

        System.out.println("\nInheritance----------------------");
        Calc calc = new Calc();
        int r1 = calc.addition(4, 5);
        int r2 = calc.subtraction(7, 3);
        AdvCalc advCalc = new AdvCalc();
        int r3 = advCalc.multiplication(5, 3);
        int r4 = advCalc.division(15, 4);
        System.out.println("Addition result: " + r1 + " | Subtraction result: " + r2 + " | Multiplication result: " + r3 + " | Division result: " + r4);


    }
}