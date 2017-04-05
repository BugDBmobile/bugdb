package BugDB.BugDBSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import BugDB.BugDBSystem.domain.Product;


public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
	@Query("select p from Product p where id = ?")
	public Product findById(int id);
}
