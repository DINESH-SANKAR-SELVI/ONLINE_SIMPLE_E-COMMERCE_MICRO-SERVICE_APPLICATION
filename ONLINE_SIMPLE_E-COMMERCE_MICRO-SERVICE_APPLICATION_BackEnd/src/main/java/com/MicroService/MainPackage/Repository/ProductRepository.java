package com.MicroService.MainPackage.Repository;

import com.MicroService.MainPackage.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{

}
