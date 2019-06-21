package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;



@Data
public class DaoHangLan implements Serializable{

    private BigDecimal dhlId;

    private String dhlName;

    private String dhlLianjie;

    private String dhlType;

    private BigDecimal dhlPaixu;

    
    
   
}