package com.rbn.programmingblog.Data.Service.Impl;

import com.rbn.programmingblog.DAO.ContentDAO;
import com.rbn.programmingblog.Data.Service.ContentDataService;
import com.rbn.programmingblog.Domain.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContentDataServiceImpl implements ContentDataService {

    @Autowired
    private ContentDAO contentDAO;

    @Override
    public List<Content> getAllContents() {
        return contentDAO.findAll();
    }

    @Override
    public Content getContentById(Integer id) {
        Optional<Content> contentOptional = contentDAO.findById(id);
        return contentOptional.get();
    }

    @Override
    public Content addContent(Content content) {
        return contentDAO.save(content);
    }

    @Override
    public Content updateContent(Content content) {
        return null;
    }

    @Override
    public void deleteContent(Content content) {
        contentDAO.delete(content);
    }
}
