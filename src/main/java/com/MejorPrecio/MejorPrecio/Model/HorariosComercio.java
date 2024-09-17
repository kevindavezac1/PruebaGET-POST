package com.MejorPrecio.MejorPrecio.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorariosComercio {

    private String dias_habiles;
    private String sabado;
    private String domingo;
}
