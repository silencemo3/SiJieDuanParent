package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;


@Data
public class GoodFengLei implements Serializable{

    private BigDecimal spflId;

    private String spflName;

    private String spflIsfu;

    private String spflFu;

    private BigDecimal spflYxz;

    private String spflIsqy;

    private String spflBeizhu;

    
}