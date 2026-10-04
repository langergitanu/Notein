package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class pz4 {

    /* JADX INFO: renamed from: k4 */
    private IReflectionEffectiveData f48209k4;

    public pz4(IReflectionEffectiveData iReflectionEffectiveData) {
        if (iReflectionEffectiveData == null) {
            throw new ArgumentNullException("reflectionEffectiveData is null.");
        }
        this.f48209k4 = iReflectionEffectiveData;
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m69342k4(C12025x6 c12025x6, float f) {
        float scaleHorizontal = ((float) this.f48209k4.getScaleHorizontal()) / 100.0f;
        float scaleVertical = ((float) this.f48209k4.getScaleVertical()) / 100.0f;
        C11913yj c11913yj = new C11913yj(C14116yg.m67482k4(C14116yg.m67505x1(scaleHorizontal)), 0.0f, 0.0f, C14116yg.m67505x1(scaleVertical), 0.0f, c12025x6.m56895kk() * 2.0f);
        C11913yj c11913yj2 = new C11913yj();
        c11913yj2.m55777kk(c12025x6.m56897x1(), c12025x6.m56895kk());
        c11913yj2.m55763k4(C14116yg.m67480k4(scaleHorizontal), C14116yg.m67480k4(scaleVertical));
        c11913yj2.m55777kk(-c12025x6.m56897x1(), -c12025x6.m56895kk());
        C11913yj c11913yj3 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, ((float) this.f48209k4.getDistance()) * f);
        C11913yj c11913yj4 = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        c11913yj4.m55769k4(c11913yj, 1);
        c11913yj4.m55769k4(c11913yj3, 1);
        c11913yj4.m55769k4(c11913yj2, 1);
        return c11913yj4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m69343k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, qy7 qy7Var, C12025x6 c12025x6) {
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        float f2;
        C11896dy c11896dy2;
        if (c11896dy == null) {
            throw new ArgumentNullException("path is null.");
        }
        if (c11896dy.m55525du() == 0 || this.f48209k4.getScaleHorizontal() == 0.0d || this.f48209k4.getScaleVertical() == 0.0d) {
            return;
        }
        C11896dy c11896dy3 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        C12007ix c12007ix = new C12007ix();
        float fM69915rv = qy7Var.m69915rv();
        boolean rotateShadowWithShape = this.f48209k4.getRotateShadowWithShape();
        boolean z4 = qy7Var.f48469h4;
        if (z4) {
            ShapeFrame shapeFrame = qy7Var.f48476m9;
            C12007ix c12007ixClone = shapeFrame.m2660k4().Clone();
            if (!rotateShadowWithShape) {
                C4317dy c4317dy = new C4317dy(shapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrame.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrame.getFlipH() == 1 ? shapeFrame.getCenterX() * 2.0f : 0.0f, shapeFrame.getFlipV() == 1 ? shapeFrame.getCenterY() * 2.0f : 0.0f);
                if (!C14064he.m66715kk(shapeFrame.getRotation())) {
                    c4317dy.m17339k4((shapeFrame.getFlipH() == 1) ^ (shapeFrame.getFlipV() == 1) ? -shapeFrame.getRotation() : shapeFrame.getRotation(), new C12025x6(shapeFrame.getCenterX(), shapeFrame.getCenterY()), 0);
                }
                C11913yj c11913yjM13229x1 = C3108y2.m13229x1(c4317dy);
                c11896dy2 = new C11896dy();
                try {
                    c11896dy2.m55578x1(c12007ixClone.Clone());
                    c11896dy2.m55577x1(c11913yjM13229x1);
                    c11896dy2.m55523c5().CloneTo(c12007ixClone);
                } finally {
                }
            }
            C11913yj c11913yjM69342k4 = m69342k4(new C12025x6(c12007ixClone.m56557jd(), c12007ixClone.m56575x1() + c12007ixClone.m56551ck()), 1.0f);
            c11896dy2 = new C11896dy();
            try {
                c11896dy2.m55578x1(shapeFrame.m2660k4().Clone());
                c11896dy2.m55577x1(c11913yjM69342k4);
                c11896dy2.m55523c5().CloneTo(c12007ix);
                c11913yjM69342k4.m55769k4(C3108y2.m13229x1(abstractC14897zn.m74623ks()), 0);
                c11896dy2.dispose();
                c11896dy3.m55577x1(c11913yjM69342k4);
                z = false;
            } finally {
            }
        } else {
            c11896dy3.m55577x1(m69342k4(c12025x6.Clone(), C0832bv.m4323k4(fM69915rv, 1.0f, 18.0f, 2.0f)));
            C12007ix c12007ixClone2 = c11896dy3.m55523c5().Clone();
            c12007ix = c12025x6.m56895kk() - c12007ixClone2.m56551ck() > 3.0f ? new C12007ix(c12007ixClone2.m56557jd(), c12025x6.m56895kk(), c12007ixClone2.m56550c5() * 1.5f, c12007ixClone2.m56575x1() * 1.5f) : new C12007ix(c12007ixClone2.m56557jd(), c12007ixClone2.m56551ck(), c12007ixClone2.m56550c5() * 1.5f, c12007ixClone2.m56575x1() * 1.5f);
            z = true;
        }
        double blurRadius = this.f48209k4.getBlurRadius();
        float f3 = (float) blurRadius;
        C12025x6 c12025x62 = new C12025x6(c12007ix.m56557jd() - f3, c12007ix.m56551ck() - f3);
        C12007ix c12007ix2 = c12007ix;
        try {
            double d = blurRadius * 2.0d;
            C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) c12007ix2.m56550c5()) + d)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) c12007ix2.m56575x1()) + d)), 14), 2498570);
            try {
                if (abstractC14897zn.m74608ar() != null) {
                    c12009k4.m56332k4(abstractC14897zn.m74608ar().mo17483jd(), abstractC14897zn.m74608ar().mo17474ck());
                }
                c11896dy3.m55577x1(new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, -c12025x62.m56897x1(), -c12025x62.m56895kk()));
                AbstractC12008jd abstractC12008jdM70048k4 = C14381rb.m70048k4(c12009k4, abstractC14897zn);
                try {
                    if (qy7Var.m69907kk() == null || qy7Var.m69907kk().m5681to() == 0) {
                        f = 1.0f;
                        z2 = false;
                    } else {
                        boolean z5 = true;
                        if (qy7Var.m69907kk().m5681to() == 1) {
                            IBackgroundEffectiveData effective = qy7Var.f48493yj.getBackground().getEffective();
                            float fM56512m9 = effective.getFillFormat().getFillType() == 1 ? ((C14176nc) effective.getFillFormat()).m67938m9().m56512m9() * 2.0f : 1.0f;
                            float fM56512m92 = qy7Var.m69907kk().m5676k4().m56512m9();
                            if (fM56512m92 < 0.6d) {
                                z5 = false;
                            }
                            f2 = fM56512m9 * fM56512m92 * 2.0f;
                            z3 = z5;
                        } else {
                            z3 = false;
                            f2 = 1.0f;
                        }
                        AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(qy7Var.m69907kk());
                        try {
                            abstractC12008jdM70048k4.mo17527k4(abstractC12024x1M73548kk, c11896dy3);
                            z2 = z3;
                            f = f2;
                        } finally {
                            if (abstractC12024x1M73548kk != null) {
                                abstractC12024x1M73548kk.dispose();
                            }
                        }
                    }
                    if (qy7Var.m69917to() != null && qy7Var.m69917to().m3903h4()) {
                        C12026yj c12026yjM3930x6 = qy7Var.m69917to().m3930x6();
                        try {
                            abstractC12008jdM70048k4.mo17540k4(c12026yjM3930x6, c11896dy3);
                            if (c12026yjM3930x6 != null) {
                                c12026yjM3930x6.dispose();
                            }
                        } catch (Throwable th) {
                            if (c12026yjM3930x6 != null) {
                                c12026yjM3930x6.dispose();
                            }
                            throw th;
                        }
                    }
                    if (abstractC12008jdM70048k4 != null) {
                        abstractC12008jdM70048k4.dispose();
                    }
                    if (z4) {
                        lzv.m64649k4(c12009k4, c12009k4.mo15757m9(), this.f48209k4, z2, f);
                    } else {
                        lzv.m64648k4(c12009k4, c12009k4.mo15757m9(), this.f48209k4);
                    }
                    if (blurRadius >= 2.0d) {
                        if (z4) {
                            C1234i0.m7346k4(c12009k4, blurRadius / 3.0d, 3);
                        } else {
                            C1234i0.m7346k4(c12009k4, blurRadius / 6.0d, 3);
                        }
                    }
                    if (rotateShadowWithShape || z) {
                        abstractC14897zn.mo64339k4(c12009k4, c12025x62.m56897x1(), c12025x62.m56895kk(), c12009k4.mo15760yj(), c12009k4.mo15757m9());
                    } else {
                        C4317dy c4317dyM74623ks = abstractC14897zn.m74623ks();
                        abstractC14897zn.m74626rv();
                        abstractC14897zn.mo64339k4(c12009k4, c12025x62.m56897x1(), c12025x62.m56895kk(), c12009k4.mo15760yj(), c12009k4.mo15757m9());
                        abstractC14897zn.m74622kk(c4317dyM74623ks);
                    }
                    c12009k4.dispose();
                    c11896dy3.dispose();
                } catch (Throwable th2) {
                    if (abstractC12008jdM70048k4 != null) {
                        abstractC12008jdM70048k4.dispose();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                c12009k4.dispose();
                throw th3;
            }
        } catch (Throwable th4) {
            if (c11896dy3 != null) {
                c11896dy3.dispose();
            }
            throw th4;
        }
    }
}
