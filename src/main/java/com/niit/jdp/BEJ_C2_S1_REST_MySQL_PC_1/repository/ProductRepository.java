package com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.repository;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
