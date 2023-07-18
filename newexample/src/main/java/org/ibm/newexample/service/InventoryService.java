package org.ibm.newexample.service;

import org.ibm.newexample.Inventory;
import java.util.*;

public interface InventoryService {
	
	public Inventory createInventory(Inventory inventory);
	
	public List<Inventory> getAllInventory();
	
	public List<Inventory> getInventoryByProductName(String productName);

	public Inventory getInventoryByid(int inventoryId);


}