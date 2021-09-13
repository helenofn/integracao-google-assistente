package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains context information about current canvas.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class CanvasContext {
    @lombok.Getter(onMethod_ = {@JsonProperty("state")})
    @lombok.Setter(onMethod_ = {@JsonProperty("state")})
    private Object state;
}
