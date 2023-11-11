public class Customer {
    private static int nextid=1;
    private final int id;
    private String name;

    public Customer(String name)
    {
        this.id = nextid++;
        this.name = name;
    }
    
    public String toString()
    {
        return String.format("Покупатель %s #%s", this.name, this.id);
    }
}