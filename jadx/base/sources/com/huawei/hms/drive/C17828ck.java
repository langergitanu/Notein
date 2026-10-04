package com.huawei.hms.drive;

/* JADX INFO: renamed from: com.huawei.hms.drive.ck */
/* JADX INFO: loaded from: classes6.dex */
public final class C17828ck {
    /* JADX INFO: renamed from: a */
    public static boolean m76490a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76491b(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m76492c(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m76493d(String str) {
        return str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m76494e(String str) {
        return !str.equals("PROPFIND");
    }
}
