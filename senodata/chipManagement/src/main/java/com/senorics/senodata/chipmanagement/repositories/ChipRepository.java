package com.senorics.senodata.chipmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senorics.senodata.chipmanagement.domain.Chip;
import io.swagger.annotations.Api;

@Api
public interface ChipRepository extends JpaRepository<Chip, Integer> {
}
