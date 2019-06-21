package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;



@Data
public class KuaiDi implements Serializable{

    private BigDecimal kauidiId;

    private String kuaidiName;

    private Double kuaidiPrice;

    
}