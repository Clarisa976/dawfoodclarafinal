/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Productos;
import models.Tipoproducto;

/**
 *
 * @author clara
 */
public class Metodos {

    //métodos que se van repitiendo
    //método para formatear la fecha y que se vea bonica
    public static String formatearFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    //método para formatear la hora y que se vea bonica
    public static String formatearHora(Date hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(hora);
    }

    //método para calcular poder hacer calculos con el tipo de iva
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
    //método para calcular el precioConIVA
    public static BigDecimal calcularPrecioConIVA(BigDecimal precioSinIVA, String tipoIVA) {
    BigDecimal iva = calcularTipoIVA(tipoIVA);
    BigDecimal precioConIVA = precioSinIVA.add(precioSinIVA.multiply(iva));
    return precioConIVA.setScale(2, RoundingMode.HALF_UP);
}

    //método para formatear el iva y que salga de forma numérica
    public static String formateoIVA(String tipoIVA) {
        if ("IVA_DIEZ".equals(tipoIVA)) {
            return "10%";
        } else {
            return "21%";
        }

    }
 
    
}
