package Classes.Inheritance;

public class AdvCalc extends Calc {

    public int multiplication(int n1, int n2){
        return n1 * n2;
    }

    public int division(int n1, int n2){
        return n1 / n2;
    }

    //override
    public void print(){
        System.out.println("Advanced Results: ");
    }
}
