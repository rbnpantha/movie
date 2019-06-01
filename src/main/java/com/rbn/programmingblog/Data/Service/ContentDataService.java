package com.rbn.programmingblog.Data.Service;

import com.rbn.programmingblog.Domain.Content;

import java.util.List;

public interface ContentDataService {

    List<Content> getAllContents();
    Content getContentById(Integer id);
    Content addContent(Content content);
    Content updateContent(Content content);
    void deleteContent(Content content);
}
