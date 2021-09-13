package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Unit measure. Specifies the size of the item in chosen units. The size, together with the
 * active price is used to determine the unit price.
 *
 * Merchant unit pricing measure.
 */
@lombok.Data
public class PurchaseMerchantUnitMeasure {
    @lombok.Getter(onMethod_ = {@JsonProperty("measure")})
    @lombok.Setter(onMethod_ = {@JsonProperty("measure")})
    private Double measure;
    @lombok.Getter(onMethod_ = {@JsonProperty("unit")})
    @lombok.Setter(onMethod_ = {@JsonProperty("unit")})
    private Unit unit;
}
