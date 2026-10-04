package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class lho {

    /* JADX INFO: renamed from: du */
    private final float f45995du;

    /* JADX INFO: renamed from: h4 */
    private final int f45996h4;

    /* JADX INFO: renamed from: k4 */
    private final double f45997k4;

    /* JADX INFO: renamed from: kk */
    private final float f45998kk;

    /* JADX INFO: renamed from: to */
    private final double f45999to;

    /* JADX INFO: renamed from: x1 */
    private final C12003du f46000x1;

    public lho(IInnerShadow iInnerShadow) {
        C12003du c12003du = new C12003du();
        this.f46000x1 = c12003du;
        this.f45995du = 3.0f;
        this.f45996h4 = 4;
        if (iInnerShadow == null) {
            throw new ArgumentNullException("innerShadow");
        }
        this.f45997k4 = iInnerShadow.getBlurRadius();
        ((ColorFormat) iInnerShadow.getShadowColor()).m1084to().CloneTo(c12003du);
        this.f45998kk = iInnerShadow.getDirection();
        this.f45999to = iInnerShadow.getDistance();
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m64394k4(C12007ix c12007ix) {
        float f = this.f45998kk;
        float f2 = (float) this.f45999to;
        C12007ix c12007ixClone = c12007ix.Clone();
        float fOooO00o = C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd());
        float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck());
        C11913yj c11913yj = new C11913yj();
        if (f == 0.0f && f2 == 0.0f) {
            return c11913yj;
        }
        C11913yj c11913yj2 = new C11913yj();
        c11913yj2.m55766k4(f, new C12025x6(fOooO00o, fOooO0O0));
        c11913yj2.m55777kk(-f2, 0.0f);
        c11913yj2.m55766k4(-f, new C12025x6(fOooO00o, fOooO0O0));
        c11913yj.m55769k4(c11913yj2, 1);
        return c11913yj;
    }

    public lho(IInnerShadowEffectiveData iInnerShadowEffectiveData) {
        C12003du c12003du = new C12003du();
        this.f46000x1 = c12003du;
        this.f45995du = 3.0f;
        this.f45996h4 = 4;
        if (iInnerShadowEffectiveData == null) {
            throw new ArgumentNullException("innerShadowEffectiveData");
        }
        this.f45997k4 = iInnerShadowEffectiveData.getBlurRadius();
        ((zg0) iInnerShadowEffectiveData).m74518x1().CloneTo(c12003du);
        this.f45998kk = iInnerShadowEffectiveData.getDirection();
        this.f45999to = iInnerShadowEffectiveData.getDistance();
    }

    /* JADX INFO: renamed from: k4 */
    private void m64395k4(C12009k4 c12009k4, C12003du c12003du) {
        byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
        byte bM56501c5 = c12003du.m56501c5();
        byte bM56507jd = c12003du.m56507jd();
        byte bM56502ck = c12003du.m56502ck();
        byte bM56505fa = c12003du.m56505fa();
        float fM56501c5 = 1.0f - ((255 - (c12003du.m56501c5() & 255)) / 255.0f);
        int i = 0;
        while (i < bArrM70057k4.length) {
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = bArrM70057k4[i3] & 255;
            if (i6 != 0) {
                byte b = bArrM70057k4[i4];
                if (i6 == 255) {
                    if ((b & 255) == 255) {
                        bArrM70057k4[i4] = 0;
                    } else {
                        bArrM70057k4[i4] = C22202OooO0oo.OooO00o(255 - r14, fM56501c5, 13);
                    }
                } else {
                    if ((b & 255) == 255) {
                        bArrM70057k4[i4] = (byte) (255 - i6);
                    } else {
                        bArrM70057k4[i4] = C7019kk.m27442k4(Float.valueOf((255 - r15) * fM56501c5 * (i6 / 255.0f)), 13);
                    }
                }
            } else {
                bArrM70057k4[i4] = bM56501c5;
            }
            bArrM70057k4[i] = bM56505fa;
            bArrM70057k4[i2] = bM56502ck;
            bArrM70057k4[i3] = bM56507jd;
            i = i5;
        }
        C14381rb.m70053k4(c12009k4, bArrM70057k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64396k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, IShapeFrame iShapeFrame) {
        if (c11896dy == null) {
            throw new ArgumentNullException("graphicsPath is null");
        }
        if (c0962es == null || c0962es.m5681to() == 0) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
        float f = ((float) this.f45997k4) / 3.0f;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((c12007ixClone.m56550c5() / (c12007ixClone.m56550c5() + c12007ixClone.m56575x1())) * f) + 0.5f)), 14) + 2;
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((c12007ixClone.m56575x1() / (c12007ixClone.m56550c5() + c12007ixClone.m56575x1())) * f) + 0.5f)), 14) + 2;
        C11896dy c11896dy3 = (C11896dy) c11896dy.deepClone();
        c11896dy3.m55577x1(m64394k4(c12007ixClone.Clone()));
        C12007ix c12007ixClone2 = c11896dy3.m55523c5().Clone();
        float f2 = iM27462to;
        float f3 = iM27462to2;
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, (-c12007ixClone.m56557jd()) + f2, (-c12007ixClone.m56551ck()) + f3);
        c11896dy3.m55577x1(c11913yj);
        c11896dy2.m55577x1(c11913yj);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5() + (iM27462to * 2)), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1() + (iM27462to2 * 2)), 13);
        C12009k4 c12009k4 = new C12009k4(iM27462to3, iM27462to4, 2498570);
        try {
            if (abstractC14897zn.m74625qq() != null) {
                c12009k4.m56332k4(abstractC14897zn.m74625qq().mo15758up(), abstractC14897zn.m74625qq().mo15752dy());
            }
            AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
            try {
                abstractC12008jdM70048k4.mo17517k4(C12003du.f40505to.Clone());
                if (c0962es.m5681to() != 0) {
                    abstractC12008jdM70048k4.mo17527k4(new C11999ar(C12003du.m56398k4(c0962es.m5676k4().m56501c5() & 255, 255, 0, 0).Clone()), c11896dy3);
                }
                abstractC12008jdM70048k4.dispose();
                C12003du c12003duClone = this.f46000x1.Clone();
                if (c0962es.m5681to() == 1 && (c0962es.m5676k4().m56501c5() & 255) != 255) {
                    C12003du.m56400k4(C7019kk.m27462to(Float.valueOf(((c0962es.m5676k4().m56501c5() & 255) / 255.0f) * (c12003duClone.m56501c5() & 255)), 13), c12003duClone.Clone()).CloneTo(c12003duClone);
                }
                m64395k4(c12009k4, c12003duClone.Clone());
                if (c12007ixClone.m56569kk(c12007ixClone2.Clone())) {
                    C1234i0.m7347k4(c12009k4, f, 4, 3);
                }
                c12009k4 = new C12009k4(iM27462to3, iM27462to4, c12009k4.mo15753jd());
                try {
                    abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                    try {
                        abstractC12008jdM70048k4.mo17517k4(C12003du.f40505to.Clone());
                        C12012lr c12012lr = new C12012lr(c12009k4);
                        try {
                            abstractC12008jdM70048k4.mo17527k4(c12012lr, c11896dy2);
                            c12012lr.dispose();
                            abstractC14897zn.mo64339k4(c12009k4, c12007ixClone.m56557jd() - f2, c12007ixClone.m56551ck() - f3, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                            abstractC12008jdM70048k4.dispose();
                            c12009k4.dispose();
                        } catch (Throwable th) {
                            c12012lr.dispose();
                            throw th;
                        }
                    } finally {
                    }
                } finally {
                    c12009k4.dispose();
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
