calcnumcomp
===========

Calculo Numerico Computacional

Programa para o ajuste de reta aos pontos experimentais na forma,
pelo metodo dos minimos quadrados, e coeficiente de correlação de Pearson.

Adaptação do programa feto em C versao: 1.0 de 03/2012 de Dariel Mazzoni Maranhao.
  	a = (SOMA_X * SOMA_XY - SOMA_X2 * SOMA_Y) / (SOMA_X * SOMA_X - (double)M * SOMA_X2);
		b = (SOMA_X * SOMA_Y - (double)M * SOMA_XY) / (SOMA_X * SOMA_X - (double)M * SOMA_X2);
		r = ( (double)M*SOMA_XY - SOMA_X*SOMA_Y ) / Math.sqrt( ((double)M*SOMA_X2 - (SOMA_X)*(SOMA_X)) * ((double)M*SOMA_Y2 - (SOMA_Y)*(SOMA_Y)) ) ;

A idéia a utilização do processo de calculo a partir de uma lib gerada desse projeto.
