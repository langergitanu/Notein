package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12011ks;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.qy7;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class er8 {

    /* JADX INFO: renamed from: k4 */
    private Shape f4852k4;

    /* JADX INFO: renamed from: x1 */
    private static final C12025x6[] f4851x1 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 0);

    /* JADX INFO: renamed from: kk */
    private static final float[] f4850kk = new float[0];

    public er8(Shape shape) {
        if (shape == null) {
            throw new ArgumentNullException("shape");
        }
        m5624k4(shape);
    }

    /* JADX INFO: renamed from: c5 */
    public final float[] m5627c5() {
        float[] fArrMo1216S_ = m5629du().mo1216S_();
        return fArrMo1216S_ != null ? fArrMo1216S_ : f4850kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C12007ix m5628ck() {
        C12007ix c12007ix = new C12007ix(m5629du().getX(), m5629du().getY(), m5629du().getWidth() > 1.0f ? m5629du().getWidth() : 1.0f, m5629du().getHeight() > 1.0f ? m5629du().getHeight() : 1.0f);
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5() * 4.0f), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1() * 4.0f), 13), 2498570);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            v7f.m72086k4(c14047bzClone.Clone());
            c12009k4.m56606k4(C12003du.m56385i5().Clone());
            c12009k4.m56332k4(96.0f, 96.0f);
            C12025x6 c12025x6 = new C12025x6(c12007ix.m56557jd() - (c12007ix.m56550c5() / 2.0f), c12007ix.m56551ck() - (c12007ix.m56575x1() / 2.0f));
            omq omqVar = new omq(c12009k4, c12009k4.mo15760yj(), c12009k4.mo15757m9());
            try {
                omqVar.m74612k4(-c12025x6.m56897x1(), -c12025x6.m56895kk());
                mo4131k4(omqVar, new kg7(m5642m9(), new C12210k4(C7134m9.class, C7131h4.class), new C13700js()), InterruptionToken.getNone());
                omqVar.dispose();
                C12007ix c12007ixClone = C12007ix.m56544k4(C3099wl.m13197x1(c12009k4)).Clone();
                c12007ixClone.m56567kk(c12025x6.m56897x1(), c12025x6.m56895kk());
                C12007ix.m56549x1(c12007ix.Clone(), c12007ixClone.Clone()).CloneTo(c12007ix);
                return c12007ix;
            } catch (Throwable th) {
                omqVar.dispose();
                throw th;
            }
        } finally {
            v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public final Shape m5629du() {
        return this.f4852k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6[] m5630dy() {
        C12025x6[] c12025x6ArrMo1215R_ = m5629du().mo1215R_();
        if (c12025x6ArrMo1215R_ == null) {
            return f4851x1;
        }
        if (c12025x6ArrMo1215R_.length > 0) {
            ShapeFrame shapeFrameM2593xk = m5629du().m2593xk();
            C4317dy c4317dy = new C4317dy(shapeFrameM2593xk.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM2593xk.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrameM2593xk.getFlipH() == 1 ? shapeFrameM2593xk.getCenterX() * 2.0f : 0.0f, shapeFrameM2593xk.getFlipV() == 1 ? shapeFrameM2593xk.getCenterY() * 2.0f : 0.0f);
            if (!C14064he.m66715kk(shapeFrameM2593xk.getRotation())) {
                c4317dy.m17339k4((shapeFrameM2593xk.getFlipH() == 1) ^ (shapeFrameM2593xk.getFlipV() == 1) ? -shapeFrameM2593xk.getRotation() : shapeFrameM2593xk.getRotation(), new C12025x6(shapeFrameM2593xk.getCenterX(), shapeFrameM2593xk.getCenterY()), 0);
            }
            c4317dy.m17342k4(c12025x6ArrMo1215R_);
        }
        return c12025x6ArrMo1215R_;
    }

    /* JADX INFO: renamed from: fa */
    public final ShapeFrame m5631fa() {
        return m5635k4(false);
    }

    /* JADX INFO: renamed from: h4 */
    public final Presentation m5632h4() {
        return (Presentation) m5629du().getPresentation();
    }

    /* JADX INFO: renamed from: jd */
    public final C12007ix m5633jd() {
        return m5622k4(new float[]{((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1() > m5629du().getWidth() ? ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1() : m5629du().getWidth()}, new float[]{((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk() > m5629du().getHeight() ? ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk() : m5629du().getHeight()}).Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final ShapeFrame m5634k4(double d, double d2) {
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = 0.0f;
        c1258im.f5733to = false;
        c1258im.f5732kk = false;
        nuk nukVar = new nuk();
        new tbp(d, d2).m71061du().CloneTo(nukVar.f47615k4);
        oju.f47834kk.CloneTo(nukVar.f47617x1);
        nukVar.f47616kk = c1258im;
        nuk nukVarClone = m5637k4(nukVar).Clone();
        oju ojuVar = nukVarClone.f47615k4;
        float f = ojuVar.f47836k4;
        float f2 = ojuVar.f47837x1;
        oju ojuVar2 = nukVarClone.f47617x1;
        float f3 = ojuVar2.f47836k4;
        float f4 = ojuVar2.f47837x1;
        C1258im c1258im2 = nukVarClone.f47616kk;
        boolean z = c1258im2.f5733to;
        boolean z2 = c1258im2.f5732kk;
        return new ShapeFrame(f, f2, f3, f4, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0, c1258im2.f5734x1);
    }

    /* JADX INFO: renamed from: kk */
    public void mo5640kk() {
    }

    /* JADX INFO: renamed from: ks */
    public final nuk m5641ks() {
        nd1 nd1VarMo1214P_ = m5629du().mo1214P_();
        tbp tbpVarClone = nd1VarMo1214P_.m67982k4().Clone();
        tbp tbpVarClone2 = m5629du().m2575sv().Clone();
        float fM67988kk = nd1VarMo1214P_.m67988kk();
        byte bM67989to = nd1VarMo1214P_.m67989to();
        byte bM67980du = nd1VarMo1214P_.m67980du();
        if (C14044b3.m66437kk(tbpVarClone.f49090k4) || C14044b3.m66437kk(tbpVarClone.f49091x1) || C14044b3.m66437kk(tbpVarClone2.f49090k4) || C14044b3.m66437kk(tbpVarClone2.f49091x1) || C14064he.m66715kk(fM67988kk) || bM67989to == -1 || bM67980du == -1) {
            for (Shape shape : m5629du().m2547c6()) {
                IShapeFrame frame = shape.getFrame();
                if (C14044b3.m66437kk(tbpVarClone.f49090k4)) {
                    tbpVarClone.f49090k4 = frame.getX();
                }
                if (C14044b3.m66437kk(tbpVarClone.f49091x1)) {
                    tbpVarClone.f49091x1 = frame.getY();
                }
                if (C14044b3.m66437kk(tbpVarClone2.f49090k4)) {
                    tbpVarClone2.f49090k4 = frame.getWidth();
                }
                if (C14044b3.m66437kk(tbpVarClone2.f49091x1)) {
                    tbpVarClone2.f49091x1 = frame.getHeight();
                }
                if (C14064he.m66715kk(fM67988kk)) {
                    fM67988kk = frame.getRotation();
                }
                if (bM67989to == -1) {
                    bM67989to = frame.getFlipH();
                }
                if (bM67980du == -1) {
                    bM67980du = frame.getFlipV();
                }
                if (!C14044b3.m66437kk(tbpVarClone.f49090k4) && !C14044b3.m66437kk(tbpVarClone.f49091x1) && !C14044b3.m66437kk(tbpVarClone2.f49090k4) && !C14044b3.m66437kk(tbpVarClone2.f49091x1) && !C14064he.m66715kk(fM67988kk) && bM67989to != -1 && bM67980du != -1) {
                    break;
                }
            }
        }
        if (C14044b3.m66437kk(tbpVarClone.f49090k4)) {
            tbpVarClone.f49090k4 = 0.0d;
        }
        if (C14044b3.m66437kk(tbpVarClone.f49091x1)) {
            tbpVarClone.f49091x1 = 0.0d;
        }
        if (C14044b3.m66437kk(tbpVarClone2.f49090k4)) {
            tbpVarClone2.f49090k4 = 0.0d;
        }
        if (C14044b3.m66437kk(tbpVarClone2.f49091x1)) {
            tbpVarClone2.f49091x1 = 0.0d;
        }
        if (C14064he.m66715kk(fM67988kk)) {
            fM67988kk = 0.0f;
        }
        if (bM67989to == -1) {
            bM67989to = 0;
        }
        if (bM67980du == -1) {
            bM67980du = 0;
        }
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = fM67988kk;
        c1258im.f5733to = bM67989to == 1;
        c1258im.f5732kk = bM67980du == 1;
        nuk nukVar = new nuk();
        tbpVarClone.m71061du().CloneTo(nukVar.f47615k4);
        tbpVarClone2.m71061du().CloneTo(nukVar.f47617x1);
        nukVar.f47616kk = c1258im;
        return nukVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final BaseSlide m5642m9() {
        return m5629du().m2583vj();
    }

    /* JADX INFO: renamed from: rv */
    public C12025x6[] m5643rv() {
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return null;
        }
        float f = (width / 2.0f) + x;
        float f2 = (height / 2.0f) + y;
        return new C12025x6[]{new C12025x6(f, y), new C12025x6(x, f2), new C12025x6(f, y + height), new C12025x6(x + width, f2)};
    }

    /* JADX INFO: renamed from: up */
    public final nuk m5644up() {
        return m5645x1(false);
    }

    /* JADX INFO: renamed from: x1 */
    public final nuk m5645x1(boolean z) {
        mo5640kk();
        return m5638k4(m5641ks().Clone().Clone(), z);
    }

    /* JADX INFO: renamed from: yj */
    public final ShapeFrame m5646yj() {
        mo5640kk();
        nuk nukVarClone = m5641ks().Clone();
        C1258im c1258im = nukVarClone.f47616kk;
        boolean z = c1258im.f5733to;
        boolean z2 = c1258im.f5732kk;
        oju ojuVar = nukVarClone.f47615k4;
        float f = ojuVar.f47836k4;
        float f2 = ojuVar.f47837x1;
        oju ojuVar2 = nukVarClone.f47617x1;
        return new ShapeFrame(f, f2, ojuVar2.f47836k4, ojuVar2.f47837x1, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0, c1258im.f5734x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final ShapeFrame m5635k4(boolean z) {
        nuk nukVarClone = m5645x1(z).Clone();
        oju ojuVar = nukVarClone.f47615k4;
        float f = ojuVar.f47836k4;
        float f2 = ojuVar.f47837x1;
        oju ojuVar2 = nukVarClone.f47617x1;
        float f3 = ojuVar2.f47836k4;
        float f4 = ojuVar2.f47837x1;
        C1258im c1258im = nukVarClone.f47616kk;
        boolean z2 = c1258im.f5733to;
        boolean z3 = c1258im.f5732kk;
        return new ShapeFrame(f, f2, f3, f4, z2 ? (byte) 1 : (byte) 0, z3 ? (byte) 1 : (byte) 0, c1258im.f5734x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m5621k4(IShapeFrame iShapeFrame) {
        float f;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        c12025x6Arr[0] = new C12025x6(iShapeFrame.getX(), iShapeFrame.getY());
        c12025x6Arr[1] = new C12025x6(iShapeFrame.getWidth() + iShapeFrame.getX(), iShapeFrame.getY());
        c12025x6Arr[2] = new C12025x6(iShapeFrame.getWidth() + iShapeFrame.getX(), iShapeFrame.getHeight() + iShapeFrame.getY());
        c12025x6Arr[3] = new C12025x6(iShapeFrame.getX(), iShapeFrame.getHeight() + iShapeFrame.getY());
        float f2 = -1.0f;
        if (iShapeFrame.getFlipH() == 1) {
            f = -1.0f;
        } else {
            f = -1.0f;
            f2 = 1.0f;
        }
        C4317dy c4317dy = new C4317dy(f2, 0.0f, 0.0f, iShapeFrame.getFlipV() == 1 ? f : 1.0f, iShapeFrame.getFlipH() == 1 ? iShapeFrame.getCenterX() * 2.0f : 0.0f, iShapeFrame.getFlipV() == 1 ? iShapeFrame.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(iShapeFrame.getRotation())) {
            c4317dy.m17339k4((iShapeFrame.getFlipH() == 1) ^ (iShapeFrame.getFlipV() == 1) ? -iShapeFrame.getRotation() : iShapeFrame.getRotation(), new C12025x6(iShapeFrame.getCenterX(), iShapeFrame.getCenterY()), 0);
        }
        c4317dy.m17342k4(c12025x6Arr);
        float fM56897x1 = -3.4028235E38f;
        float fM56897x12 = Float.MAX_VALUE;
        float fM56895kk = Float.MAX_VALUE;
        float fM56895kk2 = -3.4028235E38f;
        for (C12025x6 c12025x6 : c12025x6Arr) {
            if (fM56897x12 > c12025x6.m56897x1()) {
                fM56897x12 = c12025x6.m56897x1();
            }
            if (fM56897x1 < c12025x6.m56897x1()) {
                fM56897x1 = c12025x6.m56897x1();
            }
            if (fM56895kk > c12025x6.m56895kk()) {
                fM56895kk = c12025x6.m56895kk();
            }
            if (fM56895kk2 < c12025x6.m56895kk()) {
                fM56895kk2 = c12025x6.m56895kk();
            }
        }
        return new C12007ix(fM56897x12, fM56895kk, fM56897x1 - fM56897x12, fM56895kk2 - fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    private C12007ix m5622k4(float[] fArr, float[] fArr2) {
        float width = m5629du().getWidth();
        float height = m5629du().getHeight();
        oju ojuVarClone = oju.f47834kk.Clone();
        ojuVarClone.f47836k4 = m5629du().getX();
        ojuVarClone.f47837x1 = m5629du().getY();
        C14754wx c14754wxM1389m9 = m5629du().m2595yd().m1389m9();
        if (!c14754wxM1389m9.isNoEffects()) {
            C12007ix c12007ix = new C12007ix(ojuVarClone.f47836k4, ojuVarClone.f47837x1, width, height);
            C14381rb.m70047k4(c14754wxM1389m9, c12007ix.Clone()).CloneTo(c12007ix);
            ojuVarClone.f47836k4 = c12007ix.m56557jd();
            ojuVarClone.f47837x1 = c12007ix.m56551ck();
            width = c12007ix.m56550c5();
            height = c12007ix.m56575x1();
        }
        if (C0964eu.m5719k4()) {
            C12007ix c12007ixClone = C0964eu.m5717k4(m5629du()).Clone();
            C12007ix c12007ix2 = new C12007ix(ojuVarClone.f47836k4, ojuVarClone.f47837x1, width, height);
            C12007ix.m56549x1(c12007ix2.Clone(), c12007ixClone.Clone()).CloneTo(c12007ix2);
            ojuVarClone.f47836k4 = c12007ix2.m56557jd();
            ojuVarClone.f47837x1 = c12007ix2.m56551ck();
            width = c12007ix2.m56550c5();
            height = c12007ix2.m56575x1();
        }
        if (C7019kk.m27469x1(m5629du(), AutoShape.class) && ((AutoShape) m5629du()).getTextFrame() != null) {
            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) m5629du(), AutoShape.class);
            if (autoShape.isTextBox()) {
                TextFrame textFrame = (TextFrame) autoShape.getTextFrame();
                jq6.m63487k4(textFrame.f3523to, m5629du().getWidth(), m5629du().getHeight(), (kg7) null);
                float f = textFrame.f3523to.mo64296kk().Clone().f47837x1;
                if (height < f) {
                    oju.m68619k4(ojuVarClone, textFrame.f3523to.mo64300x1()).CloneTo(ojuVarClone);
                    height = f;
                }
            }
        }
        oju[] ojuVarArr = {ojuVarClone};
        float[] fArr3 = {width};
        float[] fArr4 = {height};
        m5625k4(ojuVarArr, fArr3, fArr4, fArr, fArr2);
        ojuVarArr[0].CloneTo(ojuVarClone);
        return new C12007ix(ojuVarClone.f47836k4, ojuVarClone.f47837x1, fArr3[0], fArr4[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m5636k4(int i, float f, float f2) {
        float fM56699x1 = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1() > m5629du().getWidth() ? ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1() : m5629du().getWidth();
        float fM56697kk = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk() > m5629du().getHeight() ? ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk() : m5629du().getHeight();
        if (i == 0 || i == 2) {
            fM56699x1 = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1();
            fM56697kk = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk();
        }
        float width = m5629du().getWidth();
        float height = m5629du().getHeight();
        oju ojuVarClone = oju.f47834kk.Clone();
        float fM67988kk = m5629du().m2548dq().m67988kk();
        if (i == 1) {
            m5629du().m2548dq().m67984k4(0.0f);
            float[] fArr = {fM56699x1};
            float[] fArr2 = {fM56697kk};
            C12007ix c12007ixClone = m5622k4(fArr, fArr2).Clone();
            float f3 = fArr[0];
            float f4 = fArr2[0];
            ojuVarClone.f47836k4 = c12007ixClone.m56557jd();
            ojuVarClone.f47837x1 = c12007ixClone.m56551ck();
            float fM56550c5 = c12007ixClone.m56550c5();
            float fM56575x1 = c12007ixClone.m56575x1();
            fM56697kk = f4;
            fM56699x1 = f3;
            width = fM56550c5;
            height = fM56575x1;
        }
        float f5 = width;
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(fM56699x1 * f, 14), OooO.OooO00o(fM56697kk * f2, 14), 2498570);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
            abstractC12008jdM56582k4.dispose();
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            try {
                try {
                    v7f.m72086k4(c14047bzClone.Clone());
                    c12009k4.m56332k4(96.0f, 96.0f);
                    float f6 = height;
                    omq omqVar = new omq(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM56699x1)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM56697kk)), 14));
                    try {
                        kg7 kg7Var = new kg7(m5642m9(), new C12210k4(C7134m9.class, C7131h4.class), new C13700js());
                        float f7 = ojuVarClone.f47836k4;
                        if (f7 != 0.0f || ojuVarClone.f47837x1 != 0.0f) {
                            omqVar.m74612k4(-f7, -ojuVarClone.f47837x1);
                        }
                        mo4131k4(omqVar, kg7Var, InterruptionToken.getNone());
                        omqVar.dispose();
                        if (i == 1) {
                            int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(f5 * f)), 14);
                            int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(f6 * f2)), 14);
                            C12009k4 c12009k42 = new C12009k4(iM27462to, iM27462to2, 2498570);
                            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                            try {
                                C12007ix c12007ix = new C12007ix(0.0f, 0.0f, iM27462to, iM27462to2);
                                abstractC12008jdM56582k4.mo17507k4(c12009k4, c12007ix.Clone(), c12007ix.Clone(), 2);
                                abstractC12008jdM56582k4.dispose();
                                c12009k4.dispose();
                                c12009k4 = c12009k42;
                            } finally {
                            }
                        }
                        if (i == 2) {
                            C12009k4 c12009k4M13177k4 = C3099wl.m13177k4(c12009k4);
                            c12009k4.dispose();
                            c12009k4 = c12009k4M13177k4;
                        }
                        byte[][] bArr = {null};
                        int[] iArrM2334k4 = Presentation.m2334k4((ctm) m5632h4().m2399x6(), bArr);
                        byte[] bArr2 = bArr[0];
                        String[] strArrM12798to = C3038bv.m12798to();
                        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
                            strArrM12798to = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
                        }
                        int[] iArrM12821x1 = C3052g8.f9069k4;
                        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
                            try {
                                C3041c6.m12809k4().m12825to();
                                iArrM12821x1 = C3041c6.m12821x1();
                            } catch (IllegalStateException e) {
                                int[] iArr = C3052g8.f9069k4;
                                C3085sv.m13082k4(e);
                                iArrM12821x1 = iArr;
                            }
                        }
                        String str = strArrM12798to[0];
                        if ((!Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) || C3092um.m13135k4() == null || !(C3092um.m13135k4() instanceof C3038bv)) && !Arrays.equals(iArrM2334k4, r1s.f48530kk) && !Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
                            qy7.C14366k4 c14366k4 = new qy7.C14366k4();
                            c14366k4.f48495k4 = "Arial";
                            c14366k4.f48498x1 = 26.0f;
                            c14366k4.f48496kk = true;
                            qy7 qy7Var = new qy7(m5632h4(), 72.0f, c14366k4.Clone());
                            qy7Var.m69901k4(C12003du.m56398k4(192, 255, 216, 207).Clone());
                            qy7Var.m69904k4(true);
                            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                            try {
                                abstractC12008jdM56582k4.mo17555k4(str, new C12013m9("Arial", 26.0f), new C11999ar(C12003du.m56398k4(192, 255, 216, 207).Clone()), new C12007ix(0.0f, 0.0f, c12009k4.mo15760yj(), c12009k4.mo15757m9()));
                                abstractC12008jdM56582k4.dispose();
                            } finally {
                            }
                        }
                        v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
                        m5629du().m2548dq().m67984k4(fM67988kk);
                        return c12009k4;
                    } catch (Throwable th) {
                        omqVar.dispose();
                        throw th;
                    }
                } catch (Throwable th2) {
                    m5629du().m2548dq().m67984k4(fM67988kk);
                    throw th2;
                }
            } catch (RuntimeException e2) {
                v7f.m72090x1(c14047bzClone.Clone());
                c12009k4.dispose();
                throw e2;
            }
        } finally {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12014ne m5623k4() {
        float fM56699x1 = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56699x1();
        float fM56697kk = ((SlideSize) m5632h4().getSlideSize()).m2755k4().m56697kk();
        float fM67988kk = m5629du().m2548dq().m67988kk();
        boolean zM5719k4 = C0964eu.m5719k4();
        C0964eu.m5718k4(false);
        C12009k4 c12009k4 = new C12009k4(OooO.OooO00o(fM56699x1, 14), OooO.OooO00o(fM56697kk, 14), 2498570);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56385i5().Clone());
            abstractC12008jdM56582k4.dispose();
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            try {
                try {
                    v7f.m72086k4(c14047bzClone.Clone());
                    C12556ck.m58569k4(c12009k4, C12003du.m56385i5().Clone());
                    c12009k4.m56332k4(96.0f, 96.0f);
                    omq omqVar = new omq(c12009k4, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(r5)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(r8)), 14));
                    try {
                        mo4131k4(omqVar, new kg7(m5642m9(), new C12210k4(C7134m9.class, C7131h4.class), new C13700js()), InterruptionToken.getNone());
                        omqVar.dispose();
                        C12014ne c12014neClone = C3099wl.m13197x1(c12009k4).Clone();
                        v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
                        c12009k4.dispose();
                        return c12014neClone;
                    } catch (Throwable th) {
                        omqVar.dispose();
                        throw th;
                    }
                } catch (RuntimeException e) {
                    v7f.m72090x1(c14047bzClone.Clone());
                    c12009k4.dispose();
                    throw e;
                }
            } finally {
                m5629du().m2548dq().m67984k4(fM67988kk);
                C0964eu.m5718k4(zM5719k4);
            }
        } catch (Throwable th2) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final nuk m5637k4(nuk nukVar) {
        return m5638k4(nukVar.Clone(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[PHI: r4
      0x0096: PHI (r4v27 boolean) = (r4v23 boolean), (r4v31 boolean) binds: [B:34:0x00aa, B:25:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[PHI: r4
      0x0098: PHI (r4v25 boolean) = (r4v23 boolean), (r4v31 boolean) binds: [B:34:0x00aa, B:25:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128 A[PHI: r5
      0x0128: PHI (r5v26 boolean) = (r5v21 boolean), (r5v30 boolean) binds: [B:64:0x013c, B:55:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[PHI: r5
      0x012a: PHI (r5v23 boolean) = (r5v21 boolean), (r5v30 boolean) binds: [B:64:0x013c, B:55:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be A[PHI: r2
      0x01be: PHI (r2v13 boolean) = (r2v9 boolean), (r2v18 boolean) binds: [B:91:0x01da, B:82:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0 A[PHI: r2
      0x01c0: PHI (r2v11 boolean) = (r2v9 boolean), (r2v18 boolean) binds: [B:91:0x01da, B:82:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nuk m5638k4(nuk nukVar, boolean z) {
        boolean z2;
        double d;
        boolean z3;
        oju ojuVar;
        boolean z4;
        double d2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        double d3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean zM2572qm = m5629du().m2572qm();
        C1258im c1258im = nukVar.f47616kk;
        boolean z12 = c1258im.f5733to;
        boolean z13 = c1258im.f5732kk;
        float fM67988kk = c1258im.f5734x1;
        char c = 2;
        oju ojuVarClone = oju.m68619k4(nukVar.f47615k4, oju.m68618k4(nukVar.f47617x1, 2)).Clone();
        oju ojuVarClone2 = ojuVarClone.Clone();
        oju ojuVar2 = nukVar.f47617x1;
        double d4 = ojuVar2.f47836k4;
        double d5 = ojuVar2.f47837x1;
        GroupShape groupShapeM2573s7 = m5629du().m2573s7();
        boolean zM2572qm2 = zM2572qm;
        while (groupShapeM2573s7 != null && (groupShapeM2573s7.m2594xw() != null || groupShapeM2573s7.mo272to().m68902kk() != null)) {
            if (groupShapeM2573s7.m2594xw() != null) {
                nd1 nd1VarMo1214P_ = groupShapeM2573s7.mo1214P_();
                tbp tbpVarClone = groupShapeM2573s7.m1643ck().Clone();
                if (zM2572qm2) {
                    z7 = z12;
                    z8 = z13;
                    d4 *= tbpVarClone.f49091x1;
                    d3 = tbpVarClone.f49090k4;
                } else {
                    d4 *= tbpVarClone.f49090k4;
                    z7 = z12;
                    z8 = z13;
                    d3 = tbpVarClone.f49091x1;
                }
                d5 *= d3;
                if (zM2572qm2 ^ zM2572qm) {
                    z12 = (nd1VarMo1214P_.m67980du() == 1) ^ z7;
                    if (nd1VarMo1214P_.m67989to() == 1) {
                    }
                } else {
                    z12 = (nd1VarMo1214P_.m67989to() == 1) ^ z7;
                    z9 = nd1VarMo1214P_.m67980du() == 1;
                }
                z13 = z8 ^ z9;
                if ((nd1VarMo1214P_.m67989to() == 1) ^ (nd1VarMo1214P_.m67980du() == 1)) {
                    fM67988kk = -fM67988kk;
                }
                fM67988kk += nd1VarMo1214P_.m67988kk();
                zM2572qm2 ^= groupShapeM2573s7.m2572qm();
                groupShapeM2573s7.m1645k4(ojuVarClone.Clone(), ojuVarClone2.Clone(), z).m71061du().CloneTo(ojuVarClone);
                tbp.m71054k4(nd1VarMo1214P_.m67982k4(), tbp.m71053k4(groupShapeM2573s7.m2575sv(), 2)).m71061du().CloneTo(ojuVarClone2);
                groupShapeM2573s7 = groupShapeM2573s7.m2573s7();
                c = 2;
            } else {
                boolean z14 = z13;
                char c2 = c;
                double d6 = d4;
                boolean z15 = z12;
                nd1 nd1VarMo1214P_2 = ((Shape) groupShapeM2573s7.mo272to().m68902kk()).mo1214P_();
                if (zM2572qm2 ^ zM2572qm) {
                    z10 = (nd1VarMo1214P_2.m67980du() == 1) ^ z15;
                    if (nd1VarMo1214P_2.m67989to() == 1) {
                    }
                } else {
                    z10 = (nd1VarMo1214P_2.m67989to() == 1) ^ z15;
                    z11 = nd1VarMo1214P_2.m67980du() == 1;
                }
                boolean z16 = z14 ^ z11;
                zM2572qm2 ^= groupShapeM2573s7.m2572qm();
                tbp.m71054k4(ojuVarClone.m68629x1(), nd1VarMo1214P_2.m67982k4()).m71061du().CloneTo(ojuVarClone);
                nd1VarMo1214P_2.m67982k4().m71061du().CloneTo(ojuVarClone2);
                groupShapeM2573s7 = ((Shape) groupShapeM2573s7.mo272to().m68902kk()).m2573s7();
                z12 = z10;
                z13 = z16;
                c = c2;
                d4 = d6;
            }
        }
        boolean z17 = z12;
        boolean z18 = z13;
        double d7 = d4;
        if (groupShapeM2573s7 == null || !C7019kk.m27469x1(groupShapeM2573s7.m2576t6(), Chart.class)) {
            z2 = z17;
            d = d7;
            z3 = z18;
        } else {
            tbp tbpVarClone2 = groupShapeM2573s7.m1643ck().Clone();
            if (zM2572qm2) {
                ojuVar = ojuVarClone2;
                z4 = z17;
                d = d7 * tbpVarClone2.f49091x1;
                d2 = tbpVarClone2.f49090k4;
            } else {
                d = tbpVarClone2.f49090k4 * d7;
                ojuVar = ojuVarClone2;
                z4 = z17;
                d2 = tbpVarClone2.f49091x1;
            }
            d5 *= d2;
            if (zM2572qm ^ zM2572qm2) {
                z5 = (groupShapeM2573s7.mo1214P_().m67980du() == 1) ^ z4;
                if (groupShapeM2573s7.mo1214P_().m67989to() == 1) {
                }
            } else {
                z5 = (groupShapeM2573s7.mo1214P_().m67989to() == 1) ^ z4;
                z6 = groupShapeM2573s7.mo1214P_().m67980du() == 1;
            }
            boolean z19 = z18 ^ z6;
            if ((groupShapeM2573s7.mo1214P_().m67989to() == 1) ^ (groupShapeM2573s7.mo1214P_().m67980du() == 1)) {
                fM67988kk = -fM67988kk;
            }
            fM67988kk += groupShapeM2573s7.mo1214P_().m67988kk();
            ((tbpVarClone2.f49090k4 == 1.0d && tbpVarClone2.f49091x1 == 1.0d) ? tbp.m71054k4(ojuVarClone.m68629x1(), groupShapeM2573s7.m2548dq().m67982k4()) : groupShapeM2573s7.m1645k4(ojuVarClone.Clone(), ojuVar.Clone(), z)).m71061du().CloneTo(ojuVarClone);
            z2 = z5;
            z3 = z19;
        }
        C1258im c1258im2 = new C1258im();
        c1258im2.f5733to = z2;
        c1258im2.f5732kk = z3;
        c1258im2.f5734x1 = ShapeFrame.m2658k4(fM67988kk);
        nuk nukVar2 = new nuk();
        nukVar2.f47615k4 = new oju((float) (((double) ojuVarClone.f47836k4) - (d / 2.0d)), (float) (((double) ojuVarClone.f47837x1) - (d5 / 2.0d)));
        nukVar2.f47617x1 = new oju((float) d, (float) d5);
        nukVar2.f47616kk = c1258im2;
        return nukVar2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m5624k4(Shape shape) {
        this.f4852k4 = shape;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.aspose.slides.er8] */
    /* JADX WARN: Type inference failed for: r5v3, types: [double, int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [double, int] */
    /* JADX INFO: renamed from: k4 */
    public final void m5639k4(AbstractC3150x6 abstractC3150x6, ISVGOptions iSVGOptions) {
        boolean z;
        float f;
        ?? Append;
        ?? r20;
        Dictionary.Enumerator it;
        boolean z2;
        float f2;
        float width = m5629du().getWidth();
        float height = m5629du().getHeight();
        float x = m5629du().getX();
        float y = m5629du().getY();
        ISVGOptions sVGOptions = iSVGOptions == null ? new SVGOptions() : iSVGOptions;
        boolean useFrameRotation = sVGOptions.getUseFrameRotation();
        if (m5629du().m2548dq().m67988kk() != 0.0f && useFrameRotation) {
            C12007ix c12007ixClone = m5621k4(m5629du().m2593xk()).Clone();
            x = c12007ixClone.m56557jd();
            y = c12007ixClone.m56551ck();
            float fM56550c5 = c12007ixClone.m56550c5();
            height = c12007ixClone.m56575x1();
            width = fM56550c5;
        }
        if (C7019kk.m27469x1(m5629du(), GroupShape.class) && m5626k4(m5629du())) {
            C12007ix c12007ixClone2 = m5628ck().Clone();
            x = c12007ixClone2.m56557jd();
            y = c12007ixClone2.m56551ck();
            float fM56550c52 = c12007ixClone2.m56550c5();
            height = c12007ixClone2.m56575x1();
            width = fM56550c52;
        }
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) m5629du(), AutoShape.class);
        GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) m5629du(), GeometryShape.class);
        Ink ink = (Ink) C7019kk.m27452k4((Object) m5629du(), Ink.class);
        if (sVGOptions.getUseFrameSize() || ((autoShape == null || autoShape.getTextFrame() == null || !autoShape.m288x1().m2926m9()) && ((geometryShape == null || geometryShape.m1591yj() == null || geometryShape.m1591yj().m3308ck() == 5) && ink == null))) {
            z = false;
        } else {
            C12014ne c12014neClone = m5623k4().Clone();
            width = c12014neClone.m56663c5();
            height = c12014neClone.m56683x1();
            x = c12014neClone.m56669jd();
            y = c12014neClone.m56664ck();
            z = true;
        }
        if (autoShape == null || autoShape.getTextFrame() == null || !autoShape.isTextBox()) {
            f = 0.0f;
        } else {
            TextFrame textFrame = (TextFrame) autoShape.getTextFrame();
            pj5 pj5VarM69115kk = textFrame.m2909k4(m5629du()).Clone();
            f = 0.0f;
            jq6.m63487k4(textFrame.f3523to, (m5629du().getWidth() - pj5VarM69115kk.f48081x1) - pj5VarM69115kk.f48080to, (m5629du().getHeight() - pj5VarM69115kk.f48079kk) - pj5VarM69115kk.f48078du, (kg7) null);
            if (!z && !sVGOptions.getUseFrameSize()) {
                oju ojuVarClone = textFrame.f3523to.mo64300x1().Clone();
                y += ojuVarClone.f47837x1;
                x += ojuVarClone.f47836k4;
                height = textFrame.f3523to.mo64296kk().f47837x1;
            }
        }
        ILineFormatEffectiveData effective = m5629du().getLineFormat() != null ? m5629du().getLineFormat().getEffective() : null;
        if (effective != null && ((effective.getAlignment() == 0 || effective.getAlignment() == -1) && effective.getFillFormat() != null && effective.getFillFormat().getFillType() != 0 && !C14044b3.m66437kk(effective.getWidth()))) {
            float width2 = (float) effective.getWidth();
            if (effective.getBeginArrowheadStyle() != 0) {
                float[] fArr = {f};
                z2 = z;
                C11896dy c11896dyM3893k4 = azo.m3893k4(effective.getBeginArrowheadStyle(), effective.getBeginArrowheadLength(), effective.getBeginArrowheadWidth(), fArr);
                f2 = fArr[0];
                C12007ix c12007ixClone3 = c11896dyM3893k4.m55533k4(new C11913yj(0.0f, 1.0f, -1.0f, 0.0f, f2, 0.0f), C12011ks.m56614k4()).Clone();
                if (c12007ixClone3.m56550c5() > width2) {
                    width2 = ((float) effective.getWidth()) * c12007ixClone3.m56550c5();
                }
            } else {
                z2 = z;
                f2 = f;
            }
            if (effective.getEndArrowheadStyle() != 0) {
                float[] fArr2 = {f2};
                C12007ix c12007ixClone4 = azo.m3893k4(effective.getEndArrowheadStyle(), effective.getEndArrowheadLength(), effective.getEndArrowheadWidth(), fArr2).m55533k4(new C11913yj(0.0f, -1.0f, 1.0f, 0.0f, fArr2[0], 0.0f), C12011ks.m56614k4()).Clone();
                if (c12007ixClone4.m56550c5() > width2) {
                    width2 = c12007ixClone4.m56550c5() * ((float) effective.getWidth());
                }
            }
            if (!z2) {
                float f3 = width2 / 2.0f;
                x -= f3;
                y -= f3;
                width += width2;
                height += width2;
            }
        }
        int iOooO00o = C22201OooO0oO.OooO00o(width, 0.5d, 14);
        float f4 = width;
        int iOooO00o2 = C22201OooO0oO.OooO00o(height, 0.5d, 14);
        if (iOooO00o < f4 || iOooO00o2 < height) {
            StringBuffer stringBufferAppend = StringBuffer.append((int) (f4 + 0.5f));
            Append = StringBuffer.append((int) (height + 0.5f));
            r20 = stringBufferAppend;
        } else {
            r20 = iOooO00o;
            Append = iOooO00o2;
        }
        vhx vhxVar = new vhx(r20, Append, 72.0f, 72.0f, 72.0f, (SVGOptions) sVGOptions, null);
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                C13700js c13700js = new C13700js();
                c13700js.f45573m9 = true;
                c13700js.f45563c5 = ((SVGOptions) sVGOptions).m2508kk().m69787kk();
                c13700js.f45569jd = sVGOptions.getDeletePicturesCroppedAreas();
                c13700js.f45567fa = useFrameRotation;
                c9d c9dVar = new c9d(m5642m9(), c12210k4, c13700js, sVGOptions.getShapeFormattingController());
                vhxVar.m74616k4(c9dVar);
                if (x != f || y != f) {
                    if (C7019kk.m27469x1(m5629du(), PictureFrame.class)) {
                        vhxVar.m74612k4(-((float) C14116yg.m67477k4(x, 2)), -((float) C14116yg.m67477k4(y, 2)));
                    } else {
                        vhxVar.m74612k4((float) C14116yg.m67490kk(-x), (float) C14116yg.m67490kk(-y));
                    }
                }
                mo4131k4(vhxVar, c9dVar, InterruptionToken.getNone());
                vhxVar.m72276k4(abstractC3150x6, true);
                v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6);
                Presentation[] presentationArr = {null};
                kke.m63959k4(Presentation.class, m5629du().getParent_Immediate(), presentationArr);
                Presentation presentation = presentationArr[0];
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (presentation == null || !presentation.m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next.getKey());
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                vhxVar.dispose();
            } catch (RuntimeException e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e;
            }
        } catch (Throwable th) {
            Presentation[] presentationArr2 = {null};
            kke.m63959k4(Presentation.class, m5629du().getParent_Immediate(), presentationArr2);
            Presentation presentation2 = presentationArr2[0];
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next2 = it.next();
                    if (presentation2 == null || !presentation2.m2392um().m56972k4(next2.getKey())) {
                        ((C7131h4) next2.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next2.getKey());
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            vhxVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        Shape shapeM2581um;
        if (C7019kk.m27469x1(m5629du(), LegacyDiagram.class)) {
            shapeM2581um = ((LegacyDiagram) C7019kk.m27452k4((Object) m5629du(), LegacyDiagram.class)).m1858kk();
        } else {
            interruptionToken.throwIfInterruptionRequested();
            if (m5629du().m2581um() == null) {
                return;
            } else {
                shapeM2581um = m5629du().m2581um();
            }
        }
        shapeM2581um.m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    private void m5625k4(oju[] ojuVarArr, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        if (m5626k4((IShape) m5629du())) {
            if (C7019kk.m27469x1(m5629du(), GroupShape.class)) {
                C12007ix c12007ixClone = m5628ck().Clone();
                if (C12007ix.m56548to(c12007ixClone, C12007ix.f40519k4)) {
                    oju ojuVar = ojuVarArr[0];
                    C12007ix c12007ix = new C12007ix(new C12025x6(ojuVar.f47836k4, ojuVar.f47837x1), new C12015qq(fArr[0], fArr2[0]));
                    C12007ix.m56549x1(c12007ixClone.Clone(), c12007ix.Clone()).CloneTo(c12007ix);
                    ojuVarArr[0].f47836k4 = c12007ix.m56557jd();
                    ojuVarArr[0].f47837x1 = c12007ix.m56551ck();
                    fArr[0] = c12007ix.m56550c5();
                    fArr2[0] = c12007ix.m56575x1();
                    if (fArr4[0] < c12007ix.m56575x1()) {
                        fArr4[0] = c12007ix.m56575x1();
                    }
                    if (fArr3[0] < c12007ix.m56550c5()) {
                        fArr3[0] = c12007ix.m56550c5();
                        return;
                    }
                    return;
                }
                return;
            }
            ILineFormatEffectiveData effective = m5629du().getLineFormat() != null ? m5629du().getLineFormat().getEffective() : null;
            if (effective != null) {
                if ((effective.getAlignment() != 0 && effective.getAlignment() != -1) || effective.getFillFormat() == null || effective.getFillFormat().getFillType() == 0 || C14044b3.m66437kk(effective.getWidth())) {
                    return;
                }
                float width = (float) effective.getWidth();
                float f = 0.0f;
                if (effective.getBeginArrowheadStyle() != 0) {
                    float[] fArr5 = {0.0f};
                    C11896dy c11896dyM3893k4 = azo.m3893k4(effective.getBeginArrowheadStyle(), effective.getBeginArrowheadLength(), effective.getBeginArrowheadWidth(), fArr5);
                    float f2 = fArr5[0];
                    C12007ix c12007ixClone2 = c11896dyM3893k4.m55533k4(new C11913yj(0.0f, 1.0f, -1.0f, 0.0f, f2, 0.0f), C12011ks.m56614k4()).Clone();
                    if (c12007ixClone2.m56550c5() > width) {
                        width = c12007ixClone2.m56550c5() * ((float) effective.getWidth());
                    }
                    f = f2;
                }
                if (effective.getEndArrowheadStyle() != 0) {
                    float[] fArr6 = {f};
                    C12007ix c12007ixClone3 = azo.m3893k4(effective.getEndArrowheadStyle(), effective.getEndArrowheadLength(), effective.getEndArrowheadWidth(), fArr6).m55533k4(new C11913yj(0.0f, -1.0f, 1.0f, 0.0f, fArr6[0], 0.0f), C12011ks.m56614k4()).Clone();
                    if (c12007ixClone3.m56550c5() > width) {
                        width = c12007ixClone3.m56550c5() * ((float) effective.getWidth());
                    }
                }
                oju ojuVar2 = ojuVarArr[0];
                float f3 = width / 2.0f;
                ojuVar2.f47836k4 -= f3;
                ojuVar2.f47837x1 -= f3;
                fArr[0] = fArr[0] + width;
                fArr2[0] = fArr2[0] + width;
                fArr3[0] = fArr3[0] + width;
                fArr4[0] = fArr4[0] + width;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m5626k4(IShape iShape) {
        ILineFormatEffectiveData effective = iShape.getLineFormat() != null ? iShape.getLineFormat().getEffective() : null;
        if (effective != null && ((effective.getAlignment() == 0 || effective.getAlignment() == -1) && effective.getFillFormat() != null && effective.getFillFormat().getFillType() != 0 && !C14044b3.m66437kk(effective.getWidth()))) {
            return true;
        }
        if (!C7019kk.m27469x1(iShape, GroupShape.class)) {
            return false;
        }
        IGenericEnumerator<IShape> it = ((GroupShape) iShape).getShapes().iterator();
        while (it.hasNext()) {
            try {
                if (m5626k4(it.next())) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }
}
