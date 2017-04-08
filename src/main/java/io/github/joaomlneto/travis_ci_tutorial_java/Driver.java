package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {
	public static final void main(String[] args) {
		SimpleCalculator simpCalc = new SimpleCalculator();
		int start = 10;
		start = simpCalc.mul(start,3);
		start = simpCalc.mul(start,7);
		start = simpCalc.mul(start,13);
		start = simpCalc.mul(start,37);
		System.out.println(start);
	}
}
