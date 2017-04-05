package BugDB.BugDBSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BugDB.BugDBSystem.domain.Component;
import BugDB.BugDBSystem.domain.Os;
import BugDB.BugDBSystem.domain.Product;
import BugDB.BugDBSystem.domain.Severity;
import BugDB.BugDBSystem.domain.Status;
import BugDB.BugDBSystem.repository.ComponentRepository;
import BugDB.BugDBSystem.repository.OsRepository;
import BugDB.BugDBSystem.repository.ProductRepository;
import BugDB.BugDBSystem.repository.SeverityRepository;
import BugDB.BugDBSystem.repository.StatusRepository;


@Service
public class UtilService {
	@Autowired
	private ComponentRepository cr;
	@Autowired
	private OsRepository or;
	@Autowired
	private ProductRepository pr;
	@Autowired
	private SeverityRepository sr;
	@Autowired
	private StatusRepository str;
	
	@Transactional
	public List<Component> findAllComponent(){
		return cr.findAll();
	}
	
	@Transactional
	public List<Os> findAllOs(){
		return or.findAll();
	}

	@Transactional
	public List<Product> findAllProduct(){
		return pr.findAll();
	}
	
	@Transactional
	public Product findProductById(int id){
		return pr.findById(id);
	}
	
	@Transactional
	public List<Severity> findAllSeverity(){
		return sr.findAll();
	}
	
	@Transactional
	public List<Status> findAllStatus(){
		return str.findAll();
	}
	
	@Transactional 
	public Status findStatusById(int id){
		return str.findById(id);
	}
}
