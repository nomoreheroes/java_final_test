import java.util.Random;

public class ToyGenerator {
   public Toy generate()
   {
       String[] toytypes = new String[]{"Железная дорога", "Мягкая игрушка", "Конструктор"};
       String[] constnames = new String[]{"LEGO","DUPLO"};
       String[] railnames = new String[]{"DeutscheBahn", "EnglishRR"};
       String[] puppynames = new String[]{"Медвежонок", "Котенок", "Поросенок"};
       Double[] constprices = new Double[]{1000.0,9900.0};
       Double[] railprices = new Double[]{10000.0,99999.0};
       Double[] puppyprices = new Double[]{2000.0, 19000.0};


       Random r = new Random();
       int tind = r.nextInt(toytypes.length);
       String type = toytypes[tind];
       String name;
       Double price;

       switch(tind)
       {
            case 2:
                name = constnames[r.nextInt(constnames.length)];
                price = constprices[0] + r.nextDouble(constprices[1]);
                break;
            case 1:
                name = puppynames[r.nextInt(puppynames.length)];
                price = puppyprices[0] + r.nextDouble(puppyprices[1]);
                break;
            case 0:
                name = railnames[r.nextInt(railnames.length)];
                price = railprices[0] + r.nextDouble(railprices[1]);
                break;
            default:
                name = "Unknown toy";
                price = 0.0;
       }
       price = ((double) Math.round(price*100))/100;
       int weight = (int) Math.pow(r.nextInt(10),(double)tind);
       
       return new Toy(type, name, price, weight);      
   } 
}