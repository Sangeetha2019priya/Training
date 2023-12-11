package com.example.Rep.Repository;

import com.example.Rep.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product findByName(String name);
    
    Optional<Product> findFirstByOrderByDescriptionDesc();

    Optional<Product> findById(Long id);

    List<Product> findByDateCreatedBefore(LocalDateTime date);

    Optional<Product> findFirstByOrderByDateCreatedDesc();

    List<Product> findByNameOrDescription(String name, String description);

    List<Product> findByNameAndDescription(String name, String description);

    Product findDistinctByName(String name);

    List<Product> findByPriceGreaterThan(BigDecimal price);

    List<Product> findByPriceLessThan(BigDecimal price);

    List<Product> findByNameContaining(String name);

    List<Product> findByNameLike(String name);

    List<Product> findByPriceBetween(BigDecimal startPrice, BigDecimal endPrice);

    List<Product> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);

    public List<Object[]> countProductsByName();

}