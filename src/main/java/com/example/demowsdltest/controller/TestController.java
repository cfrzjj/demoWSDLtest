package com.example.demowsdltest.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demowsdltest.test1.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class TestController {
    @RequestMapping("/mapper")
    @ResponseBody
    public String testWsdl(){
        SIPURCHASEOUTService sipurchaseoutService = new SIPURCHASEOUTService();
        SIPURCHASEOUT httpPort = sipurchaseoutService.getHTTPPort();

        //基于basic的用户名/密码验证
        Map< String,Object> requestContext =((BindingProvider)httpPort).getRequestContext();
        //用户名
        requestContext.put(BindingProvider.USERNAME_PROPERTY,"pisuper");
        //密码
        requestContext.put(BindingProvider.PASSWORD_PROPERTY,"Efort@2021");


        ObjectFactory objectFactory = new ObjectFactory();
        DTPURCHASEOUTREQ.TITEM dtpurchaseoutreqtitem = objectFactory.createDTPURCHASEOUTREQTITEM();
        DTPURCHASEOUTREQ dtpurchaseoutreq = objectFactory.createDTPURCHASEOUTREQ();
        DTPURCHASEOUTRES dtpurchaseoutres = objectFactory.createDTPURCHASEOUTRES();

        /*List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");*/
        dtpurchaseoutreq.setPRTYPE("11");
        dtpurchaseoutreq.setREQUESTID("22");

        dtpurchaseoutreqtitem.getACCTASSCAT().add("111");
        dtpurchaseoutreqtitem.getACCTASSCAT().add("000");
        dtpurchaseoutreqtitem.getCOSTCENTER().add("222");
        dtpurchaseoutreq.getTITEM().add(dtpurchaseoutreqtitem);


        dtpurchaseoutres = httpPort.siPURCHASEOUT(dtpurchaseoutreq);
        String s = JSONObject.toJSONString(dtpurchaseoutres);
        return s;
    }
}
