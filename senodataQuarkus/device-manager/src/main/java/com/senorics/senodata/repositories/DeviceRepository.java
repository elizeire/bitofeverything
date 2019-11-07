package com.senorics.senodata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.domain.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
