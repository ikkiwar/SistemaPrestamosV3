/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.ingenieria.diseño1.proyectox.controladores;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ues.edu.sv.ingenieria.diseño1.proyectox.definiciones.Conexion;
import ues.edu.sv.ingenieria.diseño1.proyectox.definiciones.Sesion;

/**
 *
 * @author estuardo
 */
public class ControladorBitacora {
    
    public void agregar(int id, String accion) throws ErrorPrestamo{
        
       // SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date fecha= new Date();
        Calendar cal= Calendar.getInstance();
        Timestamp fechaSave = new Timestamp(cal.getTimeInMillis());
        //String fechaSave= formato.format(fecha);
        Conexion conexion = new Conexion();

        if (conexion != null) {
            conexion.UID("INSERT INTO bitacora(id_usuario,fecha,accion)"
                    + "VALUES('" +id + "','" + fechaSave+"','"+ accion + "')");

        } else {
            throw new ErrorPrestamo("Error al Insertar Datos", "ControladorBitacora.agregar", "Error al Agregar Nuevo Registro");
        }

    }
        
        
    
    
    
    public void mostrar(){
        
        List<Sesion> sesion = new ArrayList<>();
        Conexion conexion = new Conexion();
        ResultSet resultado;
        
        
    }
    
    
    
    
}
