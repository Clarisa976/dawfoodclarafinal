/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clara
 */
public class ModeloTablaProductos extends DefaultTableModel {
    // Para usar JTable hay que asociar al JTable un objeto de tipo 
    // DefaultTableModel que contenga las columnas correspondientes

    public ModeloTablaProductos() {
        // Se asignan los nombres de las columnas de la tabla
        // en función de los atributos que tiene la persona
        String[] columnNames = {"ID", "NOMBRE", "PRECIO SIN IVA",
            "TIPO DE IVA", "STOCK", "TIPO PRODUCTO"};

        // Se le indica al modelo el nombre de las columnas y cantidad
        this.setColumnIdentifiers(columnNames);
    }

    // Este método sobrescrito sirve para indicar qué celdas
    // del JTable son editables
    public boolean isCellEditable(int row, int column) {
        // Aquí devolvemos true o false según queramos que una celda
        // identificada por fila,columna (row,column), sea o no editable
        // En nuestro caso ninguna celda se edita
        return false;
    }
}
