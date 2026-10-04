package com.aspose.slides.internal.p309o2;

import Oooo0.C20855OooooOO;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p348q1.C9610kk;
import com.aspose.slides.internal.p348q1.C9612x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.o2.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6971to extends AbstractC6972x1 {

    /* JADX INFO: renamed from: du */
    private int f18968du;

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f18969k4;

    /* JADX INFO: renamed from: kk */
    private C7186k4 f18970kk;

    /* JADX INFO: renamed from: to */
    private int[][] f18971to;

    /* JADX INFO: renamed from: x1 */
    private C7186k4 f18972x1;

    public C6971to(C7185jd c7185jd) {
        super(c7185jd);
    }

    /* JADX INFO: renamed from: du */
    private C7186k4 m27255du() {
        if (this.f18972x1 == null) {
            C7186k4 c7186k4 = (C7186k4) m27273m9().mo27768h4(C7182dy.f19381dc);
            this.f18972x1 = c7186k4;
            if (c7186k4 == null) {
                this.f18972x1 = m27267fa();
            }
        }
        return this.f18972x1;
    }

    /* JADX INFO: renamed from: to */
    private C7186k4 m27256to() {
        if (this.f18969k4 == null) {
            C7186k4 c7186k4 = (C7186k4) m27273m9().mo27768h4(C7182dy.f19736zd);
            this.f18969k4 = c7186k4;
            if (c7186k4 == null) {
                this.f18969k4 = new C7186k4();
                int iM27778k4 = m27258k4().m27778k4();
                for (int i = 0; i < iM27778k4; i++) {
                    this.f18969k4.m27783k4(C7189m9.m27821k4());
                    this.f18969k4.m27783k4(C7189m9.m27822k4(r0.m27786to(i) - 1));
                }
            }
        }
        return this.f18969k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m27257k4(AbstractC3150x6 abstractC3150x6, int i) {
        if (!abstractC3150x6.canRead() || i < 0 || i > 64) {
            return -1L;
        }
        long j = 0;
        if (i == 0) {
            return 0L;
        }
        int i2 = this.f18968du;
        int i3 = i + i2;
        int i4 = (i2 + i) & 7;
        while (i3 > 0) {
            int i5 = abstractC3150x6.readByte();
            if (i5 == -1) {
                return -1L;
            }
            j = (j << 8) | ((long) i5);
            i3 -= 8;
        }
        if (i4 != 0) {
            abstractC3150x6.seek(abstractC3150x6.getPosition() - 1, 0);
        }
        this.f18968du = i4;
        return ((-1) >> (64 - i)) & (C7019kk.m27461m9(Long.valueOf(j), 11) >> (-i3));
    }

    /* JADX INFO: renamed from: kk */
    public final C9612x1 m27259kk(int i) {
        C7186k4 c7186k4M27256to = m27256to();
        if (c7186k4M27256to == null || c7186k4M27256to.m27778k4() < (i * 2) + 1) {
            return null;
        }
        return new C9612x1(c7186k4M27256to, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m27262x1() {
        return m27273m9().m27790c5(C7182dy.f19360bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m27258k4() {
        if (this.f18970kk == null) {
            this.f18970kk = (C7186k4) m27273m9().mo27768h4(C7182dy.f19495kf);
        }
        return this.f18970kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int[][] m27260kk() {
        if (this.f18971to == null) {
            int iM27268jd = m27268jd();
            int iM27265ck = m27265ck();
            C7186k4 c7186k4M27258k4 = m27258k4();
            int iM27786to = 1;
            for (int i = 0; i < iM27268jd; i++) {
                iM27786to *= c7186k4M27258k4.m27786to(i);
            }
            this.f18971to = new int[iM27786to][];
            int i2 = 0;
            while (true) {
                int[][] iArr = this.f18971to;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = new int[iM27265ck];
                i2++;
            }
            int iM27262x1 = m27262x1();
            try {
                AbstractC3150x6 abstractC3150x6Mo27760kk = m27266dy().m46156x1().mo27760kk();
                abstractC3150x6Mo27760kk.seek(0L, 0);
                this.f18968du = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < iM27786to; i4++) {
                    for (int i5 = 0; i5 < iM27265ck; i5++) {
                        this.f18971to[i3][i5] = (int) m27257k4(abstractC3150x6Mo27760kk, iM27262x1);
                    }
                    i3++;
                }
            } catch (IOException unused) {
            }
        }
        return this.f18971to;
    }

    /* JADX INFO: renamed from: to */
    public final C9612x1 m27261to(int i) {
        C7186k4 c7186k4M27255du = m27255du();
        if (c7186k4M27255du == null || c7186k4M27255du.m27778k4() < (i * 2) + 1) {
            return null;
        }
        return new C9612x1(c7186k4M27255du, i);
    }

    @Override // com.aspose.slides.internal.p309o2.AbstractC6972x1
    /* JADX INFO: renamed from: k4 */
    public float[] mo27241k4(float[] fArr) {
        C6971to c6971to = this;
        float[] fArrM27788x1 = c6971to.m27258k4().m27788x1();
        float fM67469du = (float) (C14116yg.m67469du(2.0d, c6971to.m27262x1()) - 1.0d);
        int length = fArr.length;
        int iM27265ck = c6971to.m27265ck();
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (i < length) {
            C9612x1 c9612x1M27274x1 = c6971to.m27274x1(i);
            C9612x1 c9612x1M27259kk = c6971to.m27259kk(i);
            float fM27269k4 = c6971to.m27269k4(fArr[i], c9612x1M27274x1.m46940k4(), c9612x1M27274x1.m46941x1());
            fArr[i] = fM27269k4;
            float fM27270k4 = c6971to.m27270k4(fM27269k4, c9612x1M27274x1.m46940k4(), c9612x1M27274x1.m46941x1(), c9612x1M27259kk.m46940k4(), c9612x1M27259kk.m46941x1());
            C6971to c6971to2 = c6971to;
            fArr[i] = fM27270k4;
            float fM27269k42 = c6971to2.m27269k4(fM27270k4, 0.0f, fArrM27788x1[i] - 1.0f);
            fArr[i] = fM27269k42;
            iArr[i] = C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(fM27269k42)), 14);
            iArr2[i] = C20855OooooOO.OooO0O0(fArr[i], 14);
            i++;
            c6971to = c6971to2;
        }
        C6971to c6971to3 = c6971to;
        float[] fArrM46937k4 = new C9610kk(fArr, iArr, iArr2, iM27265ck, c6971to3.m27258k4(), c6971to3.m27260kk()).m46937k4();
        for (int i2 = 0; i2 < iM27265ck; i2++) {
            C9612x1 c9612x1M27272k4 = c6971to3.m27272k4(i2);
            C9612x1 c9612x1M27261to = c6971to3.m27261to(i2);
            float fM27270k42 = c6971to3.m27270k4(fArrM46937k4[i2], 0.0f, fM67469du, c9612x1M27261to.m46940k4(), c9612x1M27261to.m46941x1());
            fArrM46937k4[i2] = fM27270k42;
            fArrM46937k4[i2] = c6971to3.m27269k4(fM27270k42, c9612x1M27272k4.m46940k4(), c9612x1M27272k4.m46941x1());
        }
        return fArrM46937k4;
    }
}
