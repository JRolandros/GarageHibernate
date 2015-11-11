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
		Voiture v=new Voiture(10,"PQ-835-SD","PEUGEOT",2012,15);
		
		//vdao.ajouter(v);

	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#supprimer(fr.esigelec.garage.Voiture)}.
	 */
	@Test
	public void testSupprimer() {
		Voiture v=new Voiture(4,"SG-456-AF","KIA",1986,52);
		vdao.supprimer(v);

	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#rouler(fr.esigelec.garage.Voiture, int)}.
	 */
	@Test
	public void testRouler() {
	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#getVoiture(int)}.
	 */
	@Test
	public void testGetVoiture() {
		//Voiture v1=vdao.getVoiture(10);
		//System.out.println(v1.toString()); 
	}

	/**
	 * Test method for {@link fr.esigelec.garage.VoitureDAO#getVoitures()}.
	 */
	@Test
	public void testGetVoitures() {
		
		List<Voiture> listV=vdao.getVoitures();
		for (Voiture v : listV) {
			System.out.println(v.toString());
		}
				
	}

}
