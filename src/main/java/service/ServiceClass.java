package service;
import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Employee;
import model.City;
import model.State;

@Service
public class ServiceClass {
	Hashtable<String, Employee>employees = new Hashtable<String,Employee>();
	Hashtable<String, City>cities = new Hashtable<String,City>();
	Hashtable<String, State>states = new Hashtable<String,State>();
	
	public ServiceClass() {
		Employee e = new Employee();
		e.setId("1");
		e.setName("Abhishek");
		e.setCity("Etah");
		e.setPhoneNumber("8433286529");
		e.setState("UP");
		employees.put("1", e);
		
		e = new Employee();
		e.setId("2");
		e.setName("Arun");
		e.setCity("Kota");
		e.setPhoneNumber("9832186529");
		e.setState("RJ");
		employees.put("2", e);
		
		City c = new City();
		c.setCityName("Etah");
		c.setPincode("207001");
		cities.put("1", c);
		
		c = new City();
		c.setCityName("Kota");
		c.setPincode("781039");
		cities.put("2", c);
		
		State s = new State();
		s.setStateName("UP");
		s.setPopulation("403003020");
		states.put("1", s);
		
		s = new State();
		s.setStateName("RJ");
		s.setPopulation("342432");
		states.put("2", s);
		
	}
	public Employee getEmployee(String id) {
		if(employees.containsKey(id))
			return employees.get(id);
		else
			return null;
	}
	public Hashtable<String,Employee> getAllE(){
		return employees;
	}
	public City getCity(String id) {
		if(cities.containsKey(id))
			return cities.get(id);
		else
			return null;
	}
	public Hashtable<String,City> getAllC(){
		return cities;
	}
	public State getState(String id) {
		if(states.containsKey(id))
			return states.get(id);
		else
			return null;
	}
	public Hashtable<String,State> getAllS(){
		return states;
	}


}
