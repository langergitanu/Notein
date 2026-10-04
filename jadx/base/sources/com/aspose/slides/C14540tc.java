package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.tc */
/* JADX INFO: loaded from: classes3.dex */
class C14540tc extends AbstractC14780xb {
    public C14540tc(float f) {
        super(f, 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private C4459os m71072k4(C4459os c4459os, IShapeFrame iShapeFrame) {
        float centerX = iShapeFrame.getCenterX();
        float centerY = iShapeFrame.getCenterY();
        C4317dy c4317dy = new C4317dy(iShapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, iShapeFrame.getFlipV() == 1 ? -1.0f : 1.0f, iShapeFrame.getFlipH() == 1 ? centerX * 2.0f : 0.0f, iShapeFrame.getFlipV() == 1 ? centerY * 2.0f : 0.0f);
        if (!C14064he.m66715kk(iShapeFrame.getRotation())) {
            boolean z = (iShapeFrame.getFlipH() == 1) ^ (iShapeFrame.getFlipV() == 1);
            float rotation = iShapeFrame.getRotation();
            if (z) {
                rotation = -rotation;
            }
            c4317dy.m17339k4(rotation, new C12025x6(centerX, centerY), 0);
        }
        C12025x6 c12025x6Clone = c4317dy.m17333k4(new C12025x6(c4459os.m18285k4(), c4459os.m18290x1())).Clone();
        return new C4459os(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m71073x1(GeometryShape geometryShape) {
        a1f a1fVarM4288k4 = bp9.m4288k4(geometryShape);
        if (a1fVarM4288k4 == null || you.m73962x1(geometryShape.getShapeType())) {
            return true;
        }
        return a1fVarM4288k4.m3161m9() == null && a1fVarM4288k4.m3149dy() == null && C14116yg.m67480k4(a1fVarM4288k4.m3152k4()) < Float.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [int] */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m71074k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource) {
        C14562th c14562thM71269k4;
        float[] fArrM71272k4;
        float f;
        C4459os c4459os;
        C12007ix c12007ix;
        int i;
        int i2;
        float f2;
        boolean z;
        ShapeFrame shapeFrame2;
        int i3;
        boolean z2;
        ?? r0;
        C12007ix c12007ix2;
        C12007ix c12007ixM56549x1;
        ?? r21;
        boolean z3;
        kg7 kg7Var2 = kg7Var;
        boolean z4 = true;
        boolean z5 = false;
        if (shapeElementArr.length == 0 || (c14562thM71269k4 = C14570tp.m71269k4(geometryShape)) == null || (fArrM71272k4 = C14570tp.m71272k4(c14562thM71269k4.m71169kk(), c14562thM71269k4.m71168k4(), c14562thM71269k4.m71170x1())) == null) {
            return false;
        }
        if (you.m73962x1(geometryShape.getShapeType()) && !you.m73958k4((Shape) geometryShape)) {
            return false;
        }
        a1f a1fVarM4288k4 = bp9.m4288k4(geometryShape);
        float fM3163x1 = a1fVarM4288k4 != null ? a1fVarM4288k4.m3163x1() : 0.0f;
        int iM73277k4 = AbstractC14780xb.m73277k4(a1fVarM4288k4, true);
        C4473um c4473umClone = ck8.m4611x1(fArrM71272k4).Clone();
        kg7Var2.m63842k4(new C12007ix(0.0f, 0.0f, geometryShape.getWidth(), geometryShape.getHeight()));
        C0962es[] c0962esArr = new C0962es[6];
        C4459os c4459os2 = new C4459os(0.0f);
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        int i4 = 0;
        int i5 = 0;
        float f3 = 1.0f;
        for (int length = shapeElementArr.length; i4 < length; length = i) {
            boolean z6 = z5;
            ShapeElement shapeElement = shapeElementArr[i4];
            if (shapeElement.f3355x1.m55525du() == 0) {
                c4459os = c4459os2;
                c12007ix2 = c12007ixClone;
                i = length;
                i2 = i4;
                z = z4;
            } else {
                if (shapeElement.getFillSource() != 0) {
                    c4459os = c4459os2;
                    c12007ix = c12007ixClone;
                    f2 = f3;
                    i2 = i4;
                    kg7 kg7Var3 = kg7Var2;
                    i = length;
                    z = z4;
                    i3 = i5;
                    C0962es c0962esMo4333k4 = geometryShape.m1586ks().mo4333k4(abstractC14897zn, shapeFrame, shapeElement.f3355x1, c0962esArr, shapeElement.getFillSource(), iFillParamSource, kg7Var3);
                    shapeFrame2 = shapeFrame;
                    kg7Var2 = kg7Var3;
                    if (c0962esMo4333k4 != null && c0962esMo4333k4.m5681to() != 0 && c0962esMo4333k4.m5681to() != -1) {
                        z2 = z;
                    }
                    if (shapeElement.getStrokeSource() == 0) {
                        azo azoVarM4332k4 = geometryShape.m1586ks().m4332k4(shapeFrame2, abstractC14897zn.m74623ks(), shapeElement.f3355x1, kg7Var2);
                        if (azoVarM4332k4 == null || !azoVarM4332k4.m3903h4() || azoVarM4332k4.m3901dy() == null || azoVarM4332k4.m3901dy().m5681to() == 0 || azoVarM4332k4.m3901dy().m5681to() == -1) {
                            float f4 = f2;
                            r21 = z2 ? 1 : 0;
                            f3 = f4;
                        } else {
                            float fM67481k4 = C14116yg.m67481k4(f2, (float) azoVarM4332k4.m3906k4());
                            if (z2 || (azoVarM4332k4.m3897c5() <= 0 && azoVarM4332k4.m3905jd() <= 0)) {
                                z3 = z2 ? 1 : 0;
                            } else {
                                C12026yj c12026yjM3930x6 = azoVarM4332k4.m3930x6();
                                C11896dy c11896dy = (C11896dy) shapeElement.f3355x1.deepClone();
                                C12556ck.m58562k4(c11896dy, c12026yjM3930x6);
                                C12007ix c12007ixClone2 = c11896dy.m55523c5().Clone();
                                fM67481k4 = C14116yg.m67481k4(fM67481k4, C14116yg.m67504x1(c12007ixClone2.m56550c5(), c12007ixClone2.m56575x1()));
                                C4459os c4459os3 = new C4459os(shapeFrame2.getWidth(), shapeFrame2.getHeight());
                                C11896dy c11896dyM3904ix = azoVarM4332k4.m3904ix();
                                byte bM3897c5 = azoVarM4332k4.m3897c5();
                                z3 = z2 ? 1 : 0;
                                C4459os.m18282x1(AbstractC14780xb.m73280k4(azoVarM4332k4.m3922u4(), azoVarM4332k4.m3905jd(), c4459os3.Clone()).Clone(), AbstractC14780xb.m73280k4(c11896dyM3904ix, bM3897c5, c4459os3.Clone()).Clone()).CloneTo(c4459os);
                            }
                            f3 = fM67481k4;
                            r21 = (z3 || you.m73962x1(geometryShape.getShapeType()) || azoVarM4332k4.m3906k4() > 1.0d || ((double) C14116yg.m67480k4(c4473umClone.m18372kk() - 1.0f)) >= 1.0E-4d) ? z : z6;
                        }
                        i5 = i3 + r21;
                        r0 = r21;
                    } else {
                        boolean z7 = z2 ? 1 : 0;
                        f3 = f2;
                        i5 = i3;
                        r0 = z2;
                    }
                    c12007ix2 = c12007ix;
                    if (!C12007ix.m56546kk(c12007ix2, C12007ix.f40519k4) && r0 != 0) {
                        c12007ixM56549x1 = shapeElement.f3355x1.m55523c5();
                    } else if (r0 == 0) {
                        c12007ixM56549x1 = C12007ix.m56549x1(c12007ix2.Clone(), shapeElement.f3355x1.m55523c5().Clone());
                    }
                    c12007ixM56549x1.CloneTo(c12007ix2);
                } else {
                    c4459os = c4459os2;
                    c12007ix = c12007ixClone;
                    i = length;
                    i2 = i4;
                    f2 = f3;
                    z = z4;
                    shapeFrame2 = shapeFrame;
                    i3 = i5;
                }
                z2 = z6;
                if (shapeElement.getStrokeSource() == 0) {
                }
                c12007ix2 = c12007ix;
                if (!C12007ix.m56546kk(c12007ix2, C12007ix.f40519k4)) {
                    if (r0 == 0) {
                    }
                }
            }
            i4 = i2 + 1;
            c4459os2 = c4459os;
            c12007ixClone = c12007ix2;
            z5 = z6;
            z4 = z;
        }
        C4459os c4459os4 = c4459os2;
        C12007ix c12007ix3 = c12007ixClone;
        boolean z8 = z4;
        boolean z9 = z5;
        int i6 = i5;
        float f5 = f3;
        if (i6 == 0) {
            return z9;
        }
        C12007ix c12007ix4 = new C12007ix();
        C12007ix[] c12007ixArr = {c12007ix4};
        C12009k4 c12009k4M73290k4 = m73290k4(abstractC14897zn, kg7Var2, geometryShape, shapeElementArr, m73299x1() ? geometryShape.m2546bz().m5635k4(z8) : shapeFrame, f5, (byte) 7, c12007ixArr);
        c12007ixArr[z9 ? 1 : 0].CloneTo(c12007ix4);
        float centerX = shapeFrame.getCenterX();
        float centerY = shapeFrame.getCenterY();
        float fM56550c5 = shapeFrame.m2660k4().m56550c5() / 2.0f;
        float fM56575x1 = shapeFrame.m2660k4().m56575x1() / 2.0f;
        if (m73298k4(geometryShape)) {
            centerX = C22205OooOOo.OooO00o(c12007ix3, 2.0f, c12007ix3.m56557jd());
            centerY = C22203OooOO0o.OooO0O0(c12007ix3, 2.0f, c12007ix3.m56551ck());
            fM56550c5 = c12007ix3.m56550c5() / 2.0f;
            fM56575x1 = c12007ix3.m56575x1() / 2.0f;
        }
        C4489zj c4489zj = new C4489zj(fM56550c5, fM56575x1, 0.0f);
        C4459os c4459os5 = new C4459os(centerX, centerY);
        if (i6 == 1) {
            if (shapeFrame.getFlipH() == 1 && !m73298k4(geometryShape)) {
                c4459os4.m18286k4(-c4459os4.m18285k4());
            }
            if (shapeFrame.getFlipV() == 1 && !m73298k4(geometryShape)) {
                c4459os4.m18291x1(-c4459os4.m18290x1());
            }
            C4459os.m18279k4(c4459os5, m73298k4(geometryShape) ? C4459os.m18277k4(-2.0f, c4459os4) : c4459os4).CloneTo(c4459os5);
            f = 0.0f;
        } else {
            f = 0.0f;
            c4459os4 = new C4459os(0.0f);
        }
        tfm tfmVar = new tfm();
        tfmVar.m71141kk(iM73277k4);
        tfmVar.m71139k4(c12009k4M73290k4);
        tfmVar.m71147x1(c12009k4M73290k4);
        tfmVar.m71138k4(m73288k4(c4459os5.Clone(), fM3163x1, c12007ix4.Clone(), true, this.f50035x1, new C4317dy(shapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrame.getFlipV() == 1 ? -1.0f : 1.0f, (m73298k4(geometryShape) || shapeFrame.getFlipH() != 1) ? f : (-c4459os4.m18285k4()) * 2.0f, (m73298k4(geometryShape) || shapeFrame.getFlipV() != 1) ? f : c4459os4.m18290x1() * 2.0f)));
        C4489zj c4489zj2 = new C4489zj();
        C4489zj c4489zj3 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj2};
        C4489zj[] c4489zjArr2 = {c4489zj3};
        tfmVar.m71143m9().m18396k4(c4473umClone.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[z9 ? 1 : 0].CloneTo(c4489zj2);
        c4489zjArr2[z9 ? 1 : 0].CloneTo(c4489zj3);
        float fM18506k4 = c4489zj.m18506k4();
        float fM67480k4 = C14116yg.m67480k4(c4489zj2.m18506k4());
        float fM67480k42 = C14116yg.m67480k4(c4489zj3.m18506k4());
        float[] fArr = new float[2];
        fArr[z9 ? 1 : 0] = fM67480k4;
        fArr[1] = fM67480k42;
        c4489zj.m18507k4(C4479w6.m18405k4(fM18506k4, fArr));
        float fM18511x1 = c4489zj.m18511x1();
        float fM67480k43 = C14116yg.m67480k4(c4489zj2.m18511x1());
        float fM67480k44 = C14116yg.m67480k4(c4489zj3.m18511x1());
        float[] fArr2 = new float[2];
        fArr2[z9 ? 1 : 0] = fM67480k43;
        fArr2[1] = fM67480k44;
        c4489zj.m18512x1(C4479w6.m18405k4(fM18511x1, fArr2));
        List<tfm> list = new List<>();
        list.addItem(tfmVar);
        if (m73298k4(geometryShape)) {
            c4459os5 = m71072k4(c4459os5.Clone(), shapeFrame);
        }
        C4459os c4459osClone = c4459os5.Clone();
        List<C4430ar> list2 = new List<>();
        list2.addItem(txr.m71438k4());
        m73293k4(abstractC14897zn, geometryShape, list, c4473umClone.Clone(), c4459osClone.Clone(), c4489zj.Clone(), iM73277k4, fArrM71272k4, list2);
        m73292k4(list);
        return true;
    }
}
