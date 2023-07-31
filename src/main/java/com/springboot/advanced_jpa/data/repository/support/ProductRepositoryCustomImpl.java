package com.springboot.advanced_jpa.data.repository.support;


import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.data.entity.QProduct;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
// 필요한 쿼리를 작성할 메소드를 정의하는 인터페이스
public class ProductRepositoryCustomImpl extends QuerydslRepositorySupport implements
        ProductRepositoryCustom {

    public ProductRepositoryCustomImpl() {
        super(Product.class);
    }

    @Override
    public List<Product> findByName(String name) {
        QProduct product = QProduct.product;
        return from(product)
                .where(product.name.eq(name))
                .select(product)
                .fetch();
    }
}
