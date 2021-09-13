package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Indicates the verification status of the user.
 */
public enum VerificationStatus {
    GUEST, USER_VERIFICATION_STATUS_UNSPECIFIED, VERIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GUEST: return "GUEST";
            case USER_VERIFICATION_STATUS_UNSPECIFIED: return "USER_VERIFICATION_STATUS_UNSPECIFIED";
            case VERIFIED: return "VERIFIED";
        }
        return null;
    }

    @JsonCreator
    public static VerificationStatus forValue(String value) throws IOException {
        if (value.equals("GUEST")) return GUEST;
        if (value.equals("USER_VERIFICATION_STATUS_UNSPECIFIED")) return USER_VERIFICATION_STATUS_UNSPECIFIED;
        if (value.equals("VERIFIED")) return VERIFIED;
        throw new IOException("Cannot deserialize VerificationStatus");
    }
}
