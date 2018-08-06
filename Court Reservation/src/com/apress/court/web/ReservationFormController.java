package com.apress.court.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.apress.court.domain.Player;
import com.apress.court.domain.Reservation;
import com.apress.court.domain.SportType;
import com.apress.court.domain.SportTypeEditor;
import com.apress.court.service.ReservationService;

@Controller
//@RequestMapping(value="/reservationForm")
@SessionAttributes("reservation")
public class ReservationFormController {
	
	//Logger logger = new 
	
	@Autowired
	private ReservationService reservationService;
	
	
	/*public ReservationFormController()
	{
	 this.reservationService = reservationService;		
	}*/

		
	
	@ModelAttribute("sportTypes")
	public List<SportType> polulateSportType()
	{
		return reservationService.getAllSportTypes();
	}
	
	
	@RequestMapping(value="/reservationForm",method=RequestMethod.GET)
	public String setReservationForm(@RequestParam(required=false, value="username") String username, Model model)
	{
		//ModelAndView model= new ModelAndView("reservationForm");
		Reservation reservation= new Reservation();
		/*Map<Integer,String> sport= reservationService.getMapSportType();
		model.addObject("sport", sport);*/
		reservation.setSportType(new SportType(0,null));
		reservation.setPlayer(new Player(username, null));
		model.addAttribute("reservation",reservation);
		return "reservationForm";
	}
	
	@RequestMapping(value="/reservationForm", method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("reservation") Reservation reservation,
			BindingResult result, SessionStatus status)
	{	
		/*if(!reservationService.make(reservation))
		{
			return "redirect:reservationSuccess";
		}
		else
			
			return "redirect:reservationFailure";*/
		
		System.out.println(reservation.toString());
		
		return "redirect:reservationSuccess";
			
		
	}
	
	@RequestMapping("/reservationSuccess")
	public void Success()
	{
		//return "reservationSuccess";
	}
	
	@RequestMapping("/reservationFailure")
	public void Failure()
	{
		//return "reservationSuccess";
	}
	
	@InitBinder
	public void	initBinder(WebDataBinder binder) {
		System.out.println("in binder");
		binder.registerCustomEditor(Date.class,"date",new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
		binder.registerCustomEditor(SportType.class,"sportType",new SportTypeEditor(reservationService));
	}
	
	
	
}
