package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.lbk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.z3 */
/* JADX INFO: loaded from: classes3.dex */
class C14871z3 {

    /* JADX INFO: renamed from: k4 */
    private C12003du f50473k4 = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private double f50474x1;

    public C14871z3(IGlow iGlow) {
        if (iGlow == null) {
            throw new ArgumentNullException("glowEffectiveData is null.");
        }
        ((ColorFormat) iGlow.getColor()).m1084to().CloneTo(this.f50473k4);
        this.f50474x1 = iGlow.getRadius();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m74296k4(C11896dy c11896dy) {
        if (c11896dy == null) {
            throw new ArgumentNullException("shapePath is null");
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        double d = this.f50474x1;
        c12007ixClone.m56563k4(new C12015qq(((float) d) / 2.0f, ((float) d) / 2.0f));
        return c12007ixClone;
    }

    public C14871z3(IGlowEffectiveData iGlowEffectiveData) {
        if (iGlowEffectiveData == null) {
            throw new ArgumentNullException("glowEffectiveData is null.");
        }
        ((C1241i6) iGlowEffectiveData).m7537x1().CloneTo(this.f50473k4);
        this.f50474x1 = iGlowEffectiveData.getRadius();
    }

    /* JADX INFO: renamed from: k4 */
    private void m74292k4(AbstractC12008jd abstractC12008jd, C11896dy c11896dy, C12003du c12003du, C11913yj c11913yj, C0962es c0962es, azo azoVar) {
        boolean zM74295k4 = m74295k4(c0962es);
        if (m74294k4(azoVar)) {
            C12026yj c12026yjM3930x6 = azoVar.m3930x6();
            try {
                c12026yjM3930x6.m56923k4(c12003du.Clone());
                c12026yjM3930x6.m56914h4(2);
                c12026yjM3930x6.m56932to(2);
                c12026yjM3930x6.m56909du(2);
                abstractC12008jd.mo17540k4(c12026yjM3930x6, c11896dy);
                c12026yjM3930x6.dispose();
            } catch (Throwable th) {
                if (c12026yjM3930x6 != null) {
                    c12026yjM3930x6.dispose();
                }
                throw th;
            }
        }
        if (zM74295k4) {
            AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
            try {
                C11913yj c11913yjM70045k4 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                c11913yjM70045k4.m55769k4(c11913yj, 1);
                C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yjM70045k4);
                abstractC12008jd.mo17527k4(abstractC12024x1M73548kk, c11896dy);
            } finally {
                if (abstractC12024x1M73548kk != null) {
                    abstractC12024x1M73548kk.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74293k4(C12009k4 c12009k4, C12003du c12003du, double d, boolean z) {
        byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
        int length = bArrM70057k4.length;
        int[] iArr = new int[length];
        byte bM56501c5 = c12003du.m56501c5();
        byte bM56505fa = c12003du.m56505fa();
        byte bM56502ck = c12003du.m56502ck();
        byte bM56507jd = c12003du.m56507jd();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArrM70057k4.length) {
            bArrM70057k4[i2] = bM56505fa;
            bArrM70057k4[i2 + 1] = bM56502ck;
            bArrM70057k4[i2 + 2] = bM56507jd;
            int i4 = i2 + 3;
            if ((bArrM70057k4[i4] & 255) == 255) {
                bArrM70057k4[i4] = bM56501c5;
            }
            iArr[i3] = bArrM70057k4[i4] & 255;
            i2 += 4;
            i3++;
        }
        double d2 = this.f50474x1;
        float f = d2 <= ((double) 6.0f) ? (((float) (d2 * 0.2d)) / 6.0f) + 0.8f : 1.0f;
        float f2 = 5.3f * f;
        float f3 = f * 6.0f;
        int[] iArr2 = new int[length];
        C1234i0.m7348k4(iArr, iArr2, c12009k4.mo15760yj(), c12009k4.mo15757m9(), d / ((double) f2), 3);
        int iM56501c5 = c12003du.m56501c5() & 255;
        for (int i5 = 0; i5 < length; i5++) {
            if (iArr2[i5] != 0) {
                iArr2[i5] = iM56501c5;
            }
        }
        C1234i0.m7348k4(iArr2, iArr, c12009k4.mo15760yj(), c12009k4.mo15757m9(), d / ((double) f3), 3);
        int i6 = 3;
        while (i6 < bArrM70057k4.length) {
            bArrM70057k4[i6] = (byte) iArr[i];
            i6 += 4;
            i++;
        }
        C14381rb.m70053k4(c12009k4, bArrM70057k4);
        if (z) {
            C12556ck.m58568k4(c12009k4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #2 {all -> 0x010a, blocks: (B:33:0x0103, B:47:0x0119, B:48:0x011c), top: B:58:0x00be }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.aspose.slides.z3] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.aspose.slides.ms.System.IDisposable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.aspose.slides.zn, java.lang.Object] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m74297k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar) {
        AbstractC12008jd abstractC12008jd;
        ?? r1 = this;
        if (c11896dy == null || c11896dy.m55525du() == 0 || r1.f50474x1 <= 0.5f) {
            return;
        }
        float[] fArrM55776k4 = abstractC14897zn.m74608ar().mo17577u4().m55776k4();
        float fM67481k4 = C14116yg.m67481k4(fArrM55776k4[0], fArrM55776k4[3]);
        if (r1.f50474x1 <= 1.0f && fM67481k4 < 2.0f) {
            return;
        }
        boolean zM74295k4 = r1.m74295k4(c0962es);
        boolean zM74294k4 = r1.m74294k4(azoVar);
        if (!zM74295k4 && !zM74294k4) {
            return;
        }
        float fM3906k4 = (azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4();
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
        float f = (float) (((double) fM3906k4) + r1.f50474x1);
        C12025x6 c12025x6 = new C12025x6((c12007ixClone.m56557jd() - f) + 0.5f, (c12007ixClone.m56551ck() - f) + 0.5f);
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        c11896dy2.m55577x1(c11913yj);
        float f2 = f * 2.0f;
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(c12007ixClone.m56550c5() + f2, 14), OooO.OooO00o(c12007ixClone.m56575x1() + f2, 14));
        try {
            try {
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, (AbstractC14897zn) abstractC14897zn);
                try {
                    abstractC12008jdM70048k4.mo17517k4(C12003du.m56396k4(0).Clone());
                    r1.m74292k4(abstractC12008jdM70048k4, c11896dy2, r1.f50473k4.Clone(), c11913yj, c0962es, azoVar);
                    abstractC12008jd = abstractC12008jdM70048k4;
                    try {
                        try {
                            r1.m74293k4(c12009k4, r1.f50473k4.Clone(), r1.f50474x1, C7019kk.m27469x1((Object) abstractC14897zn, omq.class));
                            try {
                                abstractC14897zn.mo64339k4(c12009k4, c12025x6.m56897x1(), c12025x6.m56895kk(), c12009k4.mo15760yj(), c12009k4.mo15757m9());
                                abstractC12008jd.dispose();
                                c12009k4.dispose();
                            } catch (Throwable th) {
                                th = th;
                                if (abstractC12008jd != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (abstractC12008jd != null) {
                            abstractC12008jd.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC12008jd = abstractC12008jdM70048k4;
                }
            } catch (Throwable th5) {
                th = th5;
                r1.dispose();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r1 = c12009k4;
            r1.dispose();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0151 A[Catch: all -> 0x013e, TRY_ENTER, TryCatch #7 {all -> 0x013e, blocks: (B:62:0x0151, B:63:0x0154, B:49:0x013a), top: B:72:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[Catch: all -> 0x013e, SYNTHETIC, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:62:0x0151, B:63:0x0154, B:49:0x013a), top: B:72:0x009c }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m74298k4(AbstractC14897zn abstractC14897zn, lbk.C13770k4[] c13770k4Arr) throws Throwable {
        AbstractC12008jd abstractC12008jd;
        Throwable th;
        if (c13770k4Arr == null) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        int i = 0;
        float fM67481k4 = 0.0f;
        for (lbk.C13770k4 c13770k4 : c13770k4Arr) {
            if (c13770k4.m64349k4() != null && c13770k4.m64349k4().m55525du() > 0) {
                c11896dy.m55540k4(c13770k4.m64349k4(), false);
                if (c13770k4.m64350kk() != null && c13770k4.m64350kk().m3903h4()) {
                    fM67481k4 = C14116yg.m67481k4(fM67481k4, (float) c13770k4.m64350kk().m3906k4());
                }
            }
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        float f = (float) (((double) fM67481k4) + this.f50474x1);
        C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56557jd() - f, c12007ixClone.m56551ck() - f);
        C12009k4 c12009k4 = null;
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        float f2 = f * 2.0f;
        C12009k4 c12009k42 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5() + f2), 13), C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1() + f2), 13));
        try {
            try {
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k42, abstractC14897zn);
                try {
                    if (abstractC14897zn.m74608ar() != null) {
                        try {
                            c12009k42.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC12008jd = abstractC12008jdM70048k4;
                            if (abstractC12008jd == null) {
                            }
                        }
                    }
                    int length = c13770k4Arr.length;
                    while (i < length) {
                        try {
                            lbk.C13770k4 c13770k42 = c13770k4Arr[i];
                            C0962es c0962esCloneT = c13770k42.m64351x1() != null ? c13770k42.m64351x1().cloneT() : null;
                            azo azoVarCloneT = c13770k42.m64350kk() != null ? c13770k42.m64350kk().cloneT() : null;
                            C11896dy c11896dy2 = (C11896dy) c13770k42.m64349k4().deepClone();
                            c11896dy2.m55577x1(c11913yj);
                            C11913yj c11913yj2 = c11913yj;
                            try {
                                m74292k4(abstractC12008jdM70048k4, c11896dy2, this.f50473k4.Clone(), c11913yj2, c0962esCloneT, azoVarCloneT);
                                i++;
                                abstractC12008jdM70048k4 = abstractC12008jdM70048k4;
                                c11913yj = c11913yj2;
                            } catch (Throwable th3) {
                                th = th3;
                                abstractC12008jd = abstractC12008jdM70048k4;
                                th = th;
                                if (abstractC12008jd == null) {
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    abstractC12008jd = abstractC12008jdM70048k4;
                    try {
                        try {
                            m74293k4(c12009k42, this.f50473k4.Clone(), this.f50474x1, C7019kk.m27469x1(abstractC14897zn, omq.class));
                            abstractC14897zn.mo64339k4(c12009k42, c12025x6.m56897x1(), c12025x6.m56895kk(), c12009k42.mo15760yj(), c12009k42.mo15757m9());
                            if (abstractC12008jd != null) {
                                abstractC12008jd.dispose();
                            }
                            c12009k42.dispose();
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            if (abstractC12008jd == null) {
                                throw th;
                            }
                            abstractC12008jd.dispose();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    abstractC12008jd = abstractC12008jdM70048k4;
                }
            } catch (Throwable th8) {
                th = th8;
                c12009k4 = c12009k42;
                Throwable th9 = th;
                c12009k4.dispose();
                throw th9;
            }
        } catch (Throwable th10) {
            th = th10;
            Throwable th92 = th;
            c12009k4.dispose();
            throw th92;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74294k4(azo azoVar) {
        if (azoVar == null || !azoVar.m3903h4() || azoVar.m3917ne().m5681to() == 0) {
            return false;
        }
        return azoVar.m3917ne().m5681to() != 1 || (azoVar.m3917ne().m5676k4().m56501c5() & 255) > 1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74295k4(C0962es c0962es) {
        if (c0962es == null || c0962es.m5681to() == 0) {
            return false;
        }
        return c0962es.m5681to() != 1 || (c0962es.m5676k4().m56501c5() & 255) > 1;
    }
}
