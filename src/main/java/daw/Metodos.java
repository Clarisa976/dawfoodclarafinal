/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Productos;

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

    //método para formatear el iva y que salga de forma numérica
    public static String formateoIVA(String tipoIVA) {
        if ("IVA_DIEZ".equals(tipoIVA)) {
            return "10%";
        } else {
            return "21%";
        }

    }
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw_dawfoodclarafinal_jar_finalPU");

    //método para hacer una namequery en el que se buscan los productos por nombre
    //y obtenemos solo un resultado
    public static Productos findProductoByName(String nombreProducto) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Productos> query = em.createNamedQuery("Productos.findByNombre", Productos.class);
            query.setParameter("nombre", nombreProducto);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }
}
