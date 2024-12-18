package de.firetail.compat.mulletrestclient;

public class RequestBuilderStudy extends RequestBuilder {

	public RequestBuilderStudy() {
		super(Constants.Types.STUDY);
	}

	public void setName(String name) {
		parameters.put(Constants.Attributes.NAME, name);
	}
	
}