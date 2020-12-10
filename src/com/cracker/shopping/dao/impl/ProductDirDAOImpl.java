package com.cracker.shopping.dao.impl;

import com.cracker.shopping.dao.IProductDirDAO;
import com.cracker.shopping.domain.ProductDir;
import com.cracker.shopping.handler.BeanListHandler;
import com.cracker.shopping.util.JdbcTemplate;

import java.util.List;

public class ProductDirDAOImpl implements IProductDirDAO {
    @Override
    public List<ProductDir> list() {
        return JdbcTemplate.query("SELECT * FROM productdir", new BeanListHandler<>(ProductDir.class));
    }
}
