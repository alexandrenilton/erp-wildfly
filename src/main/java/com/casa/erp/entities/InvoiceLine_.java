package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.342-0200")
@StaticMetamodel(InvoiceLine.class)
public class InvoiceLine_ extends BaseEntity_ {
	public static volatile SingularAttribute<InvoiceLine, Date> date;
	public static volatile SingularAttribute<InvoiceLine, String> name;
	public static volatile SingularAttribute<InvoiceLine, String> uom;
	public static volatile SingularAttribute<InvoiceLine, Double> price;
	public static volatile SingularAttribute<InvoiceLine, Double> priceSubtotal;
	public static volatile SingularAttribute<InvoiceLine, Double> discount;
	public static volatile SingularAttribute<InvoiceLine, Double> quantity;
	public static volatile SingularAttribute<InvoiceLine, Boolean> active;
	public static volatile SingularAttribute<InvoiceLine, Account> account;
	public static volatile SingularAttribute<InvoiceLine, Invoice> invoice;
	public static volatile SingularAttribute<InvoiceLine, Partner> partner;
	public static volatile SingularAttribute<InvoiceLine, Product> product;
	public static volatile SingularAttribute<InvoiceLine, Tax> tax;
}
