package com.aspose.slides.internal.p541z6;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13447k4 {

    /* JADX INFO: renamed from: k4 */
    public static final long f45030k4 = C7019kk.m27461m9(4096, 9);

    /* JADX INFO: renamed from: com.aspose.slides.internal.z6.k4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo18615k4(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62556k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        m62557k4(abstractC3150x6, abstractC3150x62, f45030k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static C3152yj m62561x1(AbstractC3150x6 abstractC3150x6) {
        return m62562x1(abstractC3150x6, f45030k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m62557k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = abstractC3150x6.read(bArr, 0, i);
            if (i2 == 0) {
                return;
            } else {
                abstractC3150x62.write(bArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static C3152yj m62562x1(AbstractC3150x6 abstractC3150x6, long j) {
        final C3152yj[] c3152yjArr = {new C3152yj(0)};
        m62558k4(abstractC3150x6, new k4() { // from class: com.aspose.slides.internal.z6.k4.1
            @Override // com.aspose.slides.internal.p541z6.C13447k4.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo18615k4(byte[] bArr, int i) {
                c3152yjArr[0].write(bArr, 0, i);
                return true;
            }
        }, j);
        return c3152yjArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m62558k4(AbstractC3150x6 abstractC3150x6, k4 k4Var, long j) {
        boolean z;
        int i = (int) j;
        byte[] bArr = new byte[i];
        while (true) {
            z = false;
            int i2 = abstractC3150x6.read(bArr, 0, i);
            if (!k4Var.mo18615k4(bArr, i2)) {
                z = true;
                break;
            }
            if (i2 == 0) {
                break;
            }
        }
        return !z;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m62559k4(AbstractC3150x6 abstractC3150x6) {
        return m62560k4(abstractC3150x6, f45030k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m62560k4(AbstractC3150x6 abstractC3150x6, long j) {
        return m62562x1(abstractC3150x6, j).toArray();
    }
}
