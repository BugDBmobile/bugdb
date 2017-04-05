package BugDB.BugDBSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import BugDB.BugDBSystem.domain.Severity;


public interface SeverityRepository extends JpaRepository<Severity, Long>, JpaSpecificationExecutor<Severity> {
}
