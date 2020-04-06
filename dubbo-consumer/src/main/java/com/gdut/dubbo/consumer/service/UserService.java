package com.gdut.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gdut.dubbo.common.service.AddrService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {

    @Reference
    private AddrService addrService;


    public List<String> getUserAddr(String userid) {
        return addrService.getUserAddrList("xiezh");

    }
}
