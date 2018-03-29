package com.hc.controller;

import com.hc.model.IMoocJSONResult;
import com.hc.model.Tree;
import com.hc.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("/addTree")
    public IMoocJSONResult addTree(){
        Tree tree = new Tree();
        tree.setText("jpa新增");
        treeService.addTree(tree);
        return IMoocJSONResult.ok("新增成功");
    }
}
