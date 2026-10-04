package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p071cz.AbstractC2665b2;
import com.aspose.slides.internal.p071cz.AbstractC2707dx;
import com.aspose.slides.internal.p071cz.AbstractC2718ew;
import com.aspose.slides.internal.p071cz.AbstractC2878qv;
import com.aspose.slides.internal.p071cz.AbstractC2935v6;
import com.aspose.slides.internal.p071cz.C2690cx;
import com.aspose.slides.internal.p071cz.C2694d4;
import com.aspose.slides.internal.p071cz.C2695dc;
import com.aspose.slides.internal.p071cz.C2697dg;
import com.aspose.slides.internal.p071cz.C2706dw;
import com.aspose.slides.internal.p071cz.C2711eb;
import com.aspose.slides.internal.p071cz.C2712eg;
import com.aspose.slides.internal.p071cz.C2726fc;
import com.aspose.slides.internal.p071cz.C2728fh;
import com.aspose.slides.internal.p071cz.C2743gv;
import com.aspose.slides.internal.p071cz.C2745gz;
import com.aspose.slides.internal.p071cz.C2752hh;
import com.aspose.slides.internal.p071cz.C2767iq;
import com.aspose.slides.internal.p071cz.C2768iu;
import com.aspose.slides.internal.p071cz.C2778ji;
import com.aspose.slides.internal.p071cz.C2798kx;
import com.aspose.slides.internal.p071cz.C2808m2;
import com.aspose.slides.internal.p071cz.C2830n5;
import com.aspose.slides.internal.p071cz.C2865q1;
import com.aspose.slides.internal.p071cz.C2867q6;
import com.aspose.slides.internal.p071cz.C2891s1;
import com.aspose.slides.internal.p071cz.C2957x2;
import com.aspose.slides.internal.p071cz.C2969xq;
import com.aspose.slides.internal.p071cz.C2987z0;
import com.aspose.slides.internal.p071cz.InterfaceC2933v0;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.fg */
/* JADX INFO: loaded from: classes3.dex */
class C1099fg implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private boolean f5044k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2933v0 f5045x1;

    public C1099fg(InterfaceC2933v0 interfaceC2933v0) {
        this.f5045x1 = interfaceC2933v0;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m6156k4(byte b) {
        if (b == 0) {
            return 5;
        }
        if (b == 2) {
            return 3;
        }
        if (b == 3) {
            return 4;
        }
        if (b != 4) {
            return b != 5 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m6171k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC2707dx m6157k4(GeometryShape geometryShape, C2891s1 c2891s1) {
        int i = 0;
        if (geometryShape.getShapeType() != 0 && geometryShape.getShapeType() != -1) {
            AbstractC2665b2 abstractC2665b2M12132k4 = AbstractC2665b2.m12132k4(geometryShape.getShapeType(), c2891s1);
            AdjustValueCollection adjustValueCollection = (AdjustValueCollection) geometryShape.getAdjustments();
            while (i < adjustValueCollection.size()) {
                abstractC2665b2M12132k4.m12332x1().mo12283k4(adjustValueCollection.m232k4(i).m64509kk(), r0.m64504k4());
                i++;
            }
            return abstractC2665b2M12132k4;
        }
        c2891s1.m12516k4().m12210k4();
        c2891s1.m12516k4().m12212x1();
        double dM12482k4 = c2891s1.m12521x1().m12482k4();
        double dM12484x1 = c2891s1.m12521x1().m12484x1();
        C2695dc c2695dc = new C2695dc(c2891s1);
        ShapeElement[] shapeElementArrM3327k4 = geometryShape.m1591yj().m3327k4(geometryShape, 0.0f, 0.0f, ((float) dM12482k4) / 12700.0f, ((float) dM12484x1) / 12700.0f);
        int length = shapeElementArrM3327k4.length;
        while (i < length) {
            ShapeElement shapeElement = shapeElementArrM3327k4[i];
            if (shapeElement.m2657x1() == 0) {
                c2695dc.m12194k4(c2891s1.m12521x1().m12482k4(), c2891s1.m12521x1().m12484x1(), m6156k4(shapeElement.getFillSource()), false, true);
                m6168k4(shapeElement.m2656k4(), c2695dc);
            }
            i++;
        }
        return c2695dc;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC2718ew m6158k4(byte b, C12003du c12003du, IGradientFormatEffectiveData iGradientFormatEffectiveData, boolean z) {
        if (b == -1 || b == 0) {
            return new C2712eg();
        }
        if (b == 1) {
            return new C2743gv(m6161k4(c12003du.Clone()));
        }
        if (b == 2) {
            return m6164k4(iGradientFormatEffectiveData, z);
        }
        if (b == 3 || b == 4) {
            return new C2743gv(C2808m2.m12403k4(0, 0, 0));
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC2718ew m6159k4(IFillFormatEffectiveData iFillFormatEffectiveData) {
        return m6158k4(iFillFormatEffectiveData.getFillType(), (iFillFormatEffectiveData.getFillType() == 1 ? ((C14176nc) iFillFormatEffectiveData).m67938m9() : C12003du.f40505to).Clone(), iFillFormatEffectiveData.getFillType() == 2 ? iFillFormatEffectiveData.getGradientFormat() : null, iFillFormatEffectiveData.getRotateWithShape());
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC2718ew m6160k4(ILineFillFormatEffectiveData iLineFillFormatEffectiveData) {
        return m6158k4(iLineFillFormatEffectiveData.getFillType(), (iLineFillFormatEffectiveData.getFillType() == 1 ? ((erk) iLineFillFormatEffectiveData).m5654x1() : C12003du.f40505to).Clone(), iLineFillFormatEffectiveData.getFillType() == 2 ? iLineFillFormatEffectiveData.getGradientFormat() : null, iLineFillFormatEffectiveData.getRotateWithShape());
    }

    /* JADX INFO: renamed from: k4 */
    private static C2808m2 m6161k4(C12003du c12003du) {
        return new C2808m2((c12003du.m56507jd() & 255) / 255.0f, (c12003du.m56502ck() & 255) / 255.0f, (c12003du.m56505fa() & 255) / 255.0f, (c12003du.m56501c5() & 255) / 255.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static C2865q1 m6162k4(C12025x6 c12025x6) {
        return new C2865q1(c12025x6.m56897x1() * 12700.0f, c12025x6.m56895kk() * 12700.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static C2891s1 m6163k4(ShapeFrame shapeFrame) {
        float x = shapeFrame.getX();
        float y = shapeFrame.getY();
        float width = shapeFrame.getWidth();
        float height = shapeFrame.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return new C2891s1();
        }
        return new C2891s1(new C2706dw(x * 12700.0f, y * 12700.0f), new C2867q6(width * 12700.0f, height * 12700.0f), shapeFrame.getRotation() * 60000.0f, shapeFrame.getFlipH() == 1, shapeFrame.getFlipV() == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[DONT_GENERATE, PHI: r0 r3
      0x005a: PHI (r0v3 com.aspose.slides.internal.cz.v6) = (r0v5 com.aspose.slides.internal.cz.v6), (r0v6 com.aspose.slides.internal.cz.v6) binds: [B:26:0x00b0, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r3v3 com.aspose.slides.Collections.Generic.IGenericEnumerator<com.aspose.slides.IGradientStopEffectiveData>) = 
      (r3v2 com.aspose.slides.Collections.Generic.IGenericEnumerator<com.aspose.slides.IGradientStopEffectiveData>)
      (r3v8 com.aspose.slides.Collections.Generic.IGenericEnumerator<com.aspose.slides.IGradientStopEffectiveData>)
     binds: [B:26:0x00b0, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AbstractC2935v6 m6164k4(IGradientFormatEffectiveData iGradientFormatEffectiveData, boolean z) {
        IGenericEnumerator<IGradientStopEffectiveData> it;
        AbstractC2935v6 abstractC2935v6;
        if (iGradientFormatEffectiveData.getGradientShape() == 0) {
            C2987z0 c2987z0 = new C2987z0(iGradientFormatEffectiveData.getLinearGradientAngle() * 60000.0f, iGradientFormatEffectiveData.getLinearGradientScaled());
            it = iGradientFormatEffectiveData.getGradientStops().iterator();
            while (it.hasNext()) {
                try {
                    c2987z0.m12580x1().m12136k4(new C2830n5(m6161k4(((GradientStopEffectiveData) it.next()).m1634k4().Clone()), r4.getPosition() * 100.0f));
                } finally {
                }
            }
        } else {
            C2969xq c2969xq = new C2969xq();
            c2969xq.m12614x1(iGradientFormatEffectiveData.getGradientShape());
            it = iGradientFormatEffectiveData.getGradientStops().iterator();
            while (it.hasNext()) {
                try {
                    c2969xq.m12580x1().m12136k4(new C2830n5(m6161k4(((GradientStopEffectiveData) it.next()).m1634k4().Clone()), r4.getPosition() * 100.0f));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            AbstractC2935v6 abstractC2935v62 = c2969xq;
            abstractC2935v6 = c2969xq;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            }
        }
        abstractC2935v6.m12574k4(iGradientFormatEffectiveData.getTileFlip());
        abstractC2935v6.m12577k4(z);
        return abstractC2935v6;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m6173k4(kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame, C12007ix[] c12007ixArr) {
        return m6174k4(kg7Var, geometryShape, textFrame, c12007ixArr, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m6174k4(kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame, C12007ix[] c12007ixArr, boolean z) {
        Presentation.m2326k4(((FontsManager) geometryShape.getPresentation().getFontsManager()).m1554x1(), false);
        C2768iu c2768iu = new C2768iu(new C2697dg(), null, m6157k4(geometryShape, new C2891s1(new C2706dw(0.0d, 0.0d), new C2867q6(geometryShape.getWidth() * 12700.0f, geometryShape.getHeight() * 12700.0f), 0.0d, false, false)));
        m6167k4(textFrame, c2768iu.m12318x1());
        lbk lbkVar = new lbk(65536, 65536, 96.0f, 96.0f);
        try {
            textFrame.f3523to.mo64295k4(lbkVar, kg7Var);
            c2768iu.m12318x1().m12221k4(lbkVar.m64336jd(), lbkVar.m64334ck());
            C12007ix c12007ix = new C12007ix();
            C12007ix[] c12007ixArr2 = {c12007ix};
            C11896dy[] c11896dyArrM12225k4 = c2768iu.m12318x1().m12225k4(c12007ixArr2);
            c12007ixArr2[0].CloneTo(c12007ix);
            float fM67504x1 = C14116yg.m67504x1(c12007ix.m56550c5(), c12007ix.m56575x1());
            float fM56557jd = c12007ix.m56557jd() - fM67504x1;
            float fM56551ck = c12007ix.m56551ck() - fM67504x1;
            float f = fM67504x1 * 2.0f;
            C12007ix c12007ix2 = new C12007ix(fM56557jd, fM56551ck, c12007ix.m56550c5() + f, c12007ix.m56575x1() + f);
            c12007ixArr[0] = c12007ix2;
            C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(((c12007ix2.m56550c5() * 96.0f) / 72.0f) + 0.5f), 13), C7019kk.m27462to(Double.valueOf(((double) ((c12007ixArr[0].m56575x1() * 96.0f) / 72.0f)) + 0.5d), 14), 2498570);
            c12009k4.m56332k4(96.0f, 96.0f);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
                abstractC12008jdM56582k4.dispose();
                omq omqVar = new omq(c12009k4, c12007ixArr[0].m56550c5(), c12007ixArr[0].m56575x1());
                try {
                    omqVar.m74632x1(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, -c12007ixArr[0].m56557jd(), -c12007ixArr[0].m56551ck()));
                    m6170k4(omqVar, lbkVar, c11896dyArrM12225k4, c12007ix.Clone(), z);
                    lbkVar.dispose();
                    c12007ixArr[0].m56567kk(geometryShape.getX(), geometryShape.getY());
                    return c12009k4;
                } finally {
                    omqVar.dispose();
                }
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            lbkVar.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6165k4(ILineFormatEffectiveData iLineFormatEffectiveData, C2745gz c2745gz) {
        c2745gz.m12297kk(iLineFormatEffectiveData.getJoinStyle());
        if (iLineFormatEffectiveData.getDashStyle() != -1) {
            c2745gz.m12295k4(iLineFormatEffectiveData.getDashStyle() == 11 ? new C2694d4() : new C2690cx(iLineFormatEffectiveData.getDashStyle()));
        }
        c2745gz.m12293k4(iLineFormatEffectiveData.getMiterLimit() * 12700.0f);
        c2745gz.m12300x1(iLineFormatEffectiveData.getWidth() * 12700.0d);
        c2745gz.m12294k4((int) iLineFormatEffectiveData.getAlignment());
        c2745gz.m12301x1((int) iLineFormatEffectiveData.getCapStyle());
        c2745gz.m12299to(iLineFormatEffectiveData.getStyle());
        c2745gz.m12296kk().m12182k4(iLineFormatEffectiveData.getBeginArrowheadStyle());
        c2745gz.m12296kk().m12184x1(iLineFormatEffectiveData.getBeginArrowheadLength());
        c2745gz.m12296kk().m12183kk(iLineFormatEffectiveData.getBeginArrowheadWidth());
        c2745gz.m12298to().m12182k4(iLineFormatEffectiveData.getEndArrowheadStyle());
        c2745gz.m12298to().m12184x1(iLineFormatEffectiveData.getEndArrowheadLength());
        c2745gz.m12298to().m12183kk(iLineFormatEffectiveData.getEndArrowheadWidth());
    }

    /* JADX INFO: renamed from: k4 */
    private void m6166k4(IOuterShadowEffectiveData iOuterShadowEffectiveData, C11896dy c11896dy, qy7 qy7Var, C12007ix c12007ix, AbstractC14897zn abstractC14897zn) {
        C11896dy c11896dy2;
        if (iOuterShadowEffectiveData == null) {
            return;
        }
        if (iOuterShadowEffectiveData.getBlurRadius() <= 1.0d || iOuterShadowEffectiveData.getScaleHorizontal() > 110.0d || iOuterShadowEffectiveData.getScaleVertical() > 110.0d) {
            o6h o6hVar = new o6h(iOuterShadowEffectiveData);
            c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
            try {
                c11896dy2.m55577x1(o6hVar.m68350k4(qy7Var, c12007ix.Clone(), Float.NaN, false));
                abstractC14897zn.mo64338k4(c11896dy2, (azo) null, new C0962es(C12003du.m56400k4(C7019kk.m27462to(Float.valueOf((((vmd) iOuterShadowEffectiveData).m72367x1().m56501c5() & 255) * ((qy7Var.m69907kk().m5676k4().m56501c5() & 255) / 255.0f)), 13), ((vmd) iOuterShadowEffectiveData).m72367x1().Clone()).Clone().Clone()));
                c11896dy2.dispose();
                return;
            } finally {
            }
        }
        o6h o6hVar2 = new o6h(iOuterShadowEffectiveData);
        c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        try {
            o6hVar2.m68351k4(abstractC14897zn, c11896dy, qy7Var);
            if (c11896dy2 != null) {
                c11896dy2.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6167k4(TextFrame textFrame, C2711eb c2711eb) {
        String[] strArrM70968k4;
        if (textFrame != null) {
            boolean zM64095x1 = ((TextFrameFormat) textFrame.getTextFrameFormat()).m2944dy().m64095x1();
            int i = 0;
            if (zM64095x1) {
                IParagraphCollection paragraphs = textFrame.getParagraphs();
                InterfaceC0901dh[] interfaceC0901dhArr = new InterfaceC0901dh[paragraphs.getCount()];
                for (int i2 = 0; i2 < paragraphs.getCount(); i2++) {
                    interfaceC0901dhArr[i2] = new ihc((Paragraph) paragraphs.get_Item(i2));
                }
                strArrM70968k4 = t5o.m70968k4(AbstractC14092to.m67204k4((Object[]) interfaceC0901dhArr), paragraphs.getCount(), false);
            } else {
                strArrM70968k4 = null;
            }
            IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    Paragraph paragraph = (Paragraph) it.next();
                    C2957x2 c2957x2 = new C2957x2();
                    IParagraphFormatEffectiveData effective = paragraph.getParagraphFormat().getEffective();
                    C2728fh c2728fhM12587k4 = c2957x2.m12587k4();
                    c2728fhM12587k4.m12249k4(effective.getAlignment());
                    c2728fhM12587k4.m12248k4(effective.getDefaultTabSize());
                    c2728fhM12587k4.m12268x1(effective.getFontAlignment());
                    c2728fhM12587k4.m12254k4(new C2752hh(effective.getMarginLeft() * 12700.0f));
                    c2728fhM12587k4.m12270x1(new C2752hh(effective.getMarginRight() * 12700.0f));
                    c2728fhM12587k4.m12266to(c2728fhM12587k4.m12241ck());
                    if (zM64095x1 && !C14113y2.m67411k4(strArrM70968k4[i])) {
                        c2728fhM12587k4.m12250k4(new C2767iq(strArrM70968k4[i]));
                    }
                    i++;
                    c2711eb.m12223k4(c2957x2);
                    IGenericEnumerator<IPortion> it2 = paragraph.getPortions().iterator();
                    while (it2.hasNext()) {
                        try {
                            Portion portion = (Portion) it2.next();
                            IPortionFormatEffectiveData effective2 = portion.getPortionFormat().getEffective();
                            C2778ji c2778ji = new C2778ji();
                            c2778ji.m12382x1(effective2.getAlternativeLanguageId());
                            c2778ji.m12365k4(effective2.getFontBold());
                            c2778ji.m12373to((int) effective2.getTextCapType());
                            c2778ji.m12369kk(effective2.getComplexScriptFont().getFontName() != null ? new C2798kx(effective2.getComplexScriptFont().getFontName()) : null);
                            c2778ji.m12381x1(!C14113y2.m67363du(effective2.getEastAsianFont().getFontName(), C14113y2.f47374k4) ? new C2798kx(effective2.getEastAsianFont().getFontName()) : null);
                            c2778ji.m12358k4(m6159k4(effective2.getFillFormat()));
                            c2778ji.m12372to(((lrb) effective2).m4837m9() * 100.0f);
                            c2778ji.m12383x1(effective2.getFontItalic());
                            c2778ji.m12370kk(effective2.getKumimoji());
                            c2778ji.m12364k4(effective2.getLanguageId());
                            c2778ji.m12360k4(!C14113y2.m67363du(effective2.getLatinFont().getFontName(), C14113y2.f47374k4) ? new C2798kx(effective2.getLatinFont().getFontName()) : null);
                            c2778ji.m12380x1(m6160k4(effective2.getLineFormat().getFillFormat()));
                            c2778ji.m12359k4(new C2745gz());
                            m6165k4(effective2.getLineFormat(), c2778ji.m12355k4());
                            c2778ji.m12375to(effective2.getNormaliseHeight());
                            c2778ji.m12368kk((int) effective2.getStrikethroughType());
                            c2778ji.m12374to(!C14113y2.m67363du(effective2.getSymbolFont().getFontName(), C14113y2.f47374k4) ? new C2798kx(effective2.getSymbolFont().getFontName()) : null);
                            c2778ji.m12379x1((int) effective2.getFontUnderline());
                            C2726fc c2726fc = new C2726fc(portion.m2283h4());
                            c2726fc.m12204k4(c2778ji);
                            c2957x2.m12588k4(c2726fc);
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            kp9 kp9VarM2944dy = textFrame.f3519k4.m2944dy();
            if (!textFrame.m2926m9() || kp9VarM2944dy.m64091k4() == -1) {
                return;
            }
            AbstractC2878qv abstractC2878qvM12495k4 = AbstractC2878qv.m12495k4(kp9VarM2944dy.m64091k4());
            if (kp9VarM2944dy.f45823k4 != null) {
                Dictionary.Enumerator<String, Integer> it3 = kp9VarM2944dy.f45826x1.iterator();
                while (it3.hasNext()) {
                    try {
                        abstractC2878qvM12495k4.m12332x1().mo12283k4((String) it3.next().getKey(), kp9VarM2944dy.f45823k4[((Integer) r4.getValue()).intValue() - 1].m64504k4());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
            }
            c2711eb.m12220k4().m12128k4(abstractC2878qvM12495k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6168k4(C11896dy c11896dy, C2695dc c2695dc) {
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte[] bArrM55571to = c11896dy.m55571to();
        int iM55525du = c11896dy.m55525du();
        int i = 0;
        while (i < iM55525du) {
            byte b = bArrM55571to[i];
            if (b == 0) {
                C2865q1 c2865q1Clone = m6162k4(c12025x6ArrM55565kk[i].Clone()).Clone();
                c2695dc.m12190du(c2865q1Clone.m12477k4(), c2865q1Clone.m12481x1());
            }
            if ((b & 3) == 3) {
                C2865q1 c2865q1Clone2 = m6162k4(c12025x6ArrM55565kk[i].Clone()).Clone();
                C2865q1 c2865q1 = new C2865q1(c2865q1Clone2.m12477k4(), c2865q1Clone2.m12481x1());
                m6162k4(c12025x6ArrM55565kk[i + 1].Clone()).CloneTo(c2865q1Clone2);
                C2865q1 c2865q12 = new C2865q1(c2865q1Clone2.m12477k4(), c2865q1Clone2.m12481x1());
                i += 2;
                m6162k4(c12025x6ArrM55565kk[i].Clone()).CloneTo(c2865q1Clone2);
                byte b2 = bArrM55571to[i];
                c2695dc.m12196k4(c2865q1.Clone(), c2865q12.Clone(), new C2865q1(c2865q1Clone2.m12477k4(), c2865q1Clone2.m12481x1()).Clone());
                b = b2;
            } else if ((b & 1) == 1) {
                C2865q1 c2865q1Clone3 = m6162k4(c12025x6ArrM55565kk[i].Clone()).Clone();
                c2695dc.m12191h4(c2865q1Clone3.m12477k4(), c2865q1Clone3.m12481x1());
            }
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                c2695dc.m12189du();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6175k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame, C4317dy c4317dy) throws Throwable {
        C12007ix c12007ix;
        C11896dy[] c11896dyArrM12225k4;
        Presentation.m2326k4(((FontsManager) geometryShape.getPresentation().getFontsManager()).m1554x1(), false);
        C2697dg c2697dg = new C2697dg();
        C2891s1 c2891s1M6163k4 = m6163k4(geometryShape.m2546bz().m5631fa());
        C2768iu c2768iu = new C2768iu(c2697dg, null, m6157k4(geometryShape, c2891s1M6163k4));
        m6167k4(textFrame, c2768iu.m12318x1());
        lbk lbkVar = new lbk(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy(), abstractC14897zn.mo67707du() / 8.0f, abstractC14897zn.mo67709h4() / 8.0f);
        try {
            C4317dy c4317dyM17345kk = c4317dy.m17345kk();
            float f = ((float) (-c2891s1M6163k4.m12520to())) / 60000.0f;
            if (c2768iu.m12316k4().m12213h4().m12519kk()) {
                f += 180.0f;
            }
            c4317dyM17345kk.m17339k4(f, new C12025x6(((float) ((c2891s1M6163k4.m12521x1().m12482k4() / 2.0d) + c2891s1M6163k4.m12516k4().m12210k4())) / 12700.0f, ((float) (c2891s1M6163k4.m12516k4().m12212x1() + (c2891s1M6163k4.m12521x1().m12484x1() / 2.0d))) / 12700.0f), 1);
            C4317dy c4317dyM17345kk2 = c4317dy.m17345kk();
            c4317dyM17345kk2.m17348x1(-c4317dyM17345kk.m17330dy(), -c4317dyM17345kk.m17328c5());
            lbkVar.m74622kk(c4317dyM17345kk);
            abstractC14897zn.m74622kk(c4317dyM17345kk2);
            textFrame.f3523to.mo64295k4(lbkVar, kg7Var);
            c2768iu.m12318x1().m12221k4(lbkVar.m64336jd(), lbkVar.m64334ck());
            c12007ix = new C12007ix();
            C12007ix[] c12007ixArr = {c12007ix};
            c11896dyArrM12225k4 = c2768iu.m12318x1().m12225k4(c12007ixArr);
            c12007ixArr[0].CloneTo(c12007ix);
        } catch (Throwable th) {
            th = th;
        }
        try {
            m6169k4(abstractC14897zn, lbkVar, c11896dyArrM12225k4, c12007ix.Clone());
            abstractC14897zn.m74626rv();
            lbkVar.m74626rv();
            lbkVar.dispose();
        } catch (Throwable th2) {
            th = th2;
            lbkVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6169k4(AbstractC14897zn abstractC14897zn, lbk lbkVar, C11896dy[] c11896dyArr, C12007ix c12007ix) {
        m6170k4(abstractC14897zn, lbkVar, c11896dyArr, c12007ix.Clone(), false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6170k4(AbstractC14897zn abstractC14897zn, lbk lbkVar, C11896dy[] c11896dyArr, C12007ix c12007ix, boolean z) {
        AbstractC14897zn abstractC14897zn2;
        int i = 0;
        while (i < c11896dyArr.length) {
            C11896dy c11896dy = c11896dyArr[i];
            qy7 qy7Var = lbkVar.m64345up().get_Item(i);
            if (c11896dy.m55525du() <= 1 || !qy7Var.m69896jd()) {
                abstractC14897zn2 = abstractC14897zn;
            } else {
                abstractC14897zn2 = abstractC14897zn;
                m6166k4(qy7Var.f48464ck, c11896dy, qy7Var, c12007ix.Clone(), abstractC14897zn2);
                m6166k4(qy7Var.f48471jd, c11896dy, qy7Var, c12007ix.Clone(), abstractC14897zn2);
            }
            if (c11896dy.m55525du() > 1 && qy7Var.m69918ts()) {
                new C14871z3(qy7Var.f48462c5).m74297k4(abstractC14897zn2, c11896dy, qy7Var.m69907kk(), qy7Var.m69917to());
            }
            if (c11896dy.m55525du() > 1 && qy7Var.m69886c6()) {
                new pz4(qy7Var.f48467dy).m69343k4(abstractC14897zn2, c11896dy, qy7Var, new C12025x6(c12007ix.m56557jd(), c12007ix.m56558k4()));
            }
            i++;
            abstractC14897zn = abstractC14897zn2;
        }
        AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
        for (int i2 = 0; i2 < c11896dyArr.length; i2++) {
            C11896dy c11896dy2 = c11896dyArr[i2];
            if (c11896dy2.m55525du() > 1) {
                qy7 qy7Var2 = lbkVar.m64345up().get_Item(i2);
                if (C7019kk.m27469x1(qy7Var2.m69907kk(), C14478sy.class)) {
                    ((C14478sy) C7019kk.m27452k4((Object) qy7Var2.m69907kk(), C14478sy.class)).m71129kk(c12007ix.Clone());
                }
                if (C7019kk.m27469x1(qy7Var2.m69917to().f4054h4, C14478sy.class)) {
                    ((C14478sy) C7019kk.m27452k4((Object) qy7Var2.m69917to().f4054h4, C14478sy.class)).m71129kk(c12007ix.Clone());
                }
                if (!z) {
                    abstractC14897zn3.mo64338k4(c11896dy2, qy7Var2.m69917to(), qy7Var2.m69907kk());
                }
                if (c11896dy2.m55525du() > 1 && qy7Var2.m69891e0()) {
                    new zz0(qy7Var2.f48484up).m74891k4(abstractC14897zn3, c11896dy2, qy7Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6171k4(boolean z) {
        InterfaceC2933v0 interfaceC2933v0;
        if (this.f5044k4) {
            return;
        }
        if (z && (interfaceC2933v0 = this.f5045x1) != null) {
            interfaceC2933v0.dispose();
        }
        this.f5044k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy[] m6172k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame, ShapeFrame shapeFrame, C4317dy c4317dy, List<qy7>[] listArr, C12007ix[] c12007ixArr) {
        Presentation.m2326k4(((FontsManager) geometryShape.getPresentation().getFontsManager()).m1554x1(), false);
        C2697dg c2697dg = new C2697dg();
        C2891s1 c2891s1M6163k4 = m6163k4(shapeFrame);
        C2768iu c2768iu = new C2768iu(c2697dg, null, m6157k4(geometryShape, c2891s1M6163k4));
        m6167k4(textFrame, c2768iu.m12318x1());
        lbk lbkVar = new lbk(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy(), abstractC14897zn.mo67707du() / 8.0f, abstractC14897zn.mo67709h4() / 8.0f);
        try {
            C4317dy c4317dyM17345kk = c4317dy.m17345kk();
            float f = ((float) (-c2891s1M6163k4.m12520to())) / 60000.0f;
            if (c2768iu.m12316k4().m12213h4().m12519kk()) {
                f += 180.0f;
            }
            c4317dyM17345kk.m17339k4(f, new C12025x6(((float) ((c2891s1M6163k4.m12521x1().m12482k4() / 2.0d) + c2891s1M6163k4.m12516k4().m12210k4())) / 12700.0f, ((float) ((c2891s1M6163k4.m12521x1().m12484x1() / 2.0d) + c2891s1M6163k4.m12516k4().m12212x1())) / 12700.0f), 1);
            c4317dy.m17345kk().m17348x1(-c4317dyM17345kk.m17330dy(), -c4317dyM17345kk.m17328c5());
            lbkVar.m74622kk(c4317dyM17345kk);
            textFrame.f3523to.mo64295k4(lbkVar, kg7Var);
            c2768iu.m12318x1().m12221k4(lbkVar.m64336jd(), lbkVar.m64334ck());
            C11896dy[] c11896dyArrM12225k4 = c2768iu.m12318x1().m12225k4(c12007ixArr);
            listArr[0] = lbkVar.m64345up();
            lbkVar.m74626rv();
            return c11896dyArrM12225k4;
        } finally {
            lbkVar.dispose();
        }
    }
}
