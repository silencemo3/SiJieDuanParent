package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;



@Data
public class Orders implements Serializable{

    private Long orderId;

    private Object orderDate;

    private String orderMode;

    private Integer customerId;

    private Short orderStatus;

    private BigDecimal orderTotal;

    private Integer salesRepId;

    private Integer promotionId;
    

}