package com.senorics.senodata.devicemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.devicemanagement.domain.DeviceConfiguration;
import io.swagger.annotations.Api;

@Api
public interface DeviceConfigurationRepository extends JpaRepository<DeviceConfiguration, Integer> {
}
