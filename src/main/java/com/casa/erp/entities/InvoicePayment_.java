package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.344-0200")
@StaticMetamodel(InvoicePayment.class)
public class InvoicePayment_ extends BaseEntity_ {
	public static volatile SingularAttribute<InvoicePayment, Double> paidAmount;
	public static volatile SingularAttribute<InvoicePayment, String> name;
	public static volatile SingularAttribute<InvoicePayment, Date> date;
	public static volatile SingularAttribute<InvoicePayment, JournalEntry> journalEntry;
	public static volatile SingularAttribute<InvoicePayment, Invoice> invoice;
}
