import java.util.LinkedList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ToyShop myshop = new ToyShop();
        ToyGenerator generator = new ToyGenerator();
        CustomerGenerator generator2 = new CustomerGenerator();
        for(int i=0;i<10000;i++)
        {
            //делаем 10000 товаров и 100 покупателей
            Toy toy = generator.generate();
            //System.out.println(toy);
            myshop.addToy(toy);
            if (i % 100 == 0)
            {
                Customer customer = generator2.generate();
                //System.out.println(customer);
                myshop.addCustomer(customer);
            } 
        }

        Lottery firstLottery = new ToyLottery();
        LinkedList<Toy> alltoys = myshop.getAllToys();
        //разыгрываем десять конструкторов, пять мягких игрушек, одну железную дорогу
        int counter1=10;
        int counter2 = 5;
        int counter3 = 1;
        int counter4 = 0;
        while (counter4 < 100000)
        {
            int random = new Random().nextInt(alltoys.size());
            Toy toy = alltoys.get(random);
            switch(toy.getType())
            {
                case "Конструктор": 
                    if(counter1 > 0)
                    {
                        firstLottery.addLot(toy);
                        myshop.removeToy(toy);
                        counter1--;
                    }
                    break;
                case "Мягкая игрушка":
                    if(counter2 > 0)
                    {
                        firstLottery.addLot(toy);
                        myshop.removeToy(toy);
                        counter2--;
                    }
                    break;
                case "Железная дорога":
                    if(counter3 > 0)
                    {
                        firstLottery.addLot(toy);
                        myshop.removeToy(toy);
                        counter3--;
                    }
            }
            counter4++;
        }
        firstLottery.addPlayers(myshop.getAllCustomers());
        System.out.println(firstLottery);
        while (firstLottery.isActive())
        {
            Customer winner = firstLottery.getWinner();
            Toy prize = (Toy) firstLottery.getPrize();
            System.out.printf("%s выигрывает %s!\n",winner,prize);
        }
    }    
}