package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;



@Data
public class ShouYeBanKuai implements Serializable{

    private BigDecimal sybkId;

    private String sybkName;

    private BigDecimal sybkPaixu;

    private BigDecimal sybkNum;

    private String sybkUse;

    private String sybkBeizhu;
    

    
}