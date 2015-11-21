import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.esigelec.garage.Voiture;
import fr.esigelec.garage.VoitureDAO;

/**
 * 
 */

/**
 * @author Rolland
 *
 */
public class VoitureDAOTest {

	/**
	 * @throws java.lang.Exception
	 */
	VoitureDAO vdao=new VoitureDAO();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#ajouter(fr.esigelec.garage.Voiture)}.
	 */
	@Test
	public void testAjouter() {
		System.out.println("\n Test VoitureDAO.Ajouter() ");
		System.out.println("====================\n");
		Voiture v=new Voiture(0,"PQ-835-AK","PEUGEOT Test",2015,15);
		vdao.ajouter(v);
		System.out.println(v.getId());

	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#supprimer(fr.esigelec.garage.Voiture)}.
	 */
	@Test
	public void testSupprimer() {
		System.out.println("\n Test VoitureDAO.Supprimer() ");
		System.out.println("====================\n");
		Voiture v=new Voiture(0,"PQ-835-AK","PEUGEOT",2015,15);
		vdao.ajouter(v);
		vdao.supprimer(v);

	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#rouler(fr.esigelec.garage.Voiture, int)}.
	 */
	@Test
	public void testRouler() {
		System.out.println("\n Test VoitureDAO.Rouler() ");
		System.out.println("====================\n");
		Voiture v=new Voiture(0,"PQ-835-AK","PEUGEOT Test",2015,15);
		vdao.rouler(v, 10);
		System.out.println("Km= "+v.getKm());
	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#getVoiture(int)}.
	 */
	@Test
	public void testGetVoiture() {
		System.out.println("\n Test VoitureDAO.GetVoiture() ");
		System.out.println("====================\n");
		Voiture v1=vdao.getVoiture(10);
		System.out.println(v1.toString()); 
	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#getVoitures()}.
	 */
	@Test
	public void testGetVoitures() {
		System.out.println("\n Test VoitureDAO.GetVoitures()");
		System.out.println("====================\n");
		List<Voiture> listV=vdao.getVoitures();
		for (Voiture v : listV) {
			System.out.println(v.toString());
		}				
	}

}
