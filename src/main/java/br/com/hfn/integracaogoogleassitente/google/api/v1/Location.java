package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. The device location of the user. Note, this is only populated after location
 * permissions are granted by the end user. See the location message for more details on
 * which fields are set depending on coarse vs. fine grained permission.
 *
 * Container that represents a location.
 */
@lombok.Data
public class Location {
    @lombok.Getter(onMethod_ = {@JsonProperty("coordinates")})
    @lombok.Setter(onMethod_ = {@JsonProperty("coordinates")})
    private LatLng coordinates;
    @lombok.Getter(onMethod_ = {@JsonProperty("postalAddress")})
    @lombok.Setter(onMethod_ = {@JsonProperty("postalAddress")})
    private PostalAddress postalAddress;
}
