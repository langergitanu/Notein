package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18366t9 {
    /* JADX INFO: renamed from: a */
    public static boolean m79566a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79567b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m79568c(String str) {
        return !str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m79569d(String str) {
        return str.equals("PROPFIND");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m79570e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
