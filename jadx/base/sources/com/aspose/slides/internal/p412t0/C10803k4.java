package com.aspose.slides.internal.p412t0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p449us.C11554k4;
import com.aspose.slides.internal.p449us.C11555kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.t0.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10803k4 {

    /* JADX INFO: renamed from: k4 */
    private static Object f37852k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static InterfaceC10804kk f37853x1;

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC10804kk m52379k4() {
        InterfaceC10804kk c11555kk;
        if (f37853x1 == null) {
            synchronized (f37852k4) {
                try {
                    if (f37853x1 == null) {
                        int iM52396k4 = C10805x1.m52396k4();
                        if (iM52396k4 == 0) {
                            c11555kk = new C11555kk();
                        } else {
                            if (iM52396k4 != 3) {
                                throw new ArgumentOutOfRangeException("Unsupported external tools caller type");
                            }
                            c11555kk = new C11554k4(C10805x1.m52397x1());
                        }
                        f37853x1 = c11555kk;
                    }
                } finally {
                }
            }
        }
        return f37853x1;
    }

    /* JADX INFO: renamed from: kk */
    public static void m52385kk(String str) {
        if (f37853x1 == null) {
            m52379k4();
        }
        InterfaceC10804kk interfaceC10804kk = f37853x1;
        if (interfaceC10804kk instanceof C11555kk) {
            ((C11555kk) interfaceC10804kk).m54536kk(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m52386x1(String str, String str2, int i, int i2, int i3) {
        m52379k4().mo52391k4(str, str2, i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m52380k4(String str) {
        m52379k4().mo52389k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m52387x1(String str, String str2, int i, int i2, int i3, boolean z) {
        m52379k4().mo52392k4(str, str2, i, i2, i3, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m52381k4(String str, int i, String str2, int i2, boolean z) {
        m52379k4().mo52390k4(str, i, str2, i2, z);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m52388x1(String str) {
        return m52379k4().mo52395x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m52382k4(String str, String str2, int i, int i2, int i3) {
        m52379k4().mo52392k4(str, str2, i, i2, i3, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m52383k4(String str, String str2, int i, int i2, int i3, boolean z) {
        m52379k4().mo52394x1(str, str2, i, i2, i3, z);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m52384k4(String str, String str2, String str3) {
        m52379k4().mo52393k4(str, str2, str3);
    }
}
