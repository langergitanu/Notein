package com.aspose.slides.internal.p546zd;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.zd.sv */
/* JADX INFO: loaded from: classes5.dex */
public class C13551sv extends AbstractC1701up {

    /* JADX INFO: renamed from: k4 */
    private C11913yj f45120k4;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public static int m62698k4(int i, int i2, int i3, int i4) {
        int i5;
        long j;
        if (i == 0 || i3 == 11) {
            return i2;
        }
        if (i2 == 0) {
            i2 = i4 != 0 ? i4 : 854796;
        }
        long j2 = 4294967295L;
        long j3 = ((long) i) & 4294967295L;
        switch (i3) {
            case 1:
                j2 = 4278190080L;
                break;
            case 2:
                i |= i2;
                i5 = ~i;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 3:
                i = ~i;
                i5 = i & i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 4:
                i5 = ~i;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 5:
                i2 = ~i2;
                i5 = i & i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 6:
                i5 = ~i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 7:
                i5 = i ^ i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 8:
                i &= i2;
                i5 = ~i;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 9:
                i5 = i & i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 10:
                i ^= i2;
                i5 = ~i;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 11:
                j = i2;
                j2 = 4294967295L & j;
                break;
            case 12:
                i = ~i;
                i5 = i | i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 13:
            default:
                j2 = j3;
                break;
            case 14:
                i2 = ~i2;
                i5 = i | i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 15:
                i5 = i | i2;
                j = i5 | ViewCompat.MEASURED_STATE_MASK;
                j2 = 4294967295L & j;
                break;
            case 16:
                break;
        }
        return (int) j2;
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1701up
    /* JADX INFO: renamed from: x1 */
    public void mo7761x1(C9723vw c9723vw, C3585h4 c3585h4) {
        ((AbstractC12008jd) c3585h4.m14502k4()).mo17588x1(this.f45120k4);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1701up
    /* JADX INFO: renamed from: k4 */
    public void mo7759k4(C9723vw c9723vw, AbstractC1692du abstractC1692du, C3585h4 c3585h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c3585h4.m14502k4();
        boolean zM58571k4 = C12556ck.m58571k4(abstractC12008jd, c3585h4.m14544s7(), c3585h4.m14561vj(), c3585h4.f9906h4);
        if (c3585h4.f9906h4) {
            C12018u4 c12018u4M56768x1 = c3585h4.m14495gi().m56768x1();
            C11913yj c11913yjM14561vj = c3585h4.m14561vj();
            c11913yjM14561vj.m55780m9();
            c12018u4M56768x1.m56771x1(c11913yjM14561vj);
            C12556ck.m58565k4(abstractC12008jd, c12018u4M56768x1);
            c3585h4.f9906h4 = zM58571k4;
        }
        if (c3585h4.m14536lr() != 11) {
            if (c3585h4.m14536lr() == 13 || ((c3585h4.m14488dy() == null && c3585h4.m14479c5() == null) || !abstractC1692du.mo9136m9(c9723vw, c3585h4))) {
                abstractC1692du.mo7733h4(c9723vw, c3585h4);
            } else {
                if (c3585h4.m14494g8() == null) {
                    throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
                }
                m62699k4(c9723vw, abstractC1692du, abstractC12008jd, c3585h4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m62699k4(C9723vw c9723vw, AbstractC1692du abstractC1692du, AbstractC12008jd abstractC12008jd, C3585h4 c3585h4) {
        int iMo15760yj = c3585h4.m14494g8().mo15760yj();
        int iMo15757m9 = c3585h4.m14494g8().mo15757m9();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            C12009k4 c12009k4 = new C12009k4(iMo15760yj, iMo15757m9);
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17590x1(c3585h4.m14544s7().m56768x1());
                    abstractC12008jdM56582k4.mo17588x1(abstractC12008jd.mo17577u4());
                    Object obj = (AbstractC12008jd) c3585h4.m14502k4();
                    c3585h4.m14524k4(abstractC12008jdM56582k4);
                    abstractC1692du.mo7733h4(c9723vw, c3585h4);
                    c3585h4.m14524k4(obj);
                    abstractC12008jdM56582k4.dispose();
                    int i = 0;
                    C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                    C3983k4 c3983k4M56597k42 = c3585h4.m14494g8().m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 3, 2498570);
                    C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                    C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
                    int i2 = iMo15760yj * iMo15757m9;
                    int[] iArr = new int[i2];
                    int[] iArr2 = new int[i2];
                    C3914k4.m15619k4(c14112xwM15721to, iArr, 0, i2);
                    C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, i2);
                    int iM56506h4 = c3585h4.m14579xw().m17054kk().m56506h4();
                    int i3 = 0;
                    while (i3 < iMo15757m9) {
                        int i4 = i;
                        while (i4 < iMo15760yj) {
                            int i5 = (i3 * iMo15760yj) + i4;
                            iArr2[i5] = m62698k4(iArr[i5], iArr2[i5], c3585h4.m14536lr(), iM56506h4);
                            i4++;
                            iMo15760yj = iMo15760yj;
                        }
                        i3++;
                        i = 0;
                    }
                    C3914k4.m15622k4(iArr2, i, c14112xwM15721to2, i2);
                    c12009k4.m56605k4(c3983k4M56597k4);
                    c3585h4.m14494g8().m56605k4(c3983k4M56597k42);
                    c12009k4.dispose();
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c12009k4.dispose();
                throw th2;
            }
        } finally {
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1701up
    /* JADX INFO: renamed from: k4 */
    public void mo7760k4(C9723vw c9723vw, C3585h4 c3585h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c3585h4.m14502k4();
        this.f45120k4 = abstractC12008jd.mo17577u4();
        if (c3585h4.f9899du) {
            if (C14093tq.m67295k4(c3585h4.m14579xw().m17043c5(), null)) {
                abstractC12008jd.mo17481h4(3);
            }
            if (C14093tq.m67295k4(c3585h4.m14579xw().m17048h4(), null)) {
                abstractC12008jd.mo17586x1(0);
            }
            if (C14093tq.m67295k4(c3585h4.m14579xw().m17056m9(), null)) {
                abstractC12008jd.mo17560kk(3);
            }
            if (C14093tq.m67295k4(c3585h4.m14579xw().m17047dy(), null)) {
                abstractC12008jd.mo17476du(0);
            }
        }
    }
}
