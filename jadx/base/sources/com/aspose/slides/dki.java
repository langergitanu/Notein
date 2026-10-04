package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10520l6;
import com.aspose.slides.internal.p407st.C10601q9;
import com.aspose.slides.internal.p407st.C10675uz;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dki {
    /* JADX INFO: renamed from: k4 */
    public static void m5123k4(ey6 ey6Var, C10431f3 c10431f3) {
        ey6Var.m5778k4(c10431f3.m50776ck());
        ey6Var.m5781x1(c10431f3.m50775c5());
        ey6Var.m5779k4(c10431f3.m51762to());
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m5126x1(m4c m4cVar) {
        C12003du c12003duM67938m9;
        float fM56512m9;
        C12003du c12003duM56385i5;
        OuterShadow outerShadow;
        if (m4cVar.m64714fa() != 4) {
            return;
        }
        IGenericEnumerator<qah> it = m4cVar.m64736uz().iterator();
        while (it.hasNext()) {
            try {
                qah next = it.next();
                if (!next.m69494up() && !next.m69497yj() && next.m69482dy() == 3) {
                    IAutoShape iAutoShape = (IAutoShape) next.m69481du().m70148u4();
                    TextFrame textFrame = (TextFrame) C7019kk.m27452k4((Object) iAutoShape.getTextFrame(), TextFrame.class);
                    if (textFrame != null && !textFrame.m2902ck() && !textFrame.m2926m9()) {
                        IFillFormatEffectiveData effective = iAutoShape.getFillFormat().getEffective();
                        IBackgroundEffectiveData effective2 = m4cVar.m64735up().getBackground().getEffective();
                        IGenericEnumerator<IParagraph> it2 = iAutoShape.getTextFrame().getParagraphs().iterator();
                        while (it2.hasNext()) {
                            try {
                                IGenericEnumerator<IPortion> it3 = it2.next().getPortions().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        IPortionFormat portionFormat = it3.next().getPortionFormat();
                                        IPortionFormatEffectiveData effective3 = portionFormat.getEffective();
                                        IOuterShadowEffectiveData outerShadowEffect = effective3.getEffectFormat().getOuterShadowEffect();
                                        if (outerShadowEffect != null) {
                                            C12003du c12003duClone = C12003du.m56460uz().Clone();
                                            if (effective3.getFillFormat().getFillType() == 1) {
                                                ((C14176nc) effective3.getFillFormat()).m67938m9().CloneTo(c12003duClone);
                                            }
                                            C12003du c12003duClone2 = C12003du.m56398k4(255, 200, 200, 200).Clone();
                                            if (effective2.getFillFormat().getFillType() == 1 || effective2.getFillFormat().getFillType() == 2 || effective.getFillType() == 1) {
                                                C12003du c12003du = new C12003du();
                                                if (effective.getFillType() == 1) {
                                                    c12003duM67938m9 = ((C14176nc) effective).m67938m9();
                                                } else if (effective2.getFillFormat().getFillType() == 1) {
                                                    c12003duM67938m9 = ((C14176nc) effective2.getFillFormat()).m67938m9();
                                                } else {
                                                    c12003duClone2.CloneTo(c12003du);
                                                    fM56512m9 = c12003du.m56512m9();
                                                    float fM56512m92 = c12003duClone.m56512m9();
                                                    float fM56512m93 = c12003duClone2.m56512m9();
                                                    if (fM56512m9 > 0.0f || fM56512m9 >= 0.942f) {
                                                        if (fM56512m9 == 0.0f && fM56512m92 <= fM56512m93) {
                                                            c12003duM56385i5 = C12003du.m56385i5();
                                                        }
                                                        if (((vmd) outerShadowEffect).m72367x1().m56506h4() != c12003duClone2.m56506h4()) {
                                                            if (portionFormat.getEffectFormat().getOuterShadowEffect() == null) {
                                                                portionFormat.getEffectFormat().enableOuterShadowEffect();
                                                                outerShadow = (OuterShadow) portionFormat.getEffectFormat().getOuterShadowEffect();
                                                                outerShadow.setDistance(outerShadowEffect.getDistance());
                                                                outerShadow.setBlurRadius(outerShadowEffect.getBlurRadius());
                                                                outerShadow.setDirection(outerShadowEffect.getDirection());
                                                                outerShadow.setRectangleAlign(outerShadowEffect.getRectangleAlign());
                                                            } else {
                                                                outerShadow = (OuterShadow) portionFormat.getEffectFormat().getOuterShadowEffect();
                                                            }
                                                            ((ColorFormat) outerShadow.getShadowColor()).m1080k4(c12003duClone2.Clone());
                                                            portionFormat.getEffectFormat().setOuterShadowEffect(outerShadow);
                                                        }
                                                    } else {
                                                        c12003duM56385i5 = fM56512m92 > 0.0f ? C12003du.m56460uz() : C12003du.m56385i5();
                                                    }
                                                    c12003duM56385i5.CloneTo(c12003duClone2);
                                                    if (((vmd) outerShadowEffect).m72367x1().m56506h4() != c12003duClone2.m56506h4()) {
                                                    }
                                                }
                                                c12003duM67938m9.CloneTo(c12003du);
                                                fM56512m9 = c12003du.m56512m9();
                                                float fM56512m922 = c12003duClone.m56512m9();
                                                float fM56512m932 = c12003duClone2.m56512m9();
                                                if (fM56512m9 > 0.0f) {
                                                    if (fM56512m9 == 0.0f) {
                                                        c12003duM56385i5 = C12003du.m56385i5();
                                                        c12003duM56385i5.CloneTo(c12003duClone2);
                                                    }
                                                    if (((vmd) outerShadowEffect).m72367x1().m56506h4() != c12003duClone2.m56506h4()) {
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                            it3.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            } catch (Throwable th2) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th2;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5124k4(m4c m4cVar) {
        Slide slide = (Slide) m4cVar.m64735up();
        if (slide == null) {
            throw new NullReferenceException("Can't create target DOM Slide!");
        }
        C10431f3 c10431f3 = (C10431f3) m4cVar.m64717jd();
        slide.setHidden(false);
        C1240i5.m7462k4(m4cVar);
        m5123k4(slide.m2688ix(), c10431f3);
        m5126x1(m4cVar);
        if (slide.m2688ix().m6943kk() != null) {
            slide.m2708ne().m70263k4(!r3.m51676kk());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m5127x1(rpo rpoVar) {
        rpo next;
        C10495ji c10495jiM70209fa;
        Slide slide = (Slide) rpoVar.m70235x1();
        C10431f3 c10431f3 = (C10431f3) rpoVar.m70228to();
        C10487j0 c10487j0M51360qq = c10431f3.m51360qq();
        if (rpoVar.m70204bv()) {
            rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
            LayoutSlide layoutSlide = (LayoutSlide) slide.getLayoutSlide();
            List.Enumerator<rpo> it = rpoVarM70214k4.m70227rv().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (layoutSlide == next.m70235x1()) {
                            break;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (next == null) {
                throw new ArgumentOutOfRangeException("Mismatch layout for slide!");
            }
            if (rpoVarM70214k4.m70228to() == next.m70228to()) {
                C10520l6 c10520l6 = new C10520l6();
                c10520l6.m51150k4(4294967295L & ((long) rpoVarM70214k4.m70231up()));
                c10520l6.m51149k4(next.m70226qq() & 65535);
                c10431f3.m50507k4(c10520l6);
                c10495jiM70209fa = rpoVarM70214k4.m70209fa();
            } else {
                C10601q9 c10601q9 = new C10601q9();
                c10601q9.m51557k4(4294967295L & ((long) rpoVarM70214k4.m70231up()));
                c10431f3.m50507k4(c10601q9);
                c10495jiM70209fa = next.m70209fa();
            }
        } else {
            rpo rpoVarM70214k42 = rpoVar.m70214k4(3);
            if (rpoVarM70214k42 == null) {
                rpoVarM70214k42 = rpoVar.m70214k4(0);
            }
            c10495jiM70209fa = rpoVarM70214k42.m70209fa();
        }
        c10487j0M51360qq.m50981k4(c10495jiM70209fa.m51011to());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5125k4(rpo rpoVar) {
        C10431f3 c10431f3 = (C10431f3) rpoVar.m70228to();
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        Slide slide = (Slide) rpoVar.m70235x1();
        C10495ji c10495jiM70209fa = rpoVar.m70209fa();
        rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
        c10495jiM70209fa.m51009k4(slide.mo404to().m6945x1());
        C10487j0 c10487j0M51360qq = c10431f3.m51360qq();
        c10487j0M51360qq.m50983x1(0L);
        c10487j0M51360qq.m51114kk(slide.getBackground().getType() == -1);
        c10487j0M51360qq.m51113k4(slide.getShowMasterShapes());
        boolean z = (slide.m2688ix().m5776du() == null || slide.m2688ix().m5777h4()) ? false : true;
        y2nVarM70215k4.m73701k4(rpoVarM70214k4.m70235x1());
        c10487j0M51360qq.m51117x1(z ? slide.m2688ix().m5777h4() : !slide.getThemeManager().isOverrideThemeEnabled());
        y2nVarM70215k4.m73708k4(true);
        C1240i5.m7464k4(rpoVar);
        y2nVarM70215k4.m73708k4(false);
        m5127x1(rpoVar);
        if (z) {
            C10675uz c10675uzM51762to = c10431f3.m51762to();
            if (c10675uzM51762to != null) {
                c10675uzM51762to.m51834k4(slide.m2688ix().m5776du());
            } else {
                c10431f3.m50507k4(slide.m2688ix().m5776du());
            }
        }
        if (rpoVar.m70204bv()) {
            rpoVar.m70221kk(true);
        }
        if (slide.getLayoutSlide() != null) {
            if (rpoVar.m70233v4()) {
                c10487j0M51360qq.m50980k4(16);
                for (int i = 0; i < 8; i++) {
                    c10487j0M51360qq.m50979dy()[i] = 0;
                }
            } else {
                c10487j0M51360qq.m50980k4(f6b.m5958to(slide.getLayoutSlide().getLayoutType()));
            }
        }
        y2nVarM70215k4.m73703k4(c10487j0M51360qq, false);
        if (c10487j0M51360qq.m50982m9() == 16) {
            for (int i2 = 0; i2 < 8; i2++) {
                c10487j0M51360qq.m50979dy()[i2] = 0;
            }
        }
        cn8.m4692k4(rpoVar);
    }
}
