package com.casa.erp.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.370-0200")
@StaticMetamodel(ProductUomCategory.class)
public class ProductUomCategory_ extends BaseEntity_ {
	public static volatile SingularAttribute<ProductUomCategory, String> name;
	public static volatile ListAttribute<ProductUomCategory, ProductUom> uoms;
}
