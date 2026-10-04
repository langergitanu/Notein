package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.lbk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class nv2 {

    /* JADX INFO: renamed from: c5 */
    private boolean f47619c5;

    /* JADX INFO: renamed from: ck */
    private double f47620ck;

    /* JADX INFO: renamed from: dy */
    private double f47622dy;

    /* JADX INFO: renamed from: h4 */
    private byte f47624h4;

    /* JADX INFO: renamed from: jd */
    private double f47625jd;

    /* JADX INFO: renamed from: kk */
    private float f47627kk;

    /* JADX INFO: renamed from: m9 */
    private double f47628m9;

    /* JADX INFO: renamed from: to */
    private double f47629to;

    /* JADX INFO: renamed from: x1 */
    private double f47631x1;

    /* JADX INFO: renamed from: k4 */
    private boolean f47626k4 = false;

    /* JADX INFO: renamed from: du */
    private C12003du f47621du = new C12003du();

    /* JADX INFO: renamed from: fa */
    private final float f47623fa = 3.0f;

    /* JADX INFO: renamed from: up */
    private final int f47630up = 4;

    public nv2(IOuterShadow iOuterShadow) {
        this.f47631x1 = iOuterShadow.getBlurRadius();
        this.f47627kk = iOuterShadow.getDirection();
        this.f47629to = iOuterShadow.getDistance();
        ((ColorFormat) iOuterShadow.getShadowColor()).m1084to().CloneTo(this.f47621du);
        this.f47624h4 = iOuterShadow.getRectangleAlign();
        this.f47628m9 = iOuterShadow.getSkewHorizontal();
        this.f47622dy = iOuterShadow.getSkewVertical();
        this.f47619c5 = iOuterShadow.getRotateShadowWithShape();
        this.f47625jd = iOuterShadow.getScaleHorizontal();
        this.f47620ck = iOuterShadow.getScaleVertical();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m68225k4(C11896dy c11896dy, AbstractC14897zn abstractC14897zn) {
        if (c11896dy == null) {
            throw new ArgumentNullException("shapePath is null");
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        c11896dy2.m55577x1(m68230x1(c11896dy2, abstractC14897zn));
        return c11896dy2.m55523c5().Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11913yj m68230x1(C11896dy c11896dy, AbstractC14897zn abstractC14897zn) {
        double d;
        if (c11896dy == null) {
            throw new ArgumentNullException("graphicsPath is null");
        }
        C11913yj c11913yj = new C11913yj();
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        if (!this.f47619c5 && abstractC14897zn != null) {
            C4317dy c4317dyM74623ks = abstractC14897zn.m74623ks();
            C4317dy c4317dyM74626rv = abstractC14897zn.m74626rv();
            abstractC14897zn.m74615k4(c4317dyM74623ks, false);
            C11913yj c11913yjM13229x1 = C3108y2.m13229x1(c4317dyM74623ks);
            c11913yjM13229x1.m55769k4(C3108y2.m13229x1(C3108y2.m13223k4(c4317dyM74626rv)), 1);
            c11913yj.m55769k4(c11913yjM13229x1, 1);
            c11896dy2.m55577x1(c11913yj);
        }
        C12025x6 c12025x6Clone = m68219k4(c11896dy2.m55523c5().Clone().Clone(), this.f47624h4).Clone();
        float fM56897x1 = c12025x6Clone.m56897x1();
        float fM56895kk = c12025x6Clone.m56895kk();
        double d2 = this.f47628m9;
        double d3 = this.f47622dy;
        double d4 = this.f47625jd;
        double d5 = this.f47620ck;
        float f = this.f47627kk;
        double d6 = this.f47629to;
        if (d2 == 0.0d && d3 == 0.0d) {
            d = d4;
        } else {
            C11913yj c11913yj2 = new C11913yj();
            c11913yj2.m55777kk(fM56897x1, fM56895kk);
            d = d4;
            c11913yj2.m55785x1((float) (C14116yg.m67466c5(d2 / 180.0d) * 3.141592653589793d), (float) (C14116yg.m67466c5(d3 / 180.0d) * 3.141592653589793d));
            c11913yj2.m55777kk(-fM56897x1, -fM56895kk);
            c11913yj.m55769k4(c11913yj2, 1);
        }
        if (d != 0.0d || d5 != 0.0d) {
            C11913yj c11913yj3 = new C11913yj();
            c11913yj3.m55777kk(fM56897x1, fM56895kk);
            c11913yj3.m55763k4((float) (d / 100.0d), (float) (d5 / 100.0d));
            c11913yj3.m55777kk(-fM56897x1, -fM56895kk);
            c11913yj.m55769k4(c11913yj3, 1);
        }
        if (f != 0.0f || d6 != 0.0d) {
            C11913yj c11913yj4 = new C11913yj();
            c11913yj4.m55766k4(f, new C12025x6(fM56897x1, fM56895kk));
            c11913yj4.m55777kk((float) d6, 0.0f);
            c11913yj4.m55766k4(-f, new C12025x6(fM56897x1, fM56895kk));
            c11913yj.m55769k4(c11913yj4, 1);
        }
        c11896dy2.dispose();
        return c11913yj;
    }

    public nv2(IOuterShadowEffectiveData iOuterShadowEffectiveData) {
        this.f47631x1 = iOuterShadowEffectiveData.getBlurRadius();
        this.f47627kk = iOuterShadowEffectiveData.getDirection();
        this.f47629to = iOuterShadowEffectiveData.getDistance();
        ((vmd) iOuterShadowEffectiveData).m72367x1().CloneTo(this.f47621du);
        this.f47624h4 = iOuterShadowEffectiveData.getRectangleAlign();
        this.f47628m9 = iOuterShadowEffectiveData.getSkewHorizontal();
        this.f47622dy = iOuterShadowEffectiveData.getSkewVertical();
        this.f47619c5 = iOuterShadowEffectiveData.getRotateShadowWithShape();
        this.f47625jd = iOuterShadowEffectiveData.getScaleHorizontal();
        this.f47620ck = iOuterShadowEffectiveData.getScaleVertical();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m68219k4(C12007ix c12007ix, byte b) {
        float fM56557jd;
        double dM56550c5;
        float fM67490kk;
        double dM67490kk;
        float fOooO0O0;
        float fM56557jd2;
        float fM56557jd3;
        double dM67501x1;
        switch (b) {
            case 0:
                fM56557jd = c12007ix.m56557jd();
                dM56550c5 = fM56557jd;
                fM67490kk = (float) C14116yg.m67490kk(dM56550c5);
                dM67490kk = C14116yg.m67490kk(c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            case 1:
                fM56557jd = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
                dM56550c5 = fM56557jd;
                fM67490kk = (float) C14116yg.m67490kk(dM56550c5);
                dM67490kk = C14116yg.m67490kk(c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            case 2:
                dM56550c5 = c12007ix.m56550c5() + c12007ix.m56557jd();
                fM67490kk = (float) C14116yg.m67490kk(dM56550c5);
                dM67490kk = C14116yg.m67490kk(c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            case 3:
                fM67490kk = c12007ix.m56557jd();
                fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
                break;
            case 4:
                fM67490kk = C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd());
                fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
                break;
            case 5:
                fM67490kk = (float) C14116yg.m67501x1(c12007ix.m56550c5() + c12007ix.m56557jd());
                fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck());
                break;
            case 6:
                fM56557jd2 = c12007ix.m56557jd();
                dM67501x1 = C14116yg.m67490kk(fM56557jd2);
                fM67490kk = (float) dM67501x1;
                dM67490kk = C14116yg.m67501x1(c12007ix.m56575x1() + c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            case 7:
                fM56557jd3 = c12007ix.m56557jd();
                fM56557jd2 = C22205OooOOo.OooO00o(c12007ix, 2.0f, fM56557jd3);
                dM67501x1 = C14116yg.m67490kk(fM56557jd2);
                fM67490kk = (float) dM67501x1;
                dM67490kk = C14116yg.m67501x1(c12007ix.m56575x1() + c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            case 8:
                dM67501x1 = C14116yg.m67501x1(c12007ix.m56550c5() + c12007ix.m56557jd());
                fM67490kk = (float) dM67501x1;
                dM67490kk = C14116yg.m67501x1(c12007ix.m56575x1() + c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
            default:
                fM56557jd3 = c12007ix.m56557jd();
                fM56557jd2 = C22205OooOOo.OooO00o(c12007ix, 2.0f, fM56557jd3);
                dM67501x1 = C14116yg.m67490kk(fM56557jd2);
                fM67490kk = (float) dM67501x1;
                dM67490kk = C14116yg.m67501x1(c12007ix.m56575x1() + c12007ix.m56551ck());
                fOooO0O0 = (float) dM67490kk;
                break;
        }
        return new C12025x6(fM67490kk, fOooO0O0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68220k4(AbstractC12008jd abstractC12008jd, C11896dy c11896dy, C0962es c0962es, azo azoVar, C11913yj c11913yj) {
        m68221k4(abstractC12008jd, c11896dy, c0962es, azoVar, c11913yj, false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68221k4(AbstractC12008jd abstractC12008jd, C11896dy c11896dy, C0962es c0962es, azo azoVar, C11913yj c11913yj, boolean z) {
        if (c0962es != null && c0962es.m5681to() != 0) {
            if (c0962es.m5681to() == 1) {
                c0962es.m5678k4(C12003du.m56400k4(c0962es.m5676k4().m56501c5() & 255, this.f47621du.Clone()).Clone());
            }
            AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(c0962es);
            try {
                C11913yj c11913yj2 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                if (!z) {
                    c11913yj2 = C14381rb.m70045k4(abstractC12024x1M73548kk);
                }
                c11913yj2.m55769k4(c11913yj, 1);
                C14381rb.m70054k4(abstractC12024x1M73548kk, c11913yj2);
                abstractC12008jd.mo17527k4(abstractC12024x1M73548kk, c11896dy);
                if (abstractC12024x1M73548kk != null) {
                    abstractC12024x1M73548kk.dispose();
                }
            } finally {
            }
        }
        if (azoVar == null || !azoVar.m3903h4()) {
            return;
        }
        double d = this.f47625jd / 100.0d;
        if (azoVar.m3906k4() * d < 0.1d && d < 9.0d) {
            return;
        }
        azoVar.m3910k4(C12003du.m56400k4(azoVar.m3916m9().m56501c5() & 255, this.f47621du.Clone()).Clone());
        C12026yj c12026yjM3930x6 = azoVar.m3930x6();
        try {
            c12026yjM3930x6.m56926kk(c12026yjM3930x6.m56930ne() * ((float) d));
            abstractC12008jd.mo17540k4(c12026yjM3930x6, c11896dy);
            c12026yjM3930x6.dispose();
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68222k4(C12009k4 c12009k4, double d, boolean z) {
        C12003du c12003duClone = this.f47621du.Clone();
        C14381rb.m70056k4(c12009k4, c12003duClone.Clone());
        m68223k4(c12009k4, c12003duClone.Clone());
        C1234i0.m7346k4(c12009k4, d / 3.0d, 4);
        if (z) {
            C12556ck.m58568k4(c12009k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68223k4(C12009k4 c12009k4, C12003du c12003du) {
        byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
        byte bM56501c5 = c12003du.m56501c5();
        byte bM56507jd = c12003du.m56507jd();
        byte bM56502ck = c12003du.m56502ck();
        byte bM56505fa = c12003du.m56505fa();
        float fM56501c5 = (255 - (c12003du.m56501c5() & 255)) / 255.0f;
        int i = 0;
        while (i < bArrM70057k4.length) {
            byte b = bArrM70057k4[i + 3];
            if ((b & 255) == 255) {
                bArrM70057k4[i] = bM56505fa;
                bArrM70057k4[i + 1] = bM56502ck;
                int i2 = i + 3;
                bArrM70057k4[i + 2] = bM56507jd;
                i += 4;
                bArrM70057k4[i2] = bM56501c5;
            } else if ((b & 255) != 0) {
                bArrM70057k4[i] = bM56505fa;
                bArrM70057k4[i + 1] = bM56502ck;
                int i3 = i + 3;
                bArrM70057k4[i + 2] = bM56507jd;
                float f = bArrM70057k4[i3] & 255;
                i += 4;
                bArrM70057k4[i3] = C7019kk.m27442k4(Float.valueOf(f - (f * fM56501c5)), 13);
            } else {
                i += 4;
            }
        }
        C14381rb.m70053k4(c12009k4, bArrM70057k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68226k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar) {
        m68227k4(abstractC14897zn, c11896dy, c0962es, azoVar, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68227k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, boolean z) {
        C0962es c0962esCloneT;
        if (this.f47626k4 || (!(c0962es == null || c0962es.m5681to() == 0) || (azoVar != null && azoVar.m3903h4()))) {
            azo azoVarCloneT = azoVar != null ? azoVar.cloneT() : azoVar;
            C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
            C11896dy c11896dy3 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
            float fM3906k4 = (azoVarCloneT == null || !azoVarCloneT.m3903h4()) ? 0.0f : (float) azoVarCloneT.m3906k4();
            C11913yj c11913yjM68230x1 = m68230x1(c11896dy3, abstractC14897zn);
            c11896dy3.m55577x1(c11913yjM68230x1);
            double d = this.f47631x1;
            C12007ix c12007ixClone = c11896dy3.m55523c5().Clone();
            float f = fM3906k4 + 2;
            float f2 = ((float) d) + f;
            C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56557jd() - f2, c12007ixClone.m56551ck() - f2);
            C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
            c11896dy3.m55577x1(c11913yj);
            c11896dy2.m55577x1(c11913yj);
            c11913yjM68230x1.m55769k4(c11913yj, 1);
            double d2 = (((double) f) + d) * 2.0d;
            C12009k4 c12009k4 = new C12009k4(C22201OooO0oO.OooO00o(c12007ixClone.m56550c5(), d2, 14), C22201OooO0oO.OooO00o(c12007ixClone.m56575x1(), d2, 14), 2498570);
            try {
                if (abstractC14897zn.m74608ar() != null) {
                    c12009k4.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
                }
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                if (c0962es != null) {
                    try {
                        if (this.f47626k4 && c0962es.m5681to() == 0) {
                            c0962esCloneT = c0962es.m5673dy();
                            c0962esCloneT.m5678k4(C12003du.m56400k4(255, this.f47621du.Clone()).Clone());
                            abstractC12008jdM70048k4.mo17497k4(c11896dy2, 4);
                        } else {
                            c0962esCloneT = c0962es.cloneT();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    c0962esCloneT = c0962es;
                }
                abstractC12008jdM70048k4.mo17517k4(C12003du.m56396k4(0).Clone());
                m68220k4(abstractC12008jdM70048k4, c11896dy3, c0962esCloneT, azoVarCloneT, c11913yjM68230x1);
                abstractC12008jdM70048k4.dispose();
                m68222k4(c12009k4, d, C7019kk.m27469x1(abstractC14897zn, omq.class));
                if (z) {
                    abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                    try {
                        abstractC12008jdM70048k4.mo17497k4(c11896dy2, 0);
                        abstractC12008jdM70048k4.mo17495k4(1);
                        abstractC12008jdM70048k4.mo17527k4(C12010kk.m56611kk(), c11896dy2);
                        abstractC12008jdM70048k4.dispose();
                    } finally {
                        if (abstractC12008jdM70048k4 != null) {
                            abstractC12008jdM70048k4.dispose();
                        }
                    }
                }
                m68224k4(abstractC14897zn, c12009k4, c12025x6.Clone());
                c12009k4.dispose();
                c11896dy3.dispose();
            } catch (Throwable th2) {
                c12009k4.dispose();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68224k4(AbstractC14897zn abstractC14897zn, C12009k4 c12009k4, C12025x6 c12025x6) {
        if (this.f47619c5) {
            abstractC14897zn.mo64340k4(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56895kk())), 14));
            return;
        }
        C4317dy c4317dyM74623ks = abstractC14897zn.m74623ks();
        abstractC14897zn.m74626rv();
        abstractC14897zn.mo64340k4(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(c12025x6.m56895kk())), 14));
        abstractC14897zn.m74615k4(c4317dyM74623ks, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68228k4(AbstractC14897zn abstractC14897zn, lbk.C13770k4[] c13770k4Arr) throws Throwable {
        if (c13770k4Arr == null) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        float fM67481k4 = 0.0f;
        for (lbk.C13770k4 c13770k4 : c13770k4Arr) {
            if (c13770k4.m64349k4() != null && c13770k4.m64349k4().m55525du() != 0) {
                c11896dy.m55540k4(c13770k4.m64349k4(), false);
                if (c13770k4.m64350kk() != null && c13770k4.m64350kk().m3903h4()) {
                    fM67481k4 = C14116yg.m67481k4(fM67481k4, (float) c13770k4.m64350kk().m3906k4());
                }
            }
        }
        C11913yj c11913yjM68230x1 = m68230x1(c11896dy, abstractC14897zn);
        c11896dy.m55577x1(c11913yjM68230x1);
        double d = this.f47631x1;
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        float f = fM67481k4 + 2;
        float f2 = ((float) d) + f;
        C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56557jd() - f2, c12007ixClone.m56551ck() - f2);
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk());
        double d2 = (((double) f) + d) * 2.0d;
        C12009k4 c12009k4 = new C12009k4(C22201OooO0oO.OooO00o(c12007ixClone.m56550c5(), d2, 14), C22201OooO0oO.OooO00o(c12007ixClone.m56575x1(), d2, 14), 2498570);
        try {
            try {
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                try {
                    abstractC12008jdM70048k4.mo17517k4(C12003du.m56396k4(0).Clone());
                    for (lbk.C13770k4 c13770k42 : c13770k4Arr) {
                        C0962es c0962esCloneT = c13770k42.m64351x1() != null ? c13770k42.m64351x1().cloneT() : null;
                        azo azoVarCloneT = c13770k42.m64350kk() != null ? c13770k42.m64350kk().cloneT() : null;
                        C11896dy c11896dy2 = (C11896dy) c13770k42.m64349k4().deepClone();
                        c11896dy2.m55577x1(c11913yjM68230x1);
                        c11896dy2.m55577x1(c11913yj);
                        try {
                            m68221k4(abstractC12008jdM70048k4, c11896dy2, c0962esCloneT, azoVarCloneT, c11913yjM68230x1, true);
                        } catch (Throwable th) {
                            th = th;
                            if (abstractC12008jdM70048k4 != null) {
                                abstractC12008jdM70048k4.dispose();
                            }
                            throw th;
                        }
                    }
                    abstractC12008jdM70048k4.dispose();
                    m68222k4(c12009k4, d, C7019kk.m27469x1(abstractC14897zn, omq.class));
                    m68224k4(abstractC14897zn, c12009k4, c12025x6.Clone());
                    c12009k4.dispose();
                } catch (Throwable th2) {
                    th = th2;
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68229k4(boolean z) {
        this.f47626k4 = z;
    }
}
