package codigoalvo.calcnumcomp.test;

import java.util.*;

import codigoalvo.calcnumcomp.common.MinQuadradosResp;
import codigoalvo.calcnumcomp.service.MinimosQuadradosPearson;

public class TestaMinimosQuadrados {

	public static void main(String[] args) {
		Map<Double, Double> xyMap = new HashMap<>();
		xyMap.put(new Double(10.7d), new Double(1d));
		xyMap.put(new Double(14.5d), new Double(2.1d));
		xyMap.put(new Double(21.1d), new Double(4.6d));
		xyMap.put(new Double(17.4d), new Double(3.5d));
		xyMap.put(new Double(15.5d), new Double(2.7d));
		xyMap.put(new Double(13.8d), new Double(1.8d));
		MinQuadradosResp resp = MinimosQuadradosPearson.calculaMinQuadradoP(xyMap);
		System.out.println(resp.toString());
	}

// Resultado esperado aproximado:
/*/
Soma_X = 93.000000 Soma_Y = 15.700000 
Soma_XY = 265.800000 Soma_X2 = 1503.400000 Soma_Y2 = 49.350000 
Coeficientes da reta ajustada: 
-------------------------------------- 
 a = -3.004900 b = 0.362682 
-------------------------------------- 
 Reta Ajustada: 
-------------------------------------- 
 y = -3.004900 + 0.362682 . x 
--------------------------------------
 Coeficiente de Correlacao: 
-------------------------------------- 
 r = 0.992344 
--------------------------------------
//*/
}
