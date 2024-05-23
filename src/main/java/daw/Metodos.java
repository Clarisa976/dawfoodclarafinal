/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author clara
 */
public class Metodos {

    //métodos que se van repitiendo
    public static String formatearFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    public static String formatearHora(Date hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(hora);
    }

    public static BigDecimal calcularTipoIVA(String tipoIVA) {
        switch (tipoIVA) {
            case "IVA_DIEZ":
                return new BigDecimal("0.10");
            case "IVA_VEINTIUNO":
                return new BigDecimal("0.21");
            default:
                return BigDecimal.ZERO;
        }
    }

}
