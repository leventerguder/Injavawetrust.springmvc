package _27.hibernate.service;

import java.util.List;

import _27.hibernate.domain.Person;

public interface PersonService {

	public void insertPerson(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void updatePerson(Person person);

	public void deletePerson(int id);

}
