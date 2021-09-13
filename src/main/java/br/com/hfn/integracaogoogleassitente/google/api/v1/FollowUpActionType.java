package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Type of action.
 */
public enum FollowUpActionType {
    CALL, CANCEL, CUSTOMER_SERVICE, DIRECTION, EMAIL, EXCHANGE, FIX_ISSUE, MODIFY, REORDER, RETURN, REVIEW, TYPE_UNSPECIFIED, VIEW_DETAILS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CALL: return "CALL";
            case CANCEL: return "CANCEL";
            case CUSTOMER_SERVICE: return "CUSTOMER_SERVICE";
            case DIRECTION: return "DIRECTION";
            case EMAIL: return "EMAIL";
            case EXCHANGE: return "EXCHANGE";
            case FIX_ISSUE: return "FIX_ISSUE";
            case MODIFY: return "MODIFY";
            case REORDER: return "REORDER";
            case RETURN: return "RETURN";
            case REVIEW: return "REVIEW";
            case TYPE_UNSPECIFIED: return "TYPE_UNSPECIFIED";
            case VIEW_DETAILS: return "VIEW_DETAILS";
        }
        return null;
    }

    @JsonCreator
    public static FollowUpActionType forValue(String value) throws IOException {
        if (value.equals("CALL")) return CALL;
        if (value.equals("CANCEL")) return CANCEL;
        if (value.equals("CUSTOMER_SERVICE")) return CUSTOMER_SERVICE;
        if (value.equals("DIRECTION")) return DIRECTION;
        if (value.equals("EMAIL")) return EMAIL;
        if (value.equals("EXCHANGE")) return EXCHANGE;
        if (value.equals("FIX_ISSUE")) return FIX_ISSUE;
        if (value.equals("MODIFY")) return MODIFY;
        if (value.equals("REORDER")) return REORDER;
        if (value.equals("RETURN")) return RETURN;
        if (value.equals("REVIEW")) return REVIEW;
        if (value.equals("TYPE_UNSPECIFIED")) return TYPE_UNSPECIFIED;
        if (value.equals("VIEW_DETAILS")) return VIEW_DETAILS;
        throw new IOException("Cannot deserialize FollowUpActionType");
    }
}
