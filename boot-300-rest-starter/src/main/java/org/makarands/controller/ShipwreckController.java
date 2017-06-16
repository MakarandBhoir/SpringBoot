package org.makarands.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.makarands.model.Shipwreck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	private static Logger logger = Logger.getLogger(ShipwreckController.class);
	
	@RequestMapping(value="shipwrecks", method=RequestMethod.GET)
	public List <Shipwreck> list()
	{
		logger.info("--- LIST ---");
		return ShipwreckData.list();
	}
	@RequestMapping(value="shipwrecks", method=RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck)
	{
		logger.info("--- CREATE ---");
		return ShipwreckData.create(shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id)
	{
		logger.info("--- GET ---");
		return ShipwreckData.get(id);
	}
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck)
	{
		logger.info("--- UPDATE ---");
		return ShipwreckData.update(id, shipwreck);
	}
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id)
	{
		logger.info("--- DELETE ---");
		return ShipwreckData.delete(id);
	}
}
