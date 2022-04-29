import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    //Constructor
    public Gallery(String name, double till) {
        this.name = name;
        this.artworks = new ArrayList<>();
        this.till = 0;
    }

    public int artworkCount(){
        return this.artworks.size();
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }
}
