package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The type of the payment.
 */
public enum PaymentType {
    BANK, CASH, GIFT_CARD, LOYALTY_PROGRAM, PAYMENT_CARD, PAYMENT_TYPE_UNSPECIFIED, WALLET;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANK: return "BANK";
            case CASH: return "CASH";
            case GIFT_CARD: return "GIFT_CARD";
            case LOYALTY_PROGRAM: return "LOYALTY_PROGRAM";
            case PAYMENT_CARD: return "PAYMENT_CARD";
            case PAYMENT_TYPE_UNSPECIFIED: return "PAYMENT_TYPE_UNSPECIFIED";
            case WALLET: return "WALLET";
        }
        return null;
    }

    @JsonCreator
    public static PaymentType forValue(String value) throws IOException {
        if (value.equals("BANK")) return BANK;
        if (value.equals("CASH")) return CASH;
        if (value.equals("GIFT_CARD")) return GIFT_CARD;
        if (value.equals("LOYALTY_PROGRAM")) return LOYALTY_PROGRAM;
        if (value.equals("PAYMENT_CARD")) return PAYMENT_CARD;
        if (value.equals("PAYMENT_TYPE_UNSPECIFIED")) return PAYMENT_TYPE_UNSPECIFIED;
        if (value.equals("WALLET")) return WALLET;
        throw new IOException("Cannot deserialize PaymentType");
    }
}
