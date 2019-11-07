package com.senorics.senodata.chipmanagement.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.senorics.senodata.chipmanagement.domain.Chip;
import com.senorics.senodata.chipmanagement.repositories.ChipRepository;

@Component
public class ChipManagementApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ChipRepository chipRepository;

    @Autowired
    public void setApplicationRepository(ChipRepository chipRepository) {
        this.chipRepository = chipRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Chip chip1 = new Chip("chip1");
        Chip chip2 = new Chip("chip2");
        Chip chip3 = new Chip("chip3");
        Chip chip4 = new Chip("chip4");
        Chip chip5 = new Chip("chip5");
        chipRepository.save(chip1);
        chipRepository.save(chip2);
        chipRepository.save(chip3);
        chipRepository.save(chip4);
        chipRepository.save(chip5);
    }
}

