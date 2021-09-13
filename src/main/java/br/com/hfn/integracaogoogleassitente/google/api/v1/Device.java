package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Required. Info on the device the user is using to interact with the Action.
 *
 * Represents the device the user is using to make a request to the Action.
 *
 * Optional. Use to move between Assistant devices the user has access to.
 */
@lombok.Data
public class Device {
    @lombok.Getter(onMethod_ = {@JsonProperty("capabilities")})
    @lombok.Setter(onMethod_ = {@JsonProperty("capabilities")})
    private List<Capability> capabilities;
    @lombok.Getter(onMethod_ = {@JsonProperty("currentLocation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("currentLocation")})
    private Location currentLocation;
    @lombok.Getter(onMethod_ = {@JsonProperty("timeZone")})
    @lombok.Setter(onMethod_ = {@JsonProperty("timeZone")})
    private TimeZone timeZone;
}
