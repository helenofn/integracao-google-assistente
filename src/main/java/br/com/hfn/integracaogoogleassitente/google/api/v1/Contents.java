package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Required: Order contents which is a group of line items.
 *
 * Wrapper for line items.
 */
@lombok.Data
public class Contents {
    @lombok.Getter(onMethod_ = {@JsonProperty("lineItems")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lineItems")})
    private List<LineItem> lineItems;
}
