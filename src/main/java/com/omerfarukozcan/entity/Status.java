package com.omerfarukozcan.entity;

public enum Status {
    ACTIVE("Hazirlaniyor"),
    DELETED("İptal Edildi"),
    COMPLETED("Tamamlandi");

    private final String desc;

    Status(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

}
