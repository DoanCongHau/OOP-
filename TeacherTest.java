package schoolmanagement;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacherTest {
	
	double delta = 0.000001;
	//@Before
	@Test
    public void testDefaultConstructor() {
      Teachers t1 = new Teachers();
	  assertEquals("hau" , t1.getName());
	  
	  //System.out.println(c1.getRadius()); //1.0
	  //System.out.println(c1.getArea()); // pi
    }
	/*
	@Test
    public void testConstructorWithRadius() {
	  Circle c2 = new Circle(2.0); 
	  assertEquals(2.0, c2.getRadius(), delta);
	  
	  //System.out.println(c2.getRadius()); //2.0
	  //System.out.println(c2.getArea()); //4pi
	}*/
}