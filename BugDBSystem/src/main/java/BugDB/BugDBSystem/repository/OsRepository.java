package BugDB.BugDBSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import BugDB.BugDBSystem.domain.Os;


public interface OsRepository extends JpaRepository<Os, Long>, JpaSpecificationExecutor<Os> {
}
