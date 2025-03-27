package Classes.Object;

public class Flat2 {
    private double sizeInSqM = 0;
    private String adress = "";

    public Flat2(double sizeInSqM, String adress) {
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

    public boolean equals(Flat2 fl){
        return this.sizeInSqM == fl.sizeInSqM && this.adress.equalsIgnoreCase(fl.adress);
    }
}
