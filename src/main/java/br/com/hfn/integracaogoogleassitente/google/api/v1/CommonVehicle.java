package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Vehicle details of the user placing the order.
 *
 * Details about a vehicle
 */
@lombok.Data
public class CommonVehicle {
    @lombok.Getter(onMethod_ = {@JsonProperty("colorName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("colorName")})
    private String colorName;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private V2UIElementsImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("licensePlate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("licensePlate")})
    private String licensePlate;
    @lombok.Getter(onMethod_ = {@JsonProperty("make")})
    @lombok.Setter(onMethod_ = {@JsonProperty("make")})
    private String make;
    @lombok.Getter(onMethod_ = {@JsonProperty("model")})
    @lombok.Setter(onMethod_ = {@JsonProperty("model")})
    private String model;
}
