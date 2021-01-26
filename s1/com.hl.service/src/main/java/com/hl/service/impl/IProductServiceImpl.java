package com.hl.service.impl;

import com.hl.dao.ProductDao;
import com.hl.domain.Product;
import com.hl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productdao;

    public List<Product> findAll() throws Exception {
        return productdao.findAll();
    }
}
