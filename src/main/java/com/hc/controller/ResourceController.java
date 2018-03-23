package com.hc.controller;

import com.hc.model.IMoocJSONResult;
import com.hc.model.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private Resource resource;

    /**
     * 资源文件属性配置
     * @return
     */
    @RequestMapping("/getResource")
    @ResponseBody
    public IMoocJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map){
        map.addAttribute("name","老哥");
        return "index";
    }
}
