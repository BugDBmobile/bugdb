package BugDB.BugDBSystem.repository;

import BugDB.BugDBSystem.domain.ElasticUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface ElasticUserRepository extends ElasticsearchRepository<ElasticUser, Long> {

    ElasticUser findByUserName(String name);
}
