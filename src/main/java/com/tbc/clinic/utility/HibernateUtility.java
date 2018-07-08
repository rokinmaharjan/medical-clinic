/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbc.clinic.utility;

import com.tbc.clinic.model.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * 
 */
public class HibernateUtility {
    public static Session getSession() {
		Configuration config = new Configuration().configure()
				.addAnnotatedClass(Staff.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(reg);

		Session session = sf.openSession();
		
		return session;
	}
}
