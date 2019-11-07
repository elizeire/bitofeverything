package com.senorics.senodata.devicemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.devicemanagement.domain.Device;
import io.swagger.annotations.Api;

@Api
public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
