package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.framework.common.PackageUtils;
import com.huawei.hms.framework.common.StringUtils;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18347s3 {

    /* JADX INFO: renamed from: a */
    public static final String f56093a = "5.0.4.300";

    /* JADX INFO: renamed from: b */
    public static final String f56094b = "2021-06-04";

    /* JADX INFO: renamed from: c */
    public static final int f56095c = C18098a2.f54138h.intValue();

    /* JADX INFO: renamed from: d */
    public static String f56096d = null;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s3$a */
    public static class a {
        public static final int CATTLE = 3;
        public static final int RABBIT = 5;
        public static final int RAT = 2;
        public static final int TIGER = 4;
    }

    public static String getAgent(Context context) {
        return context == null ? StringUtils.format("RestClient/%s", getVersion()) : StringUtils.format("%s/%s (Linux; Android %s; %s) RestClient/%s", context.getPackageName(), PackageUtils.getVersionName(context), Build.VERSION.RELEASE, Build.MODEL, getVersion());
    }

    public static int getApiLevel() {
        return f56095c;
    }

    public static String getBuildTime() {
        return "2021-06-04";
    }

    public static String getUserAgent(Context context) {
        if (f56096d == null) {
            f56096d = getAgent(context);
        }
        return f56096d;
    }

    public static String getVersion() {
        return "5.0.4.300";
    }
}
