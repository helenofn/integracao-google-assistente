package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Table card.
 *
 * A table card for displaying a table of text.
 */
@lombok.Data
public class Table {
    @lombok.Getter(onMethod_ = {@JsonProperty("button")})
    @lombok.Setter(onMethod_ = {@JsonProperty("button")})
    private Link button;
    @lombok.Getter(onMethod_ = {@JsonProperty("columns")})
    @lombok.Setter(onMethod_ = {@JsonProperty("columns")})
    private List<TableColumn> columns;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private Image image;
    @lombok.Getter(onMethod_ = {@JsonProperty("rows")})
    @lombok.Setter(onMethod_ = {@JsonProperty("rows")})
    private List<TableRow> rows;
    @lombok.Getter(onMethod_ = {@JsonProperty("subtitle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subtitle")})
    private String subtitle;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
