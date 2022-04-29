import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerArtwork;

    // Constructor -- command + N --
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerArtwork = new ArrayList<>();
    }

    // Getters & Setters -- command + N --
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {
        return customerArtwork;
    }

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork) {
        this.customerArtwork = customerArtwork;
    }
}
