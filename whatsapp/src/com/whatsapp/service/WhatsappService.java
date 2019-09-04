package com.whatsapp.service;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappEmployee;

public class WhatsappService implements WhatsappServiceInterafce{
	private WhatsappService() {}

	public static WhatsappServiceInterafce createServiceObject() {
		// TODO Auto-generated method stub
		return new WhatsappService();
	}

	@Override
	public int createProfile(WhatsappEmployee we) {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=WhatsappDAO.createDaoObject();
		return wd.createProfileDAO(we);
	}

}
