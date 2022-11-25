/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controlador.Controlador_Frm_Registrar_Videojuegos;
import Modelo.ListarVideojuegos;
import Vista.frm_RegistrarProductos;

/**
 *
 * @author kevin
 */
public class Principal {
    
    public static frm_RegistrarProductos frm_rp;
    public static Controlador_Frm_Registrar_Videojuegos c_frm_rp;
    public static ListarVideojuegos lv;
    public static void main(String[] args) {
    
        frm_rp=new frm_RegistrarProductos();
        frm_rp.setVisible(true);
        frm_rp.setLocationRelativeTo(null);
        
        c_frm_rp=new Controlador_Frm_Registrar_Videojuegos(frm_rp);
        lv=new ListarVideojuegos();
        lv.MostrarTable(frm_rp.tblVideojuegos);
    }
    
}
