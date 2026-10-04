package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11721ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class rwz {
    /* JADX INFO: renamed from: k4 */
    private static String m70357k4(String str, AbstractC11721ck abstractC11721ck) {
        try {
            return C3141rv.m13397du(str);
        } catch (ArgumentException e) {
            if (C7019kk.m27469x1(abstractC11721ck, gnb.class)) {
                ((gnb) abstractC11721ck).m6785k4(e.toString(), 1);
                return "";
            }
            if (!C7019kk.m27469x1(abstractC11721ck, qye.class)) {
                return "";
            }
            ((qye) abstractC11721ck).m69954k4(e.toString(), 1);
            return "";
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70358k4(OleObjectFrame oleObjectFrame, byte[] bArr, AbstractC11721ck abstractC11721ck) {
        if (oleObjectFrame == null) {
            throw new ArgumentNullException("oleFrame");
        }
        if (bArr == null) {
            throw new ArgumentNullException("streamData");
        }
        if (bArr.length == 0) {
            return false;
        }
        String[] strArr = {null};
        String[] strArr2 = {null};
        byte[][] bArr2 = {null};
        boolean zM70359k4 = m70359k4(bArr, strArr, strArr2, bArr2);
        String str = strArr[0];
        String str2 = strArr2[0];
        byte[] bArr3 = bArr2[0];
        if (!zM70359k4) {
            return false;
        }
        oleObjectFrame.m2088x1(str);
        oleObjectFrame.m2078k4(str2);
        oleObjectFrame.m2084rv().m2070k4(bArr3);
        oleObjectFrame.m2084rv().m2069k4(m70357k4(str, abstractC11721ck));
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70359k4(byte[] bArr, String[] strArr, String[] strArr2, byte[][] bArr2) {
        bArr2[0] = null;
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                try {
                    if (c3134k4.m13386x6() != bArr.length - 4) {
                        strArr2[0] = null;
                        strArr[0] = null;
                        c3152yj.dispose();
                        return false;
                    }
                    c3134k4.m13381rv();
                    strArr2[0] = C3085sv.m13079k4(c3134k4);
                    strArr[0] = C3085sv.m13079k4(c3134k4);
                    c3134k4.m13387yj();
                    c3134k4.m13387yj();
                    c3134k4.m13381rv();
                    try {
                        s0q.m70409k4(c3134k4).m70410k4();
                        int iM13386x6 = c3134k4.m13386x6();
                        if (iM13386x6 > 0) {
                            bArr2[0] = c3134k4.m13372dy(iM13386x6);
                            boolean z = !C14113y2.m67411k4(strArr[0]);
                            c3152yj.dispose();
                            return z;
                        }
                        bArr2[0] = null;
                        c3152yj.dispose();
                        return false;
                    } catch (FormatException unused) {
                        c3152yj.dispose();
                        return false;
                    }
                } finally {
                    c3134k4.dispose();
                }
            } catch (EndOfStreamException unused2) {
                strArr2[0] = null;
                strArr[0] = null;
                c3152yj.dispose();
                return false;
            }
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }
}
