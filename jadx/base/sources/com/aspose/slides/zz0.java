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
class zz0 {

    /* JADX INFO: renamed from: k4 */
    private IInnerShadowEffectiveData f50768k4;

    /* JADX INFO: renamed from: x1 */
    private final float f50771x1 = 116.0f;

    /* JADX INFO: renamed from: kk */
    private final float f50769kk = 3.0f;

    /* JADX INFO: renamed from: to */
    private final int f50770to = 4;

    public zz0(IInnerShadowEffectiveData iInnerShadowEffectiveData) {
        this.f50768k4 = iInnerShadowEffectiveData;
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m74889k4(C12007ix c12007ix, float f) {
        float direction = this.f50768k4.getDirection();
        float distance = (float) ((this.f50768k4.getDistance() * ((double) f)) / 116.0d);
        C12007ix c12007ixClone = c12007ix.Clone();
        float fOooO00o = C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd());
        float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck());
        C11913yj c11913yj = new C11913yj();
        if (direction == 0.0f && distance == 0.0f) {
            return c11913yj;
        }
        C11913yj c11913yj2 = new C11913yj();
        c11913yj2.m55766k4(direction, new C12025x6(fOooO00o, fOooO0O0));
        c11913yj2.m55777kk(-distance, 0.0f);
        c11913yj2.m55766k4(-direction, new C12025x6(fOooO00o, fOooO0O0));
        c11913yj.m55769k4(c11913yj2, 1);
        return c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74890k4(C12009k4 c12009k4, C12003du c12003du) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.aspose.slides.zn] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.aspose.slides.internal.w8.dy] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.aspose.slides.ms.System.IDisposable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.aspose.slides.internal.wh.jd, com.aspose.slides.ms.System.IDisposable] */
    /* JADX INFO: renamed from: k4 */
    public final void m74891k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, qy7 qy7Var) {
        C0962es c0962esM69907kk;
        C12012lr c12012lr;
        if (c11896dy == null) {
            throw new ArgumentNullException("graphicsPath is null");
        }
        if (c11896dy.m55525du() == 0 || (c0962esM69907kk = qy7Var.m69907kk()) == null || c0962esM69907kk.m5681to() == 0) {
            return;
        }
        ?? r3 = (C11896dy) c11896dy.deepClone();
        C12007ix c12007ixClone = r3.m55523c5().Clone();
        float blurRadius = ((((float) this.f50768k4.getBlurRadius()) / 3.0f) * qy7Var.m69915rv()) / 116.0f;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((c12007ixClone.m56550c5() / (c12007ixClone.m56550c5() + c12007ixClone.m56575x1())) * blurRadius)), 14) + 2;
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((c12007ixClone.m56575x1() / (c12007ixClone.m56550c5() + c12007ixClone.m56575x1())) * blurRadius)), 14) + 2;
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        c11896dy2.m55577x1(m74889k4(c12007ixClone.Clone(), qy7Var.m69915rv()));
        float f = iM27462to;
        float f2 = iM27462to2;
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, (-c12007ixClone.m56557jd()) + f, (-c12007ixClone.m56551ck()) + f2);
        c11896dy2.m55577x1(c11913yj);
        r3.m55577x1(c11913yj);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5() + (iM27462to * 2)), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1() + (iM27462to2 * 2)), 13);
        C12009k4 c12009k4 = new C12009k4(iM27462to3, iM27462to4, 2498570);
        try {
            if (abstractC14897zn.m74625qq() != null) {
                c12009k4.m56332k4(abstractC14897zn.m74625qq().mo15758up(), abstractC14897zn.m74625qq().mo15752dy());
            }
            AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, (AbstractC14897zn) abstractC14897zn);
            try {
                abstractC12008jdM70048k4.mo17517k4(C12003du.f40505to.Clone());
                if (c0962esM69907kk.m5681to() != 0) {
                    abstractC12008jdM70048k4.mo17527k4(new C11999ar(C12003du.m56398k4(c0962esM69907kk.m5676k4().m56501c5() & 255, 255, 0, 0).Clone()), c11896dy2);
                }
                abstractC12008jdM70048k4.dispose();
                C12003du c12003duClone = ((zg0) this.f50768k4).m74518x1().Clone();
                if (c0962esM69907kk.m5681to() == 1 && (c0962esM69907kk.m5676k4().m56501c5() & 255) != 255) {
                    C12003du.m56400k4(C7019kk.m27462to(Float.valueOf(((c0962esM69907kk.m5676k4().m56501c5() & 255) / 255.0f) * (c12003duClone.m56501c5() & 255)), 13), c12003duClone.Clone()).CloneTo(c12003duClone);
                }
                m74890k4(c12009k4, c12003duClone.Clone());
                C1234i0.m7347k4(c12009k4, blurRadius, 3, 3);
                C12009k4 c12009k42 = new C12009k4(iM27462to3, iM27462to4, c12009k4.mo15753jd());
                try {
                    try {
                        abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k42, (AbstractC14897zn) abstractC14897zn);
                        try {
                            abstractC12008jdM70048k4.mo17517k4(C12003du.f40505to.Clone());
                            c12012lr = new C12012lr(c12009k4);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            try {
                                abstractC12008jdM70048k4.mo17527k4(c12012lr, r3);
                                c12012lr.dispose();
                                abstractC14897zn.mo64339k4(c12009k42, c12007ixClone.m56557jd() - f, c12007ixClone.m56551ck() - f2, c12009k42.mo15760yj(), c12009k42.mo15757m9());
                                abstractC12008jdM70048k4.dispose();
                                c12009k42.dispose();
                                c12009k4.dispose();
                            } catch (Throwable th2) {
                                c12012lr.dispose();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r3.dispose();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r3 = c12009k42;
                    r3.dispose();
                    throw th;
                }
            } finally {
                if (abstractC12008jdM70048k4 != null) {
                    abstractC12008jdM70048k4.dispose();
                }
            }
        } catch (Throwable th6) {
            c12009k4.dispose();
            throw th6;
        }
    }
}
