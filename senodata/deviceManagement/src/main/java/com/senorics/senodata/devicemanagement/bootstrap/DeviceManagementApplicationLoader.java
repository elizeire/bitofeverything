package com.senorics.senodata.devicemanagement.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.senorics.senodata.devicemanagement.domain.Device;
import com.senorics.senodata.devicemanagement.domain.DeviceConfiguration;
import com.senorics.senodata.devicemanagement.domain.DeviceModel;
import com.senorics.senodata.devicemanagement.domain.DeviceType;
import com.senorics.senodata.devicemanagement.repositories.DeviceConfigurationRepository;
import com.senorics.senodata.devicemanagement.repositories.DeviceModelRepository;
import com.senorics.senodata.devicemanagement.repositories.DeviceRepository;
import com.senorics.senodata.devicemanagement.repositories.DeviceTypeRepository;

@Component
public class DeviceManagementApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private DeviceRepository deviceRepository;
    private DeviceModelRepository deviceModelRepository;
    private DeviceConfigurationRepository deviceConfigurationRepository;
    private DeviceTypeRepository deviceTypeRepository;

    @Autowired
    public void setDeviceRepository(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }
    @Autowired
    public void setDeviceModelRepository(DeviceModelRepository deviceModelRepository) {
        this.deviceModelRepository = deviceModelRepository;
    }
    @Autowired
    public void setDeviceConfigurationRepository(DeviceConfigurationRepository deviceConfigurationRepository) {
        this.deviceConfigurationRepository = deviceConfigurationRepository;
    }
    @Autowired
    public void setDeviceTypeRepository(DeviceTypeRepository deviceTypeRepository) {
        this.deviceTypeRepository = deviceTypeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Device device1 = new Device("device00A");
        Device device2 = new Device("device00B");
        Device device3 = new Device("device00C");
        Device device4 = new Device("device00D");
        Device device5 = new Device("device00F");

        DeviceModel deviceModel = new DeviceModel();
        deviceModel.setDescription("model x.x.1");
        deviceModelRepository.save(deviceModel);

        DeviceConfiguration deviceConfiguration = new DeviceConfiguration();
        deviceConfiguration.setDescription("cfg OMEGA");
        deviceConfigurationRepository.save(deviceConfiguration);

        DeviceType deviceType = new DeviceType();
        deviceType.setDescription("Type AAA");
        deviceType.setDeviceConfiguration(deviceConfiguration);
        deviceType.setDeviceModel(deviceModel);
        deviceTypeRepository.save(deviceType);

        device1.setDeviceType(deviceType);
        device2.setDeviceType(deviceType);
        device3.setDeviceType(deviceType);
        device4.setDeviceType(deviceType);
        device5.setDeviceType(deviceType);

        deviceRepository.save(device1);
        deviceRepository.save(device2);
        deviceRepository.save(device3);
        deviceRepository.save(device4);
        deviceRepository.save(device5);
    }
}
