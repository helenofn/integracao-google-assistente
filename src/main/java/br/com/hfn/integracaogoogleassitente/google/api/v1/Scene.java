package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Optional. Info on the current and next scene when the function was called. Will be filled
 * when the fulfillment call is made within the scope of a scene.
 *
 * Represent a scene. Scenes can call fulfillment, add prompts, and collect slot values from
 * the user. Scenes are triggered by events or intents and can trigger events and match
 * intents to transition to other scenes.
 *
 * Optional. Represents the current and next scene. If `Scene.next` is set the runtime will
 * immediately transition to the specified scene.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Scene {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("next")})
    @lombok.Setter(onMethod_ = {@JsonProperty("next")})
    private NextScene next;
    @lombok.Getter(onMethod_ = {@JsonProperty("slotFillingStatus")})
    @lombok.Setter(onMethod_ = {@JsonProperty("slotFillingStatus")})
    private SlotFillingStatus slotFillingStatus;
    @lombok.Getter(onMethod_ = {@JsonProperty("slots")})
    @lombok.Setter(onMethod_ = {@JsonProperty("slots")})
    private Map<String, Object> slots;
}
