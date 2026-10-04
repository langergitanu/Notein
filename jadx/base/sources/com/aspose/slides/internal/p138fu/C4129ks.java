package com.aspose.slides.internal.p138fu;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p482wr.C12251ck;
import com.aspose.slides.internal.p482wr.C12268ts;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4129ks {
    /* JADX INFO: renamed from: k4 */
    public static int m16563k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i) {
        int position = (int) abstractC3150x62.getPosition();
        AbstractC3150x6 abstractC3150x6M16565k4 = m16565k4(i, abstractC3150x62, 0);
        try {
            C12565ks.m58615k4(abstractC3150x6, abstractC3150x6M16565k4);
            return ((int) abstractC3150x62.getPosition()) - position;
        } finally {
            if (abstractC3150x6M16565k4 != null) {
                abstractC3150x6M16565k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m16564k4(byte[] bArr, int i, int i2, AbstractC3150x6 abstractC3150x6, int i3) {
        int position = (int) abstractC3150x6.getPosition();
        AbstractC3150x6 abstractC3150x6M16565k4 = m16565k4(i3, abstractC3150x6, 0);
        try {
            abstractC3150x6M16565k4.write(bArr, i, i2);
            abstractC3150x6M16565k4.dispose();
            return ((int) abstractC3150x6.getPosition()) - position;
        } catch (Throwable th) {
            if (abstractC3150x6M16565k4 != null) {
                abstractC3150x6M16565k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC3150x6 m16565k4(int i, AbstractC3150x6 abstractC3150x6, int i2) {
        if (i != 0) {
            if (i == 1) {
                return new C12268ts(abstractC3150x6, i2, true);
            }
            throw new InvalidOperationException("Unknown compression method specified.");
        }
        return new C12251ck(abstractC3150x6, i2, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16566k4(AbstractC3150x6 abstractC3150x6, int i) {
        C3152yj c3152yj = new C3152yj();
        try {
            m16563k4(abstractC3150x6, c3152yj, i);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16567k4(AbstractC3150x6 abstractC3150x6, int i, int i2) {
        if (i == 0) {
            i = (int) abstractC3150x6.getLength();
        }
        C3152yj c3152yj = new C3152yj(i);
        AbstractC3150x6 abstractC3150x6M16565k4 = m16565k4(i2, abstractC3150x6, 1);
        try {
            C12565ks.m58615k4(abstractC3150x6M16565k4, c3152yj);
            return c3152yj.toArray();
        } finally {
            if (abstractC3150x6M16565k4 != null) {
                abstractC3150x6M16565k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16568k4(byte[] bArr, int i) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            return m16566k4(c3152yj, i);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m16569k4(byte[] bArr, int i, int i2) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            return m16567k4(c3152yj, i, i2);
        } finally {
            c3152yj.dispose();
        }
    }
}
