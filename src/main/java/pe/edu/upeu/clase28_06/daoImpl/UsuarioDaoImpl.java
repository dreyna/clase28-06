/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.clase28_06.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.upeu.clase28_06.config.Conexion;
import pe.edu.upeu.clase28_06.dao.UsuarioDao;

/**
 *
 * @author dreyna
 */
public class UsuarioDaoImpl implements UsuarioDao {
private PreparedStatement ps = null;
private ResultSet rs = null;
private Connection cx=null;
    @Override
    public int validar(String user, String pass) {
        int x  = 0;
        String SQL = "SELECT *FROM USUARIO WHERE USERNAME =? AND PASSWORD = ? AND ESTADO = 1";
        try {
            cx = Conexion.getConexion(); //obtenemos la conexion
            ps = cx.prepareStatement(SQL); //Ejecutamos la consulta
            ps.setString(1, user);//seteamos el user
            ps.setString(2, pass);//seteamos el password
            rs = ps.executeQuery();//ejecutamos la consulta y obtenemos un registro
            while(rs.next()){
                x = 1;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return x;
    }
    
}
