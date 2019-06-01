package com.rbn.programmingblog.Business.Service.Impl;

import com.rbn.programmingblog.Business.Service.ContentBusinessService;
import com.rbn.programmingblog.Data.Service.ContentDataService;
import com.rbn.programmingblog.Domain.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentBusinessServiceImpl implements ContentBusinessService {

    @Autowired
    private ContentDataService contentDataService;

    @Override
    public List<Content> findAll() {
        return contentDataService.getAllContents();
    }

    @Override
    public Content findById(Integer id) {
        return contentDataService.getContentById(id);
    }

    @Override
    public Content createContent(Content content) {
        return contentDataService.addContent(content);
    }

    @Override
    public Content updateContent(Content content) {
        return contentDataService.updateContent(content);
    }

    @Override
    public void deleteContent(Content content) {
        contentDataService.deleteContent(content);
    }
}
