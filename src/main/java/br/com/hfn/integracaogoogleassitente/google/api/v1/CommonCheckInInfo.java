package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Metadata required by partner to support a checkin method.
 */
@lombok.Data
public class CommonCheckInInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("checkInType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("checkInType")})
    private CheckInType checkInType;
}
