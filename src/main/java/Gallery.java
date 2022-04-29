import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name, double till) {
        this.name = name;
        this.artworks = new ArrayList<>();
        this.till = 0;
    }
}
