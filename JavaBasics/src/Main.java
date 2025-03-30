import Classes.AbstractAnonymousClass.AbstractAnonymousClass;
import Classes.Calculator;
import Classes.Inheritance.AdvCalc;
import Classes.Inheritance.Calc;
import Classes.Inheritance.SciCalc;
import Classes.InnerClass.ClassA;
import Classes.Object.Flat;
import Classes.Object.Flat2;
import Classes.Object.House;
import Classes.Object.House2;
import Classes.Second;
import Classes.Student;
import Interfaces.IFirst;

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
        int r5 = advCalc.addition(4, 99);
        SciCalc sciCalc = new SciCalc();
        double r6 = sciCalc.power(3,7);
        int r7 = sciCalc.division(50, 2);
        int r8 = sciCalc.subtraction(50, 2);
        System.out.println("Addition result: " + r1 +
                " | Subtraction result: " + r2 +
                " | Multiplication result: " + r3 +
                " | Division result: " + r4 +
                " | Addition result 2: " + r5 +
                " | Power result: " + r6 +
                " | Division result 2: " + r7 +
                " | Subtraction result 2: " + r8);

        System.out.println("\nFinal/Constants----------------------");
        int num = 8;
        num = 10;
        System.out.println(num);
        final int numm = 666;
        //numm = 555; ERROR so final is basically const from C#
        System.out.println(numm);

        System.out.println("\nOverride built in methods----------------------");
        Flat flat1 = new Flat(54, "Street 4");
        Flat flat2 = new Flat(54, "Street 4");
        //false because it compares if they are the same objects in memory, not comparing the attributes values
        System.out.println(flat1.equals(flat2));
        Flat2 flat3 = new Flat2(54, "Street 4");
        Flat2 flat4 = new Flat2(54, "Street 4");
        //true because of the override of equals method of parent Object class
        System.out.println(flat3.equals(flat4));

        House house1 = new House(234, "Street 666");
        //prints default toString from parent Object class
        System.out.println(house1);
        House2 house2 = new House2(234, "Street 666");
        //prints override toString
        System.out.println(house2);

        System.out.println("\nInner class----------------------");
        ClassA classA = new ClassA(1);
        ClassA.ClassB classB = classA.new ClassB(99);
        classB.printValueOfB();

        System.out.println("\nInner anonymous class----------------------");
        ClassA classA2 = new ClassA(69){
            public void printValueOfA(){
                System.out.println("Value of A");
            }
        };
        classA2.printValueOfA();

        System.out.println("\nAbstract anonymous class----------------------");
        AbstractAnonymousClass abstractAnonymousClass = new AbstractAnonymousClass() {
            public void printHeart() {
                System.out.println("<3");
            }
        };
        abstractAnonymousClass.printHeart();

        System.out.println("\nEnums----------------------");
        enum Status{
            Running,
            Failed,
            Pending,
            Success
        }
        System.out.println(Status.Running);
        System.out.println(Status.values()[1]);
        System.out.println(Status.Pending.ordinal());

        System.out.println("\nEnums advanced----------------------");
        enum Phone{
            iPhone(1000),
            Pixel(990),
            Galaxy(1100);

            private int price;

            Phone(int price) {
                this.price = price;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }

        System.out.println("Phone: " + Phone.Pixel + " | Price: " + Phone.Pixel.getPrice());
        Phone.Pixel.setPrice(950);
        System.out.println("Phone: " + Phone.Pixel + " | Price: " + Phone.Pixel.getPrice());

        System.out.println("\nFunctional interface----------------------");
        IFirst internet = new Second();
        internet.printSomething();
    }
}