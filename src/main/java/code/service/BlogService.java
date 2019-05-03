package code.service;

import code.model.Blog;
import code.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByAuthorContaining(String author, Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
