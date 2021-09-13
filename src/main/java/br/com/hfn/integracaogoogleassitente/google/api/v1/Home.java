package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Optional. Information related to the HomeGraph structure that the target device belongs
 * to. See https://developers.google.com/actions/smarthome/concepts/homegraph.
 *
 * Represents the HomeGraph structure that the user's target device belongs to.
 *
 * Optional. Used to specify parameters related to the HomeGraph structure that the target
 * device belongs to. See https://developers.google.com/actions/smarthome/concepts/homegraph.
 */
@lombok.Data
public class Home {
    @lombok.Getter(onMethod_ = {@JsonProperty("params")})
    @lombok.Setter(onMethod_ = {@JsonProperty("params")})
    private Map<String, Object> params;
}
