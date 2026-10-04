package com.huawei.hms.support.hwid.tools;

import android.text.TextUtils;
import com.aspose.slides.OooOOO;
import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class NetworkTool {
    /* JADX INFO: renamed from: a */
    private static boolean m80155a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static String buildNetworkCookie(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("=");
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (m80155a(bool)) {
            sb.append(";HttpOnly");
        }
        if (m80155a(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        return sb.toString();
    }

    public static String buildNetworkUrl(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        String str2 = m80155a(bool) ? AuthenticationConstants.HTTPS_PROTOCOL_STRING : "http";
        return OooOOO.OooO0O0(new StringBuilder(String.valueOf(str).length() + str2.length() + 3), str2, "://", str);
    }
}
