package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.349-0200")
@StaticMetamodel(Journal.class)
public class Journal_ extends BaseEntity_ {
	public static volatile SingularAttribute<Journal, String> name;
	public static volatile SingularAttribute<Journal, String> type;
	public static volatile SingularAttribute<Journal, String> code;
	public static volatile SingularAttribute<Journal, Boolean> active;
	public static volatile ListAttribute<Journal, JournalItem> journalItems;
	public static volatile ListAttribute<Journal, JournalEntry> journalEntries;
	public static volatile ListAttribute<Journal, Payment> payments;
	public static volatile ListAttribute<Journal, Invoice> invoices;
}
