package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Response indicating a set of media to be played.
 *
 * Represents one media object. Contains information about the media, such as name,
 * description, url, etc.
 */
@lombok.Data
public class Media {
    @lombok.Getter(onMethod_ = {@JsonProperty("firstMediaObjectIndex")})
    @lombok.Setter(onMethod_ = {@JsonProperty("firstMediaObjectIndex")})
    private Long firstMediaObjectIndex;
    @lombok.Getter(onMethod_ = {@JsonProperty("mediaObjects")})
    @lombok.Setter(onMethod_ = {@JsonProperty("mediaObjects")})
    private List<MediaObject> mediaObjects;
    @lombok.Getter(onMethod_ = {@JsonProperty("mediaType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("mediaType")})
    private MediaType mediaType;
    @lombok.Getter(onMethod_ = {@JsonProperty("optionalMediaControls")})
    @lombok.Setter(onMethod_ = {@JsonProperty("optionalMediaControls")})
    private List<OptionalMediaControl> optionalMediaControls;
    @lombok.Getter(onMethod_ = {@JsonProperty("repeatMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("repeatMode")})
    private RepeatMode repeatMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("startOffset")})
    @lombok.Setter(onMethod_ = {@JsonProperty("startOffset")})
    private String startOffset;
}
