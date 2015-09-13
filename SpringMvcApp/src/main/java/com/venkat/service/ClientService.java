/**
 * 
 */
package com.venkat.service;

import java.util.List;

import com.venkat.domain.Client;

/**
 * @author talluri
 *
 */
public interface ClientService {
public void persist(Client client);
	
	public List<Client> getAll();
	
}
