package com.itcast.service.Impl;

import com.itcast.service.IProductService;
import com.itheima.dao.IProductDao;
import com.itheima.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao iProductDao;
    @Override
    public List<Product> findAll() throws Exception {

        return iProductDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        iProductDao.save(product);
    }
}
