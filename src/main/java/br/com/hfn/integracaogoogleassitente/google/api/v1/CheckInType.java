package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Method used to send checkin instructions.
 */
public enum CheckInType {
    CHECK_IN_TYPE_UNSPECIFIED, EMAIL, SMS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHECK_IN_TYPE_UNSPECIFIED: return "CHECK_IN_TYPE_UNSPECIFIED";
            case EMAIL: return "EMAIL";
            case SMS: return "SMS";
        }
        return null;
    }

    @JsonCreator
    public static CheckInType forValue(String value) throws IOException {
        if (value.equals("CHECK_IN_TYPE_UNSPECIFIED")) return CHECK_IN_TYPE_UNSPECIFIED;
        if (value.equals("EMAIL")) return EMAIL;
        if (value.equals("SMS")) return SMS;
        throw new IOException("Cannot deserialize CheckInType");
    }
}
