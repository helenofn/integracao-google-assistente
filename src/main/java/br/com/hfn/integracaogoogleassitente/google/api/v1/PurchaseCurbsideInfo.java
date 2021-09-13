package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Details specific to the curbside information. If pickup_type is not "CURBSIDE", this
 * field would be ignored.
 *
 * Details about how curbside order would be facilitated.
 */
@lombok.Data
public class PurchaseCurbsideInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("curbsideFulfillmentType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("curbsideFulfillmentType")})
    private CurbsideFulfillmentType curbsideFulfillmentType;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVehicle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVehicle")})
    private CommonVehicle userVehicle;
}
