package de.firetail.compat.mulletrestclient;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.awt.Frame;
import java.util.*;


public class TestRest {

	final static String MULLET_BASE_URL_PROD = "";
	final static String USER = "";
	final static String PASSWORD = "";

	@Test
	@Tag("manual")
	public void testStudies() throws Exception {
		MulletRestClient client = new MulletRestClient( MULLET_BASE_URL_PROD, USER, PASSWORD, (Frame) null);
		RequestBuilderStudy requestStudies = new RequestBuilderStudy();
		List<Record> studies = client.readAll(requestStudies);

		System.out.println("studies: "+studies.size());

		for ( Record study : studies) {
			String name = study.getStringValue(Constants.Attributes.NAME);
			String id = study.getStringValue("id");
			System.out.println("\""+name+"\": "+id );
		}
	}
}
