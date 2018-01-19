package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.379-0200")
@StaticMetamodel(SaleOrderLine.class)
public class SaleOrderLine_ extends BaseEntity_ {
	public static volatile SingularAttribute<SaleOrderLine, Date> date;
	public static volatile SingularAttribute<SaleOrderLine, Double> quantity;
	public static volatile SingularAttribute<SaleOrderLine, Double> price;
	public static volatile SingularAttribute<SaleOrderLine, String> uom;
	public static volatile SingularAttribute<SaleOrderLine, Double> subTotal;
	public static volatile SingularAttribute<SaleOrderLine, Double> discount;
	public static volatile SingularAttribute<SaleOrderLine, String> name;
	public static volatile SingularAttribute<SaleOrderLine, Boolean> active;
	public static volatile SingularAttribute<SaleOrderLine, Boolean> invoiced;
	public static volatile SingularAttribute<SaleOrderLine, SaleOrder> saleOrder;
	public static volatile SingularAttribute<SaleOrderLine, Product> product;
	public static volatile SingularAttribute<SaleOrderLine, Tax> tax;
}
