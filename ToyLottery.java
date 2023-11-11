import java.util.LinkedList;
import java.util.Random;

public class ToyLottery implements Lottery{

    LinkedList<Lot> lots = new LinkedList<Lot>();
    LinkedList<Customer> players = new LinkedList<Customer>();

    @Override
    public void addLot(Lot lot) {
        this.lots.add(lot);
    }

    @Override
    public Lot getPrize() {
        int sum = 0;
        for(Lot lot:this.lots) sum += lot.getWeight();
        double r = new Random().nextDouble() * sum;
        int weightcounter = 0;
        for(Lot lot:this.lots)
        {
            weightcounter += (double) lot.getWeight();
            if (weightcounter >= r)
            {
                this.lots.remove(this.lots.indexOf(lot));
                return lot;
            }
        }
        return null;
    }

    @Override
    public void addPlayers(LinkedList<Customer> players) {
        this.players = players;
    }

    @Override
    public Customer getWinner() {
        return this.players.get(new Random().nextInt(this.players.size()));
    }

    @Override
    public boolean isActive() {
        return this.lots.size() > 0;
    }

    public String toString()
    {
        return String.format("Разыгрываем %s призов среди %s игроков", this.lots.size(),this.players.size());
    }
    
}