package com.whatsapp.dao;

import com.whatsapp.entity.WhatsappEmployee;

public class WhatsappDAO implements WhatsappDAOInterface{
	private WhatsappDAO() {}

	public static WhatsappDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new WhatsappDAO();
	}

	@Override
	public int createProfileDAO(WhatsappEmployee we) {
		// TODO Auto-generated method stub
		return 1;
	}

}
