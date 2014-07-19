/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisImp.Service;

import Conexion.Helper;
import SisImp.modelo.Cuota;
import SisImp.modelo.DatCon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Prueba {

    public static void main(String[] args) {
        List<DatCon> lista = new ArrayList<DatCon>();
        Helper cn = null;
        ResultSet tabla = null;
        String docCli;
        DatCon obj;
           try {       
               cn = new Helper();
               docCli = "09634400";
               //tabla = cn.executeDataset("exec lsContratoxDocCli '" + docCli + "'", new Object[]{});
               tabla = cn.executeDataset("exec lsContratoxDocCli ?", new Object[]{docCli});
               while(tabla.next()){
                  obj = new DatCon();                  
                  obj.setCod_Contrato(tabla.getInt("Cod_Contrato"));
                  obj.setCod_Cliente(tabla.getInt("Cod_Cliente"));
                  obj.setFch_Contrato(tabla.getString("Fch_Contrato"));
                  obj.setFch_Vencimiento(tabla.getString("Fch_Vencimiento"));
                  obj.setEst_Contrato(tabla.getString("Est_Contrato"));
                  obj.setMon_Cuota(tabla.getDouble("Mon_Cuota"));
                  obj.setCan_Cuotas(tabla.getInt("Can_Cuotas"));                  
                  obj.setCod_Empleado(tabla.getInt("Cod_Empleado"));
                  obj.setTip_Moneda(tabla.getString("Tip_Moneda"));  
                  lista.add(obj);
               }               
           } catch (Exception e) {
           }              
    }

}
