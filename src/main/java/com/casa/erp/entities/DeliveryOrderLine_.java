package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.334-0200")
@StaticMetamodel(DeliveryOrderLine.class)
public class DeliveryOrderLine_ extends BaseEntity_ {
	public static volatile SingularAttribute<DeliveryOrderLine, Double> price;
	public static volatile SingularAttribute<DeliveryOrderLine, Double> quantity;
	public static volatile SingularAttribute<DeliveryOrderLine, Double> reserved;
	public static volatile SingularAttribute<DeliveryOrderLine, String> type;
	public static volatile SingularAttribute<DeliveryOrderLine, String> uom;
	public static volatile SingularAttribute<DeliveryOrderLine, String> state;
	public static volatile SingularAttribute<DeliveryOrderLine, Boolean> active;
	public static volatile SingularAttribute<DeliveryOrderLine, Partner> partner;
	public static volatile SingularAttribute<DeliveryOrderLine, DeliveryOrder> deliveryOrder;
	public static volatile SingularAttribute<DeliveryOrderLine, Product> product;
}
