package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Permission {
    DEVICE_COARSE_LOCATION, DEVICE_PRECISE_LOCATION, PERMISSION_UNSPECIFIED, UPDATE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEVICE_COARSE_LOCATION: return "DEVICE_COARSE_LOCATION";
            case DEVICE_PRECISE_LOCATION: return "DEVICE_PRECISE_LOCATION";
            case PERMISSION_UNSPECIFIED: return "PERMISSION_UNSPECIFIED";
            case UPDATE: return "UPDATE";
        }
        return null;
    }

    @JsonCreator
    public static Permission forValue(String value) throws IOException {
        if (value.equals("DEVICE_COARSE_LOCATION")) return DEVICE_COARSE_LOCATION;
        if (value.equals("DEVICE_PRECISE_LOCATION")) return DEVICE_PRECISE_LOCATION;
        if (value.equals("PERMISSION_UNSPECIFIED")) return PERMISSION_UNSPECIFIED;
        if (value.equals("UPDATE")) return UPDATE;
        throw new IOException("Cannot deserialize Permission");
    }
}
