
package factory;

import data.CarroPopular;
import data.CarroSedan;
import data.Palio;
import data.Siena;

public class FiatFactory implements CarroFactory {

    @Override
    public CarroSedan criarCarroSedan() {

        return new Siena();
    
    }

    @Override
    public CarroPopular criarCarroPopular() {

        return new Palio();

    }

}
