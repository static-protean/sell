package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by protean on 2019-05-07-21:26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeInTest(){
        ProductCategory one = productCategoryRepository.findOne(1);
        System.out.println(one);
    }
    @Test
//    @Transactional//回滚，删除测试记录
    public void saveTest(){
/*        ProductCategory category = new ProductCategory("嘻哈哈哈嘻", 6);
        ProductCategory save = productCategoryRepository.save(category);
        Assert.assertNotNull(save);*/

        ProductCategory one = productCategoryRepository.findOne(5);
        one.setCategoryType(3);
        one.setCategoryName("阿斯顿");
        productCategoryRepository.save(one);
       /* ProductCategory category = new ProductCategory();
        category.setCategoryName("哈哈");
        category.setCategoryType(3);
        productCategoryRepository.save(category);*/

    }
    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }
}