package Classes.Object;

public class Flat {
    private double sizeInSqM = 0;
    private String adress = "";

    public Flat(double sizeInSqM, String adress) {
        this.sizeInSqM = sizeInSqM;
        this.adress = adress;
    }

    public double getSizeInSqM() {
        return sizeInSqM;
    }

    public void setSizeInSqM(double sizeInSqM) {
        this.sizeInSqM = sizeInSqM;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
