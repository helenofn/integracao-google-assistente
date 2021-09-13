package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Describes an existing IntentSubscription.
 */
@lombok.Data
public class IntentSubscription {
    @lombok.Getter(onMethod_ = {@JsonProperty("contentTitle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("contentTitle")})
    private String contentTitle;
    @lombok.Getter(onMethod_ = {@JsonProperty("intent")})
    @lombok.Setter(onMethod_ = {@JsonProperty("intent")})
    private String intent;
}
