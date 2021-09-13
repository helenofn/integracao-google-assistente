package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. Timezone associated with the request used to resolve datetime values. If not
 * set, "UTC" is used.
 *
 * Represents a time zone from the [IANA Time Zone
 * Database](https://www.iana.org/time-zones).
 */
@lombok.Data
public class TimeZone {
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("version")})
    @lombok.Setter(onMethod_ = {@JsonProperty("version")})
    private String version;
}
