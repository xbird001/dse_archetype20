package com.dse.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dse.demo.dao.ContactMapper;
import com.dse.demo.entity.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author subiao_zhou
 * @since 2019-02-21
 */
@Service(value = "contactServiceImpl")
@Transactional
public class ContactServiceImpl extends ServiceImpl<ContactMapper, Contact> implements com.dse.demo.service.ContactService {

    private Logger logger = LoggerFactory.getLogger(com.dse.demo.service.impl.ContactServiceImpl.class);

}
