package com.lianyanjie.dubboapi;

import java.util.List;

/**
 * @author: lyj
 * @since: 2019/2/27
 */
public interface DemoService {

    List<String> getPermissions(Long id);

}
