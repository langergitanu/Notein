package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.z6 */
/* JADX INFO: loaded from: classes3.dex */
class C14874z6 {

    /* JADX INFO: renamed from: k4 */
    private IBlurEffectiveData f50494k4;

    public C14874z6(IBlurEffectiveData iBlurEffectiveData) {
        this.f50494k4 = iBlurEffectiveData;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m74335k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, ShapeFrame shapeFrame) {
        C12025x6 c12025x6;
        C12009k4 c12009k4;
        if (this.f50494k4.getRadius() == 0.0d) {
            return;
        }
        if ((c0962es == null || c0962es.m5681to() == 0) && (azoVar == null || !azoVar.m3903h4())) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        float fM3906k4 = (azoVar == null || !azoVar.m3903h4()) ? 0.0f : (float) azoVar.m3906k4();
        boolean grow = this.f50494k4.getGrow();
        double radius = this.f50494k4.getRadius();
        C12007ix c12007ixClone = c11896dy2.m55523c5().Clone();
        C12025x6.f40591k4.Clone();
        float fM56557jd = c12007ixClone.m56557jd();
        float f = fM3906k4 / 2.0f;
        if (grow) {
            float f2 = f + ((float) radius);
            c12025x6 = new C12025x6(fM56557jd - f2, c12007ixClone.m56551ck() - f2);
        } else {
            float f3 = f + 1.0f;
            c12025x6 = new C12025x6(fM56557jd - f3, c12007ixClone.m56551ck() - f3);
        }
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        c11896dy2.m55577x1(c11913yj);
        C12009k4 c12009k42 = null;
        try {
            if (grow) {
                double d = 2.0d * radius;
                c12009k4 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) (c12007ixClone.m56550c5() + fM3906k4)) + d)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) (c12007ixClone.m56575x1() + fM3906k4)) + d)), 14), 2498570);
            } else {
                c12009k4 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone.m56550c5() + fM3906k4 + 1.0f)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12007ixClone.m56575x1() + fM3906k4 + 1.0f)), 14), 2498570);
            }
            c12009k42 = c12009k4;
            if (abstractC14897zn.m74625qq() != null) {
                c12009k42.m56332k4(abstractC14897zn.m74625qq().mo15758up(), abstractC14897zn.m74625qq().mo15752dy());
            }
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            try {
                if (abstractC14897zn.m74608ar() != null) {
                    abstractC12008jdM56582k4.mo17481h4(1);
                    abstractC12008jdM56582k4.mo17491k4(abstractC14897zn.m74608ar().mo17579up());
                    abstractC12008jdM56582k4.mo17574to(abstractC14897zn.m74608ar().mo17605yj());
                }
                abstractC12008jdM56582k4.mo17517k4(C12003du.m56396k4(0).Clone());
                C11913yj c11913yj2 = new C11913yj();
                c11913yj2.m55769k4(c11913yj, 1);
                if (c0962es != null && c0962es.m5681to() != 0) {
                    AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
                    try {
                        C11913yj c11913yjM70045k4 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                        c11913yjM70045k4.m55769k4(c11913yj2, 1);
                        C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yjM70045k4);
                        abstractC12008jdM56582k4.mo17527k4(abstractC12024x1M73548kk, c11896dy2);
                        if (abstractC12024x1M73548kk != null) {
                            abstractC12024x1M73548kk.dispose();
                        }
                    } catch (Throwable th) {
                        if (abstractC12024x1M73548kk != null) {
                            abstractC12024x1M73548kk.dispose();
                        }
                        throw th;
                    }
                }
                if (azoVar != null && azoVar.m3903h4()) {
                    C12026yj c12026yjM3930x6 = azoVar.m3930x6();
                    try {
                        C11913yj c11913yjM56940x6 = c12026yjM3930x6.m56940x6();
                        c11913yjM56940x6.m55769k4(c11913yj2, 1);
                        c12026yjM3930x6.m56922k4(c11913yjM56940x6);
                        abstractC12008jdM56582k4.mo17540k4(c12026yjM3930x6, c11896dy2);
                        c12026yjM3930x6.dispose();
                    } catch (Throwable th2) {
                        if (c12026yjM3930x6 != null) {
                            c12026yjM3930x6.dispose();
                        }
                        throw th2;
                    }
                }
                abstractC12008jdM56582k4.dispose();
                C14381rb.m70056k4(c12009k42, C12003du.m56398k4(0, 128, 128, 128).Clone());
                if (!grow && radius > 4.0d && c12009k42.mo15757m9() > 2 && c12009k42.mo15760yj() > 2) {
                    C14381rb.m70052k4(c12009k42, (byte) 0, 1);
                }
                double d2 = radius * 0.3333333333333333d;
                if (radius <= 8.0d) {
                    C1234i0.m7346k4(c12009k42, d2, 4);
                } else {
                    C1234i0.m7346k4(c12009k42, d2, 3);
                }
                abstractC14897zn.mo64340k4(c12009k42, C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(c12025x6.m56895kk())), 14));
                c11896dy2.dispose();
                c12009k42.dispose();
            } catch (Throwable th3) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            c11896dy2.dispose();
            if (c12009k42 != null) {
                c12009k42.dispose();
            }
            throw th4;
        }
    }
}
