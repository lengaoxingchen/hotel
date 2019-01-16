package cn.itcast.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DinnerTable {
    private Integer id;
    private String tableName;
    private Integer tableStatus;
    private Date orderDate;
}
