package com.apress.court.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.apress.court.domain.Player;
import com.apress.court.domain.Reservation;
import com.apress.court.domain.SportType;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	public static final SportType TENNIS = new SportType(1,"TENNIS");
	public static final SportType SOCCER = new SportType(2, "SOCCER");
	
	private List<Reservation> reservations;
	private Map<Integer,String> reserv;

	
	
	public ReservationServiceImpl() {
		
		reservations = new ArrayList<Reservation>();
		reservations.add(new Reservation("TENNIS #1", 
										new GregorianCalendar(2008,4,14).getTime(), 
										16, 
										new Player("Roger", "N/A"),
										TENNIS));
		
		reservations.add(new Reservation("TENNIS #2",
										new GregorianCalendar(2008,4,14).getTime(),
										4,
										new Player("Mike", "N/A"),
										SOCCER));
		
		reserv = new HashMap<Integer, String>();
		reserv.put(TENNIS.getId(), TENNIS.getName());
		reserv.put(SOCCER.getId(), SOCCER.getName());
		
		
	}

	public List<Reservation> queryReservationByCourtName(String courtName) {
		
		List<Reservation> result= new ArrayList<Reservation>();
		
		for (Reservation reservation : reservations)
		{
			if(reservation.getCourtName().equals(courtName))
			{
				result.add(reservation);				
			}
			
		}
		
		return result;
	}
	
	public Map<Integer,String> getMapSportType()
	{
		return reserv;
	}
	
	public List<SportType> getAllSportTypes() {
		
		//SportType[] sportType= new SportType[]{TENNIS,SOCCER};
		return Arrays.asList(new SportType[] { TENNIS, SOCCER });
	}
	
	public boolean make(Reservation reservation)

	{
		boolean exists= false;
		//Logger.getLogger("inside make");
		for(Reservation reserv: reservations)
		{
			if(reserv.getCourtName().equals(reservation.getCourtName())
				&& reserv.getDate().equals(reservation.getDate())
				&& reserv.getHour() == reservation.getHour())
			{
				exists=true;
			}
		}
		
		if(!exists)
		{
			reservations.add(reservation);
			//exists=true;
		}
		return exists;
	}
	
	public SportType getSportType(int sportTypeId)
	{
		System.out.println("in get sport type");
		switch (sportTypeId) {
		case 1:
			return TENNIS;
		case 2:
			return SOCCER;
		default:
			return null;
		}
	}
}
