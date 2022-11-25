/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListarVideojuegos;
import Modelo.Registro;
import Modelo.Videojuego;
import Vista.frm_RegistrarProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kevin
 */
public class Controlador_Frm_Registrar_Videojuegos implements ActionListener {
    frm_RegistrarProductos frm_rp;

    public Controlador_Frm_Registrar_Videojuegos(frm_RegistrarProductos frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm_rp.btnGuardar){
            
            String nombre=frm_rp.txtNombre.getText();
            int cantidad=Integer.parseInt(frm_rp.txtCantidad.getText());
            Double precio=Double.parseDouble(frm_rp.txtPrecio.getText());
            
            Videojuego V=new Videojuego(nombre, cantidad, precio);
            Registro R=new Registro();
            R.registrarbd(V);
            
            ListarVideojuegos lv=new ListarVideojuegos();
            lv.MostrarTable(frm_rp.tblVideojuegos);
            limpiarentradas();
            
        }
        
    }

    private void limpiarentradas() {
        frm_rp.txtNombre.setText("");
        frm_rp.txtCantidad.setText("");
        frm_rp.txtPrecio.setText("");
    }
    
}
