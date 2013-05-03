package codigoalvo.calcnumcomp.common;

import java.io.Serializable;

public class MinQuadradosResp implements Serializable {

	private static final long serialVersionUID = -3606841447762462170L;
	private double a;
	private double b;
	private double r;
	private double somaX;
	private double somaY;
	private double somaXY;
	private double somaX2;
	private double somaY2;

	public MinQuadradosResp() {
		super();
		init();
	}

	public void init() {
		a = b = r = 0d;
		somaX = somaY = somaXY = somaX2 = somaY2 = 0d;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getR() {
		return r;
	}

	public double getSomaX() {
		return somaX;
	}

	public double getSomaY() {
		return somaY;
	}

	public double getSomaXY() {
		return somaXY;
	}

	public double getSomaX2() {
		return somaX2;
	}

	public double getSomaY2() {
		return somaY2;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setR(double r) {
		this.r = r;
	}

	public void setSomaX(double somaX) {
		this.somaX = somaX;
	}

	public void setSomaY(double somaY) {
		this.somaY = somaY;
	}

	public void setSomaXY(double somaXY) {
		this.somaXY = somaXY;
	}

	public void setSomaX2(double somaX2) {
		this.somaX2 = somaX2;
	}

	public void setSomaY2(double somaY2) {
		this.somaY2 = somaY2;
	}

	@Override
	public String toString() {
		String sep = "; ";
		StringBuilder sb = new StringBuilder();
		sb.append("somaX: ").append(somaX).append(sep);
		sb.append("somaY: ").append(somaY).append(sep);
		sb.append("somaXY: ").append(somaXY).append(sep);
		sb.append("somaX2: ").append(somaX2).append(sep);
		sb.append("somaY2: ").append(somaY2).append(sep);
		sb.append("\n");
		sb.append("a: ").append(a).append(sep);
		sb.append("b: ").append(b).append(sep);
		sb.append("r: ").append(r).append(sep);
		return sb.toString();
	}
}
