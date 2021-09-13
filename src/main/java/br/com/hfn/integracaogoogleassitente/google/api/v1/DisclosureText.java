package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Content of the disclosure. Weblinks are allowed.
 *
 * Represents a plain text with web links.
 */
@lombok.Data
public class DisclosureText {
    @lombok.Getter(onMethod_ = {@JsonProperty("template")})
    @lombok.Setter(onMethod_ = {@JsonProperty("template")})
    private String template;
    @lombok.Getter(onMethod_ = {@JsonProperty("textLinks")})
    @lombok.Setter(onMethod_ = {@JsonProperty("textLinks")})
    private List<TextLink> textLinks;
}
