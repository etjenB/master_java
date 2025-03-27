package Classes.Object;

public class House2 {
    private double sizeInSqM = 0;
    private String address = "";

    public House2(double sizeInSqM, String adress) {
        this.sizeInSqM = sizeInSqM;
        this.address = adress;
    }

    public String toString(){
        return "Size in square/meters: " + this.sizeInSqM + " | Address: " + this.address;
    }
}
