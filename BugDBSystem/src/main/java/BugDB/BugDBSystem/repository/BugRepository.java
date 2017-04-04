package BugDB.BugDBSystem.repository;

import BugDB.BugDBSystem.domain.Bug;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jingwei on 2017/4/4.
 */
public interface BugRepository extends PagingAndSortingRepository<Bug, Integer> {

}
