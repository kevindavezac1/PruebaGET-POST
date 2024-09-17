package com.MejorPrecio.MejorPrecio.Repository;

import com.MejorPrecio.MejorPrecio.Model.Comercio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComercioRepository extends MongoRepository<Comercio, Integer> {
}
