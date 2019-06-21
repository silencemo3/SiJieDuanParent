package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;



@Data
public class Goods implements Serializable{

    private BigDecimal goodId;

    private String goodPicture;

    private String goodName;

    private String goodDescrib;

    private Double goodPrice;

    private Date goodCreatedate;

    private Date goodGenxindate;

    private String goodStatu;

    private BigDecimal goodNum;

    private BigDecimal goodXznum;

    private String goodXiangqing;

    private String goodLj;

   
}