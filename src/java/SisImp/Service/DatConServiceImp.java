/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SisImp.Service;

import Conexion.Helper;
import SisImp.modelo.Cliente;
import SisImp.modelo.Cuota;
import SisImp.modelo.DatCon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Antonio
 */
@WebService(endpointInterface="SisImp.Service.DatConService")
public class DatConServiceImp implements DatConService {
    
    @Override
    public List<DatCon> getDatosContrato(String docCli){
        List<DatCon> lista = new ArrayList<DatCon>();
           Helper cn = null;
           ResultSet tabla = null;
           DatCon obj;
           try {       
               cn = new Helper();
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
           return lista;
    }
    
    @Override
    public List<Cuota> getCuotasXContrato(int Cont){
        
           List<Cuota> lista = new ArrayList<Cuota>();
           Helper cn = null;
           ResultSet tabla = null;
           Cuota obj;
           try {       
               cn = new Helper();
               //tabla = cn.executeDataset("exec lsCuotasxContrato " + Cont, new Object[]{});
               tabla = cn.executeDataset("exec lsCuotasxContrato ?", new Object[]{Cont});
               while(tabla.next()){
                  obj = new Cuota();
                  obj.setCod_cuota(tabla.getInt("cod_cuota"));
                  obj.setCod_contrato(tabla.getInt("cod_contrato"));        
                  obj.setFch_cuota(tabla.getString("fch_cuota"));
                  obj.setNro_cuota(tabla.getInt("nro_cuota")); 
                  obj.setFch_vencimiento(tabla.getString("fch_vencimiento"));
                  obj.setFch_pago(tabla.getString("fch_pago"));
                  obj.setEst_cuota(tabla.getString("est_cuota"));
                  //obj.setCod_comprobante(tabla.getInt("cod_comprobante"));
                  obj.setSaldo(tabla.getInt("Mon_Saldo"));   
                  lista.add(obj);
               }               
           } catch (Exception e) {
           }              
           return lista;
    }
    
    @Override
    public List<Cliente> getClientesXDni(String Dni){
         List<Cliente> lista = new ArrayList<Cliente>();
           Helper cn = null;
           ResultSet tabla = null;
           Cliente obj;
           try {       
               cn = new Helper();
               //tabla = cn.executeDataset("exec lsClientesxDni '" + Dni + "'", new Object[]{});
               tabla = cn.executeDataset("exec lsClientesxDni ?", new Object[]{Dni});
               while(tabla.next()){
                  obj = new Cliente();
                  obj.setCod_Cliente(tabla.getInt("Cod_Cliente"));
                  obj.setApe_Paterno(tabla.getString("Ape_Paterno"));
                  obj.setApe_Materno(tabla.getString("Ape_Materno"));
                  obj.setNom_Cliente(tabla.getString("Nom_Cliente"));
                  obj.setTip_Documento(tabla.getString("Tip_Documento"));
                  obj.setNro_Documento(tabla.getString("Nro_Documento"));
                  obj.setNom_Direccion(tabla.getString("Nom_Direccion"));
                  obj.setNom_Distrito(tabla.getString("Nom_Distrito"));
                  obj.setNum_Telefono(tabla.getString("Num_Telefono"));
                  obj.setCli_Correo(tabla.getString("Cli_Correo"));                     
                  lista.add(obj);
               }               
           } catch (Exception e) {
           }              
           return lista;
    }
    
    @Override
    public int setClientes(String Ape_Paterno,String Ape_Materno,String Nom_Cliente,String Tip_Documento,String Nro_Documento,String Nom_Direccion,String Nom_Distrito,String Num_Telefono,String Cli_Correo){
        int res = 0; 
        Helper cn = null;
        try {
            cn = new Helper();
            //res = cn.executeNonQuery("exec insClientes '" + Ape_Paterno + "', '" + Ape_Materno + "', '" + Nom_Cliente + "', '" + Tip_Documento + "', '" + Nro_Documento + "', '" + Nom_Direccion + "', '" + Nom_Distrito + "', '" + Num_Telefono + "', '" + Cli_Correo + "'", new Object[]{});
            res = cn.executeNonQuery("exec insClientes ?, ?, ?, ?, ?, ?, ?, ?, ?", new Object[]{Ape_Paterno, Ape_Materno, Nom_Cliente, Tip_Documento, Nro_Documento, Nom_Direccion, Nom_Distrito, Num_Telefono, Cli_Correo});
        } catch (Exception e) {
        }
        return res;
    }
    
    @Override
    public int setContratos(int Cod_Cliente,String Fch_Contrato,String Fch_Vencimiento,String Est_Contrato,double Mon_Cuota,int Can_Cuotas,int Cod_Empleado,String Tip_Moneda){
        int res = 0; 
        Helper cn = null;
        try {
            cn = new Helper();
            //res = cn.executeNonQuery("exec insContrato " + Cod_Cliente + ", '" + Fch_Contrato + "', '" + Fch_Vencimiento + "', '" + Est_Contrato + "', " + Mon_Cuota + ", " + Can_Cuotas + ", " + Cod_Empleado + ", '" + Tip_Moneda + "'", new Object[]{});
            res = cn.executeNonQuery("exec insContrato ?, ?, ?, ?, ?, ?, ?, ?", new Object[]{Cod_Cliente, Fch_Contrato, Fch_Vencimiento, Est_Contrato, Mon_Cuota, Can_Cuotas, Cod_Empleado, Tip_Moneda});
        } catch (Exception e) {
        }
        return res;
    }
    
}
