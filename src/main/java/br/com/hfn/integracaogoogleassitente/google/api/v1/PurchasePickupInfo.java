package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Additional information regarding how order would be picked. This field would only be
 * applicable when fulfillment type is PICKUP.
 *
 * Details about how an order is picked up. It includes details such as pickup type and
 * additional metadata attached with each type, if any.
 */
@lombok.Data
public class PurchasePickupInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("checkInInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("checkInInfo")})
    private List<CommonCheckInInfo> checkInInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("curbsideInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("curbsideInfo")})
    private PurchaseCurbsideInfo curbsideInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("pickupType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pickupType")})
    private PickupType pickupType;
}
