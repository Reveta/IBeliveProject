package ua.somedomen.IBelive.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.somedomen.IBelive.dao.ListURLDAO;
import ua.somedomen.IBelive.entity.ListURL;
import ua.somedomen.IBelive.service.ListURLService;

import java.util.List;

@Service
@Transactional
public class ListURLServiceImpl implements ListURLService{

    @Autowired
    private ListURLDAO listURLDAO;


    @Override
    public void saveURLforVideo(ListURL listURL) {
        System.out.println("Hello ListIMPLEMENT");
        listURLDAO.save(listURL);
    }

    @Override
    public List<ListURL> findALL() {
        return listURLDAO.findAll();
    }
}
