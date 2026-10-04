package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class o6h {

    /* JADX INFO: renamed from: c5 */
    private double f47685c5;

    /* JADX INFO: renamed from: du */
    private byte f47686du;

    /* JADX INFO: renamed from: dy */
    private double f47687dy;

    /* JADX INFO: renamed from: h4 */
    private double f47688h4;

    /* JADX INFO: renamed from: k4 */
    private double f47689k4;

    /* JADX INFO: renamed from: kk */
    private double f47690kk;

    /* JADX INFO: renamed from: m9 */
    private double f47691m9;

    /* JADX INFO: renamed from: to */
    private C12003du f47692to = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private float f47693x1;

    public o6h(IOuterShadowEffectiveData iOuterShadowEffectiveData) {
        this.f47689k4 = iOuterShadowEffectiveData.getBlurRadius();
        this.f47693x1 = iOuterShadowEffectiveData.getDirection();
        this.f47690kk = iOuterShadowEffectiveData.getDistance();
        ((vmd) iOuterShadowEffectiveData).m72367x1().CloneTo(this.f47692to);
        this.f47686du = iOuterShadowEffectiveData.getRectangleAlign();
        this.f47688h4 = iOuterShadowEffectiveData.getSkewHorizontal();
        this.f47691m9 = iOuterShadowEffectiveData.getSkewVertical();
        this.f47687dy = iOuterShadowEffectiveData.getScaleHorizontal();
        this.f47685c5 = iOuterShadowEffectiveData.getScaleVertical();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float m68349k4(float f, boolean z) {
        float f2;
        if (f < 10.0f) {
            f2 = z ? 1.4f : 1.7f;
        } else if (f < 10.0f || f > 17.0f) {
            f2 = (f <= 17.0f || f > 20.0f) ? (f <= 20.0f || f >= 24.0f) ? 1.6f : z ? 1.53f : 1.62f : (z || f == 18.0f) ? 1.45f : 1.55f;
        } else if (!z) {
            f2 = 1.65f;
        }
        if (f >= 24.0f && f < 48.0f) {
            return 1.62f;
        }
        if (f >= 48.0f && f < 96.0f) {
            return 1.55f;
        }
        if (f >= 96.0f) {
            return 1.6f;
        }
        return f2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m68350k4(qy7 qy7Var, C12007ix c12007ix, float f, boolean z) {
        C11913yj c11913yj = new C11913yj();
        C12025x6 c12025x6Clone = nv2.m68219k4(c12007ix.Clone(), this.f47686du).Clone();
        if (this.f47688h4 != 0.0d || this.f47691m9 != 0.0d) {
            C11913yj c11913yj2 = new C11913yj();
            c11913yj2.m55777kk(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
            c11913yj2.m55785x1((float) (C14116yg.m67466c5(this.f47688h4 / 180.0d) * 3.141592653589793d), (float) (C14116yg.m67466c5(this.f47691m9 / 180.0d) * 3.141592653589793d));
            c11913yj2.m55777kk(-c12025x6Clone.m56897x1(), -c12025x6Clone.m56895kk());
            c11913yj.m55769k4(c11913yj2, 1);
        }
        double d = this.f47687dy;
        if ((d != 0.0d || this.f47685c5 != 0.0d) && (d != 100.0d || this.f47685c5 != 100.0d)) {
            C11913yj c11913yj3 = new C11913yj();
            c11913yj3.m55777kk(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
            c11913yj3.m55763k4((float) (this.f47687dy / 100.0d), (float) (this.f47685c5 / 100.0d));
            c11913yj3.m55777kk(-c12025x6Clone.m56897x1(), -c12025x6Clone.m56895kk());
            c11913yj.m55769k4(c11913yj3, 1);
        }
        if (this.f47693x1 == 0.0f && this.f47690kk == 0.0d) {
            return c11913yj;
        }
        C11913yj c11913yj4 = new C11913yj();
        c11913yj4.m55766k4(this.f47693x1, c12025x6Clone.Clone());
        c11913yj4.m55777kk((float) (this.f47690kk * ((double) ((qy7Var.m69884bz() || C14064he.m66715kk(f)) ? 1.0f : C0832bv.m4323k4(f, 0.75f, 48.0f, m68349k4(f, z))))), 0.0f);
        c11913yj4.m55766k4(-this.f47693x1, c12025x6Clone.Clone());
        c11913yj.m55769k4(c11913yj4, 1);
        return c11913yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0190  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m68351k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, qy7 qy7Var) {
        C12007ix c12007ixClone;
        AbstractC12002ck abstractC12002ck;
        C12026yj c12026yj;
        C11896dy c11896dy2;
        AbstractC12024x1 abstractC12024x1;
        C12025x6 c12025x6;
        C12009k4 c12009k4;
        AbstractC12024x1 abstractC12024x1M73548kk;
        C14251ot c14251ot;
        int[] iArr;
        if (c11896dy.m55525du() == 0) {
            return;
        }
        float fM69915rv = qy7Var.m69915rv();
        boolean zM27469x1 = C7019kk.m27469x1(abstractC14897zn, omq.class);
        if (this.f47687dy == 100.0d && this.f47685c5 == 100.0d) {
            oju ojuVar = qy7Var.f48472k4;
            c12007ixClone = new C12007ix(0.0f, 0.0f, ojuVar.f47836k4, ojuVar.f47837x1);
        } else {
            c12007ixClone = c11896dy.m55523c5().Clone();
        }
        C11913yj c11913yjM68350k4 = m68350k4(qy7Var, c12007ixClone, fM69915rv, zM27469x1);
        try {
            c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
            try {
                c11896dy2.m55577x1(c11913yjM68350k4);
                C12007ix c12007ixClone2 = c11896dy2.m55523c5().Clone();
                float f = 2;
                c12025x6 = new C12025x6((c12007ixClone2.m56557jd() - ((float) this.f47689k4)) - f, (c12007ixClone2.m56551ck() - ((float) this.f47689k4)) - f);
                c11896dy2.m55577x1(new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x6.m56897x1(), -c12025x6.m56895kk()));
                float f2 = 4;
                c12009k4 = new C12009k4(C7019kk.m27462to(Double.valueOf((this.f47689k4 * 2.0d) + ((double) (c12007ixClone2.m56550c5() + f2))), 14), C7019kk.m27462to(Double.valueOf((this.f47689k4 * 2.0d) + ((double) (c12007ixClone2.m56575x1() + f2))), 14), 2498570);
            } catch (Throwable th) {
                th = th;
                abstractC12002ck = null;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC12002ck = null;
            c12026yj = null;
            c11896dy2 = null;
        }
        try {
            if (abstractC14897zn.m74608ar() != null) {
                c12009k4.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
            }
            AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
            try {
                abstractC12008jdM70048k4.mo17517k4(C12003du.m56396k4(0).Clone());
                C14251ot c14251otM69882b3 = qy7Var.m69882b3();
                C12026yj c12026yjM3930x6 = (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4()) ? null : qy7Var.m69917to().m3930x6();
                try {
                    if (qy7Var.m69907kk() != null) {
                        try {
                            abstractC12024x1M73548kk = C14814xq.m73548kk(qy7Var.m69907kk());
                        } catch (Throwable th3) {
                            th = th3;
                            c12026yj = c12026yjM3930x6;
                            abstractC12002ck = c12009k4;
                            abstractC12024x1 = null;
                            if (abstractC12008jdM70048k4 != null) {
                            }
                            throw th;
                        }
                    } else {
                        abstractC12024x1M73548kk = C12010kk.m56611kk();
                    }
                    abstractC12024x1 = abstractC12024x1M73548kk;
                    if (c12026yjM3930x6 != null) {
                        try {
                            if (c12026yjM3930x6.m56930ne() > 0.0f) {
                                C12003du c12003duClone = this.f47692to.Clone();
                                if (c12026yjM3930x6.m56931rv() == 0) {
                                    C14381rb.m70046k4(this.f47692to.Clone(), c12026yjM3930x6.m56925kk().m56501c5()).CloneTo(c12003duClone);
                                }
                                c14251ot = c14251otM69882b3;
                                C12026yj c12026yj2 = new C12026yj(C12003du.m56398k4(255, 0, 0, c12003duClone.m56501c5() & 255).Clone(), c12026yjM3930x6.m56930ne() * ((float) (this.f47687dy / 100.0d)));
                                try {
                                    abstractC12008jdM70048k4.mo17540k4(c12026yj2, c11896dy2);
                                    c12026yj2.dispose();
                                } catch (Throwable th4) {
                                    c12026yj2.dispose();
                                    throw th4;
                                }
                            } else {
                                c14251ot = c14251otM69882b3;
                            }
                            if (abstractC12024x1 != null) {
                                C11999ar c11999ar = (C11999ar) C7019kk.m27452k4((Object) abstractC12024x1, C11999ar.class);
                                C12003du c12003duClone2 = this.f47692to.Clone();
                                if (c11999ar != null) {
                                    C14381rb.m70046k4(this.f47692to.Clone(), c11999ar.m56305h4().m56501c5()).CloneTo(c12003duClone2);
                                }
                                C11999ar c11999ar2 = new C11999ar(C12003du.m56398k4(255, 0, 0, c12003duClone2.m56501c5() & 255).Clone());
                                try {
                                    if (c14251ot.m68810h4()) {
                                        C12026yj c12026yj3 = new C12026yj(c11999ar2, c14251ot.m68817m9() * 0.02f);
                                        try {
                                            abstractC12008jdM70048k4.mo17540k4(c12026yj3, c11896dy2);
                                            c12026yj3.dispose();
                                        } catch (Throwable th5) {
                                            c12026yj3.dispose();
                                            throw th5;
                                        }
                                    }
                                    if (c11999ar == null || (c11999ar.m56305h4().m56501c5() & 255) > 0) {
                                        abstractC12008jdM70048k4.mo17527k4(c11999ar2, c11896dy2);
                                    }
                                    c11999ar2.dispose();
                                } catch (Throwable th6) {
                                    c11999ar2.dispose();
                                    throw th6;
                                }
                            }
                            try {
                                abstractC12008jdM70048k4.dispose();
                                byte[] bArrM70057k4 = C14381rb.m70057k4(c12009k4);
                                int length = bArrM70057k4.length;
                                int[] iArr2 = new int[length];
                                byte bM56505fa = this.f47692to.m56505fa();
                                byte bM56502ck = this.f47692to.m56502ck();
                                byte bM56507jd = this.f47692to.m56507jd();
                                int i = 0;
                                int i2 = 0;
                                while (i < bArrM70057k4.length) {
                                    int i3 = i2 + 1;
                                    try {
                                        iArr2[i2] = ((byte) (((bArrM70057k4[i] & 255) * (bArrM70057k4[i + 3] & 255)) >> 8)) & 255;
                                        bArrM70057k4[i] = bM56505fa;
                                        bArrM70057k4[i + 1] = bM56502ck;
                                        bArrM70057k4[i + 2] = bM56507jd;
                                        i += 4;
                                        i2 = i3;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c12026yj = c12026yjM3930x6;
                                        abstractC12002ck = c12009k4;
                                    }
                                }
                                int[] iArr3 = new int[length];
                                int i4 = 3;
                                if (qy7Var.m69884bz()) {
                                    iArr = iArr2;
                                    C1234i0.m7348k4(iArr, iArr3, c12009k4.mo15760yj(), c12009k4.mo15757m9(), this.f47689k4 / 3.0d, 4);
                                } else {
                                    iArr = iArr2;
                                    C1234i0.m7348k4(iArr, iArr3, c12009k4.mo15760yj(), c12009k4.mo15757m9(), C0832bv.m4322k4(fM69915rv, (float) this.f47689k4), (this.f47690kk >= 2.0d || this.f47689k4 > 4.0d) ? 3 : 4);
                                }
                                int i5 = 0;
                                while (i4 < bArrM70057k4.length) {
                                    int i6 = i5 + 1;
                                    bArrM70057k4[i4] = (byte) iArr[i5];
                                    i4 += 4;
                                    i5 = i6;
                                }
                                C14381rb.m70053k4(c12009k4, bArrM70057k4);
                                abstractC12002ck = c12009k4;
                                try {
                                    abstractC14897zn.mo64339k4(abstractC12002ck, c12025x6.m56897x1(), c12025x6.m56895kk(), c12009k4.mo15760yj(), c12009k4.mo15757m9());
                                    if (c12026yjM3930x6 != null) {
                                        c12026yjM3930x6.dispose();
                                    }
                                    if (abstractC12024x1 != null) {
                                        abstractC12024x1.dispose();
                                    }
                                    abstractC12002ck.dispose();
                                    c11896dy2.dispose();
                                    return;
                                } catch (Throwable th8) {
                                    th = th8;
                                    c12026yj = c12026yjM3930x6;
                                    if (c12026yj != null) {
                                    }
                                    if (abstractC12024x1 != null) {
                                    }
                                    if (abstractC12002ck != null) {
                                    }
                                    if (c11896dy2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                abstractC12002ck = c12009k4;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c12026yj = c12026yjM3930x6;
                            abstractC12002ck = c12009k4;
                            if (abstractC12008jdM70048k4 != null) {
                                try {
                                    abstractC12008jdM70048k4.dispose();
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    abstractC12002ck = c12009k4;
                    c12026yj = c12026yjM3930x6;
                }
            } catch (Throwable th13) {
                th = th13;
                abstractC12002ck = c12009k4;
                c12026yj = null;
            }
        } catch (Throwable th14) {
            th = th14;
            abstractC12002ck = c12009k4;
            c12026yj = null;
            abstractC12024x1 = null;
        }
        if (c12026yj != null) {
            c12026yj.dispose();
        }
        if (abstractC12024x1 != null) {
            abstractC12024x1.dispose();
        }
        if (abstractC12002ck != null) {
            abstractC12002ck.dispose();
        }
        if (c11896dy2 != null) {
            c11896dy2.dispose();
        }
        throw th;
    }
}
