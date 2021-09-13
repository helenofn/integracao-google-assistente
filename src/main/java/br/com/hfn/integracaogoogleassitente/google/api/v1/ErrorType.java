package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: This represents the granular reason why an order gets rejected by the merchant.
 */
public enum ErrorType {
    ACCOUNT_LINKING_FAILED, AVAILABILITY_CHANGED, CLOSED, ERROR_TYPE_UNSPECIFIED, FAILED_PRECONDITION, INCORRECT_PRICE, INELIGIBLE, INVALID, MERCHANT_UNREACHABLE, NOT_FOUND, NO_CAPACITY, NO_COURIER_AVAILABLE, OUT_OF_SERVICE_AREA, PAYMENT_DECLINED, PRICE_CHANGED, PROMO_EXPIRED, PROMO_NOT_APPLICABLE, PROMO_NOT_RECOGNIZED, PROMO_ORDER_INELIGIBLE, PROMO_USER_INELIGIBLE, REQUIREMENTS_NOT_MET, TOO_LATE, UNAVAILABLE_SLOT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNT_LINKING_FAILED: return "ACCOUNT_LINKING_FAILED";
            case AVAILABILITY_CHANGED: return "AVAILABILITY_CHANGED";
            case CLOSED: return "CLOSED";
            case ERROR_TYPE_UNSPECIFIED: return "ERROR_TYPE_UNSPECIFIED";
            case FAILED_PRECONDITION: return "FAILED_PRECONDITION";
            case INCORRECT_PRICE: return "INCORRECT_PRICE";
            case INELIGIBLE: return "INELIGIBLE";
            case INVALID: return "INVALID";
            case MERCHANT_UNREACHABLE: return "MERCHANT_UNREACHABLE";
            case NOT_FOUND: return "NOT_FOUND";
            case NO_CAPACITY: return "NO_CAPACITY";
            case NO_COURIER_AVAILABLE: return "NO_COURIER_AVAILABLE";
            case OUT_OF_SERVICE_AREA: return "OUT_OF_SERVICE_AREA";
            case PAYMENT_DECLINED: return "PAYMENT_DECLINED";
            case PRICE_CHANGED: return "PRICE_CHANGED";
            case PROMO_EXPIRED: return "PROMO_EXPIRED";
            case PROMO_NOT_APPLICABLE: return "PROMO_NOT_APPLICABLE";
            case PROMO_NOT_RECOGNIZED: return "PROMO_NOT_RECOGNIZED";
            case PROMO_ORDER_INELIGIBLE: return "PROMO_ORDER_INELIGIBLE";
            case PROMO_USER_INELIGIBLE: return "PROMO_USER_INELIGIBLE";
            case REQUIREMENTS_NOT_MET: return "REQUIREMENTS_NOT_MET";
            case TOO_LATE: return "TOO_LATE";
            case UNAVAILABLE_SLOT: return "UNAVAILABLE_SLOT";
        }
        return null;
    }

    @JsonCreator
    public static ErrorType forValue(String value) throws IOException {
        if (value.equals("ACCOUNT_LINKING_FAILED")) return ACCOUNT_LINKING_FAILED;
        if (value.equals("AVAILABILITY_CHANGED")) return AVAILABILITY_CHANGED;
        if (value.equals("CLOSED")) return CLOSED;
        if (value.equals("ERROR_TYPE_UNSPECIFIED")) return ERROR_TYPE_UNSPECIFIED;
        if (value.equals("FAILED_PRECONDITION")) return FAILED_PRECONDITION;
        if (value.equals("INCORRECT_PRICE")) return INCORRECT_PRICE;
        if (value.equals("INELIGIBLE")) return INELIGIBLE;
        if (value.equals("INVALID")) return INVALID;
        if (value.equals("MERCHANT_UNREACHABLE")) return MERCHANT_UNREACHABLE;
        if (value.equals("NOT_FOUND")) return NOT_FOUND;
        if (value.equals("NO_CAPACITY")) return NO_CAPACITY;
        if (value.equals("NO_COURIER_AVAILABLE")) return NO_COURIER_AVAILABLE;
        if (value.equals("OUT_OF_SERVICE_AREA")) return OUT_OF_SERVICE_AREA;
        if (value.equals("PAYMENT_DECLINED")) return PAYMENT_DECLINED;
        if (value.equals("PRICE_CHANGED")) return PRICE_CHANGED;
        if (value.equals("PROMO_EXPIRED")) return PROMO_EXPIRED;
        if (value.equals("PROMO_NOT_APPLICABLE")) return PROMO_NOT_APPLICABLE;
        if (value.equals("PROMO_NOT_RECOGNIZED")) return PROMO_NOT_RECOGNIZED;
        if (value.equals("PROMO_ORDER_INELIGIBLE")) return PROMO_ORDER_INELIGIBLE;
        if (value.equals("PROMO_USER_INELIGIBLE")) return PROMO_USER_INELIGIBLE;
        if (value.equals("REQUIREMENTS_NOT_MET")) return REQUIREMENTS_NOT_MET;
        if (value.equals("TOO_LATE")) return TOO_LATE;
        if (value.equals("UNAVAILABLE_SLOT")) return UNAVAILABLE_SLOT;
        throw new IOException("Cannot deserialize ErrorType");
    }
}
