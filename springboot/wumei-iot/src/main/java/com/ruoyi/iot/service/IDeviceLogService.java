package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.DeviceLog;

import java.util.List;

/**
 * 设备日志Service接口
 * 
 * @author kerwincui
 * @date 2022-01-13
 */
public interface IDeviceLogService 
{
    /**
     * 查询设备日志
     * 
     * @param logId 设备日志主键
     * @return 设备日志
     */
    public DeviceLog selectDeviceLogByLogId(Long logId);

    /**
     * 查询设备日志列表
     * 
     * @param deviceLog 设备日志
     * @return 设备日志集合
     */
    public List<DeviceLog> selectDeviceLogList(DeviceLog deviceLog);

    /**
     * 新增设备日志
     * 
     * @param deviceLog 设备日志
     * @return 结果
     */
    public int insertDeviceLog(DeviceLog deviceLog);

    /**
     * 修改设备日志
     * 
     * @param deviceLog 设备日志
     * @return 结果
     */
    public int updateDeviceLog(DeviceLog deviceLog);

    /**
     * 批量删除设备日志
     * 
     * @param logIds 需要删除的设备日志主键集合
     * @return 结果
     */
    public int deleteDeviceLogByLogIds(Long[] logIds);

    /**
     * 删除设备日志信息
     * 
     * @param logId 设备日志主键
     * @return 结果
     */
    public int deleteDeviceLogByLogId(Long logId);

    /**
     * 根据设备IDs批量删除设备日志
     *
     * @param deviceIds 需要删除的设备日志IDs
     * @return 结果
     */
    public int deleteDeviceLogByDeviceIds(Long[] deviceIds);
}
