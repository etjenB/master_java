package Classes;

public class Mobile {
    String brand;
    int price;
    static String category;

    static
    {
        category = "Phone";    //use static block when you want to initialize static variable for class only once when you use the class first time in whole app
    }

    public Mobile(){
        brand = "";
        price = 0;
    }

    public void print(){
        System.out.println(brand + " : " + price + " : " + category);
    }
}
