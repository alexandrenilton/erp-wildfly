package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.372-0200")
@StaticMetamodel(PurchaseOrder.class)
public class PurchaseOrder_ extends BaseEntity_ {
	public static volatile SingularAttribute<PurchaseOrder, Date> date;
	public static volatile SingularAttribute<PurchaseOrder, Double> amountTax;
	public static volatile SingularAttribute<PurchaseOrder, Double> amountTotal;
	public static volatile SingularAttribute<PurchaseOrder, Double> amountUntaxed;
	public static volatile SingularAttribute<PurchaseOrder, String> state;
	public static volatile SingularAttribute<PurchaseOrder, Boolean> shipped;
	public static volatile SingularAttribute<PurchaseOrder, Boolean> deliveryCreated;
	public static volatile SingularAttribute<PurchaseOrder, Boolean> paid;
	public static volatile SingularAttribute<PurchaseOrder, Double> unpaid;
	public static volatile SingularAttribute<PurchaseOrder, String> notes;
	public static volatile SingularAttribute<PurchaseOrder, String> invoiceMethod;
	public static volatile SingularAttribute<PurchaseOrder, Integer> discount;
	public static volatile SingularAttribute<PurchaseOrder, Boolean> active;
	public static volatile SingularAttribute<PurchaseOrder, String> name;
	public static volatile SingularAttribute<PurchaseOrder, String> reference;
	public static volatile SingularAttribute<PurchaseOrder, Partner> partner;
	public static volatile ListAttribute<PurchaseOrder, PurchaseOrderLine> purchaseOrderLines;
	public static volatile ListAttribute<PurchaseOrder, DeliveryOrder> deliveryOrders;
	public static volatile ListAttribute<PurchaseOrder, Invoice> invoices;
}
