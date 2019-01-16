package cn.itcast.entity;


import lombok.Getter;

/**
 * 餐桌状态
 */
@Getter
public enum TableStatus {
    /**
     * Free 餐桌位于未预定状态
     * PlanIn 餐桌位于已预订状态
     */
    FREE, PlanIn;

}
