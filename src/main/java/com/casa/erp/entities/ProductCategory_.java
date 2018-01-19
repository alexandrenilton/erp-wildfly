package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.365-0200")
@StaticMetamodel(ProductCategory.class)
public class ProductCategory_ extends BaseEntity_ {
	public static volatile SingularAttribute<ProductCategory, String> name;
	public static volatile SingularAttribute<ProductCategory, Boolean> active;
	public static volatile ListAttribute<ProductCategory, Product> products;
}
