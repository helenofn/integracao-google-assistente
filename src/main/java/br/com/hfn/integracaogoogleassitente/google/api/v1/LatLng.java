package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Geo coordinates. Requires the [DEVICE_PRECISE_LOCATION] permission.
 *
 * An object that represents a latitude/longitude pair. This is expressed as a pair of
 * doubles to represent degrees latitude and degrees longitude. Unless specified otherwise,
 * this must conform to the WGS84 standard. Values must be within normalized ranges.
 *
 * Geo coordinates. Requires the DEVICE_PRECISE_LOCATION permission.
 */
@lombok.Data
public class LatLng {
    @lombok.Getter(onMethod_ = {@JsonProperty("latitude")})
    @lombok.Setter(onMethod_ = {@JsonProperty("latitude")})
    private Double latitude;
    @lombok.Getter(onMethod_ = {@JsonProperty("longitude")})
    @lombok.Setter(onMethod_ = {@JsonProperty("longitude")})
    private Double longitude;
}
