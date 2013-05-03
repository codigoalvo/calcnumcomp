package codigoalvo.calcnumcomp.service;

import java.util.*;
import java.util.Map.Entry;
import codigoalvo.calcnumcomp.common.MinQuadradosResp;

public class MinimosQuadradosPearson {

	public static MinQuadradosResp calculaMinQuadradoP(Map<Double, Double> xyMap) {
		MinQuadradosResp resp = new MinQuadradosResp();
		double somaX = 0;
		double somaY = 0;
		double somaXY = 0;
		double somaX2 = 0;
		double somaY2 = 0;
		double m = (double)xyMap.size();

		// Somatorias
		for (Entry<Double, Double> entry : xyMap.entrySet()) {
			double x = entry.getKey().doubleValue();
			double y = entry.getValue().doubleValue();
			somaX += x;
			somaY += y;
			somaXY += (x * y);
			somaX2 += (x * x);
			somaY2 += (y * y);
		}

		resp.setSomaX(somaX);
		resp.setSomaY(somaY);
		resp.setSomaX2(somaX2);
		resp.setSomaY2(somaY2);
		resp.setSomaXY(somaXY);

		resp.setA((somaX * somaXY - somaX2 * somaY) / (somaX * somaX - m * somaX2));
		resp.setB((somaX * somaY - m * somaXY) / (somaX * somaX - m * somaX2));
		resp.setR((m * somaXY - somaX * somaY) / Math.sqrt((m * somaX2 - (somaX) * (somaX)) * (m * somaY2 - (somaY) * (somaY))));

		return resp;
	}
}
