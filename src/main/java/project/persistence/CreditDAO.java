package project.persistence;

import java.util.List;
import project.entity.impl.Client;
import project.entity.impl.Credit;

public interface CreditDAO extends DAO<Credit> {
	
	List<Credit> findByClient(Client client);
}
