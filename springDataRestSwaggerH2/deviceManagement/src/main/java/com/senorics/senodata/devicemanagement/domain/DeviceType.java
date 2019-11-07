package com.senorics.senodata.devicemanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DeviceType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String description;

    @ManyToOne
    private DeviceModel deviceModel;

    @ManyToOne
    private DeviceConfiguration deviceConfiguration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeviceModel getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(DeviceModel deviceModel) {
        this.deviceModel = deviceModel;
    }

    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }
}
