package BugDB.BugDBSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import BugDB.BugDBSystem.domain.Updates;


public interface UpdatesRepository extends JpaRepository<Updates, Long>, JpaSpecificationExecutor<Updates> {
	@Query("select u from Updates u where bugId = ?")
	public List<Updates> findByBugId(int bugId);
}
