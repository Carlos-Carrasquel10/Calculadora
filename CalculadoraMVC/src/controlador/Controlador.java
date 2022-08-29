package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.View;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Modelo model;
    private Vista ver;

    public Controlador(Vista ver, Modelo model) {

        this.ver = ver;
        this.model = model;
        this.ver.btnMultiplicar.addActionListener(this);


    }

    public void iniciar() {
        ver.setTitle("Calculadora");
        ver.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        model.setNumero1(Integer.parseInt(ver.txtNumero1.getText()));
        model.setNumero2(Integer.parseInt(ver.txtNumero2.getText()));
        model.multiplicar();
        ver.txtResultado.setText(String.valueOf(model.getResult()));

    }


    }

