package com.aspose.slides.internal.p296nd;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p441ui.AbstractC11319to;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11316k4;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p533yv.C13335k4;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.rv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6841rv extends AbstractC11319to {
    /* JADX INFO: renamed from: k4 */
    public static int m26878k4(int i, int i2, int i3, int i4) {
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
    private void m26880kk(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        int i;
        int i2;
        int iMo15760yj = c11315h4.m54409ix().mo15760yj();
        int iMo15757m9 = c11315h4.m54409ix().mo15757m9();
        new C11316k4();
        C12014ne c12014neClone = C12014ne.f40546k4.Clone();
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            C12009k4 c12009k4 = new C12009k4(iMo15760yj, iMo15757m9);
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17590x1(c11315h4.m54448u4().m56768x1());
                    abstractC12008jdM56582k4.mo17588x1(abstractC12008jd.mo17577u4());
                    C11316k4 c11316k4Mo23714k4 = C13335k4.m61989k4(c1752sv.m9405yj()).mo23714k4(c1752sv, abstractC12008jd, c11315h4);
                    mo26875x1(c1752sv, abstractC12008jdM56582k4, c11315h4);
                    abstractC12008jdM56582k4.dispose();
                    if (c11316k4Mo23714k4.m54474x1()) {
                        m26879k4(new C12018u4(c11316k4Mo23714k4.m54472k4().Clone()), abstractC12008jd, c11315h4).CloneTo(c12014neClone);
                    }
                    C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 1, 2498570);
                    C3983k4 c3983k4M56597k42 = c11315h4.m54409ix().m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 3, 2498570);
                    C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
                    C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
                    int i3 = iMo15760yj * iMo15757m9;
                    int[] iArr = new int[i3];
                    int[] iArr2 = new int[i3];
                    C3914k4.m15619k4(c14112xwM15721to, iArr, 0, i3);
                    C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, i3);
                    int iM56666dy = c12014neClone.m56666dy();
                    int iM56670k4 = c12014neClone.m56670k4();
                    int iM56681to = c12014neClone.m56681to();
                    int iM56668h4 = c12014neClone.m56668h4();
                    int iM54441ne = c11315h4.m54441ne();
                    int iM56506h4 = c11315h4.m54447ts().m22904x1().m56506h4();
                    while (iM56666dy <= iM56670k4) {
                        int i4 = iM56670k4;
                        int i5 = iM56681to;
                        while (i5 <= iM56668h4) {
                            if (iM56666dy < 0 || iM56666dy >= iMo15757m9 || i5 < 0 || i5 >= iMo15760yj) {
                                i = iMo15760yj;
                                i2 = iMo15757m9;
                            } else {
                                int i6 = (iM56666dy * iMo15760yj) + i5;
                                i = iMo15760yj;
                                i2 = iMo15757m9;
                                iArr2[i6] = m26878k4(iArr[i6], iArr2[i6], iM54441ne, iM56506h4);
                            }
                            i5++;
                            iMo15760yj = i;
                            iMo15757m9 = i2;
                        }
                        iM56666dy++;
                        iM56670k4 = i4;
                    }
                    C3914k4.m15622k4(iArr2, 0, c14112xwM15721to2, i3);
                    c12009k4.m56605k4(c3983k4M56597k4);
                    c11315h4.m54409ix().m56605k4(c3983k4M56597k42);
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

    /* JADX INFO: renamed from: x1 */
    public abstract void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4);

    /* JADX INFO: renamed from: k4 */
    private C12014ne m26879k4(C12018u4 c12018u4, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12014ne c12014neClone = C12014ne.f40546k4.Clone();
        if (c11315h4.m54441ne() != 11 && c11315h4.m54441ne() != 13) {
            c12018u4.m56771x1(abstractC12008jd.mo17577u4());
            C12018u4 c12018u4M56768x1 = abstractC12008jd.mo17480h4().m56768x1();
            c12018u4M56768x1.m56771x1(abstractC12008jd.mo17577u4());
            c12018u4.m56761kk(c12018u4M56768x1);
            C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
            abstractC12008jd.mo17475du();
            abstractC12008jd.mo17573to();
            C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone()).CloneTo(c12014neClone);
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
        return c12014neClone;
    }

    @Override // com.aspose.slides.internal.p441ui.AbstractC11319to
    /* JADX INFO: renamed from: k4 */
    public void mo26873k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        try {
            C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
            abstractC12008jd.mo17475du();
            abstractC12008jd.mo17590x1(c11315h4.m54448u4().m56768x1());
            abstractC12008jd.mo17588x1(c11913yjMo17577u4);
            abstractC12008jd.mo17500k4(c11315h4.m54391ak(), 0);
            if (c11315h4.m54441ne() != 11) {
                if (c11315h4.m54441ne() == 13 || (c11315h4.m54395c5() == null && c11315h4.m54403dy() == null)) {
                    mo26875x1(c1752sv, abstractC12008jd, c11315h4);
                } else {
                    if (c11315h4.m54409ix() == null) {
                        throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
                    }
                    m26880kk(c1752sv, abstractC12008jd, c11315h4);
                }
            }
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        } catch (Throwable th) {
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
            throw th;
        }
    }
}
