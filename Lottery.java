import java.util.LinkedList;

public interface Lottery {
    public void addLot(Lot lot);
    public void addPlayers(LinkedList<Customer> players);
    public Lot getPrize();
    public Customer getWinner();
    public boolean isActive();
}