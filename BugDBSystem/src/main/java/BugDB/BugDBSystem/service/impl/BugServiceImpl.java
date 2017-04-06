package BugDB.BugDBSystem.service.impl;

import BugDB.BugDBSystem.domain.Bug;
import BugDB.BugDBSystem.domain.EsBug;
import BugDB.BugDBSystem.domain.User;
import BugDB.BugDBSystem.repository.BugRepository;
import BugDB.BugDBSystem.repository.EsBugRepository;
import BugDB.BugDBSystem.service.IBugService;
import org.apache.lucene.queryparser.flexible.core.QueryNodeException;
import org.apache.lucene.queryparser.flexible.core.builders.QueryBuilder;
import org.apache.lucene.queryparser.flexible.core.nodes.QueryNode;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by jingwei on 2017/4/4.
 */
@Service
public class BugServiceImpl implements IBugService {
    @Autowired
    private EsBugRepository esBugRepository;
    @Autowired
    private BugRepository bugRepository;

    @Override
    public EsBug findByBugNo(int bugNo){
        return esBugRepository.findByBugNo(bugNo);
    }

    public Iterable<Bug> findAll(){
        return bugRepository.findAll();
    }

    @Override
    @Transactional
    public EsBug save(EsBug esBug) {
        return esBugRepository.save(esBug);
    }

    @Override
    public Iterable<EsBug> search(String str) {
        QueryStringQueryBuilder queryBuilder = new QueryStringQueryBuilder("*"+str+"*");
       // MatchAllDocsQuery matchAllDocsQuery = new MatchAllDocsQuery();

        Iterable<EsBug> bugList = esBugRepository.search(queryBuilder);
        return bugList;

    }

    @Override
    public Iterable<EsBug> findAllEsBug() {
        return esBugRepository.findAll();
    }

    @Override
    @Transactional
    public Iterable<EsBug> deleteAll() {
        esBugRepository.deleteAll();
        return esBugRepository.findAll();
    }


}
