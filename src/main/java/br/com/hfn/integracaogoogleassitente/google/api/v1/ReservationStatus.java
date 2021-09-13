package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Reservation status.
 */
public enum ReservationStatus {
    CANCELLED, CHANGE_REQUESTED, CONFIRMED, FULFILLED, PENDING, REJECTED, RESERVATION_STATUS_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CANCELLED: return "CANCELLED";
            case CHANGE_REQUESTED: return "CHANGE_REQUESTED";
            case CONFIRMED: return "CONFIRMED";
            case FULFILLED: return "FULFILLED";
            case PENDING: return "PENDING";
            case REJECTED: return "REJECTED";
            case RESERVATION_STATUS_UNSPECIFIED: return "RESERVATION_STATUS_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static ReservationStatus forValue(String value) throws IOException {
        if (value.equals("CANCELLED")) return CANCELLED;
        if (value.equals("CHANGE_REQUESTED")) return CHANGE_REQUESTED;
        if (value.equals("CONFIRMED")) return CONFIRMED;
        if (value.equals("FULFILLED")) return FULFILLED;
        if (value.equals("PENDING")) return PENDING;
        if (value.equals("REJECTED")) return REJECTED;
        if (value.equals("RESERVATION_STATUS_UNSPECIFIED")) return RESERVATION_STATUS_UNSPECIFIED;
        throw new IOException("Cannot deserialize ReservationStatus");
    }
}
