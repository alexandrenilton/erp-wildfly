package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.377-0200")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ extends BaseEntity_ {
	public static volatile SingularAttribute<SaleOrder, Date> date;
	public static volatile SingularAttribute<SaleOrder, Double> amountTax;
	public static volatile SingularAttribute<SaleOrder, Double> amountTotal;
	public static volatile SingularAttribute<SaleOrder, Double> amountUntaxed;
	public static volatile SingularAttribute<SaleOrder, String> state;
	public static volatile SingularAttribute<SaleOrder, Boolean> shipped;
	public static volatile SingularAttribute<SaleOrder, Boolean> deliveryCreated;
	public static volatile SingularAttribute<SaleOrder, Boolean> paid;
	public static volatile SingularAttribute<SaleOrder, Double> unpaid;
	public static volatile SingularAttribute<SaleOrder, String> notes;
	public static volatile SingularAttribute<SaleOrder, String> invoiceMethod;
	public static volatile SingularAttribute<SaleOrder, Integer> discount;
	public static volatile SingularAttribute<SaleOrder, Boolean> active;
	public static volatile SingularAttribute<SaleOrder, String> name;
	public static volatile SingularAttribute<SaleOrder, Partner> partner;
	public static volatile ListAttribute<SaleOrder, DeliveryOrder> deliveryOrders;
	public static volatile ListAttribute<SaleOrder, Invoice> invoices;
	public static volatile ListAttribute<SaleOrder, SaleOrderLine> saleOrderLines;
}
