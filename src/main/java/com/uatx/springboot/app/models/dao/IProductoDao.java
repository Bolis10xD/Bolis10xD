package com.uatx.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.uatx.springboot.app.models.entity.Producto;

public interface IProductoDao extends PagingAndSortingRepository<Producto, Long>{


}
