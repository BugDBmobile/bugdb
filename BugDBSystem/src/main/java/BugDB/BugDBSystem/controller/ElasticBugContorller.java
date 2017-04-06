package BugDB.BugDBSystem.controller;

import BugDB.BugDBSystem.Util.IteratorUtils;
import BugDB.BugDBSystem.VO.EsBugVO;
import BugDB.BugDBSystem.domain.Bug;
import BugDB.BugDBSystem.domain.EsBug;
import BugDB.BugDBSystem.service.IBugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/esbug", produces = "application/json;charset=UTF-8")
public class ElasticBugContorller {

    @Autowired
    private IBugService bugService;


    @RequestMapping(value = "synchronizeDB", method = RequestMethod.GET)
    public String bug() {
        Iterable<Bug> bugList = bugService.findAll();
        int count = 0;
        for (Bug bug : bugList) {
            EsBug esBug = new EsBug(bug);
            EsBug eb = bugService.save(esBug);
            if (eb != null)
                count++;

        }
        return "" + count;
    }

    @RequestMapping(value = "/{queryString}", method = RequestMethod.GET)
    public List searchBug(@PathVariable("queryString") String queryString) {
        Iterable<EsBug> bugList = bugService.search(queryString);
        List<EsBugVO> esbugs = IteratorUtils.toVOList(bugList, EsBugVO.class);
        return esbugs;
    }

    @RequestMapping(value = "/allBug", method = RequestMethod.GET)
    public List allBug() {
        Iterable<EsBug> bugList = bugService.findAllEsBug();
        List<EsBugVO> esbugs = IteratorUtils.toVOList(bugList, EsBugVO.class);
        return esbugs;
    }

    @RequestMapping(value = "/deleteAll")
    public List deleteAll() {
        Iterable<EsBug> bugList = bugService.deleteAll();
        List<EsBug> esbugs = IteratorUtils.toList(bugList);
        return esbugs;
    }
}
