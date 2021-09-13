package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. Information of current context of the request. Includes but isn't limited to
 * active media session info or canvas info.
 *
 * Contains context information when user makes query. Such context includes but not limited
 * to info about active media session, state of canvas web app, etc.
 */
@lombok.Data
public class Context {
    @lombok.Getter(onMethod_ = {@JsonProperty("canvas")})
    @lombok.Setter(onMethod_ = {@JsonProperty("canvas")})
    private CanvasContext canvas;
    @lombok.Getter(onMethod_ = {@JsonProperty("media")})
    @lombok.Setter(onMethod_ = {@JsonProperty("media")})
    private MediaContext media;
}
