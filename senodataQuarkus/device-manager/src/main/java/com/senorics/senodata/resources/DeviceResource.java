package com.senorics.senodata.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.senorics.senodata.domain.Device;
import com.senorics.senodata.domain.DeviceConfiguration;
import com.senorics.senodata.domain.DeviceModel;
import com.senorics.senodata.domain.DeviceType;
import com.senorics.senodata.repositories.DeviceConfigurationRepository;
import com.senorics.senodata.repositories.DeviceModelRepository;
import com.senorics.senodata.repositories.DeviceRepository;
import com.senorics.senodata.repositories.DeviceTypeRepository;

@Path("/device") public class DeviceResource {

    @Inject DeviceRepository deviceRepository;
    @Inject DeviceModelRepository deviceModelRepository;
    @Inject DeviceConfigurationRepository deviceConfigurationRepository;
    @Inject DeviceTypeRepository deviceTypeRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Device> getDevices() {

        Device device1 = new Device("device00A");
        Device device2 = new Device("device00B");
        Device device3 = new Device("device00C");
        Device device4 = new Device("device00D");
        Device device5 = new Device("device00F");

        device1.setDescription("desc1");
        device2.setDescription("desc2");
        device3.setDescription("desc3");
        device4.setDescription("desc4");
        device5.setDescription("desc5");

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

        return deviceRepository.findAll();
    }
}