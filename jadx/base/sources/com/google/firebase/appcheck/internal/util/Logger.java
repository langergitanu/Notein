package com.google.firebase.appcheck.internal.util;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseAppCheck";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* JADX INFO: renamed from: d */
    public void m75262d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m75264e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m75266i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* JADX INFO: renamed from: v */
    public void m75268v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m75270w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75261d(String str) {
        m75262d(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m75263e(String str) {
        m75264e(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m75265i(String str) {
        m75266i(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m75267v(String str) {
        m75268v(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m75269w(String str) {
        m75270w(str, null);
    }
}
