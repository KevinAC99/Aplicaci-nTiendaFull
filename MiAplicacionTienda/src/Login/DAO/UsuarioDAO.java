/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login.DAO;

import Login.beans.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class UsuarioDAO {
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios= new ArrayList<>();
    }
    
    public int buscar(String usuario){
        int n=-1;
        for(int i = 0; i < usuarios.size(); i++){
           if(usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
           }
        }
        return n;
    }
    
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario())== -1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario){
        if(buscar(usuario.getUsuario())!=-1){
           Usuario usuarioaux=obtener(usuario.getUsuario());
           
           usuarioaux.setContrasenia(usuario.getContrasenia());
           usuarioaux.setNombres(usuario.getNombres());
           usuarioaux.setApellidos(usuario.getApellidos());
           usuarioaux.setCorreo(usuario.getCorreo());
           
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String usuario){
         if(buscar(usuario) !=-1){
             usuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }
    }
    
    public Usuario obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
    
}