import java.util.Random;

public class CustomerGenerator {
    public Customer generate()
    {
        String[] names = new String[]{"Вася", "Петя", "Иван", "Альберт", "Константин", "Торвлобнор", "Акакий"};
        return new Customer(names[new Random().nextInt(names.length)]);
    }
}