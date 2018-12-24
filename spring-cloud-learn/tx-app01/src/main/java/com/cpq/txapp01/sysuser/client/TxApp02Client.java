package com.cpq.txapp01.sysuser.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "tx-app02")
public interface TxApp02Client {
    @RequestMapping(value = "/sys/user/add",method = RequestMethod.POST)
    Object add();
}
