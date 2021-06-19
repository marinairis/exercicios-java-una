package testeSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TesteCalcularMediaVetor1;
import teste.TesteCalcularMediavetor2;

@RunWith(Suite.class)
@SuiteClasses({ TesteCalcularMediaVetor1.class,
				TesteCalcularMediavetor2.class })
public class AllTestes {

}
