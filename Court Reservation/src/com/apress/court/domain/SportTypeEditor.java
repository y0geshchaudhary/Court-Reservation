package com.apress.court.domain;

import java.beans.PropertyEditorSupport;
import com.apress.court.service.ReservationService;


public class SportTypeEditor extends PropertyEditorSupport {

	ReservationService reservationService;

	//public SportTypeEditor(){}
	
	public SportTypeEditor(ReservationService reservationService) {
		this.reservationService = reservationService;
	}



	@Override
	public void setAsText(String sportTypeId) throws IllegalArgumentException {
		int sportId= Integer.parseInt(sportTypeId);
		System.out.println("Id is : "+ sportId);
		SportType sportType=reservationService.getSportType(sportId);
		setValue(sportType);
	}

}
