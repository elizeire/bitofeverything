package com.senorics.senodata.devicemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.senorics.senodata.devicemanagement.domain.DeviceModel;
import io.swagger.annotations.Api;

@Api
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:3000")
public interface DeviceModelRepository extends JpaRepository<DeviceModel, Integer> {
}
