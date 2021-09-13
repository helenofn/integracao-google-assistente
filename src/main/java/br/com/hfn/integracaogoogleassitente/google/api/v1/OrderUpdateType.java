package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Deprecated: Use OrderUpdate.update_mask instead. If type = SNAPSHOT, OrderUpdate.order
 * should be the entire order. If type = ORDER_STATUS, this is the order level status
 * change. Only order.last_update_time and this vertical status are picked up. Note:
 * type.ORDER_STATUS only supports PurcahaseOrderExtension status updates and there is no
 * plan to extend this support. Instead, we recommend using update_mask as it is more
 * generic, extensible and can be used for all verticals.
 */
public enum OrderUpdateType {
    ORDER_STATUS, SNAPSHOT, TYPE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ORDER_STATUS: return "ORDER_STATUS";
            case SNAPSHOT: return "SNAPSHOT";
            case TYPE_UNSPECIFIED: return "TYPE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static OrderUpdateType forValue(String value) throws IOException {
        if (value.equals("ORDER_STATUS")) return ORDER_STATUS;
        if (value.equals("SNAPSHOT")) return SNAPSHOT;
        if (value.equals("TYPE_UNSPECIFIED")) return TYPE_UNSPECIFIED;
        throw new IOException("Cannot deserialize OrderUpdateType");
    }
}
