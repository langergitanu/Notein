package com.huawei.cloud.base.util;

/* JADX INFO: loaded from: classes8.dex */
public class Base64 {
    private Base64() {
    }

    public static byte[] decodeBase64(String str) {
        return com.huawei.cloud.base.util.base64.Base64.decodeBase64(str);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return com.huawei.cloud.base.util.base64.Base64.encodeBase64(bArr);
    }

    public static String encodeBase64String(byte[] bArr) {
        return com.huawei.cloud.base.util.base64.Base64.encodeBase64String(bArr);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return com.huawei.cloud.base.util.base64.Base64.encodeBase64URLSafeString(bArr);
    }
}
