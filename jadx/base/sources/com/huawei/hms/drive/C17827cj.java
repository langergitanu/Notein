package com.huawei.hms.drive;

import com.google.common.net.HttpHeaders;
import java.util.List;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.drive.cj */
/* JADX INFO: loaded from: classes6.dex */
public final class C17827cj {

    /* JADX INFO: renamed from: a */
    private static final C34527OooO0oO f53114a;

    /* JADX INFO: renamed from: b */
    private static final C34527OooO0oO f53115b;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f53114a = C34527OooO0oO.OooO00o.OooO0O0("\"\\");
        f53115b = C34527OooO0oO.OooO00o.OooO0O0("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static long m76485a(C17800bj c17800bj) {
        return m76484a(c17800bj.m76286e());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m76489b(C17800bj c17800bj) {
        if (c17800bj.m76280a().m76263b().equals("HEAD")) {
            return false;
        }
        int iM76283b = c17800bj.m76283b();
        return (((iM76283b >= 100 && iM76283b < 200) || iM76283b == 204 || iM76283b == 304) && m76485a(c17800bj) == -1 && !"chunked".equalsIgnoreCase(c17800bj.m76281a(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static long m76484a(C17788ay c17788ay) {
        return m76486a(c17788ay.m76074a("Content-Length"));
    }

    /* JADX INFO: renamed from: a */
    private static long m76486a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76487a(InterfaceC17783at interfaceC17783at, C17792bb c17792bb, C17788ay c17788ay) {
        if (interfaceC17783at == InterfaceC17783at.f52734a) {
            return;
        }
        List<C17782as> listM76028a = C17782as.m76028a(c17792bb, c17788ay);
        if (listM76028a.isEmpty()) {
            return;
        }
        interfaceC17783at.mo76035a(c17792bb, listM76028a);
    }

    /* JADX INFO: renamed from: b */
    public static int m76488b(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m76483a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m76482a(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }
}
