package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.360-0200")
@StaticMetamodel(Product.class)
public class Product_ extends BaseEntity_ {
	public static volatile SingularAttribute<Product, byte[]> image;
	public static volatile SingularAttribute<Product, String> defaultCode;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, byte[]> imageMedium;
	public static volatile SingularAttribute<Product, Double> salePrice;
	public static volatile SingularAttribute<Product, Double> purchasePrice;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, Double> weight;
	public static volatile SingularAttribute<Product, Double> volume;
	public static volatile SingularAttribute<Product, Double> length;
	public static volatile SingularAttribute<Product, Boolean> saleOk;
	public static volatile SingularAttribute<Product, Boolean> purchaseOk;
	public static volatile SingularAttribute<Product, Boolean> active;
	public static volatile SingularAttribute<Product, ProductCategory> category;
	public static volatile SingularAttribute<Product, ProductUom> uom;
	public static volatile SingularAttribute<Product, Inventory> inventory;
	public static volatile ListAttribute<Product, JournalItem> journalItems;
	public static volatile ListAttribute<Product, DeliveryOrderLine> deliveryOrderLines;
	public static volatile ListAttribute<Product, InvoiceLine> invoiceLines;
	public static volatile ListAttribute<Product, PurchaseOrderLine> purchaseOrderLines;
	public static volatile ListAttribute<Product, SaleOrderLine> saleOrderLines;
}
