package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.mvc.model.Offers;

@Component("offersDao")
public class OffersDao {

	public OffersDao() {
		System.out.println("Offers dao loaded");
	}

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	private void setDataSource(DataSource ds) {
		this.jdbc = new NamedParameterJdbcTemplate(ds);
	}

	public List<Offers> getOffers() {
		return jdbc.query("select * from offers", new RowMapper<Offers>() {

			@Override
			public Offers mapRow(ResultSet rs, int arg1) throws SQLException {
				Offers ofr = new Offers();
				ofr.setId(rs.getInt("id"));
				ofr.setName(rs.getString("name"));
				ofr.setEmail(rs.getString("email"));
				ofr.setOffer(rs.getString("offer"));
				return ofr;
			}
		});

	}

}
