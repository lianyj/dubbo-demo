package com.lianyanjie.dubboprovider.impl;

import com.lianyanjie.dubboapi.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lyj
 * @since: 2019/2/27
 */
public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(Long id){
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
