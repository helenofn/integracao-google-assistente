package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Merchant's address.
 *
 * Container that represents a location.
 *
 * Pickup or delivery location.
 *
 * Location of the service/event.
 *
 * The location where the event is happening, or an organization is located.
 */
@lombok.Data
public class V2Location {
    @lombok.Getter(onMethod_ = {@JsonProperty("city")})
    @lombok.Setter(onMethod_ = {@JsonProperty("city")})
    private String city;
    @lombok.Getter(onMethod_ = {@JsonProperty("coordinates")})
    @lombok.Setter(onMethod_ = {@JsonProperty("coordinates")})
    private LatLng coordinates;
    @lombok.Getter(onMethod_ = {@JsonProperty("formattedAddress")})
    @lombok.Setter(onMethod_ = {@JsonProperty("formattedAddress")})
    private String formattedAddress;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("notes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("notes")})
    private String notes;
    @lombok.Getter(onMethod_ = {@JsonProperty("phoneNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("phoneNumber")})
    private String phoneNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("placeId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("placeId")})
    private String placeID;
    @lombok.Getter(onMethod_ = {@JsonProperty("postalAddress")})
    @lombok.Setter(onMethod_ = {@JsonProperty("postalAddress")})
    private PostalAddress postalAddress;
    @lombok.Getter(onMethod_ = {@JsonProperty("zipCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("zipCode")})
    private String zipCode;
}
