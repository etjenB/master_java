package Classes.Object;

import java.util.Objects;

public class Apartment {
    private double sizeInSqM = 0;
    private String address = "";

    public Apartment(double sizeInSqM, String address) {
        this.sizeInSqM = sizeInSqM;
        this.address = address;
    }

    //Automatically generated overrides, use this it is more secure and reliable

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Apartment apartment)) return false;
        return Double.compare(sizeInSqM, apartment.sizeInSqM) == 0 && Objects.equals(address, apartment.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeInSqM, address);
    }
}
