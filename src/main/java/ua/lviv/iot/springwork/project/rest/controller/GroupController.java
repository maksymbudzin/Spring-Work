package ua.lviv.iot.spring.project7.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.lviv.iot.spring.project7.business.GroupService;
import ua.lviv.iot.spring.project7.rest.model.Group;

@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    public List<Group> getAllGroups() {
        return groupService.findAll();
    }
}
