package de.firetail.compat.mulletrestclient;

public class RequestBuilderStudyAttribute extends RequestBuilder {

	public RequestBuilderStudyAttribute(String studyId, String sensorTypeId) {
		super(Constants.Types.STUDY_ATTRIBUTE, studyId);
		parameters.put(Constants.Attributes.SENSOR_TYPE_ID, sensorTypeId);
	}

}
