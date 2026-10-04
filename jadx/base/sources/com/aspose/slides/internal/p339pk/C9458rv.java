package com.aspose.slides.internal.p339pk;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C9458rv extends C3134k4 {
    public C9458rv(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m46387du() {
        int[] iArrM46392k4 = m46392k4(4);
        return new C12007ix(iArrM46392k4[3], iArrM46392k4[2], iArrM46392k4[1], iArrM46392k4[0]);
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6[][] m46388dy() {
        int iM13382u4 = super.m13382u4() & 65535;
        C12025x6[][] c12025x6Arr = new C12025x6[iM13382u4][];
        int[] iArrM46392k4 = m46392k4(iM13382u4);
        for (int i = 0; i < iM13382u4; i++) {
            c12025x6Arr[i] = m46397x1(iArrM46392k4[i]);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: h4 */
    public final C5656k4 m46389h4() {
        int iM13387yj = super.m13387yj() & 255;
        int iM13387yj2 = super.m13387yj() & 255;
        int iM13387yj3 = super.m13387yj() & 255;
        super.m13387yj();
        return new C5656k4(iM13387yj, iM13387yj2, iM13387yj3);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m46390k4() {
        return new C12025x6(super.m13381rv(), super.m13381rv());
    }

    /* JADX INFO: renamed from: kk */
    public final C12007ix m46393kk() {
        int[] iArrM46392k4 = m46392k4(4);
        return C12007ix.m56541k4(iArrM46392k4[0], iArrM46392k4[1], iArrM46392k4[2], iArrM46392k4[3]);
    }

    /* JADX INFO: renamed from: m9 */
    public final C12025x6[] m46394m9() {
        return m46397x1(super.m13382u4() & 65535);
    }

    /* JADX INFO: renamed from: to */
    public final C12007ix m46395to() {
        int[] iArrM46392k4 = m46392k4(4);
        return C12007ix.m56541k4(iArrM46392k4[3], iArrM46392k4[2], iArrM46392k4[1], iArrM46392k4[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m46396x1() {
        return new C12015qq(super.m13381rv(), super.m13381rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final String m46391k4(int i, AbstractC6747ar abstractC6747ar) {
        byte[] bArrM13372dy = super.m13372dy(i);
        int i2 = 0;
        while (i2 < i && (bArrM13372dy[i2] & 255) != 0) {
            i2++;
        }
        return abstractC6747ar.mo26682x1(bArrM13372dy, 0, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6[] m46397x1(int i) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i);
        for (int i2 = 0; i2 < i; i2++) {
            c12025x6Arr[i2] = new C12025x6(super.m13381rv(), super.m13381rv());
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m46392k4(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = super.m13381rv();
        }
        return iArr;
    }
}
