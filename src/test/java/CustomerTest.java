import org.junit.jupiter.api.BeforeEach;

public class CustomerTest {

    Customer customer;
    Artist vanGogh;
    Artwork sunflowers;

    @BeforeEach
    public void setUp(){
        customer = new Customer("John Doe", 800);

        vanGogh = new Artist("Van Gogh");
        sunflowers = new Artwork("Sunflowers", vanGogh, 1000, 766);
    }


}
