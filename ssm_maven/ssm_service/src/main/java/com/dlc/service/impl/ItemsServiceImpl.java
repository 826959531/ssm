package com.dlc.service.impl;

import com.dlc.dao.ItemsDao;
import com.dlc.domain.Items;
import com.dlc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao dao;
    //@Override
    public Items findById(int id) {
        return dao.findById(id);
    }
}
