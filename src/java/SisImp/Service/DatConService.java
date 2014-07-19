/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SisImp.Service;

import SisImp.modelo.Cliente;
import SisImp.modelo.Cuota;
import SisImp.modelo.DatCon;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Antonio
 */
@WebService
public interface DatConService {
    
    List<DatCon> getDatosContrato(String DocCli);
    
    List<Cuota> getCuotasXContrato(int Cont);
    
    List<Cliente> getClientesXDni(String DNI);
    
    int setClientes(String Ape_Paterno,String Ape_Materno,String Nom_Cliente,String Tip_Documento,String Nro_Documento,String Nom_Direccion,String Nom_Distrito,String Num_Telefono,String Cli_Correo);
    
    int setContratos(int Cod_Cliente,String Fch_Contrato,String Fch_Vencimiento,String Est_Contrato,double Mon_Cuota,int Can_Cuotas,int Cod_Empleado,String Tip_Moneda);
    
}
