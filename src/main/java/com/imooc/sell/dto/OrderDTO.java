package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.utils.serializer.Data2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    //订单状态，默认为0新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    //支付状态，默认为0等待支付
    private Integer payStatus;

    @JsonSerialize(using = Data2LongSerializer.class)
    private Date createTime;


    @JsonSerialize(using = Data2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
