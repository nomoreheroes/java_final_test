public class Toy extends Sellable implements Lot {

    private int weight;

    public Toy(String type, String name, double price, int weight)
    {
        super(type,name,price);
        this.weight = weight;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public String toString()
    {
        return String.format("Игрушка #%s '%s %s', цена %s",this.getID(), this.getType(), this.getName(), this.getPrice());
    }
    
}