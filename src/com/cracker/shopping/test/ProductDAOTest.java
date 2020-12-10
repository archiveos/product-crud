package com.cracker.shopping.test;

import com.cracker.shopping.dao.IProductDAO;
import com.cracker.shopping.dao.impl.ProductDAOImpl;
import com.cracker.shopping.domain.Product;
import com.cracker.shopping.query.ProductQueryObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class ProductDAOTest {
    private IProductDAO dao = new ProductDAOImpl();

    @Test
    public void testList() {
        List<Product> list = dao.list();
        for (Product p : list) {
            System.out.println(p);
        }
    }

    // 高级查询测试
    @Test
    public void testQuery0() {
        List<Product> list = dao.query("", new BigDecimal("100"), new BigDecimal("200"));
        System.out.println(list.size());
        for (Product p : list) {
            System.out.println(p);
        }
    }

    // 高级查询测试
    @Test
    public void testQuery() {
        ProductQueryObject qo = new ProductQueryObject();
        qo.setName("M");
        qo.setMinSalePrice(new BigDecimal("100"));
        qo.setMaxSalePrice(new BigDecimal("200"));
        // =====================================
        List<Product> list = dao.query0(qo);
        System.out.println(list.size());
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
