package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * A product, service or policy disclosure that may be presented to the user.
 */
@lombok.Data
public class Disclosure {
    @lombok.Getter(onMethod_ = {@JsonProperty("disclosureText")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disclosureText")})
    private DisclosureText disclosureText;
    @lombok.Getter(onMethod_ = {@JsonProperty("presentationOptions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("presentationOptions")})
    private DisclosurePresentationOptions presentationOptions;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
