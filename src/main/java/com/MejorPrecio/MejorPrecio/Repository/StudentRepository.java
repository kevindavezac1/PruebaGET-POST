package com.MejorPrecio.MejorPrecio.Repository;

import com.MejorPrecio.MejorPrecio.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
