package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.351-0200")
@StaticMetamodel(JournalEntry.class)
public class JournalEntry_ extends BaseEntity_ {
	public static volatile SingularAttribute<JournalEntry, String> name;
	public static volatile SingularAttribute<JournalEntry, String> ref;
	public static volatile SingularAttribute<JournalEntry, Date> date;
	public static volatile SingularAttribute<JournalEntry, Double> amount;
	public static volatile SingularAttribute<JournalEntry, String> state;
	public static volatile SingularAttribute<JournalEntry, Boolean> active;
	public static volatile ListAttribute<JournalEntry, JournalItem> journalItems;
	public static volatile SingularAttribute<JournalEntry, Journal> journal;
	public static volatile SingularAttribute<JournalEntry, Partner> partner;
	public static volatile SingularAttribute<JournalEntry, Payment> payment;
	public static volatile SingularAttribute<JournalEntry, Invoice> invoice;
	public static volatile ListAttribute<JournalEntry, InvoicePayment> invoicePayments;
}
