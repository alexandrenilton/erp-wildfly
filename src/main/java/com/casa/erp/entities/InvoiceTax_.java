package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.347-0200")
@StaticMetamodel(InvoiceTax.class)
public class InvoiceTax_ extends BaseEntity_ {
	public static volatile SingularAttribute<InvoiceTax, Date> date;
	public static volatile SingularAttribute<InvoiceTax, Double> taxAmount;
	public static volatile SingularAttribute<InvoiceTax, String> name;
	public static volatile SingularAttribute<InvoiceTax, Double> baseAmount;
	public static volatile SingularAttribute<InvoiceTax, Boolean> active;
	public static volatile SingularAttribute<InvoiceTax, Account> account;
	public static volatile SingularAttribute<InvoiceTax, Invoice> invoice;
	public static volatile SingularAttribute<InvoiceTax, Tax> tax;
}
