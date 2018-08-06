package com.apress.court.service;

import java.util.List;
import java.util.Map;

import com.apress.court.domain.Reservation;
import com.apress.court.domain.SportType;

public interface ReservationService {
	
	public List<Reservation> queryReservationByCourtName(String courtName);
	public boolean make(Reservation reservation);
	public List<SportType> getAllSportTypes();
	public Map<Integer,String> getMapSportType();
	public SportType getSportType(int sportTypeId);

}
