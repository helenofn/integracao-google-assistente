package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Represents a request sent to a developer's fulfillment by Google.
 */
@lombok.Data
public class HandlerRequest {
    @lombok.Getter(onMethod_ = {@JsonProperty("context")})
    @lombok.Setter(onMethod_ = {@JsonProperty("context")})
    private Context context;
    @lombok.Getter(onMethod_ = {@JsonProperty("device")})
    @lombok.Setter(onMethod_ = {@JsonProperty("device")})
    private Device device;
    @lombok.Getter(onMethod_ = {@JsonProperty("handler")})
    @lombok.Setter(onMethod_ = {@JsonProperty("handler")})
    private Handler handler;
    @lombok.Getter(onMethod_ = {@JsonProperty("home")})
    @lombok.Setter(onMethod_ = {@JsonProperty("home")})
    private Home home;
    @lombok.Getter(onMethod_ = {@JsonProperty("intent")})
    @lombok.Setter(onMethod_ = {@JsonProperty("intent")})
    private Intent intent;
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
