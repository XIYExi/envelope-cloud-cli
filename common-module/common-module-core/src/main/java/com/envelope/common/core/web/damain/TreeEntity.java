package com.envelope.common.core.web.damain;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.ArrayList;
import java.util.List;

/**
 * Tree基类
 * @param <T>
 */
public class TreeEntity<T> extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /**
     * 父菜单名称
     */
    @TableField(exist = false)
    private String parentName;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 子部门、子数据
     */
    @TableField(exist = false)
    private List<T> children = new ArrayList<>();

}
