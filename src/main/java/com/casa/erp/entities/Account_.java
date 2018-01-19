package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.257-0200")
@StaticMetamodel(Account.class)
public class Account_ extends BaseEntity_ {
	public static volatile SingularAttribute<Account, String> name;
	public static volatile SingularAttribute<Account, String> title;
	public static volatile SingularAttribute<Account, String> type;
	public static volatile SingularAttribute<Account, String> code;
	public static volatile SingularAttribute<Account, Boolean> active;
	public static volatile ListAttribute<Account, JournalItem> journalItems;
	public static volatile ListAttribute<Account, InvoiceLine> invoiceLines;
	public static volatile ListAttribute<Account, InvoiceTax> invoiceTaxes;
	public static volatile ListAttribute<Account, Payment> payments;
	public static volatile ListAttribute<Account, Invoice> invoices;
}
