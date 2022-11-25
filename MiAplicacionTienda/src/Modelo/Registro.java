/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Conexion.ConexionMysql;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Registro {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    public void registrarbd(Videojuego v){
        try {
            PreparedStatement ps=cn.prepareStatement
        ("INSERT INTO videojuegos(nombre,cantidad,precio,total)VALUES(?,?,?,?)");
            ps.setString(1, v.getNombre());
            ps.setInt(2, v.getCantidad());
            ps.setDouble(3, v.getPrecio()); 
            ps.setDouble(4, v.Total());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR DATOS"+e);
        }
    }
    
    
}
