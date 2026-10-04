package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p302nm.C6923jd;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p504xm.C12550h4;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4208ck {
    /* JADX INFO: renamed from: du */
    private static boolean m16887du(byte[] bArr) {
        int iM58515x1 = C12549du.m58515x1(bArr);
        if (iM58515x1 == 4) {
            return m16892x1(bArr);
        }
        if (iM58515x1 == 5) {
            return m16890kk(bArr);
        }
        if (iM58515x1 != 8) {
            return false;
        }
        return m16891to(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16888k4(C4127k4 c4127k4) throws Throwable {
        int iM16536h4;
        C3152yj c3152yj = new C3152yj();
        switch (c4127k4.m16536h4()) {
            case 4:
            case 5:
            case 8:
                iM16536h4 = c4127k4.m16536h4();
                c4127k4.m16541k4(c3152yj, iM16536h4);
                break;
            case 6:
            case 7:
                iM16536h4 = 5;
                c4127k4.m16541k4(c3152yj, iM16536h4);
                break;
            default:
                c4127k4.mo16493x1(c3152yj, 100);
                break;
        }
        return C12565ks.m58632x1(c3152yj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m16890kk(byte[] bArr) {
        boolean z;
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C12564kk c12564kk = new C12564kk(c3152yj);
            c3152yj.setPosition(8L);
            String str = C14113y2.f47374k4;
            String strM67405k4 = str;
            boolean z2 = true;
            while (c3152yj.getPosition() <= c3152yj.getLength() - 8) {
                long jM58604kk = c12564kk.m58604kk();
                strM67405k4 = C14113y2.m67405k4(c12564kk.m58607x1(4));
                if (z2) {
                    str = strM67405k4;
                    z2 = false;
                }
                c3152yj.seek(4294967295L & ((jM58604kk & 4294967295L) + 4), 1);
            }
            if ("IHDR".equals(str)) {
                z = "IEND".equals(strM67405k4);
            }
            c3152yj.dispose();
            return z;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: to */
    public static boolean m16891to(byte[] bArr) {
        return new C12550h4(bArr).m58533du();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m16892x1(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C12564kk c12564kk = new C12564kk(c3152yj);
            c12564kk.m58600du();
            while (true) {
                int iM58600du = c12564kk.m58600du();
                int i = iM58600du & 65535;
                if ((65520 & iM58600du) == 65472 && i != 65476 && i != 65484) {
                    c3152yj.dispose();
                    return false;
                }
                switch (iM58600du) {
                    case 65504:
                    case 65505:
                    case 65506:
                    case 65517:
                    case 65518:
                        return true;
                    default:
                        c3152yj.seek((c12564kk.m58600du() & 65535) - 2, 1);
                        break;
                }
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16889k4(byte[] bArr) {
        if (m16887du(bArr)) {
            return bArr;
        }
        try {
            C4127k4 c4127k4 = new C4127k4(bArr);
            try {
                return m16888k4(c4127k4);
            } finally {
                c4127k4.dispose();
            }
        } catch (RuntimeException unused) {
            return C6923jd.m27138x1();
        }
    }
}
