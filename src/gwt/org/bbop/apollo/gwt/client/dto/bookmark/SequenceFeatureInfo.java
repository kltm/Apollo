package org.bbop.apollo.gwt.client.dto.bookmark;

import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import org.bbop.apollo.gwt.shared.FeatureStringEnum;

/**
 * Created by ndunn on 9/30/15.
 */
public class SequenceFeatureInfo extends JSONObject{

//    private Integer min;
//    private Integer max;
//    private SequenceFeatureInfo feature;
//    private boolean reverseComplement = false ;

    public String getName(){
        return get(FeatureStringEnum.NAME.getValue()).isString().stringValue();
    }

    public void setName(String groupName) {
        put(FeatureStringEnum.NAME.getValue(), new JSONString(groupName));
    }

    public void setFeature(SequenceFeatureInfo featuresObject) {
        put(FeatureStringEnum.FEATURE.getValue(),featuresObject);
    }

    public void setStart(Integer min) {
        put(FeatureStringEnum.START.getValue(),new JSONNumber(min));
    }

    public void setEnd(Integer max) {
        put(FeatureStringEnum.END.getValue(),new JSONNumber(max));
    }


    public void setReverseComplement(boolean reverseComplement) {
        put(FeatureStringEnum.REVERSE_COMPLEMENT.getValue(),JSONBoolean.getInstance(reverseComplement));
    }
}