package com.hc.service;

import com.hc.model.IMoocJSONResult;
import com.hc.model.Tree;
import com.hc.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeService {

    @Autowired
    private TreeRepository treeRepository;
    public IMoocJSONResult addTree(Tree tree) {
        treeRepository.save(tree);
        return IMoocJSONResult.ok();
    }
}
