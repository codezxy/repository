package com.itcast.service;

import com.itheima.domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page,int size)throws Exception;
}
