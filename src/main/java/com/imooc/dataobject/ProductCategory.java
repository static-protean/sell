package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by 刘师兄
 * 2017-05-07 14:30
 */
@Entity//与数据库中的表映射
@DynamicUpdate//动态更新时间
@Data//自动写入get/set
public class ProductCategory {

    /**
     * 类目id.
     */
    @Id//主键
    @GeneratedValue//自增注解
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
