package codigoalvo.calcnumcomp.test;


import java.util.Scanner;

/**********************************************************************
 * 
 ** Programa para o ajuste de reta aos pontos experimentais na forma **
 * 
 ** (x,y), pelo metodo dos minimos quadrados, e coeficiente de correlação de Pearson **
 * 
 ** versao: 1.0 de 03/2012. **
 * 
 ** autor: Dariel Mazzoni Maranhao **
 * 
 ** Traduzido para Java por: Cássio Reinaldo Amaral **
 **********************************************************************/

public class MinimosQuadradosShell {

    public static void main(String[] args) {
	int I, J, M;
	float SOMA_X = 0, SOMA_Y = 0, SOMA_XY = 0, SOMA_X2 = 0, SOMA_Y2 = 0;
	double a, b, r;
	Scanner in = new Scanner(System.in);

	System.out.println("Numero de pontos (x,y)  M= ");
	M = in.nextInt();

	double[] X = new double[M];
	double[] Y = new double[M];

	System.out.println("Digite os dados X_i e Y_i de sua tabela.\n");
	System.out.println("----------------------------------------\n");

	for (I = 0; I < M; I++)	{
	    System.out.printf("X[%d]:", I + 1);
	    X[I] = in.nextDouble();
	}

	System.out.println("--------------\n");
	for (I = 0; I < M; I++)	{
	    System.out.printf("Y[%d]:", I + 1);
	    Y[I] = in.nextDouble();
	}

	for (I = 0; I < M; I++)	{
	    SOMA_X += X[I];
	    SOMA_Y += Y[I];
	    SOMA_XY += X[I] * Y[I];
	    SOMA_X2 += X[I] * X[I];
	    SOMA_Y2 += Y[I] * Y[I];
	}

	System.out.println("\n");
	System.out.println("               Somas\n");
	System.out.println("-------------------------------------------\n");
	System.out.printf("Soma_X = %f   Soma_Y = %f\n", SOMA_X, SOMA_Y);
	System.out.printf("Soma_XY = %f   Soma_X2 = %f   Soma_Y2 = %f\n",SOMA_XY, SOMA_X2, SOMA_Y2);

	a = (SOMA_X * SOMA_XY - SOMA_X2 * SOMA_Y) / (SOMA_X * SOMA_X - (double)M * SOMA_X2);
	b = (SOMA_X * SOMA_Y - (double)M * SOMA_XY) / (SOMA_X * SOMA_X - (double)M * SOMA_X2);
	r = ( (double)M*SOMA_XY - SOMA_X*SOMA_Y ) / Math.sqrt( ((double)M*SOMA_X2 - (SOMA_X)*(SOMA_X)) * ((double)M*SOMA_Y2 - (SOMA_Y)*(SOMA_Y)) ) ;

	System.out.println("");
	System.out.println("Coeficientes da reta ajustada:");
	System.out.println("------------------------------");
	System.out.printf("a1 = %f    a2 = %f\n", a, b);
	System.out.println("------------------------------");
	System.out.println("");
	System.out.println("Reta Ajustada:");
	System.out.println("------------------------------");
    	System.out.printf("y = %f + %f . x\n",a,b);
	System.out.println("------------------------------");
	System.out.println("");
	System.out.println("Coeficiente de Correlacao:");
        System.out.println("------------------------------");
	System.out.printf("r = %f\n", r);
	System.out.println("------------------------------");

    }
}
