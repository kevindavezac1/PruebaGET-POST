package com.MejorPrecio.MejorPrecio.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DireccionComercio
{
    private String calle;
    private String numero;
    private String ciudad;
    private double latitud;
    private double longitud;
}
