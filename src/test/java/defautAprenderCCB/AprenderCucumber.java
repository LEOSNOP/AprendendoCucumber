package defautAprenderCCB;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	// cenario 1 testes
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Entao("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
	}
	// cenario 2 exemplo de um contador
	int contador = 0;	
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    contador = arg1;
	}

	@Quando("^eu incrementar (\\d+)$")
	public void euIncrementar(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    contador = contador + arg1;
	}

	@Entao("^o valor deve ser (\\d+)$")
	public void oValorDeveSer(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    Assert.assertEquals(arg1, contador);
	    
	}
	// cenario 3 Exemplo de uma verificação de uma entrega
	
	Date entrega = new Date();
	
	@Dado("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoÉDia(int dia, int mes, int ano) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.MONTH, mes - 1);
	    cal.set(Calendar.YEAR, ano);
	    entrega = cal.getTime();
	    
	}

	@Quando("^a entrega atrasar em (\\d+) (.+)$")
	public void aEntregaAtrasarEmDias(int dia, String tempo) throws Throwable {
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(entrega);
	  if(tempo.equals("dias")) {
	  cal.add(Calendar.DAY_OF_MONTH, dia);
	  } 
	  if(tempo.equals("meses")) {
		  cal.add(Calendar.MONTH, dia);
		  } 
	  entrega = cal.getTime(); 
	}

	@Entao("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = format.format(entrega);
	    Assert.assertEquals(data, dataFormatada);
	    
	}
	
}
