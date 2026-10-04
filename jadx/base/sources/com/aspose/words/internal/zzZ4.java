package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ4 {
    public static void zzU(String str, String str2) {
        if (zzZKN.zzU3(str)) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("The argument cannot be null or empty string.\r\nParameter name: ", str2));
        }
    }

    public static boolean zzW(Object obj, Object obj2) {
        return zzY(obj, obj2) && obj.getClass() == obj2.getClass() && obj.hashCode() == obj2.hashCode();
    }

    public static boolean zzX(Object obj, Object obj2) {
        return obj == null && obj2 == null;
    }

    public static boolean zzY(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static boolean zzZ(Object obj, Object obj2) {
        return (obj == null) ^ (obj2 == null);
    }

    public static void zzY(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Value cannot be null.\r\nParameter name: ", str));
        }
    }

    public static void zzZ(int i, int i2, int i3, String str) {
        if (i < i2 || i > i3) {
            throw new IllegalArgumentException(zzZKN.format("Expected a value between {0} and {1}.", Integer.valueOf(i2), Integer.valueOf(i3)) + "\r\nParameter name: " + str);
        }
    }

    public static void zzZ(double d, double d2, double d3, String str) {
        if (d < d2 || d > d3 || Double.isNaN(d)) {
            throw new IllegalArgumentException(zzZKN.format("Expected a value between {0} and {1}.", Double.valueOf(d2), Double.valueOf(d3)) + "\r\nParameter name: " + str);
        }
    }

    public static void zzZ(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Expected a positive value.\r\nParameter name: ", str));
        }
    }

    public static void zzY(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Expected a non-negative value.\r\nParameter name: ", str));
        }
    }

    public static void zzZ(double d, String str) {
        if (d <= 0.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Expected a positive value.\r\nParameter name: ", str));
        }
    }

    public static void zzY(double d, String str) {
        if (d < 0.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Expected a non-negative value.\r\nParameter name: ", str));
        }
    }

    public static double zzZ(double d, double d2, double d3, double d4, double d5, boolean z, String str) {
        if (d < d2) {
            if (z) {
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Specified argument was out of the range of valid values.\r\nParameter name: ", str));
            }
            return d3;
        }
        if (d <= d4) {
            return d;
        }
        if (z) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Specified argument was out of the range of valid values.\r\nParameter name: ", str));
        }
        return d5;
    }
}
