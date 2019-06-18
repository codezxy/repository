package com.itheima.controller;

import com.itcast.service.IProductService;
import com.itheima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    //产品添加
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }
//查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> productList = productService.findAll();
        modelAndView.addObject("productList",productList);
        modelAndView.setViewName("product-list1");
        return  modelAndView;
    }
}
