package com.aspose.slides;

import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes3.dex */
class dj6 {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m5112k4(String str) {
        int iM66582k4;
        boolean z;
        int iM66582k42;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*?)'!R(\\d+|\\[-?\\d*\\])?\\s*C(\\d+|\\[-?\\d*\\])?", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9]+)!R(\\d+|\\[-?\\d*\\])?\\s*C(\\d+|\\[-?\\d*\\])?", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        boolean z2 = true;
        String strM67401k4 = C14113y2.m67401k4(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk(), "''", "'");
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 2), C14113y2.f47374k4)) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 3);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
            if (iM66582k4 < 1) {
                return null;
            }
            z = true;
        }
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 3), C14113y2.f47374k4)) {
            String strOooO00o2 = OooOo.OooO00o(c12385toOooO00o, 3);
            iM66582k42 = ("".equals(strOooO00o2) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o2)) ? 0 : C14057f9.m66582k4(strOooO00o2);
            z2 = false;
        } else {
            iM66582k42 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
            if (iM66582k42 < 1) {
                return null;
            }
        }
        return new C0909dp(new b6d(iM66582k4, z, strM67401k4), new C0958eo(iM66582k42, z2, strM67401k4), strM67401k4);
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC0761as m5114kk(String str) {
        int iM66582k4;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*?)'!C((\\d+)|\\[(-?\\d*)\\])?", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9_]+)!C((\\d+)|\\[(-?\\d*)\\])?", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        boolean z = true;
        String strM67401k4 = C14113y2.m67401k4(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk(), "''", "'");
        if (C14113y2.m67411k4(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk())) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 4);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
            if (iM66582k4 < 1) {
                return null;
            }
        }
        return new C0958eo(iM66582k4, z, strM67401k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC0761as m5116x1(String str) {
        int iM66582k4;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*?)'!R((\\d+)|\\[(-?\\d*)\\])?", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9_]+)!R((\\d+)|\\[(-?\\d*)\\])?", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        boolean z = true;
        String strM67401k4 = C14113y2.m67401k4(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk(), "''", "'");
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 3), C14113y2.f47374k4)) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 4);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
            if (iM66582k4 < 1) {
                return null;
            }
        }
        return new b6d(iM66582k4, z, strM67401k4);
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC0761as m5115kk(String str, String str2) {
        int iM66582k4;
        boolean z;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*C((\\d+)|\\[(-?\\d*)\\])?\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 2), C14113y2.f47374k4)) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 3);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
            z = true;
            if (iM66582k4 < 1) {
                return null;
            }
        }
        return new C0958eo(iM66582k4, z, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC0761as m5117x1(String str, String str2) {
        int iM66582k4;
        boolean z;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*R((\\d+)|\\[(-?\\d*)\\])?\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 2), C14113y2.f47374k4)) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 3);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
            z = true;
            if (iM66582k4 < 1) {
                return null;
            }
        }
        return new b6d(iM66582k4, z, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m5113k4(String str, String str2) {
        int iM66582k4;
        boolean z;
        int iM66582k42;
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*R((\\d+)|\\[(-?\\d*)\\])?\\s*C((\\d+)|\\[(-?\\d*)\\])?\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        boolean z2 = false;
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 2), C14113y2.f47374k4)) {
            String strOooO00o = OooOo.OooO00o(c12385toOooO00o, 3);
            iM66582k4 = ("".equals(strOooO00o) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o)) ? 0 : C14057f9.m66582k4(strOooO00o);
            z = false;
        } else {
            iM66582k4 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
            if (iM66582k4 < 1) {
                return null;
            }
            z = true;
        }
        if (C14113y2.m67363du(OooOo.OooO00o(c12385toOooO00o, 5), C14113y2.f47374k4)) {
            String strOooO00o2 = OooOo.OooO00o(c12385toOooO00o, 6);
            iM66582k42 = ("".equals(strOooO00o2) || CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(strOooO00o2)) ? 0 : C14057f9.m66582k4(strOooO00o2);
        } else {
            iM66582k42 = C14057f9.m66582k4(c12385toOooO00o.m58004du().m58000k4(5).mo57995kk());
            if (iM66582k42 < 1) {
                return null;
            }
            z2 = true;
        }
        return new C0909dp(new b6d(iM66582k4, z, str2), new C0958eo(iM66582k42, z2, str2), str2);
    }
}
