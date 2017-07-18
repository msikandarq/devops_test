package com.example.PriceCal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceDaoImpl implements PriceDao {

	@Autowired
	private HibernateTemplate ht;
	public Price getById(int id) {
		// TODO Auto-generated method stub
		return ht.get(Price.class,id);
	}

}
