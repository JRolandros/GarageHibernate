package fr.esigelec.garage;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.internal.runners.statements.Fail;

import fr.esigelec.garage.*;

/**
 * @author Rolland
 *
 */
public class VoitureDAO {
	
	private HTMLLayout layout= new HTMLLayout();
	private FileAppender appender;
	private static final Logger logger = Logger.getLogger(VoitureDAO.class);
	
	public VoitureDAO(){
		try {
			appender=new FileAppender(layout,"akamba.log");
			logger.addAppender(appender);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ajouter(Voiture v){
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(v);
			session.getTransaction().commit();
			session.close();
			
		} catch (Exception e) {
			logger.log(Level.ALL, e.getMessage());
		}
	}
	public void supprimer(Voiture v){
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(v);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			logger.log(Level.ALL, e.getMessage());
			logger.debug(e.getMessage());
		}
	}
	public void rouler(Voiture v,int distance){
		try {
			v.setKm(distance);
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
	}
	public Voiture getVoiture(int idVoiture){
		Voiture reponse=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			reponse=(Voiture)session.get(Voiture.class,idVoiture);
			session.getTransaction().commit();
			session.close();
			
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return reponse;
	}
	public List<Voiture> getVoitures(){
		List<Voiture> reponse=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query q=session.createQuery("from Voiture"); //requete HQL
			reponse=q.list();
			session.getTransaction().commit();
			session.close();
			 
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return reponse;
	}
}

