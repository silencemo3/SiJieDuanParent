package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;



@Data
public class OrderItem implements Serializable{

    private BigDecimal oiId;

    private BigDecimal ordersId;

    private BigDecimal goodId;

    private BigDecimal oiNum;

    
}