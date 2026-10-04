package com.aspose.slides;

import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.k4 */
/* JADX INFO: loaded from: classes3.dex */
class C13712k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m63637k4(String str) {
        int iCharAt = 0;
        for (int i = 0; i < C14113y2.m67358c5(str).length(); i++) {
            iCharAt = (iCharAt * 26) + (r3.charAt(i) - '@');
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: kk */
    private static String m63646kk(String str) {
        if (C14113y2.m67411k4(str)) {
            return C14113y2.f47374k4;
        }
        if (!C14113y2.m67359c5(str, "]")) {
            return str;
        }
        int iM67429to = C14113y2.m67429to(str, ']') + 1;
        return OooO0OO.OooO00o(iM67429to, iM67429to, str, str);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC0761as m63647x1(String str, int i) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*?)'!(\\$?)([a-zA-Z]+):(\\$?)([a-zA-Z]+)", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9_]+)!(\\$?)([a-zA-Z]+):(\\$?)([a-zA-Z]+)", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        String strM67401k4 = C14113y2.m67401k4(m63646kk(OooOo.OooO00o(c12385toOooO00o, 1)), "''", "'");
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        int iM63637k4 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 3));
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(4).mo57995kk());
        int iM63637k42 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 5));
        boolean z = zEquals && zEquals2;
        boolean z2 = (zEquals || zEquals2) ? false : true;
        if (iM63637k4 == iM63637k42 && (z || z2)) {
            if (!z) {
                iM63637k4 -= i;
            }
            return new C0958eo(iM63637k4, z, strM67401k4);
        }
        if (!zEquals) {
            iM63637k4 -= i;
        }
        if (!zEquals2) {
            iM63637k42 -= i;
        }
        return new xdd(new C0958eo(iM63637k4, zEquals, strM67401k4), new C0958eo(iM63637k42, zEquals2, strM67401k4), strM67401k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m63638k4(String str, int i) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*?)'!(\\$?)(\\d)+:(\\$?)(\\d+)", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9_]+)!(\\$?)(\\d+):(\\$?)(\\d+)", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        String strM67401k4 = C14113y2.m67401k4(m63646kk(OooOo.OooO00o(c12385toOooO00o, 1)), "''", "'");
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        int iM67015to = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(4).mo57995kk());
        int iM67015to2 = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(5).mo57995kk());
        boolean z = zEquals && zEquals2;
        boolean z2 = (zEquals || zEquals2) ? false : true;
        if (iM67015to == iM67015to2 && (z || z2)) {
            if (!z) {
                iM67015to -= i;
            }
            return new b6d(iM67015to, z, strM67401k4);
        }
        if (!zEquals) {
            iM67015to -= i;
        }
        if (!zEquals2) {
            iM67015to2 -= i;
        }
        return new xdd(new b6d(iM67015to, zEquals, strM67401k4), new b6d(iM67015to2, zEquals2, strM67401k4), strM67401k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m63639k4(String str, int i, int i2) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("'(.*)'!(\\$?)([a-zA-Z]+)(\\$?)(\\d+)", str);
        if (!c12385toOooO00o.mo58006to()) {
            c12385toOooO00o = C22210OooOo0o.OooO00o("([a-zA-Z0-9]*)!(\\$?)([a-zA-Z]+)(\\$?)(\\d+)", str);
            if (!c12385toOooO00o.mo58006to()) {
                return null;
            }
        }
        String strM67401k4 = C14113y2.m67401k4(m63646kk(OooOo.OooO00o(c12385toOooO00o, 1)), "''", "'");
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        int iM63637k4 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 3));
        if (!zEquals) {
            iM63637k4 -= i;
        }
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(4).mo57995kk());
        int iM67015to = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(5).mo57995kk());
        if (!zEquals2) {
            iM67015to -= i2;
        }
        return new C0909dp(new b6d(iM67015to, zEquals2, strM67401k4), new C0958eo(iM63637k4, zEquals, strM67401k4), strM67401k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC0761as m63648x1(String str, int i, String str2) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("(.*?)(\\$?)([a-zA-Z]+):(.*?)(\\$?)([a-zA-Z]+)\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        String strM63649x1 = m63649x1(OooOo.OooO00o(c12385toOooO00o, 1));
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        int iM63637k4 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 3));
        String strM63649x12 = m63649x1(OooOo.OooO00o(c12385toOooO00o, 4));
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(5).mo57995kk());
        int iM63637k42 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 6));
        boolean z = zEquals && zEquals2;
        boolean z2 = (zEquals || zEquals2) ? false : true;
        if (strM63649x1 == null) {
            strM63649x1 = str2;
        }
        if (strM63649x12 == null) {
            strM63649x12 = strM63649x1;
        }
        if (iM63637k4 == iM63637k42 && (z || z2)) {
            if (!z) {
                iM63637k4 -= i;
            }
            return new C0958eo(iM63637k4, z, strM63649x12);
        }
        if (!zEquals) {
            iM63637k4 -= i;
        }
        if (!zEquals2) {
            iM63637k42 -= i;
        }
        return new xdd(new C0958eo(iM63637k4, zEquals, strM63649x1), new C0958eo(iM63637k42, zEquals2, strM63649x12), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m63640k4(String str, int i, int i2, String str2) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*(\\$?)([a-zA-Z]+)(\\$?)(\\d+)\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(1).mo57995kk());
        int iM63637k4 = m63637k4(OooOo.OooO00o(c12385toOooO00o, 2));
        if (!zEquals) {
            iM63637k4 -= i;
        }
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
        int iM67015to = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(4).mo57995kk());
        if (!zEquals2) {
            iM67015to -= i2;
        }
        return new C0909dp(new b6d(iM67015to, zEquals2, str2), new C0958eo(iM63637k4, zEquals, str2), str2);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m63649x1(String str) {
        if (C14113y2.m67411k4(str) || !C14113y2.m67359c5(str, "!")) {
            return null;
        }
        if (C14113y2.m67359c5(str, "]")) {
            str = C14113y2.m67422kk(str, C14113y2.m67364dy(str, "]") + 1);
        }
        if (androidx.core.content.OooO0O0.OooO00o(1, str) == '!') {
            str = OooO0OO.OooO00o(1, 0, str, str);
        }
        return androidx.core.content.OooO0O0.OooO00o(1, str) == '\'' ? OooO0OO.OooO00o(1, 0, str, str) : str;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m63641k4(String str, int i, String str2) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("(.*?)(\\$?)(\\d+):(.*?)(\\$?)(\\d+)\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            return null;
        }
        String strM63649x1 = m63649x1(OooOo.OooO00o(c12385toOooO00o, 1));
        boolean zEquals = "$".equals(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        int iM67015to = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(3).mo57995kk());
        String strM63649x12 = m63649x1(OooOo.OooO00o(c12385toOooO00o, 4));
        boolean zEquals2 = "$".equals(c12385toOooO00o.m58004du().m58000k4(5).mo57995kk());
        int iM67015to2 = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(6).mo57995kk());
        boolean z = zEquals && zEquals2;
        boolean z2 = (zEquals || zEquals2) ? false : true;
        if (strM63649x1 == null) {
            strM63649x1 = str2;
        }
        if (strM63649x12 == null) {
            strM63649x12 = strM63649x1;
        }
        if (iM67015to == iM67015to2 && (z || z2)) {
            if (!z) {
                iM67015to -= i;
            }
            return new b6d(iM67015to, z, strM63649x12);
        }
        if (!zEquals) {
            iM67015to -= i;
        }
        if (!zEquals2) {
            iM67015to2 -= i;
        }
        return new xdd(new b6d(iM67015to, zEquals, strM63649x1), new b6d(iM67015to2, zEquals2, strM63649x12), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC0761as m63642k4(String str, InterfaceC1124fx interfaceC1124fx) {
        InterfaceC0761as interfaceC0761asM63648x1 = m63648x1(str, interfaceC1124fx.mo3443kk(), interfaceC1124fx.mo3436k4().mo5429x1());
        if (interfaceC0761asM63648x1 == null) {
            interfaceC0761asM63648x1 = m63641k4(str, interfaceC1124fx.mo3452x1(), interfaceC1124fx.mo3436k4().mo5429x1());
        }
        if (interfaceC0761asM63648x1 != null) {
            return interfaceC0761asM63648x1;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ':');
        InterfaceC0761as interfaceC0761asM63639k4 = m63639k4(strArrM67414k4[0], interfaceC1124fx.mo3443kk(), interfaceC1124fx.mo3452x1());
        if (interfaceC0761asM63639k4 == null) {
            interfaceC0761asM63639k4 = m63640k4(strArrM67414k4[0], interfaceC1124fx.mo3443kk(), interfaceC1124fx.mo3452x1(), interfaceC1124fx.mo3436k4().mo5429x1());
        }
        InterfaceC0761as interfaceC0761asM63639k42 = m63639k4(strArrM67414k4[1], interfaceC1124fx.mo3443kk(), interfaceC1124fx.mo3452x1());
        if (interfaceC0761asM63639k42 == null) {
            interfaceC0761asM63639k42 = m63640k4(strArrM67414k4[0], interfaceC1124fx.mo3443kk(), interfaceC1124fx.mo3452x1(), interfaceC1124fx.mo3436k4().mo5429x1());
        }
        if (interfaceC0761asM63639k4 == null || interfaceC0761asM63639k42 == null) {
            return null;
        }
        return new xdd(interfaceC0761asM63639k4, interfaceC0761asM63639k42);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63643k4(int i) {
        String strM67407k4 = "";
        while (i > 0) {
            int i2 = (i - 1) % 26;
            strM67407k4 = C14113y2.m67407k4(Character.valueOf((char) (i2 + 65)), strM67407k4);
            i = (i - i2) / 26;
        }
        return strM67407k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63644k4(String str, int[] iArr, int[] iArr2) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*([a-zA-Z]+)(\\d+)\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            throw new CellInvalidReferenceException("An invalid cell address is detected.", str);
        }
        iArr[0] = m63637k4(OooOo.OooO00o(c12385toOooO00o, 1));
        iArr2[0] = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63645k4(String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^\\s*([a-zA-Z]+)(\\d+):([a-zA-Z]+)(\\d+)\\s*$", str);
        if (!c12385toOooO00o.mo58006to()) {
            throw new CellInvalidReferenceException("An invalid cell range address is detected.", str);
        }
        iArr[0] = m63637k4(OooOo.OooO00o(c12385toOooO00o, 1));
        iArr2[0] = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk());
        iArr3[0] = m63637k4(OooOo.OooO00o(c12385toOooO00o, 3));
        iArr4[0] = C14080ne.m67015to(c12385toOooO00o.m58004du().m58000k4(4).mo57995kk());
    }
}
