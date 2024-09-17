package com.MejorPrecio.MejorPrecio.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "comercios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comercio {

    @Id
    private Integer id;

    private String nombre;
    private String tipo;
    private DireccionComercio direccion;
    private ContactoComercio contacto;
    private HorariosComercio horarios;
    private String categorias;
    private List<ProductoComercio> productos;
    private boolean activo;
}
