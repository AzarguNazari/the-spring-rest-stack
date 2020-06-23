package com.jl.crm.client.meta;

import lombok.Data;

@Data
public class Authority {
    private String authority ;

    public Authority(String authority) {
        this.authority = authority;
    }

    Authority() {}
}
