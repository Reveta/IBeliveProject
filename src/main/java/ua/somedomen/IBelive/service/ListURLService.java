package ua.somedomen.IBelive.service;

import ua.somedomen.IBelive.entity.ListURL;

import java.util.List;

public interface ListURLService {

    void saveURLforVideo(ListURL listURL);

    List<ListURL> findALL();

}
