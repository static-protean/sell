package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>//两个参数第一个为数据库映射对象，第二个为主键类型
{
    //自定义特殊的增删改查
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
