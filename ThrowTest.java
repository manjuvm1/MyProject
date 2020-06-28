package exceptionDemo;

import java.io.IOException;

public class ThrowTest {

	public static void main(String[] args) {
		display1();
	}
	public static void display1() {
			try {
				System.out.println("Inside program");		
				throw new IOException("Display exception message");
			}
			catch (IOException ioe) {
				System.out.println(ioe);
			}	
		}
	}