package com.hl.web;

import com.hl.domain.Product;
import com.hl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
     @Autowired
    private ProductService productsevice;
      @RequestMapping("/findAll.do")
     public ModelAndView findAll(){
          System.out.println(1);
          ModelAndView mv = new ModelAndView();
          try{
              List<Product> productList = productsevice.findAll();
              System.out.println(productList);
              mv.addObject("productList",productList);
              mv.setViewName("product-list");
          }catch(Exception e){
              e.printStackTrace();
          }
           return mv;

     }
}
