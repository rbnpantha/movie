package com.rbn.programmingblog.DAO;

import com.rbn.programmingblog.Domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentDAO extends JpaRepository<Content, Integer> {
}
