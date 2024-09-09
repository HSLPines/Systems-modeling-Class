
import data.CarroSedan;
import factory.CarroFactory;
import factory.FiatFactory;

public class App {
    public static void main(String[] args) throws Exception {

        CarroFactory factory = new FiatFactory();
        CarroSedan sedan = factory.criarCarroSedan();
        sedan.exibirInfoSedan();
        System.out.println(sedan.getClass());

    }
}
