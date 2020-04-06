package com.gdut.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gdut.dubbo.common.service.AddrService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class AddrServiceImpl implements AddrService {

    @Override
    public List<String> getUserAddrList(String userid) {
        List<String> addrList = new ArrayList<>();

        addrList.add("广州大学城");
        addrList.add("电白一中");

        return addrList;
    }
}
