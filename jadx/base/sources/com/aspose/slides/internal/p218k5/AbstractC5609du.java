package com.aspose.slides.internal.p218k5;

import com.aspose.slides.internal.p040bg.AbstractC1697k4;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p349q3.C9684nv;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.k5.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5609du extends AbstractC1697k4 {
    public AbstractC5609du(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m22995k4(C12009k4 c12009k4, C12009k4 c12009k42, C12016rv c12016rv) {
        C12009k4 c12009k43;
        C12009k4 c12009k44;
        if (c12009k4.mo15753jd() != 2498570) {
            c12009k44 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k44);
            try {
                C3976c5 c3976c5 = new C3976c5();
                try {
                    c3976c5.m15673x1(3);
                    abstractC12008jdM56582k4.mo17476du(2);
                    abstractC12008jdM56582k4.mo17560kk(7);
                    c12009k43 = c12009k4;
                    abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) c12009k43, new C12014ne(0, 0, c12009k44.mo15760yj(), c12009k44.mo15757m9()), 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2, c3976c5);
                    abstractC12008jdM56582k4.dispose();
                } finally {
                    c3976c5.dispose();
                }
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } else {
            c12009k43 = c12009k4;
            c12009k44 = c12009k43;
        }
        C3983k4 c3983k4M56597k4 = c12009k43.m56597k4(new C12014ne(0, 0, c12009k43.mo15760yj(), c12009k43.mo15757m9()), 3, c12009k43.mo15753jd());
        C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 3, 196865);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
        int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15722x1();
        int[] iArr = new int[iM15716k4];
        int iM15716k42 = c3983k4M56597k42.m15716k4() * C14116yg.m67482k4(c3983k4M56597k42.m15715du());
        byte[] bArr = new byte[iM15716k42];
        C3914k4.m15619k4(c14112xwM15721to, iArr, 0, iM15716k4);
        C3914k4.m15618k4(c14112xwM15721to2, bArr, 0, iM15716k42);
        for (int i = 0; i < c3983k4M56597k4.m15716k4(); i++) {
            for (int i2 = 0; i2 < c3983k4M56597k4.m15722x1(); i2++) {
                int iM15722x1 = (c3983k4M56597k4.m15722x1() * i) + i2;
                int iM56708k4 = (c12016rv.m56708k4() + i2) % c12009k42.mo15760yj();
                int iM15715du = (c3983k4M56597k42.m15715du() * ((c12016rv.m56713x1() + i) % c12009k42.mo15757m9())) + (iM56708k4 >> 3);
                int i3 = ((byte) (128 >> (iM56708k4 & 7))) & 255;
                if ((bArr[iM15715du] & 255 & i3) != i3) {
                    iArr[iM15722x1] = 0;
                }
            }
        }
        C3914k4.m15622k4(iArr, 0, c14112xwM15721to, iM15716k4);
        c12009k43.m56605k4(c3983k4M56597k4);
        c12009k42.m56605k4(c3983k4M56597k42);
        return c12009k44;
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1697k4
    /* JADX INFO: renamed from: h4 */
    public void mo9143h4(C9723vw c9723vw, C3585h4 c3585h4) {
        mo12690k4((C9684nv) c9723vw, c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo12690k4(C9684nv c9684nv, C3585h4 c3585h4);
}
