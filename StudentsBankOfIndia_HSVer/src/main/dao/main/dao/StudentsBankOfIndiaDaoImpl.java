package main.dao;


import org.springframework.orm.hibernate3.HibernateTemplate;

import main.model.Bank_Admin;

public class StudentsBankOfIndiaDaoImpl implements StudentsBankOfIndiaDao {
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void saveBankAdmin(Bank_Admin bank_admin) {
		template.save(bank_admin);
		
	}

}
