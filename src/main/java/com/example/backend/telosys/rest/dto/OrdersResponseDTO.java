/*
 * Created on 2025-02-08 ( 14:50:02 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 4.2.0
 */
package com.example.backend.telosys.rest.dto;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * DTO class for "Orders"
 *
 * @author Telosys
 *
 */
public class OrdersResponseDTO implements Serializable {
    private OrdersDTO orderDTO;
    private BigDecimal cost;
    private BigDecimal remain;

    

    public OrdersResponseDTO(OrdersDTO orderDTO, BigDecimal cost, BigDecimal remain) {
        this.orderDTO = orderDTO;
        this.cost = cost;
        this.remain = remain;
    }

    public OrdersDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrdersDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getRemain() {
        return remain;
    }

    public void setRemain(BigDecimal remain) {
        this.remain = remain;
    }

}
