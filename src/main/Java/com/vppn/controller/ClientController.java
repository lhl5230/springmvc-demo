package com.vppn.controller;

import com.vppn.beans.VPPNTeam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by hongliang.liu on 2018/5/30.
 */
@Controller
@RequestMapping(value = "/vppn/api/v1/client")
public class ClientController {

    @RequestMapping(value = "/createTeam", method = RequestMethod.POST)
    public @ResponseBody String createTeam(@RequestBody VPPNTeam team){

        System.out.println(team);
        return "{\"a\":\"b\"}";
    }

    @RequestMapping(value = "/searchTeam", method = RequestMethod.POST)
    public @ResponseBody VPPNTeam searchTeam(String userId){
        VPPNTeam vppnTeam = new VPPNTeam();
        vppnTeam.setUserId(userId);
        return vppnTeam;
    }
}
