package com.huawei.cloud.base.util;

import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.network.embedded.C18101a5;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class StringUtils {
    public static final String LINE_SEPARATOR = System.getProperty(C18101a5.f54156e);
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private StringUtils() {
    }

    private static byte[] getBytes(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf8(String str) {
        return getBytes(str, Charsets.UTF_8);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String maskLogBody(String str) {
        for (String str2 : Config.EXCLUDED_FIELD_LENGTH.keySet()) {
            Map<String, Integer> map = Config.EXCLUDED_FIELD_LENGTH;
            if (map.get(str2) != null) {
                StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str2, ".{");
                sbOooO0OO.append(map.get(str2).intValue() + 2);
                sbOooO0OO.append("}");
                str = str.replaceAll(sbOooO0OO.toString(), str2 + ": *****");
            }
        }
        return str;
    }

    private static String newString(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String newStringUsAscii(byte[] bArr) {
        return newString(bArr, Charsets.US_ASCII);
    }

    public static String newStringUtf8(byte[] bArr) {
        return newString(bArr, UTF_8);
    }
}
