package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Required. Holds session data like the session id and session parameters.
 *
 * Contains information on the current conversation session
 *
 * Optional. Describes data for the current session, session parameters can be created,
 * updated, or removed by the fulfillment.
 */
@lombok.Data
public class Session {
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("languageCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("languageCode")})
    private String languageCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("params")})
    @lombok.Setter(onMethod_ = {@JsonProperty("params")})
    private Map<String, Object> params;
    @lombok.Getter(onMethod_ = {@JsonProperty("typeOverrides")})
    @lombok.Setter(onMethod_ = {@JsonProperty("typeOverrides")})
    private List<TypeOverride> typeOverrides;
}
