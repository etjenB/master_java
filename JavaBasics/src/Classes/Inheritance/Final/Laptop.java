package Classes.Inheritance.Final;

public class Laptop extends Computer{
    private double display = 14.7;

    //will not work because final methods cannot be override
    //public void print(){
    //    System.out.println("MAC M4");
    //}
}

//this will not work because ComputerFinal class is final and cannot be inherited
//public class Laptop extends ComputerFinal {
//    private double display = 14.7;
//}
