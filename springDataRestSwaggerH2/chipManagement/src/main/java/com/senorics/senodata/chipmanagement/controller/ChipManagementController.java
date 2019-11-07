package com.senorics.senodata.chipmanagement.controller;//package com.senorics.senodata.chipmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.senorics.senodata.chipmanagement.domain.Chip;
import com.senorics.senodata.chipmanagement.repositories.ChipRepository;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@BasePathAwareController
public class ChipManagementController {

    private final ChipRepository chipRepository;

    @Autowired
    public ChipManagementController(final ChipRepository chipRepository) {
        this.chipRepository = chipRepository;
    }

    @RequestMapping(path = "chip", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    ResponseEntity<?> getChips() {
        List<Chip> chips = chipRepository.findAll();
        Resources<Chip> resources = new Resources<Chip>(chips);
        resources.add(linkTo(methodOn(ChipManagementController.class).getChips()).withSelfRel());
        return ResponseEntity.ok(resources);
    }
}
