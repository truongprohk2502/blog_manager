package code.repository;

import code.model.Blog;
import code.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByAuthorContaining(String author, Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
}
