package com.spring.mvc.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.Offers;
import com.spring.mvc.service.OffersService;

@Controller
public class OffersController {

	/*
	 * @RequestMapping("/offers") public String setHome(HttpSession session) {
	 * 
	 * ModelAndView mv = new ModelAndView("index");
	 * 
	 * Map<String, Object> map = mv.getModelMap();
	 * 
	 * map.put("name2", "pat");
	 * 
	 * session.setAttribute("name", "raja"); return "index"; }
	 */

	/* @RequestMapping("/offers")
		 public ModelAndView setHome(HttpSession session) {
		
		 ModelAndView mv = new ModelAndView("index");
		
		 Map<String, Object> map = mv.getModelMap();
		
		 map.put("name2", "pat");
		
		// session.setAttribute("name", "raja");
		 return mv;
		 }
	 */
	
	@Autowired
	private OffersService offersService;

	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/")
	public String setHome() {
		return "home";
	}

	@RequestMapping("/offers")
	public String getOffers(Model model) {

		// ModelAndView mv = new ModelAndView("index");
		//
		// Map<String, Object> map = mv.getModelMap();
		//
		// session.setAttribute("name", "raja");
		// map.put("name2", "pat");

		List<Offers> offers = offersService.getCurrentOffers();

		model.addAttribute("offers", offers);
		return "index";
	}

	@RequestMapping("/createOffer")
	public String createOffer() {
		return "createOffer";
	}
	
	@RequestMapping(value="/doCreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Offers offer, BindingResult result) {
		Principal principal;
//		principal.
		System.out.println(offer);
		return "offerCreated";
	}
}
