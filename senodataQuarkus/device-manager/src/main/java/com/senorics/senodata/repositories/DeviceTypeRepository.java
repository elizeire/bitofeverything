package com.senorics.senodata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.domain.DeviceType;

public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer> {
}
