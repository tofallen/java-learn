package com.cpq.paramsvalidateboot.controller;

import com.cpq.paramsvalidateboot.bean.UserVo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/get")
public class GetController {

    @GetMapping("/g1")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> g1(String g1) throws Exception{

        return new HashMap<String, Object>(){{put("d",g1);}};
    }

    @GetMapping("/g2/more")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> g2(String g1, Integer i2, String g3) throws Exception{

        return new HashMap<String, Object>(){{put("d",g1);}};
    }

    @GetMapping("/g3/map")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> g3(@RequestParam Map<String, Object> map) throws Exception{

        return new HashMap<String, Object>(){{put("d",map);}};
    }

    @GetMapping("/g4/list")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> noRequest(String g1, @RequestParam List<String> l1) throws Exception{

        return new HashMap<String, Object>(){{put("r",l1);}};
    }

    @GetMapping("/g5/path/{id}")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> path(HttpServletRequest request, @PathVariable Integer id, @RequestParam String name) throws Exception{

        System.out.println(request.getParameterMap());
        System.out.println(request.getParameterNames());
        return new HashMap<String, Object>(){{put("r", name);}};
    }

    @RequestMapping("/user-vo")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> vo(HttpServletRequest request, UserVo userVo) throws Exception {

        return new HashMap<String, Object>(){{put("r",userVo);}};
    }

    @RequestMapping("/attr")
    //@ParamsValidate(file = "/v1/json-test.json", keyName="map01")
    public Map<String, Object> attr(HttpServletRequest request,@ModelAttribute UserVo userVo) throws Exception {

        return new HashMap<String, Object>(){{put("r",userVo);}};
    }
}
