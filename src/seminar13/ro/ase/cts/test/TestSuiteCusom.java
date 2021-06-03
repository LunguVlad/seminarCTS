package seminar13.ro.ase.cts.test;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import seminar13.ro.ase.cts.test.categorii.ConstructorGrupaCategory;
import seminar13.ro.ase.cts.test.categorii.GetPromovabilitateCategory;
import seminar13.ro.ase.cts.test.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)

@Suite.SuiteClasses({
        GrupaTest.class,
        GrupaTestMock.class,
        GrupaTestFixture.class
})

//@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory({GetPromovabilitateCategory.class,ConstructorGrupaCategory.class})
public class TestSuiteCusom {
}
