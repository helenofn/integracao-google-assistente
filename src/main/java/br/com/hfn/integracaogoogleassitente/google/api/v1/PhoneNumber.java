package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Standard phone number representation.
 */
@lombok.Data
public class PhoneNumber {
    @lombok.Getter(onMethod_ = {@JsonProperty("e164PhoneNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("e164PhoneNumber")})
    private String e164PhoneNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("extension")})
    @lombok.Setter(onMethod_ = {@JsonProperty("extension")})
    private String extension;
    @lombok.Getter(onMethod_ = {@JsonProperty("preferredDomesticCarrierCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("preferredDomesticCarrierCode")})
    private String preferredDomesticCarrierCode;
}
