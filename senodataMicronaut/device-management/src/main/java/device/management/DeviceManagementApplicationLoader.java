package device.management;

import javax.inject.Singleton;
import device.management.controller.entities.Device;
import device.management.controller.entities.DeviceConfiguration;
import device.management.controller.entities.DeviceModel;
import device.management.controller.entities.DeviceType;
import device.management.controller.repositories.DeviceConfigurationRepository;
import device.management.controller.repositories.DeviceModelRepository;
import device.management.controller.repositories.DeviceRepository;
import device.management.controller.repositories.DeviceTypeRepository;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.discovery.event.ServiceStartedEvent;

@Singleton public class DeviceManagementApplicationLoader implements ApplicationEventListener<ServiceStartedEvent> {

    private DeviceRepository deviceRepository;
    private DeviceModelRepository deviceModelRepository;
    private DeviceConfigurationRepository deviceConfigurationRepository;
    private DeviceTypeRepository deviceTypeRepository;

    public DeviceManagementApplicationLoader(DeviceRepository deviceRepository,
            DeviceModelRepository deviceModelRepository, DeviceConfigurationRepository deviceConfigurationRepository,
            DeviceTypeRepository deviceTypeRepository) {
        this.deviceRepository = deviceRepository;
        this.deviceModelRepository = deviceModelRepository;
        this.deviceConfigurationRepository = deviceConfigurationRepository;
        this.deviceTypeRepository = deviceTypeRepository;
    }

    @Override
    public void onApplicationEvent(ServiceStartedEvent event) {
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

    @Override
    public boolean supports(ServiceStartedEvent event) {
        return true;
    }
}
