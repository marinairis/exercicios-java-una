package testeSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TesteNecessidadeDiaria;
import teste.TestePesoIdeal;

@RunWith(Suite.class)
@SuiteClasses({ TesteNecessidadeDiaria.class, TestePesoIdeal.class })
public class AllTests {

}
