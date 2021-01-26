package com.hl.dao;

import com.hl.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {
     @Select("select * from product")
     public List<Product> findAll() throws Exception;
}
