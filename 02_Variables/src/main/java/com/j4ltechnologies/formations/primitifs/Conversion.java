package com.j4ltechnologies.formations.primitifs;

public class Conversion {

	public static void main(String[] args) {

		byte unByte = 45;
		int unInt, grandInt;

		System.out.println(String.format("unByte = %s", unByte));

		unInt = 45;
		System.out.println(String.format("unInt = %s", unInt));

		unInt = unByte;//Conversion implicite
		System.out.println(String.format("unInt = %s", unInt));

		unByte = (byte) unInt;
		System.out.println(String.format("unByte = %s", unByte));

		grandInt = 456;//Conversion explicite
		unByte = (byte) grandInt;
		System.out.println(String.format("unByte = %s", unByte));
	}
}
