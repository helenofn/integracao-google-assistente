package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Coordinate {
    @lombok.Getter(onMethod_ = {@JsonProperty("request")})
    @lombok.Setter(onMethod_ = {@JsonProperty("request")})
    private HandlerRequest request;
    @lombok.Getter(onMethod_ = {@JsonProperty("response")})
    @lombok.Setter(onMethod_ = {@JsonProperty("response")})
    private HandlerResponse response;
}
