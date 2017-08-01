package com.ssh.service.impl;

import com.ssh.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by Ykue on 2017/6/28.
 */
@Service
public class TestServiceImp implements TestService {

    public String test() {
        return "test";
    }
}
