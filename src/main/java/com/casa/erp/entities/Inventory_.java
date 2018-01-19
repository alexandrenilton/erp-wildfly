package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.336-0200")
@StaticMetamodel(Inventory.class)
public class Inventory_ extends BaseEntity_ {
	public static volatile SingularAttribute<Inventory, Double> maxQty;
	public static volatile SingularAttribute<Inventory, Double> minQty;
	public static volatile SingularAttribute<Inventory, Double> quantityOnHand;
	public static volatile SingularAttribute<Inventory, Double> incomingQuantity;
	public static volatile SingularAttribute<Inventory, Double> reservedQuantity;
	public static volatile SingularAttribute<Inventory, Double> unitCost;
	public static volatile SingularAttribute<Inventory, Double> totalCost;
	public static volatile SingularAttribute<Inventory, Boolean> active;
	public static volatile SingularAttribute<Inventory, Product> product;
}
