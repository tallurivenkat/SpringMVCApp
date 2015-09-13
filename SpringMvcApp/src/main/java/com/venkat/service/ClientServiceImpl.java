/**
 * 
 */
package com.venkat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.dao.BaseDao;
import com.venkat.domain.Client;

/**
 * @author talluri
 *
 */
@Service(value="clientService")
public class ClientServiceImpl implements ClientService {

	@Autowired
	BaseDao dao;
	@Override
	public void persist(Client client) {
		// TODO Auto-generated method stub
		dao.persist(client);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll(Client.class);
	}

}
