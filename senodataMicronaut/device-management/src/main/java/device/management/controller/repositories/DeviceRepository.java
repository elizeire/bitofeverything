package device.management.controller.repositories;

import device.management.controller.entities.Device;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {
}
