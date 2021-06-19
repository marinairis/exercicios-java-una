package testeSuite;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TesteAdicionaTaxaEntrega;
import teste.TesteAplicaDesconto;
import teste.TesteCalculaSomatorioPreco;

@RunWith(Suite.class)
@SuiteClasses({ TesteAdicionaTaxaEntrega.class,
				TesteAplicaDesconto.class,
				TesteCalculaSomatorioPreco.class })
public class AllTests {

}
