package com.google.api.client.util;

import com.huawei.hms.network.embedded.C18101a5;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes7.dex */
public class StringUtils {
    public static final String LINE_SEPARATOR = System.getProperty(C18101a5.f54156e);

    private StringUtils() {
    }

    public static byte[] getBytesUtf8(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String newStringUtf8(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
