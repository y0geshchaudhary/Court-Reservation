package com.apress.court.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apress.court.domain.Reservation;
import com.apress.court.service.ReservationService;



@Controller
//@RequestMapping("/reservationQuery")
public class ReservationQueryController {

	private ReservationService reservationService;
	
	@Autowired
	public ReservationQueryController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	
	@RequestMapping(value="/reservationQuery",method=RequestMethod.GET)
	public void setUpForm()
	{
	}
	
	
	@RequestMapping(value="reservationQuery",method=RequestMethod.POST)
	public String submitForm(@RequestParam("courtName") String courtName,Model model)
	{
		List<Reservation> reservList=java.util.Collections.emptyList();
		if(courtName!= null)
		{
			reservList= reservationService.queryReservationByCourtName(courtName);
		}
		model.addAttribute("reservations",reservList);
		return "reservationQuery";
		
	}
	
	
	
}
