
package calculadoramvc;
import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class CalculadoraMVC {

   
    public static void main(String[] args) {
        
        Modelo mo = new Modelo();
        Vista ver = new Vista();
        Controlador controller = new Controlador(ver, mo);
        controller.iniciar();
        ver.setVisible(true);
    }
    
}
