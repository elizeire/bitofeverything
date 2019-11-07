package device.management.controller.repositories;

import device.management.controller.entities.DeviceType;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DeviceTypeRepository extends CrudRepository<DeviceType, Integer> {
}
