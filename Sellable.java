public class Sellable implements Commodity {

    private static int nexid=1;
    private final int id;
    private String type;
    private String name;
    private double price;
    public static int quantity = 0;

    public Sellable(String type, String name, double price)
    {
        this.id = nexid++;
        this.type = type;
        this.name = name;
        this.price = price;
        quantity++;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int q) {
        quantity = q;
    }
    
}