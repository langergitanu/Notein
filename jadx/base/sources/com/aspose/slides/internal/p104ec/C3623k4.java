package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.k4 */
/* JADX INFO: loaded from: classes3.dex */
class C3623k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m14763k4(C3134k4 c3134k4) {
        if (c3134k4 == null) {
            throw new ArgumentNullException("reader");
        }
        int iM13382u4 = c3134k4.m13382u4();
        c3134k4.m13371ck().seek(-2L, 1);
        return iM13382u4;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte m14767x1(C3134k4 c3134k4) {
        if (c3134k4 == null) {
            throw new ArgumentNullException("reader");
        }
        byte bM13387yj = c3134k4.m13387yj();
        c3134k4.m13371ck().seek(-1L, 1);
        return bM13387yj;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m14764k4(C3134k4 c3134k4, int i, int i2) {
        if (c3134k4 != null) {
            return C3624kk.m14768k4(c3134k4.m13372dy(i), i2);
        }
        throw new ArgumentNullException("reader");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m14765k4(C3134k4 c3134k4, int i, AbstractC6747ar abstractC6747ar) {
        if (c3134k4 == null) {
            throw new ArgumentNullException("reader");
        }
        if (abstractC6747ar != null) {
            return C3624kk.m14769k4(c3134k4.m13372dy(i), abstractC6747ar);
        }
        throw new ArgumentNullException("encoding");
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m14766k4(C3134k4 c3134k4, byte b) {
        List list = new List();
        while (true) {
            byte bM13387yj = c3134k4.m13387yj();
            if (C7019kk.m27462to(Byte.valueOf(bM13387yj), 6) == C7019kk.m27462to(Byte.valueOf(b), 6)) {
                return C3085sv.m13110x1((List<Byte>) list);
            }
            list.addItem(Byte.valueOf(bM13387yj));
        }
    }
}
