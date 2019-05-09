package com.imooc.enums;

import lombok.Getter;

/**
 * Created by protean
 * 2019-05-08-12:27.
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}

