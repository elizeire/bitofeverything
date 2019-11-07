package com.senorics.senodata.devicemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.devicemanagement.domain.DeviceModel;
import io.swagger.annotations.Api;

@Api
public interface DeviceModelRepository extends JpaRepository<DeviceModel, Integer> {
}
