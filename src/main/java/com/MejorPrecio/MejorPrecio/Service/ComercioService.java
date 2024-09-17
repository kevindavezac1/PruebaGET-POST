package com.MejorPrecio.MejorPrecio.Service;

import com.MejorPrecio.MejorPrecio.Model.Comercio;
import com.MejorPrecio.MejorPrecio.Repository.ComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/usuarios")
@Service
public class ComercioService {

    @Autowired
    private ComercioRepository comercioRepository;

    @PostMapping("/")
    public Comercio getComercioById(Integer id) {
        return comercioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Comercio no encontrado con id: " + id));
    }

    public List<Comercio> getAllComercios() {
        return comercioRepository.findAll();
    }
}
