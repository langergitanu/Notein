package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10726y4;

/* JADX INFO: renamed from: com.aspose.slides.nt */
/* JADX INFO: loaded from: classes3.dex */
class C14200nt {
    /* JADX INFO: renamed from: k4 */
    public static void m68199k4(IEffectFormat iEffectFormat, ri7 ri7Var) {
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10534m3 c10534m3Mo50859du = c10462h9M70140fa.mo50859du();
        C10726y4 c10726y4 = (C10726y4) C7019kk.m27452k4((Object) (c10534m3Mo50859du != null ? c10534m3Mo50859du.m51263x1() : new C10480ii()).m50923k4(575), C10726y4.class);
        if (c10726y4 == null || !c10726y4.m52051x1()) {
            return;
        }
        C1148gj.m6741k4(iEffectFormat.getBlurEffect(), c10534m3Mo50859du, ri7Var);
        C14453se.m70597k4(iEffectFormat.getFillOverlayEffect(), c10534m3Mo50859du, ri7Var);
        C14368r0.m69971k4(iEffectFormat.getGlowEffect(), c10534m3Mo50859du, ri7Var);
        nwr.m68240k4(iEffectFormat.getInnerShadowEffect(), c10534m3Mo50859du, ri7Var);
        btg.m4308k4(iEffectFormat.getReflectionEffect(), c10534m3Mo50859du, ri7Var);
        ipq.m63024k4(iEffectFormat.getSoftEdgeEffect(), c10534m3Mo50859du, ri7Var);
        if (c10726y4.m52051x1() && !c10726y4.m52049kk() && iEffectFormat.isNoEffects()) {
            ((EffectFormat) iEffectFormat).m1385du();
        } else if (pcw.m69021k4(c10534m3Mo50859du)) {
            pcw.m69018k4(iEffectFormat, c10462h9M70140fa);
        } else {
            ouj.m68861k4(iEffectFormat, ri7Var);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m68201x1(uz3 uz3Var) {
        if (uz3Var.m71998b3()) {
            IEffectFormat iEffectFormatM72009v4 = uz3Var.m72009v4();
            C10480ii c10480iiM51263x1 = uz3Var.m72000ix().mo50859du().m51263x1();
            C10726y4 c10726y4 = new C10726y4();
            if (((EffectFormat) iEffectFormatM72009v4).m1390to() && iEffectFormatM72009v4.isNoEffects()) {
                c10726y4.m52047k4(true);
                c10726y4.m52050x1(false);
                c10726y4.m52048kk(false);
            } else {
                c10726y4.m52047k4(true);
                c10726y4.m52050x1(true);
                c10726y4.m52048kk(true);
                nwr.m68241k4(iEffectFormatM72009v4.getInnerShadowEffect(), uz3Var);
                ouj.m68862k4(iEffectFormatM72009v4.getOuterShadowEffect(), uz3Var);
                pcw.m69019k4(iEffectFormatM72009v4.getPresetShadowEffect(), uz3Var);
            }
            c10480iiM51263x1.m50930x1(c10726y4);
            C1148gj.m6742k4(iEffectFormatM72009v4.getBlurEffect(), uz3Var);
            C14453se.m70598k4(iEffectFormatM72009v4.getFillOverlayEffect(), uz3Var);
            C14368r0.m69972k4(iEffectFormatM72009v4.getGlowEffect(), uz3Var);
            btg.m4309k4(iEffectFormatM72009v4.getReflectionEffect(), uz3Var);
            ipq.m63025k4(iEffectFormatM72009v4.getSoftEdgeEffect(), uz3Var);
            if (c10480iiM51263x1.m50931x1(521) || c10480iiM51263x1.m50931x1(524) || c10480iiM51263x1.m50931x1(522) || c10480iiM51263x1.m50931x1(523)) {
                C22225Oooo0oO.OooO0O0(512, 2L, c10480iiM51263x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68200k4(uz3 uz3Var) {
        GeometryShape geometryShape;
        if (uz3Var.m71998b3() || (geometryShape = (GeometryShape) C7019kk.m27452k4((Object) uz3Var.mo64936jd(), GeometryShape.class)) == null) {
            return;
        }
        rpo rpoVarM3738du = uz3Var.m3745to().m3738du();
        IShapeStyle shapeStyle = geometryShape.getShapeStyle();
        if (shapeStyle == null) {
            return;
        }
        C14754wx c14754wxM6307k4 = (shapeStyle.getEffectStyleIndex() & 4294967295L) > 0 ? ((fuq) rpoVarM3738du.m70235x1().createThemeEffective()).m6307k4(shapeStyle.getEffectStyleIndex()) : null;
        if (c14754wxM6307k4 == null) {
            return;
        }
        C10480ii c10480iiM51263x1 = uz3Var.m72000ix().mo50859du().m51263x1();
        C10726y4 c10726y4 = (C10726y4) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(575), C10726y4.class);
        if (c10726y4 == null) {
            c10726y4 = new C10726y4();
            c10480iiM51263x1.m50930x1(c10726y4);
        }
        boolean zIsNoEffects = c14754wxM6307k4.isNoEffects();
        c10726y4.m52047k4(true);
        if (zIsNoEffects) {
            c10726y4.m52050x1(false);
            c10726y4.m52048kk(false);
        } else {
            c10726y4.m52050x1(true);
            c10726y4.m52048kk(true);
            nwr.m68242k4(c14754wxM6307k4.getInnerShadowEffect(), uz3Var);
            ouj.m68863k4(c14754wxM6307k4.getOuterShadowEffect(), uz3Var);
            pcw.m69020k4(c14754wxM6307k4.getPresetShadowEffect(), uz3Var);
        }
        C1148gj.m6743k4(c14754wxM6307k4.getBlurEffect(), uz3Var);
        C14453se.m70599k4(c14754wxM6307k4.getFillOverlayEffect(), uz3Var);
        C14368r0.m69973k4(c14754wxM6307k4.getGlowEffect(), uz3Var);
        btg.m4310k4(c14754wxM6307k4.getReflectionEffect(), uz3Var);
        ipq.m63026k4(c14754wxM6307k4.getSoftEdgeEffect(), uz3Var);
        if (c10480iiM51263x1.m50931x1(521) || c10480iiM51263x1.m50931x1(524) || c10480iiM51263x1.m50931x1(522) || c10480iiM51263x1.m50931x1(523)) {
            C22225Oooo0oO.OooO0O0(512, 2L, c10480iiM51263x1);
        }
    }
}
