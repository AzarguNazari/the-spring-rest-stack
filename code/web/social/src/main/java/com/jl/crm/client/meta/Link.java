package com.jl.crm.client.meta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * describes a link to a URL and relationship.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Link {

    private String href, rel;

    public Link(String rel, String href) {
        this.href = href;
        this.rel = rel;
    }

    public Link() {}
}
