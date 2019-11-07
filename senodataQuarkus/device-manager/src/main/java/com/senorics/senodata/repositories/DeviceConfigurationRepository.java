package com.senorics.senodata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.domain.DeviceConfiguration;


public interface DeviceConfigurationRepository extends JpaRepository<DeviceConfiguration, Integer> {
}
