package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional. Represents a Interactive Canvas response to be sent to the user.
 *
 * Represents an Interactive Canvas response to be sent to the user.
 * This can be used in conjunction with the "first_simple" field in the
 * containing prompt to speak to the user in addition to displaying a
 * interactive canvas response. The maximum size of the response is 50k bytes.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Canvas {
    @lombok.Getter(onMethod_ = {@JsonProperty("continueTtsDuringTouch")})
    @lombok.Setter(onMethod_ = {@JsonProperty("continueTtsDuringTouch")})
    private Boolean continueTTSDuringTouch;
    @lombok.Getter(onMethod_ = {@JsonProperty("data")})
    @lombok.Setter(onMethod_ = {@JsonProperty("data")})
    private List<Object> data;
    @lombok.Getter(onMethod_ = {@JsonProperty("enableFullScreen")})
    @lombok.Setter(onMethod_ = {@JsonProperty("enableFullScreen")})
    private Boolean enableFullScreen;
    @lombok.Getter(onMethod_ = {@JsonProperty("suppressMic")})
    @lombok.Setter(onMethod_ = {@JsonProperty("suppressMic")})
    private Boolean suppressMic;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
}
