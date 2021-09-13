package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Partners need additional information to facilitate curbside pickup orders. Depending upon
 * what fulfillment type is chosen, corresponding details would be collected from the user.
 */
public enum CurbsideFulfillmentType {
    UNSPECIFIED, VEHICLE_DETAIL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case UNSPECIFIED: return "UNSPECIFIED";
            case VEHICLE_DETAIL: return "VEHICLE_DETAIL";
        }
        return null;
    }

    @JsonCreator
    public static CurbsideFulfillmentType forValue(String value) throws IOException {
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        if (value.equals("VEHICLE_DETAIL")) return VEHICLE_DETAIL;
        throw new IOException("Cannot deserialize CurbsideFulfillmentType");
    }
}
