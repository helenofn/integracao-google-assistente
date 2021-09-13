package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Button. Optional.
 *
 * Button.
 *
 * Optional. An additional suggestion chip that can link out to the associated app or site.
 * The chip will be rendered with the title "Open <name>". Max 20 chars.
 */
@lombok.Data
public class Link {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("open")})
    @lombok.Setter(onMethod_ = {@JsonProperty("open")})
    private OpenURL open;
}
