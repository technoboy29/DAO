package com.crud.dao;

import com.crud.idao.Operaciones;
import java.util.ArrayList;
import com.crud.modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AutoDaoImpl implements Operaciones{
    
    Database db = new Database ();
    Auto auto = new Auto();

    @Override
    public boolean insertar(Object obj) {
        auto = (Auto)obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into auto(marca, referencia, modelo, tipo, llantas, puertas, color, numserie) "
                    + "values (?,?,?,?,?,?,?,?)";
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, auto.getMarca());
            pst.setString(2, auto.getReferencia());
            pst.setString(3, auto.getModelo());
            pst.setString(4, auto.getTipo());
            pst.setString(5, auto.getLlantas());
            pst.setString(6, auto.getPuertas());
            pst.setString(7, auto.getColor());
            pst.setString(8, auto.getNumserie());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
              
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean eliminar(Object obj) {
       auto = (Auto)obj;
        Connection con;
        PreparedStatement pst;
        String sql = "delete from auto where numserie = ?";
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, auto.getNumserie());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
              
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        auto = (Auto)obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update auto set marca=?, referencia=?, modelo=?, tipo=?, llantas=?, puertas=?, color=?, numserie=? where numserie=?";
                    
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, auto.getMarca());
            pst.setString(2, auto.getReferencia());
            pst.setString(3, auto.getModelo());
            pst.setString(4, auto.getTipo());
            pst.setString(5, auto.getLlantas());
            pst.setString(6, auto.getPuertas());
            pst.setString(7, auto.getColor());
            pst.setString(8, auto.getNumserie());
            pst.setString(9, auto.getNumserie());
            
            int filas = pst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
              
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from auto";
        
        try{
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                Object[] fila = new Object[9];
                for(int i=0; i<=8; i++){
                    fila[i]=rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            JOptionPane.showInputDialog(null,"Error: " + e.getMessage());
        }finally{
            return data;
        }
    }
    
}
