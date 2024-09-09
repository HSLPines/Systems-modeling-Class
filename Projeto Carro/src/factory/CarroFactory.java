
package factory;

import data.CarroPopular;
import data.CarroSedan;

public interface CarroFactory {

    public abstract CarroSedan criarCarroSedan(); // nem public nem abstract são necessários
    CarroPopular criarCarroPopular();
    
} 