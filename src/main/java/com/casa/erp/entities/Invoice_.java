package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.338-0200")
@StaticMetamodel(Invoice.class)
public class Invoice_ extends BaseEntity_ {
	public static volatile SingularAttribute<Invoice, Date> date;
	public static volatile SingularAttribute<Invoice, Double> amountUntaxed;
	public static volatile SingularAttribute<Invoice, Double> amountTotal;
	public static volatile SingularAttribute<Invoice, Double> amountTax;
	public static volatile SingularAttribute<Invoice, String> type;
	public static volatile SingularAttribute<Invoice, String> origin;
	public static volatile SingularAttribute<Invoice, String> reference;
	public static volatile SingularAttribute<Invoice, String> comment;
	public static volatile SingularAttribute<Invoice, Double> residual;
	public static volatile SingularAttribute<Invoice, String> state;
	public static volatile SingularAttribute<Invoice, String> number;
	public static volatile SingularAttribute<Invoice, String> supplierInvoiceNumber;
	public static volatile SingularAttribute<Invoice, Boolean> active;
	public static volatile SingularAttribute<Invoice, String> name;
	public static volatile ListAttribute<Invoice, InvoiceLine> invoiceLines;
	public static volatile ListAttribute<Invoice, InvoiceTax> invoiceTaxes;
	public static volatile ListAttribute<Invoice, Payment> payments;
	public static volatile SingularAttribute<Invoice, Account> account;
	public static volatile SingularAttribute<Invoice, JournalEntry> journalEntry;
	public static volatile SingularAttribute<Invoice, Journal> journal;
	public static volatile SingularAttribute<Invoice, Partner> partner;
	public static volatile SingularAttribute<Invoice, PurchaseOrder> purchaseOrder;
	public static volatile SingularAttribute<Invoice, SaleOrder> saleOrder;
	public static volatile ListAttribute<Invoice, InvoicePayment> invoicePayments;
}
