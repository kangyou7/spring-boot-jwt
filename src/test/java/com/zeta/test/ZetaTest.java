package com.zeta.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ZetaTest {

	@Test
	public void makeString() {

		List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");

		String citiesCommaSeparated = String.join(",", cities);
		System.out.println(citiesCommaSeparated);

	}

}
