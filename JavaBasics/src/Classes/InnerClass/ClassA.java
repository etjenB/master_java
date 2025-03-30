package Classes.InnerClass;

public class ClassA {
    private int value;

    public ClassA(int value) {
        this.value = value;
    }

    public void printValueOfA(){
        System.out.println(value);
    }

    public class ClassB{
        private int valueOfB;

        public ClassB(int valueOfB) {
            this.valueOfB = valueOfB;
        }

        public void printValueOfB(){
            System.out.println(valueOfB);
        }
    }
}
