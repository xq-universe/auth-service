package com.xqcao.universe.auth.infrastructure.util;

import java.util.UUID;

public class UuidConverter {

    public static String toString(UUID uuid) {
        return uuid.toString();
    }

    public static UUID toUuid(String id) {
        return UUID.fromString(id);
    }
}
