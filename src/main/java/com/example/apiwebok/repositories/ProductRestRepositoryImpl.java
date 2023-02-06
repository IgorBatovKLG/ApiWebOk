package com.example.apiwebok.repositories;


import com.example.apiwebok.models.ProductLastCountModel;
import com.example.apiwebok.models.ProductModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductRestRepositoryImpl implements ProductRestRepository {

    @PersistenceContext
    private EntityManager em;
    @Override
    public void save(ProductModel productModel) {
        em.persist(productModel);
    }

    public void saveCount(ProductLastCountModel productModel) {
        em.persist(productModel);
    }

    @Override
    public ProductModel getProductById(int id) {
        return em.find(ProductModel.class, id);
    }

    @Override
    public int getProductLastCount() {
        return em.find(ProductLastCountModel.class, 1).getCount();
    }

    @Override
    public void setProductLastCount(int count) {
        ProductLastCountModel productLastCountModel = em.find(ProductLastCountModel.class, 1);
        productLastCountModel.setCount(count);
        em.merge(productLastCountModel);
    }

}
