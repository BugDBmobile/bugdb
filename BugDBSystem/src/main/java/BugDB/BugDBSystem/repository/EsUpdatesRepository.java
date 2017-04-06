package BugDB.BugDBSystem.repository;

import BugDB.BugDBSystem.domain.EsUpdates;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by jingwei on 06/04/2017.
 */
public interface EsUpdatesRepository extends ElasticsearchRepository<EsUpdates, Integer> {


}