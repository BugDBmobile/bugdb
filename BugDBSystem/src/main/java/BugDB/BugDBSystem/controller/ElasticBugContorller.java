package BugDB.BugDBSystem.controller;

import BugDB.BugDBSystem.domain.Bug;
import BugDB.BugDBSystem.domain.ElasticUser;
import BugDB.BugDBSystem.domain.EsBug;
import BugDB.BugDBSystem.service.IBugService;
import BugDB.BugDBSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
        for (Bug bug : bugList)
        {
            EsBug esBug = new EsBug(bug);
            EsBug eb = bugService.save(esBug);
            if (eb != null)
                count ++;

        }
        return ""+count;
    }

    @RequestMapping(value = "/{queryString}", method = RequestMethod.GET)
    public Iterable<EsBug> searchBug(@PathVariable("queryString") String queryString) {
        Iterable<EsBug> bugList = bugService.search(queryString);
       return bugList;
    }
    @RequestMapping(value = "/allBug", method = RequestMethod.GET)
    public Iterable<EsBug> allBug() {
        Iterable<EsBug> bugList = bugService.findAllEsBug();
        return bugList;
    }
    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public Iterable<EsBug> deleteAll() {
        Iterable<EsBug> bugList = bugService.deleteAll();
        return bugList;
    }
}
