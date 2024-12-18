package de.firetail.compat.mulletrestclient;

public class RequestBuilderSensor extends RequestBuilder {

	public RequestBuilderSensor(String studyId) {
		super(Constants.Types.SENSOR);
		parameters.put(Constants.Attributes.TAG_STUDY_ID, studyId);
	}

}
