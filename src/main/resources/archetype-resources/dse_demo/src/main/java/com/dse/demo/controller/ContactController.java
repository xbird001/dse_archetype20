package com.dse.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
    *  前端控制器
    * </p>
 *
 * @author subiao_zhou
 * @since 2019-02-21
 */
@RestController
@RequestMapping("/contact")
public class ContactController {

    private Logger logger = LoggerFactory.getLogger(com.dse.demo.controller.ContactController.class);

    @Resource(name = "contactServiceImpl")
    private com.dse.demo.service.ContactService contactService;


}
