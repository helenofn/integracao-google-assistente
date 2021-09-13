package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TableColumn {
    @lombok.Getter(onMethod_ = {@JsonProperty("align")})
    @lombok.Setter(onMethod_ = {@JsonProperty("align")})
    private Align align;
    @lombok.Getter(onMethod_ = {@JsonProperty("header")})
    @lombok.Setter(onMethod_ = {@JsonProperty("header")})
    private String header;
}
