package com.senorics.senodata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.domain.DeviceModel;

public interface DeviceModelRepository extends JpaRepository<DeviceModel, Integer> {
}
