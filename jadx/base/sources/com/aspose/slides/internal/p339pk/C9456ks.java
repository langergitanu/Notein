package com.aspose.slides.internal.p339pk;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C9456ks extends C3134k4 {
    public C9456ks(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12025x6[][] m46360c5() {
        int iM13386x6 = super.m13386x6();
        super.m13386x6();
        C12025x6[][] c12025x6Arr = new C12025x6[iM13386x6][];
        int[] iArrM46368k4 = m46368k4(iM13386x6);
        for (int i = 0; i < iM13386x6; i++) {
            c12025x6Arr[i] = m46362du(iArrM46368k4[i]);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: du */
    public final C5656k4 m46361du() {
        int iM13387yj = super.m13387yj() & 255;
        int iM13387yj2 = super.m13387yj() & 255;
        int iM13387yj3 = super.m13387yj() & 255;
        super.m13387yj();
        return new C5656k4(iM13387yj, iM13387yj2, iM13387yj3);
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6[][] m46363dy() {
        int iM13386x6 = super.m13386x6();
        super.m13386x6();
        C12025x6[][] c12025x6Arr = new C12025x6[iM13386x6][];
        int[] iArrM46368k4 = m46368k4(iM13386x6);
        for (int i = 0; i < iM13386x6; i++) {
            c12025x6Arr[i] = m46373to(iArrM46368k4[i]);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: h4 */
    public final int[] m46364h4(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = super.m13387yj() & 255;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: jd */
    public final C4317dy m46366jd() {
        return new C4317dy(m13374ix(), m13374ix(), m13374ix(), m13374ix(), m13374ix(), m13374ix());
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m46367k4() {
        return m46368k4(super.m13386x6());
    }

    /* JADX INFO: renamed from: kk */
    public final C12015qq m46369kk() {
        return new C12015qq(super.m13386x6(), super.m13386x6());
    }

    /* JADX INFO: renamed from: m9 */
    public final C12025x6[] m46371m9() {
        return m46362du(super.m13386x6());
    }

    /* JADX INFO: renamed from: to */
    public final C12007ix m46372to() {
        return C12007ix.m56541k4(m13386x6(), m13386x6(), m13386x6(), m13386x6());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m46374x1() {
        return new C12025x6(super.m13386x6(), super.m13386x6());
    }

    /* JADX INFO: renamed from: du */
    public final C12025x6[] m46362du(int i) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i);
        for (int i2 = 0; i2 < i; i2++) {
            c12025x6Arr[i2] = new C12025x6(super.m13381rv(), super.m13381rv());
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12025x6[] m46365h4() {
        return m46373to(super.m13386x6());
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m46368k4(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = super.m13386x6();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: kk */
    public final String m46370kk(int i) {
        int i2 = i * 2;
        byte[] bArrM13372dy = super.m13372dy(i2);
        int i3 = 0;
        while (i3 < i2 && ((bArrM13372dy[i3] & 255) != 0 || (bArrM13372dy[i3 + 1] & 255) != 0)) {
            i3 += 2;
        }
        return AbstractC6747ar.m26643rv().mo26682x1(bArrM13372dy, 0, i3);
    }

    /* JADX INFO: renamed from: to */
    public final C12025x6[] m46373to(int i) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i);
        for (int i2 = 0; i2 < i; i2++) {
            c12025x6Arr[i2] = new C12025x6(super.m13386x6(), super.m13386x6());
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m46375x1(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = super.m13381rv();
        }
        return iArr;
    }
}
