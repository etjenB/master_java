package Classes.Inheritance;

public class SciCalc extends AdvCalc {

    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }

    //override
    public void print(){
        System.out.println("Science Results: ");
    }
}
