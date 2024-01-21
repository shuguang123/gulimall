package com.atguigu.gulimall.ware.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 
 * 
 * @author aurora
 * @email aurora@gmail.com
 * @date 2024-01-20 22:48:24
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId
    private Long id;
    /**
     * 
     */
    private Long branchId;
    /**
     * 
     */
    private String xid;
    /**
     * 
     */
    private String context;
    /**
     * 
     */
    private byte[] rollbackInfo;
    /**
     * 
     */
    private Integer logStatus;
    /**
     * 
     */
    private Date logCreated;
    /**
     * 
     */
    private Date logModified;
    /**
     * 
     */
    private String ext;

}
