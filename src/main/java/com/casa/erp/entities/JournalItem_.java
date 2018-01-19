package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.353-0200")
@StaticMetamodel(JournalItem.class)
public class JournalItem_ extends BaseEntity_ {
	public static volatile SingularAttribute<JournalItem, Double> debit;
	public static volatile SingularAttribute<JournalItem, Double> credit;
	public static volatile SingularAttribute<JournalItem, Double> costOfGoodsSold;
	public static volatile SingularAttribute<JournalItem, Date> date;
	public static volatile SingularAttribute<JournalItem, String> name;
	public static volatile SingularAttribute<JournalItem, String> ref;
	public static volatile SingularAttribute<JournalItem, Double> taxAmount;
	public static volatile SingularAttribute<JournalItem, Double> quantity;
	public static volatile SingularAttribute<JournalItem, Double> residualAmount;
	public static volatile SingularAttribute<JournalItem, Boolean> active;
	public static volatile SingularAttribute<JournalItem, Account> account;
	public static volatile SingularAttribute<JournalItem, JournalEntry> journalEntry;
	public static volatile SingularAttribute<JournalItem, Journal> journal;
	public static volatile SingularAttribute<JournalItem, Partner> partner;
	public static volatile SingularAttribute<JournalItem, Product> product;
	public static volatile SingularAttribute<JournalItem, ProductUom> uom;
	public static volatile SingularAttribute<JournalItem, Tax> tax;
}
