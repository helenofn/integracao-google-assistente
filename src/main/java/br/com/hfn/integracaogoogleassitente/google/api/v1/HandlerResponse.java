package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Represents a response sent from a developer's fulfillment to Actions on Google.
 */
@lombok.Data
public class HandlerResponse {
    @lombok.Getter(onMethod_ = {@JsonProperty("device")})
    @lombok.Setter(onMethod_ = {@JsonProperty("device")})
    private Device device;
    @lombok.Getter(onMethod_ = {@JsonProperty("expected")})
    @lombok.Setter(onMethod_ = {@JsonProperty("expected")})
    private Expected expected;
    @lombok.Getter(onMethod_ = {@JsonProperty("home")})
    @lombok.Setter(onMethod_ = {@JsonProperty("home")})
    private Home home;
    @lombok.Getter(onMethod_ = {@JsonProperty("prompt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("prompt")})
    private Prompt prompt;
    @lombok.Getter(onMethod_ = {@JsonProperty("scene")})
    @lombok.Setter(onMethod_ = {@JsonProperty("scene")})
    private Scene scene;
    @lombok.Getter(onMethod_ = {@JsonProperty("session")})
    @lombok.Setter(onMethod_ = {@JsonProperty("session")})
    private Session session;
    @lombok.Getter(onMethod_ = {@JsonProperty("user")})
    @lombok.Setter(onMethod_ = {@JsonProperty("user")})
    private User user;
}
