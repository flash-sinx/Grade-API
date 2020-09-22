package controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.ServiceClass;
import model.Employee;
import model.State;
import model.City;

@RestController
@RequestMapping("/")
public class PersonController {
	
	@Autowired
	ServiceClass ps;
	
	@RequestMapping("employees/all")
	public Hashtable<String, Employee> getAllE(){
		return ps.getAllE();
	}
	
	@RequestMapping("employees/{id}")
	public Employee getEmployee(@PathVariable("id") String id) {
		return ps.getEmployee(id);
	}
	@RequestMapping("cities/all")
	public Hashtable<String, City> getAllC(){
		return ps.getAllC();
	}
	
	@RequestMapping("cities/{id}")
	public City getCity(@PathVariable("id") String id) {
		return ps.getCity(id);
	}
	@RequestMapping("states/all")
	public Hashtable<String, State> getAllS(){
		return ps.getAllS();
	}
	
	@RequestMapping("states/{id}")
	public State getState(@PathVariable("id") String id) {
		return ps.getState(id);
	}

}
