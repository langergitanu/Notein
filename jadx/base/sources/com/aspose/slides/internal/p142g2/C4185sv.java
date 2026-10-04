package com.aspose.slides.internal.p142g2;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p191it.AbstractC5129up;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.g2.sv */
/* JADX INFO: loaded from: classes.dex */
public class C4185sv extends AbstractC5129up {

    /* JADX INFO: renamed from: kk */
    private C11893c5 f11362kk;

    public C4185sv(AbstractC5120du abstractC5120du) {
        super(abstractC5120du);
        this.f11362kk = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public static int m16640k4(int i, int i2, int i3, int i4) {
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

    @Override // com.aspose.slides.internal.p191it.AbstractC5129up
    /* JADX INFO: renamed from: kk */
    public void mo16645kk(C5061vw c5061vw, C4201h4 c4201h4) throws Throwable {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        abstractC12008jd.mo17475du();
        abstractC12008jd.mo17590x1(c4201h4.m16744s7().m56768x1());
        abstractC12008jd.mo17588x1(c11913yjMo17577u4);
        abstractC12008jd.mo17499k4(c4201h4.m16760vj());
        C12018u4 c12018u4M56768x1 = c4201h4.m16695gi().m56768x1();
        C11913yj c11913yjM16760vj = c4201h4.m16760vj();
        c11913yjM16760vj.m55780m9();
        c12018u4M56768x1.m56771x1(c11913yjM16760vj);
        abstractC12008jd.mo17522k4(c12018u4M56768x1);
        if (c4201h4.m16736lr() != 11) {
            if (c4201h4.m16736lr() == 13 || ((c4201h4.m16688dy() == null && c4201h4.m16679c5() == null) || !this.f14078x1.mo21988k4(c5061vw, c4201h4))) {
                this.f14077k4.mo21987k4(c5061vw, c4201h4);
            } else {
                if (c4201h4.m16694g8() == null) {
                    throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
                }
                m16641k4(c5061vw, abstractC12008jd, c4201h4);
            }
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5129up
    /* JADX INFO: renamed from: x1 */
    public void mo16646x1(C5061vw c5061vw, C4201h4 c4201h4) {
        ((AbstractC12008jd) c4201h4.m16701k4()).mo17496k4(this.f11362kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11893c5 m16642k4() {
        return this.f11362kk;
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5129up
    /* JADX INFO: renamed from: k4 */
    public void mo16643k4(C5061vw c5061vw, C4201h4 c4201h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        this.f11362kk = abstractC12008jd.mo17583x1();
        if (c4201h4.f11386du) {
            if (!c4201h4.m16778xw().m22898dy().m67302x1()) {
                abstractC12008jd.mo17481h4(3);
            }
            if (!c4201h4.m16778xw().m22897du().m67302x1()) {
                abstractC12008jd.mo17586x1(0);
            }
            if (!c4201h4.m16778xw().m22899h4().m67302x1()) {
                abstractC12008jd.mo17560kk(3);
            }
            if (c4201h4.m16778xw().m22902m9().m67302x1()) {
                return;
            }
            abstractC12008jd.mo17476du(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16641k4(C5061vw c5061vw, AbstractC12008jd abstractC12008jd, C4201h4 c4201h4) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        int iMo15760yj = c4201h4.m16694g8().mo15760yj();
        int iMo15757m9 = c4201h4.m16694g8().mo15757m9();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            try {
                C12009k4 c12009k4 = new C12009k4(iMo15760yj, iMo15757m9);
                try {
                    try {
                        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                        try {
                            abstractC12008jdM56582k4.mo17590x1(c4201h4.m16744s7().m56768x1());
                            abstractC12008jdM56582k4.mo17588x1(abstractC12008jd.mo17577u4());
                            abstractC12008jd2 = (AbstractC12008jd) c4201h4.m16701k4();
                            c4201h4.m16723k4(abstractC12008jdM56582k4);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            this.f14077k4.mo21987k4(c5061vw, c4201h4);
                            c4201h4.m16723k4(abstractC12008jd2);
                            abstractC12008jdM56582k4.dispose();
                            int i = 0;
                            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                            C3983k4 c3983k4M56597k42 = c4201h4.m16694g8().m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 3, 2498570);
                            C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                            C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
                            int i2 = iMo15760yj * iMo15757m9;
                            int[] iArr = new int[i2];
                            int[] iArr2 = new int[i2];
                            C3914k4.m15619k4(c14112xwM15721to, iArr, 0, i2);
                            C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, i2);
                            int iM56506h4 = c4201h4.m16778xw().m22904x1().m56506h4();
                            int i3 = 0;
                            while (i3 < iMo15757m9) {
                                while (i < iMo15760yj) {
                                    int i4 = (i3 * iMo15760yj) + i;
                                    iArr2[i4] = m16640k4(iArr[i4], iArr2[i4], c4201h4.m16736lr(), iM56506h4);
                                    i++;
                                    iMo15760yj = iMo15760yj;
                                    iMo15757m9 = iMo15757m9;
                                }
                                i3++;
                                i = 0;
                            }
                            C3914k4.m15622k4(iArr2, i, c14112xwM15721to2, i2);
                            c12009k4.m56605k4(c3983k4M56597k4);
                            c4201h4.m16694g8().m56605k4(c3983k4M56597k42);
                            c12009k4.dispose();
                            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                        } catch (Throwable th2) {
                            th = th2;
                            if (abstractC12008jdM56582k4 != null) {
                                abstractC12008jdM56582k4.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c12009k4.dispose();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c12009k4.dispose();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16644k4(C11893c5 c11893c5) {
        this.f11362kk = c11893c5;
    }
}
