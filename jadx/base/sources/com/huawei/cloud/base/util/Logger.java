package com.huawei.cloud.base.util;

import android.util.Log;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.drive.C17769af;

/* JADX INFO: loaded from: classes8.dex */
public class Logger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    private static final String DEFAULT_FORMAT_TAG = "[%s]%s.%s";
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final int OFF_VALUE = 7;
    public static final boolean PROGUARD_DISABLED = true;
    private static final String TAG_PREFIX = "DriveSDK";
    public static final int VERBOSE = 2;
    private static final String VERSION_NAME = "5.0.0.307";
    public static final int WARN = 5;
    private static int levelValue = 4;
    private String tagName;

    private Logger(String str) {
        this.tagName = formatTag(str);
    }

    public static String convertMsg(String str) {
        return str == null ? "" : str;
    }

    public static String formatTag(String str) {
        return OooO00o.OooO00o("[5.0.0.307]DriveSDK.", str);
    }

    public static Logger getLogger(String str) {
        return new Logger(str);
    }

    private boolean isLoggable(int i) {
        int i2 = levelValue;
        return i >= i2 && i2 != 7;
    }

    public static void setLevel(int i) {
        levelValue = i;
    }

    /* JADX INFO: renamed from: d */
    public void m75688d(String str) {
        if (isLoggable(3)) {
            Log.d(this.tagName, convertMsg(StringUtils.maskLogBody(str)));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m75690e(String str) {
        if (isLoggable(6)) {
            Log.e(this.tagName, convertMsg(str));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m75691i(String str) {
        if (isLoggable(4)) {
            Log.i(this.tagName, convertMsg(str));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m75692v(String str) {
        if (isLoggable(2)) {
            Log.v(this.tagName, convertMsg(str));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m75693w(String str) {
        if (isLoggable(5)) {
            Log.w(this.tagName, convertMsg(str));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m75694w(String str, Throwable th) {
        if (isLoggable(5)) {
            Log.w(this.tagName, convertMsg(str), th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75689d(String str, boolean z) {
        if (isLoggable(3)) {
            C17769af.m75943a(this.tagName, convertMsg(StringUtils.maskLogBody(str)), false);
        }
    }
}
