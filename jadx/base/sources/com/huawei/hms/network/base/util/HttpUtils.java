package com.huawei.hms.network.base.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class HttpUtils {
    public static final String HTTPS_PREFIX = "https://";
    public static final String HTTP_PREFIX = "http://";

    /* JADX INFO: renamed from: a */
    private static final String f54068a = "HttpUtils";

    public static boolean isHttpOrGrsUrl(String str) {
        return isHttpUrl(str) || str.startsWith("grs://");
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(HTTP_PREFIX) || str.startsWith("https://");
    }
}
