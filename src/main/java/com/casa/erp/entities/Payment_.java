package com.casa.erp.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-11-05T00:42:32.358-0200")
@StaticMetamodel(Payment.class)
public class Payment_ extends BaseEntity_ {
	public static volatile SingularAttribute<Payment, Date> date;
	public static volatile SingularAttribute<Payment, Double> amount;
	public static volatile SingularAttribute<Payment, Double> overpayment;
	public static volatile SingularAttribute<Payment, String> type;
	public static volatile SingularAttribute<Payment, String> partnerType;
	public static volatile SingularAttribute<Payment, String> name;
	public static volatile SingularAttribute<Payment, String> reference;
	public static volatile SingularAttribute<Payment, String> state;
	public static volatile SingularAttribute<Payment, Boolean> active;
	public static volatile SingularAttribute<Payment, Account> account;
	public static volatile SingularAttribute<Payment, JournalEntry> journalEntry;
	public static volatile SingularAttribute<Payment, Invoice> invoice;
	public static volatile SingularAttribute<Payment, Journal> journal;
	public static volatile SingularAttribute<Payment, Partner> partner;
}
