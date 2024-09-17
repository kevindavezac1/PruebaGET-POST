package com.MejorPrecio.MejorPrecio.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoComercio {
    private String nombre;
    private double precio;
    private String descripcion;
    private String marca;
}
