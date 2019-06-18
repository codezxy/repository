package com.itcast.service.Impl;

import com.github.pagehelper.PageHelper;
import com.itcast.service.IOrdersService;
import com.itheima.dao.IOrdersDao;
import com.itheima.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao iOrdersDao;
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum是页码值   参数pageSize代表是每页显示条数
        PageHelper.startPage(page,size);
        return iOrdersDao.findAll();
    }
}
