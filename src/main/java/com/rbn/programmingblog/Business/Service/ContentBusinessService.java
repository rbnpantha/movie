package com.rbn.programmingblog.Business.Service;

import com.rbn.programmingblog.Domain.Content;

import java.util.List;

public interface ContentBusinessService {
    List<Content> findAll();

    Content findById(Integer id);

    Content createContent(Content content);

    Content updateContent(Content content);

    void deleteContent(Content content);
}
