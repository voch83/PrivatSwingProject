package project.service;

import java.util.Date;
import java.util.List;
import project.entity.impl.Client;
import project.entity.impl.Credit;
import project.exception.ExsistDoubleClient;

public interface ClientService {
	
	Client findByPassportNumber(String passportNumber);
	
	Client findByNameAndBirthDay(String firstName, String lastName,
			String patronymic, Date birthDay);
	
	Client findByInn(String inn);
	
	List<Credit> findCredits(Client client);
	
	void insert(Client client) throws ExsistDoubleClient;

}
