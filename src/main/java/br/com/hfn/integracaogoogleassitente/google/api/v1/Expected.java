package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional. Describes the expectations for the next dialog turn.
 *
 * Describes the expectations for the next dialog turn.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Expected {
    @lombok.Getter(onMethod_ = {@JsonProperty("speech")})
    @lombok.Setter(onMethod_ = {@JsonProperty("speech")})
    private List<String> speech;
}
