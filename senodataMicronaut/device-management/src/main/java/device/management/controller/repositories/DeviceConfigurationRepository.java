package device.management.controller.repositories;

import device.management.controller.entities.DeviceConfiguration;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DeviceConfigurationRepository extends CrudRepository<DeviceConfiguration, Integer> {
}
