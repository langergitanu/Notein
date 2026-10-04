package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.agconnect.common.api.RandomWrapper;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.UUID;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17625c {

    /* JADX INFO: renamed from: a */
    public static final String f52154a = "aaid";

    /* JADX INFO: renamed from: b */
    public static final String f52155b = "creationTime";

    /* JADX INFO: renamed from: a */
    private static String m75522a(int i) {
        return C17628f.m75553b(RandomWrapper.generateSecureRandom(i));
    }

    /* JADX INFO: renamed from: b */
    private static String m75526b(String str) {
        String strM75550a = C17628f.m75550a(str, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        return ((TextUtils.isEmpty(strM75550a) || strM75550a.length() != 64) ? UUID.randomUUID() : m75527c(strM75550a)).toString();
    }

    /* JADX INFO: renamed from: c */
    private static UUID m75527c(String str) {
        return new UUID(m75528d(str.substring(0, 32)), m75528d(str.substring(32, 64)));
    }

    /* JADX INFO: renamed from: d */
    private static long m75528d(String str) {
        return (((((Long.decode("0x" + str.substring(0, 8)).longValue() << 16) | Long.decode("0x" + str.substring(8, 16)).longValue()) << 16) | Long.decode("0x" + str.substring(16, 24)).longValue()) << 16) | Long.decode("0x" + str.substring(24, 32)).longValue();
    }

    /* JADX INFO: renamed from: a */
    public static String m75523a(Context context) {
        PackageInfo packageInfoSafeGetPackageInfo;
        if (context == null || (packageInfoSafeGetPackageInfo = SafeAppInfo.safeGetPackageInfo(context.getPackageManager(), context.getPackageName(), 64)) == null) {
            return null;
        }
        return packageInfoSafeGetPackageInfo.signatures[0].toCharsString();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m75524a(C17627e c17627e) {
        String strM75543b;
        try {
            if (c17627e.m75548e(f52154a)) {
                strM75543b = c17627e.m75543b(f52154a);
            } else {
                String string = UUID.randomUUID().toString();
                c17627e.m75541a(f52154a, string);
                c17627e.m75535a(f52155b, Long.valueOf(System.currentTimeMillis()));
                strM75543b = string;
            }
        } catch (Throwable th) {
            throw th;
        }
        return strM75543b;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m75525a(String str) {
        return m75526b(str + m75522a(32));
    }
}
