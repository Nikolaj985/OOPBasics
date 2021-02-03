package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("Full-Time"), PART_TIME("Part-Time");
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }

    public static ContractType fromCode(String code) {
        for (ContractType d : values()) {
            if (d.getDisplayName().equals(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }

    ContractType(String displayName) {
        this.displayName = displayName;
    }
}
