package guru.springframework.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.thymeleaf.standard.expression.FragmentExpression.ExecutedFragmentExpression;

public class CategoryTest {

	Category category;
	
	@Before
	public void setUp() {
		category=new Category();
	}
	
	@Test
	public void getId() throws Exception{
		Long idValue=4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void testGetDescription() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetRecipes() {
		//fail("Not yet implemented");
	}

}
