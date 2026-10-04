package com.nimbusds.jose.util;

/* JADX INFO: loaded from: classes9.dex */
public class IntegerUtils {
    private IntegerUtils() {
    }

    public static byte[] toBytes(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }
}
