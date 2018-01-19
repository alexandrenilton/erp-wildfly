package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.375-0200")
@StaticMetamodel(PurchaseOrderLine.class)
public class PurchaseOrderLine_ extends BaseEntity_ {
	public static volatile SingularAttribute<PurchaseOrderLine, Date> date;
	public static volatile SingularAttribute<PurchaseOrderLine, Double> price;
	public static volatile SingularAttribute<PurchaseOrderLine, Double> quantity;
	public static volatile SingularAttribute<PurchaseOrderLine, String> state;
	public static volatile SingularAttribute<PurchaseOrderLine, String> name;
	public static volatile SingularAttribute<PurchaseOrderLine, String> uom;
	public static volatile SingularAttribute<PurchaseOrderLine, Double> subTotal;
	public static volatile SingularAttribute<PurchaseOrderLine, Boolean> active;
	public static volatile SingularAttribute<PurchaseOrderLine, Boolean> invoiced;
	public static volatile SingularAttribute<PurchaseOrderLine, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<PurchaseOrderLine, Product> product;
	public static volatile SingularAttribute<PurchaseOrderLine, Tax> tax;
}
