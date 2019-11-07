package device.management.controller;

import javax.inject.Inject;
import device.management.controller.entities.Device;
import device.management.controller.repositories.DeviceRepository;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller public class DeviceManagementController {

    @Inject DeviceRepository deviceRepository;

    @Get(produces = MediaType.APPLICATION_JSON)
    public Iterable<Device> getDevices() {

        return deviceRepository.findAll();
    }
}
