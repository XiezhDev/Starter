package com.gdut.dubbo.common.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface AddrService {

    List<String> getUserAddrList(String userid);
}
