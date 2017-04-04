package BugDB.BugDBSystem.service;

import BugDB.BugDBSystem.domain.Bug;
import BugDB.BugDBSystem.domain.EsBug;

/**
 * Created by jingwei on 2017/4/4.
 */
public interface IBugService {

    EsBug findByBugNo(int bugNo);

    Iterable<Bug> findAll();

    EsBug save(EsBug esBug);

    Iterable<EsBug> search(String str);

    Iterable<EsBug> findAllEsBug();

    Iterable<EsBug> deleteAll();

}
