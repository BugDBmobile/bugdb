package BugDB.BugDBSystem.repository;

import BugDB.BugDBSystem.domain.EsBug;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by jingwei on 2017/4/4.
 */
public interface EsBugRepository extends ElasticsearchRepository<EsBug, Integer> {

    EsBug findByBugNo(int bugNo);
}
