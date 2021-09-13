package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A follow-up action associated with the order or line item.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Action {
    @lombok.Getter(onMethod_ = {@JsonProperty("actionMetadata")})
    @lombok.Setter(onMethod_ = {@JsonProperty("actionMetadata")})
    private ActionMetadata actionMetadata;
    @lombok.Getter(onMethod_ = {@JsonProperty("openUrlAction")})
    @lombok.Setter(onMethod_ = {@JsonProperty("openUrlAction")})
    private V2UIElementsOpenURLAction openURLAction;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private FollowUpActionType type;
}
