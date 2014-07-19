/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SisImp.Service;

import SisImp.modelo.Cuota;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Antonio
 */
@WebService
public interface CuotaService {
    
    List<Cuota> getCuotasXContrato(int Cont);
    
}
