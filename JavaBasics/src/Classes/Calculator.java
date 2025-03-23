package Classes;

public class Calculator {

    public int Addition(int num1, int num2){
        return num1 + num2;
    }

    public int Addition(int num1, int num2, Integer num3){
        if (num3 == null){
            return num1 + num2;
        }
        return num1 + num2 + num3;
    }

    public float Addition(float num1, float num2){
        return num1 + num2;
    }
}
