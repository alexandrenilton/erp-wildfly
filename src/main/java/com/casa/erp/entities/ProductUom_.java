package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.367-0200")
@StaticMetamodel(ProductUom.class)
public class ProductUom_ extends BaseEntity_ {
	public static volatile SingularAttribute<ProductUom, String> name;
	public static volatile SingularAttribute<ProductUom, Integer> decimals;
	public static volatile SingularAttribute<ProductUom, Boolean> active;
	public static volatile ListAttribute<ProductUom, Product> products;
	public static volatile ListAttribute<ProductUom, JournalItem> journalItems;
	public static volatile SingularAttribute<ProductUom, ProductUomCategory> category;
}
