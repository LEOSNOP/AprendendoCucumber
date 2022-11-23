#language: pt 

Funcionalidade: Aprender Cucumber 
	como um aluno 
	eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar criterios de aceitação

Cenario: Deve executar especificação
	Dado que criei o arquivo corretamente 
	Quando executa-lo
	Entao a especificação deve finalizar com sucesso
	
Cenario: Contador exemplo
	Dado que o valor do contador é 15
	Quando eu incrementar 3 
	Entao o valor deve ser 18
	
Cenario: Deve calcular atraso no prazo de entrega
	Dado que o prazo é dia 05/04/2018
	Quando a entrega atrasar em 2 dias
	Entao a entrega será efetuada em 07/04/2018
	
Cenario: Deve calcular o atraso no prazo de entrega da china
	Dado que o prazo é dia 05/04/2018
	Quando a entrega atrasar em 2 meses
	Entao a entrega será efetuada em 05/06/2018