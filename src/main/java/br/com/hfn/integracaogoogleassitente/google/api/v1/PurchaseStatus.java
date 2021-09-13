package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Line item level status.
 *
 * Required: Overall Status for the order.
 */
public enum PurchaseStatus {
    CANCELLED, CHANGE_REQUESTED, CONFIRMED, CREATED, DELIVERED, IN_PREPARATION, OUT_OF_STOCK, PURCHASE_STATUS_UNSPECIFIED, READY_FOR_PICKUP, REJECTED, RETURNED, SHIPPED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CANCELLED: return "CANCELLED";
            case CHANGE_REQUESTED: return "CHANGE_REQUESTED";
            case CONFIRMED: return "CONFIRMED";
            case CREATED: return "CREATED";
            case DELIVERED: return "DELIVERED";
            case IN_PREPARATION: return "IN_PREPARATION";
            case OUT_OF_STOCK: return "OUT_OF_STOCK";
            case PURCHASE_STATUS_UNSPECIFIED: return "PURCHASE_STATUS_UNSPECIFIED";
            case READY_FOR_PICKUP: return "READY_FOR_PICKUP";
            case REJECTED: return "REJECTED";
            case RETURNED: return "RETURNED";
            case SHIPPED: return "SHIPPED";
        }
        return null;
    }

    @JsonCreator
    public static PurchaseStatus forValue(String value) throws IOException {
        if (value.equals("CANCELLED")) return CANCELLED;
        if (value.equals("CHANGE_REQUESTED")) return CHANGE_REQUESTED;
        if (value.equals("CONFIRMED")) return CONFIRMED;
        if (value.equals("CREATED")) return CREATED;
        if (value.equals("DELIVERED")) return DELIVERED;
        if (value.equals("IN_PREPARATION")) return IN_PREPARATION;
        if (value.equals("OUT_OF_STOCK")) return OUT_OF_STOCK;
        if (value.equals("PURCHASE_STATUS_UNSPECIFIED")) return PURCHASE_STATUS_UNSPECIFIED;
        if (value.equals("READY_FOR_PICKUP")) return READY_FOR_PICKUP;
        if (value.equals("REJECTED")) return REJECTED;
        if (value.equals("RETURNED")) return RETURNED;
        if (value.equals("SHIPPED")) return SHIPPED;
        throw new IOException("Cannot deserialize PurchaseStatus");
    }
}
