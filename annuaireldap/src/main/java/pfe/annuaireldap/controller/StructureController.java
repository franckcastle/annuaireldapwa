package pfe.annuaireldap.controller;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pfe.annuaireldap.dto.StructureDto;
import pfe.annuaireldap.request.StructureRequest;
import pfe.annuaireldap.service.GroupService;
import pfe.annuaireldap.service.StructureService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class StructureController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    StructureService structureService;
    @GetMapping(path = "/find-all-structure")
    public List<StructureDto> findAllUser () throws Exception{
        List<StructureDto> structureList = structureService.getAllStructure();
        return structureList;

    }
    @GetMapping(path = "/find-structure-by-ou")
    public StructureDto findByStructureName() throws Exception{
        StructureDto structureDto = structureService.getStructureByOu("C50");
        return structureDto;
    }
    @PostMapping(path="/add-structure")
    public String addStructure() throws Exception{
        StructureRequest structureRequest = new StructureRequest();
        structureRequest.setId("ou=C50,ou=cni,ou=structures");
        structureRequest.setOu("C50");
        structureRequest.setDescriptionAr("ببيبيبيب");
        structureRequest.setDescriptionFr("sdsdsd");
        structureRequest.setStructurePath("/Tunisie/C50");
        return structureService.addStructure(structureRequest);
    }
}
