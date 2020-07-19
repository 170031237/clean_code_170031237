package main.java.sriram_task3;
public class Compound_interst {
	
public double compound_interst(double principle_balence, double interst_rate, double number_of_time) {
	double CI = principle_balence * (Math.pow((1 + interst_rate / 100),number_of_time))-principle_balence;
	return CI;
}
}