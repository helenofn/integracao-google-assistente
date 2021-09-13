package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Presentation options for the disclosure.
 *
 * Options for the presentation of a disclosure.
 */
@lombok.Data
public class DisclosurePresentationOptions {
    @lombok.Getter(onMethod_ = {@JsonProperty("initiallyExpanded")})
    @lombok.Setter(onMethod_ = {@JsonProperty("initiallyExpanded")})
    private Boolean initiallyExpanded;
    @lombok.Getter(onMethod_ = {@JsonProperty("presentationRequirement")})
    @lombok.Setter(onMethod_ = {@JsonProperty("presentationRequirement")})
    private PresentationRequirement presentationRequirement;
}
