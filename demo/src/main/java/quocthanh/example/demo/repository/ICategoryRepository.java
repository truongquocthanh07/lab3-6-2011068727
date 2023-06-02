package quocthanh.example.demo.repository;

import quocthanh.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
