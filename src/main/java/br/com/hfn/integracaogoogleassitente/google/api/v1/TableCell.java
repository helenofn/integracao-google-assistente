package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Describes a cell in a row.
 */
@lombok.Data
public class TableCell {
    @lombok.Getter(onMethod_ = {@JsonProperty("text")})
    @lombok.Setter(onMethod_ = {@JsonProperty("text")})
    private String text;
}
