package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by protean
 * 2019-05-08-11:51.
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    //根据状态查询
    List<ProductInfo> findByProductStatus(Integer aa);

}
