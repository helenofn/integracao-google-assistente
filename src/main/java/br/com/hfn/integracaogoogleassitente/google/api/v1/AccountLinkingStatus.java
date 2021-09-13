package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Whether the user account is linked to the app.
 */
public enum AccountLinkingStatus {
    ACCOUNT_LINKING_STATUS_UNSPECIFIED, LINKED, NOT_LINKED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNT_LINKING_STATUS_UNSPECIFIED: return "ACCOUNT_LINKING_STATUS_UNSPECIFIED";
            case LINKED: return "LINKED";
            case NOT_LINKED: return "NOT_LINKED";
        }
        return null;
    }

    @JsonCreator
    public static AccountLinkingStatus forValue(String value) throws IOException {
        if (value.equals("ACCOUNT_LINKING_STATUS_UNSPECIFIED")) return ACCOUNT_LINKING_STATUS_UNSPECIFIED;
        if (value.equals("LINKED")) return LINKED;
        if (value.equals("NOT_LINKED")) return NOT_LINKED;
        throw new IOException("Cannot deserialize AccountLinkingStatus");
    }
}
