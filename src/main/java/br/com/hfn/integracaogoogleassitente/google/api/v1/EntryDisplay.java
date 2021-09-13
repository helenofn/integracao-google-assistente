package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. The item display's information.
 */
@lombok.Data
public class EntryDisplay {
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("footer")})
    @lombok.Setter(onMethod_ = {@JsonProperty("footer")})
    private String footer;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private Image image;
    @lombok.Getter(onMethod_ = {@JsonProperty("openUrl")})
    @lombok.Setter(onMethod_ = {@JsonProperty("openUrl")})
    private OpenURL openURL;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
