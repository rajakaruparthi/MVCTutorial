package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.OffersDao;
import com.spring.mvc.model.Offers;

@Service("offersService")
public class OffersService {
	
	@Autowired
	private OffersDao offersDao;
	
	public void setOffersDao(OffersDao offersDao) {
		this.offersDao = offersDao;
	}

	public List<Offers> getCurrentOffers(){
		System.out.println(offersDao.getOffers());
		return offersDao.getOffers();
	}
}
