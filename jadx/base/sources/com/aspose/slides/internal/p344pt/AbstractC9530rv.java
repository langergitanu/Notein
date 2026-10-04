package com.aspose.slides.internal.p344pt;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p123f5.AbstractC3860to;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9530rv extends AbstractC3860to {
    /* JADX INFO: renamed from: k4 */
    public static int m46693k4(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        if (i == 0) {
            return i2;
        }
        if (i2 == 0 && i4 != 0) {
            i2 = i4;
        }
        long j2 = 4294967295L;
        long j3 = ((long) i) & 4294967295L;
        switch (i3) {
            case 1:
                j2 = 4278190080L;
                break;
            case 2:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i6 = i | i2;
                i8 = ~i6;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 3:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i = ~i;
                i8 = i & i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 4:
                i7 = ((~i) & 16777215) | (i2 & ViewCompat.MEASURED_STATE_MASK);
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 5:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i2 = ~i2;
                i8 = i & i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 6:
                i7 = (i2 & ViewCompat.MEASURED_STATE_MASK) | ((~i2) & 16777215);
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 7:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i8 = i ^ i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 8:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i6 = i & i2;
                i8 = ~i6;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 9:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i8 = i & i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 10:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i6 = i ^ i2;
                i8 = ~i6;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 11:
                j = i2;
                j2 = 4294967295L & j;
                break;
            case 12:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i = ~i;
                i8 = i | i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 13:
            default:
                j2 = j3;
                break;
            case 14:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i2 = ~i2;
                i8 = i | i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 15:
                i5 = i2 & ViewCompat.MEASURED_STATE_MASK;
                i8 = i | i2;
                i7 = (i8 & 16777215) | i5;
                j = i7;
                j2 = 4294967295L & j;
                break;
            case 16:
                break;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: kk */
    private void m46696kk(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c3856h4.m15518u4());
            try {
                abstractC12008jdM56582k4.mo17590x1(c3856h4.m15524wl().m56768x1());
                abstractC12008jdM56582k4.mo17588x1(abstractC12008jd.mo17577u4());
                mo46684x1(c4047sv, abstractC12008jdM56582k4, c3856h4);
                c3856h4.m15499k4(true);
                abstractC12008jdM56582k4.dispose();
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4);

    /* JADX INFO: renamed from: k4 */
    public static void m46694k4(C3856h4 c3856h4) {
        try {
            m46695k4(c3856h4.m15518u4(), c3856h4.m15511ne(), c3856h4);
        } finally {
            c3856h4.m15518u4().dispose();
            c3856h4.m15531x1((C12009k4) null);
            c3856h4.m15499k4(false);
        }
    }

    @Override // com.aspose.slides.internal.p123f5.AbstractC3860to
    /* JADX INFO: renamed from: k4 */
    public void mo15559k4(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            abstractC12008jd.mo17475du();
            abstractC12008jd.mo17590x1(c3856h4.m15524wl().m56768x1());
            abstractC12008jd.mo17500k4(c3856h4.m15538xk(), 0);
            if (c3856h4.m15511ne() != 11) {
                if (c3856h4.m15511ne() == 13 || (c3856h4.m15464c5() == null && c3856h4.m15472dy() == null)) {
                    mo46684x1(c4047sv, abstractC12008jd, c3856h4);
                } else {
                    if (c3856h4.m15479ix() == null) {
                        throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
                    }
                    m46696kk(c4047sv, abstractC12008jd, c3856h4);
                }
            }
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        } catch (Throwable th) {
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m46695k4(C12009k4 c12009k4, int i, C3856h4 c3856h4) {
        int iMo15760yj = c3856h4.m15479ix().mo15760yj();
        int iMo15757m9 = c3856h4.m15479ix().mo15757m9();
        int i2 = 0;
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
        C3983k4 c3983k4M56597k42 = c3856h4.m15479ix().m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 3, 2498570);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
        int i3 = iMo15760yj * iMo15757m9;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        C3914k4.m15619k4(c14112xwM15721to, iArr, 0, i3);
        C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, i3);
        int iM56506h4 = c3856h4.m15463bz().m17054kk().m56506h4();
        int i4 = 0;
        while (i4 < iMo15757m9) {
            for (int i5 = i2; i5 < iMo15760yj; i5++) {
                int i6 = (i4 * iMo15760yj) + i5;
                iArr2[i6] = m46693k4(iArr[i6], iArr2[i6], i, iM56506h4);
            }
            i4++;
            i2 = 0;
        }
        C3914k4.m15622k4(iArr2, i2, c14112xwM15721to2, i3);
        c12009k4.m56605k4(c3983k4M56597k4);
        c3856h4.m15479ix().m56605k4(c3983k4M56597k42);
    }
}
