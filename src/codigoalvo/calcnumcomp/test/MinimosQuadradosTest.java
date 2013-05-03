package codigoalvo.calcnumcomp.test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import codigoalvo.calcnumcomp.common.MinQuadradosResp;
import codigoalvo.calcnumcomp.service.MinimosQuadradosPearson;

public class MinimosQuadradosTest {

	@Test
	public void testCalculaMinQuadradoP() {
		Map<Double, Double> xyMap = new HashMap<>();
		xyMap.put(new Double(10.7d), new Double(1d));
		xyMap.put(new Double(14.5d), new Double(2.1d));
		xyMap.put(new Double(21.1d), new Double(4.6d));
		xyMap.put(new Double(17.4d), new Double(3.5d));
		xyMap.put(new Double(15.5d), new Double(2.7d));
		xyMap.put(new Double(13.8d), new Double(1.8d));
		MinQuadradosResp resp = MinimosQuadradosPearson.calculaMinQuadradoP(xyMap);

		double aMin = -3.01d;
		double aMax = -2.99d;
		double bMin = 0.35d;
		double bMax = 0.37d;
		double rMin = 0.98d;
		double rMax = 1.00d;
		double somaXmin = 92.99d;
		double somaXmax = 93.01d;
		double somaYmin = 15.69d;
		double somaYmax = 15.71d;
		double somaXYmin = 265.78d;
		double somaXYmax = 265.80d;
		double somaX2min = 1503.39d;
		double somaX2max = 1503.41d;
		double somaY2min = 49.34d;
		double somaY2max = 49.36d;

		assertTrue(resp.getA() > aMin && resp.getA() < aMax);
		assertTrue(resp.getB() > bMin && resp.getB() < bMax);
		assertTrue(resp.getR() > rMin && resp.getR() < rMax);
		assertTrue(resp.getSomaX() > somaXmin && resp.getSomaX() < somaXmax);
		assertTrue(resp.getSomaY() > somaYmin && resp.getSomaY() < somaYmax);
		assertTrue(resp.getSomaXY() > somaXYmin && resp.getSomaXY() < somaXYmax);
		assertTrue(resp.getSomaX2() > somaX2min && resp.getSomaX2() < somaX2max);
		assertTrue(resp.getSomaY2() > somaY2min && resp.getSomaY2() < somaY2max);

		System.out.println(resp.toString());

		// Resultado esperado aproximado:
		/*
		 * /
		 * Soma_X = 93.000000 Soma_Y = 15.700000
		 * Soma_XY = 265.800000 Soma_X2 = 1503.400000 Soma_Y2 = 49.350000
		 * Coeficientes da reta ajustada:
		 * --------------------------------------
		 * a = -3.004900 b = 0.362682
		 * --------------------------------------
		 * Reta Ajustada:
		 * --------------------------------------
		 * y = -3.004900 + 0.362682 . x
		 * --------------------------------------
		 * Coeficiente de Correlacao:
		 * --------------------------------------
		 * r = 0.992344
		 * --------------------------------------
		 * //
		 */
	}

}
