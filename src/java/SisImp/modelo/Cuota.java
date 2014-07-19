/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SisImp.modelo;

/**
 *
 * @author Antonio
 */
public class Cuota {
    
    private int cod_cuota;
    private int cod_contrato;
    private String fch_cuota;
    private int nro_cuota;
    private String fch_vencimiento;
    private String fch_pago;
    private String est_cuota;
    private int cod_comprobante;
    private double saldo;

    /**
     * @return the cod_cuota
     */
    public int getCod_cuota() {
        return cod_cuota;
    }

    /**
     * @param cod_cuota the cod_cuota to set
     */
    public void setCod_cuota(int cod_cuota) {
        this.cod_cuota = cod_cuota;
    }

    /**
     * @return the cod_contrato
     */
    public int getCod_contrato() {
        return cod_contrato;
    }

    /**
     * @param cod_contrato the cod_contrato to set
     */
    public void setCod_contrato(int cod_contrato) {
        this.cod_contrato = cod_contrato;
    }

    /**
     * @return the fch_cuota
     */
    public String getFch_cuota() {
        return fch_cuota;
    }

    /**
     * @param fch_cuota the fch_cuota to set
     */
    public void setFch_cuota(String fch_cuota) {
        this.fch_cuota = fch_cuota;
    }

    /**
     * @return the nro_cuota
     */
    public int getNro_cuota() {
        return nro_cuota;
    }

    /**
     * @param nro_cuota the nro_cuota to set
     */
    public void setNro_cuota(int nro_cuota) {
        this.nro_cuota = nro_cuota;
    }

    /**
     * @return the fch_vencimiento
     */
    public String getFch_vencimiento() {
        return fch_vencimiento;
    }

    /**
     * @param fch_vencimiento the fch_vencimiento to set
     */
    public void setFch_vencimiento(String fch_vencimiento) {
        this.fch_vencimiento = fch_vencimiento;
    }

    /**
     * @return the fch_pago
     */
    public String getFch_pago() {
        return fch_pago;
    }

    /**
     * @param fch_pago the fch_pago to set
     */
    public void setFch_pago(String fch_pago) {
        this.fch_pago = fch_pago;
    }

    /**
     * @return the est_cuota
     */
    public String getEst_cuota() {
        return est_cuota;
    }

    /**
     * @param est_cuota the est_cuota to set
     */
    public void setEst_cuota(String est_cuota) {
        this.est_cuota = est_cuota;
    }

    /**
     * @return the cod_comprobante
     */
    public int getCod_comprobante() {
        return cod_comprobante;
    }

    /**
     * @param cod_comprobante the cod_comprobante to set
     */
    public void setCod_comprobante(int cod_comprobante) {
        this.cod_comprobante = cod_comprobante;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
