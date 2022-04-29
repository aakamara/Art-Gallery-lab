public class Artwork {

    private String title;
    private Artist artist;
    private double price;
    private int nft;

    //constructor
    public Artwork(String title, Artist artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }


    //getters & setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNft() {
        return nft;
    }

    public void setNft(int nft) {
        this.nft = nft;
    }
}
