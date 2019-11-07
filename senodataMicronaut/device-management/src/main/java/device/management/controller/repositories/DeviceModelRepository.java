package device.management.controller.repositories;

import device.management.controller.entities.DeviceModel;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DeviceModelRepository extends CrudRepository<DeviceModel, Integer> {
}
