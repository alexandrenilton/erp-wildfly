package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.381-0200")
@StaticMetamodel(Tax.class)
public class Tax_ extends BaseEntity_ {
	public static volatile SingularAttribute<Tax, String> name;
	public static volatile SingularAttribute<Tax, Double> amount;
	public static volatile SingularAttribute<Tax, Double> percent;
	public static volatile SingularAttribute<Tax, String> typeTaxUse;
	public static volatile SingularAttribute<Tax, Boolean> active;
	public static volatile ListAttribute<Tax, InvoiceLine> invoiceLines;
	public static volatile ListAttribute<Tax, PurchaseOrderLine> purchaseOrderLines;
	public static volatile ListAttribute<Tax, InvoiceTax> invoiceTaxes;
	public static volatile ListAttribute<Tax, SaleOrderLine> saleOrderLines;
	public static volatile ListAttribute<Tax, JournalItem> journalItems;
}
