package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.355-0200")
@StaticMetamodel(Partner.class)
public class Partner_ extends BaseEntity_ {
	public static volatile SingularAttribute<Partner, String> name;
	public static volatile SingularAttribute<Partner, byte[]> image;
	public static volatile SingularAttribute<Partner, String> city;
	public static volatile SingularAttribute<Partner, String> street;
	public static volatile SingularAttribute<Partner, Boolean> supplier;
	public static volatile SingularAttribute<Partner, Boolean> customer;
	public static volatile SingularAttribute<Partner, String> email;
	public static volatile SingularAttribute<Partner, String> website;
	public static volatile SingularAttribute<Partner, String> country;
	public static volatile SingularAttribute<Partner, Date> createDate;
	public static volatile SingularAttribute<Partner, String> fax;
	public static volatile SingularAttribute<Partner, String> phone;
	public static volatile SingularAttribute<Partner, Double> credit;
	public static volatile SingularAttribute<Partner, Double> debit;
	public static volatile SingularAttribute<Partner, byte[]> imageMedium;
	public static volatile SingularAttribute<Partner, String> mobile;
	public static volatile SingularAttribute<Partner, Boolean> isCompany;
	public static volatile SingularAttribute<Partner, Integer> purchaseDeals;
	public static volatile SingularAttribute<Partner, Integer> saleDeals;
	public static volatile SingularAttribute<Partner, Boolean> active;
	public static volatile SingularAttribute<Partner, Account> accountReceivable;
	public static volatile SingularAttribute<Partner, Account> accountPayable;
	public static volatile ListAttribute<Partner, JournalItem> journalItems;
	public static volatile ListAttribute<Partner, DeliveryOrderLine> deliveryOrderLines;
	public static volatile ListAttribute<Partner, DeliveryOrder> deliveryOrders;
	public static volatile ListAttribute<Partner, JournalEntry> journalEntries;
	public static volatile ListAttribute<Partner, InvoiceLine> invoiceLines;
	public static volatile ListAttribute<Partner, PurchaseOrder> purchaseOrderList;
	public static volatile ListAttribute<Partner, SaleOrder> saleOrders;
	public static volatile ListAttribute<Partner, Payment> payments;
	public static volatile ListAttribute<Partner, Invoice> invoices;
}
