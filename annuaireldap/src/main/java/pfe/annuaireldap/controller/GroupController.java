package pfe.annuaireldap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pfe.annuaireldap.dto.GroupDto;
import pfe.annuaireldap.service.GroupService;

import java.util.List;

@RestController
public class GroupController {
    @Autowired
    MessageSource messageSource;
    @Autowired
    GroupService groupService;

    @GetMapping(path="/find-all-group")
    public List <GroupDto> findAllUser () throws Exception{
        List<GroupDto> groupList =groupService.getAllGroup();
        return groupList;
    }
    @GetMapping (path="/find-group-by-cn")
    public GroupDto findGroupByCn() throws Exception{
        GroupDto groupDto =groupService.getGroupByCn("testGroup2");
        return groupDto;
    }
}
