package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.332-0200")
@StaticMetamodel(DeliveryOrder.class)
public class DeliveryOrder_ extends BaseEntity_ {
	public static volatile SingularAttribute<DeliveryOrder, Date> date;
	public static volatile SingularAttribute<DeliveryOrder, String> origin;
	public static volatile SingularAttribute<DeliveryOrder, String> name;
	public static volatile SingularAttribute<DeliveryOrder, String> deliveryMethod;
	public static volatile SingularAttribute<DeliveryOrder, String> state;
	public static volatile SingularAttribute<DeliveryOrder, String> type;
	public static volatile SingularAttribute<DeliveryOrder, Boolean> active;
	public static volatile ListAttribute<DeliveryOrder, DeliveryOrderLine> deliveryOrderLines;
	public static volatile SingularAttribute<DeliveryOrder, Partner> partner;
	public static volatile SingularAttribute<DeliveryOrder, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<DeliveryOrder, SaleOrder> saleOrder;
	public static volatile SingularAttribute<DeliveryOrder, DeliveryOrder> backOrder;
	public static volatile ListAttribute<DeliveryOrder, DeliveryOrder> children;
}
