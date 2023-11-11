import java.util.LinkedList;

public class ToyShop {

    private LinkedList<Toy> toys = new LinkedList<Toy>();
    private LinkedList<Customer> customers = new LinkedList<Customer>();

    public void addCustomer(Customer customer)
    {
        this.customers.add(customer);
    }

    public void addToy(Toy toy)
    {
        this.toys.add(toy);
    }

    public void removeToy(Toy toy)
    {
        this.toys.remove(this.toys.indexOf(toy));
    }

    public LinkedList<Toy> getAllToys()
    {
        return this.toys;
    }

    public LinkedList<Customer> getAllCustomers()
    {
        return this.customers;
    }
}