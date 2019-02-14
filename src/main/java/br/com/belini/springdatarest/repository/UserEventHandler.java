package br.com.belini.springdatarest.repository;

import org.jboss.logging.Logger;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import br.com.belini.springdatarest.model.User;

@RepositoryEventHandler(User.class)
public class UserEventHandler {
	
	private Logger logger = Logger.getLogger("UserEventHandler Logger ->");
	
	@HandleBeforeCreate
	public void handleUserSave(User user) {
		logger.info("Handle Before Save ...");
	}

}