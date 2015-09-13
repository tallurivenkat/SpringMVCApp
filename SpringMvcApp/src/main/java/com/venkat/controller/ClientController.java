/**
 * 
 */
package com.venkat.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.venkat.domain.Client;
import com.venkat.service.ClientService;

/**
 * @author talluri
 *
 */
@Controller
@RequestMapping("/*")
public class ClientController {
	@Autowired
	ClientService clientService;
	@RequestMapping(value="/addClient",method=RequestMethod.GET)
	public ModelAndView addClient(){
		
		return new ModelAndView("addClient","client",new Client());
	}
	
	@RequestMapping(value="/saveClient",method=RequestMethod.POST)
	public String saveClient(Client client,ModelMap map){
		clientService.persist(client);
		map.put("allClients",clientService.getAll());
		return "listClients";
		}
	}


