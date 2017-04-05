package BugDB.BugDBSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import BugDB.BugDBSystem.domain.Component;


public interface ComponentRepository extends JpaRepository<Component, Long>, JpaSpecificationExecutor<Component> {
}
