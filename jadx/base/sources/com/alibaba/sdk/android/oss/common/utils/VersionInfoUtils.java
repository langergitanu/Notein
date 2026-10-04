package com.alibaba.sdk.android.oss.common.utils;

import android.os.Build;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.aspose.slides.OooOOO;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfoUtils {
    private static String userAgent;

    private static String getSystemInfo() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.getProperty("os.name"));
        sb.append("/Android " + Build.VERSION.RELEASE);
        sb.append("/");
        sb.append(HttpUtil.urlEncode(Build.MODEL, "utf-8") + ";" + HttpUtil.urlEncode(Build.ID, "utf-8"));
        sb.append(")");
        String string = sb.toString();
        OSSLog.logDebug("user agent : " + string);
        return OSSUtils.isEmptyString(string) ? System.getProperty("http.agent").replaceAll("[^\\p{ASCII}]", MsalUtils.QUERY_STRING_SYMBOL) : string;
    }

    public static String getUserAgent(String str) {
        if (OSSUtils.isEmptyString(userAgent)) {
            userAgent = "aliyun-sdk-android/" + getVersion() + getSystemInfo();
        }
        return OSSUtils.isEmptyString(str) ? userAgent : OooOOO.OooO0O0(new StringBuilder(), userAgent, "/", str);
    }

    public static String getVersion() {
        return OSSConstants.SDK_VERSION;
    }
}
