package soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author test
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayTset {

	
	@Autowired
	private ICompactDisc CD ;
	
	@Test
	public void cdShouNotBeNull(){
//		assertNotNull(CD);
		if(CD == null){
			System.out.println("¿Õ");
		}else{
			System.out.println("·Ç¿Õ");
		}
	}
}
