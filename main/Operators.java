package main;

public class Operators {
	public int add(int x,int y) {
		return x+y;
	}
	public int sub(int x,int y) {
		return x-y;
	}
	public int mul(int x,int y) {
		return x*y;
	}
	public int div(int x,int y) {
		return x/y;
	}
	public int mod(int x,int y) {
		return x%y;
	}
	
	
	public int or(int x,int y) {
		return x|y;
	}
	public int and(int x,int y){
		return x&y;
	}
	public int not(int x) {
		return ~x;
	}
	public int xor(int x,int y) {
		return x^y;
	}
	public int leftShift(int num,int shift) {
		return num<<shift;
	}
	public int rightShift(int num,int shift) {
		return num>>shift;
	}
	
	
	public boolean or(boolean x,boolean y) {
		return x|y;
	}
	public boolean and(boolean x,boolean y) {
		return x&y;
	}
	public boolean not(boolean x) {
		return !x;
	}
	public boolean xor(boolean x,boolean y) {
		return x^y;
	}
}