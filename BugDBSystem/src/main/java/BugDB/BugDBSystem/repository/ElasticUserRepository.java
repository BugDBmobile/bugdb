package BugDB.BugDBSystem.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import BugDB.BugDBSystem.domain.User;


public interface ElasticUserRepository extends ElasticsearchRepository<User, Long> {

    User findByUserName(String name);
}
