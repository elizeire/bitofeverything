package com.senorics.senodata.devicemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.devicemanagement.domain.DeviceType;
import io.swagger.annotations.Api;

@Api
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer> {
}
