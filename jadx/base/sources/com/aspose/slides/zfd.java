package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class zfd {
    /* JADX INFO: renamed from: k4 */
    private static FontData m74509k4(C14251ot c14251ot, String str) {
        return c14251ot.m68818to() ? new FontData(str) : C13827mb.f46185k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74510k4(BasePortionFormat basePortionFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (basePortionFormat == null) {
            throw new ArgumentNullException("portionFormat");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("styleElement");
        }
        com.aspose.slides.internal.p332p7.zob zobVar = (com.aspose.slides.internal.p332p7.zob) wgi.m72712k4(com.aspose.slides.internal.p332p7.zob.class, "text-properties", lzcVar.m36550to());
        if (zobVar == null) {
            return;
        }
        m74511k4(basePortionFormat, zobVar, wxbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m74511k4(BasePortionFormat basePortionFormat, com.aspose.slides.internal.p332p7.zob zobVar, wxb wxbVar) {
        PortionFormat portionFormat;
        C12003du c12003duM67938m9;
        if (basePortionFormat == null) {
            throw new ArgumentNullException("portionFormat");
        }
        if (zobVar == null) {
            throw new ArgumentNullException("textProperties");
        }
        if (!C14113y2.m67411k4(zobVar.m45808jd()) && !wgi.m72742x1(zobVar.m45808jd())) {
            basePortionFormat.setFontHeight((float) wgi.m72702fa(zobVar.m45808jd()));
        }
        if (zobVar.m45810k4() == 3) {
            basePortionFormat.setTextCapType((byte) 2);
        }
        basePortionFormat.setFontBold(q9u.f48269k4.get_Item(Integer.valueOf(zobVar.m45821rv())).byteValue());
        basePortionFormat.setFontItalic(q9u.f48273x1.get_Item(Integer.valueOf(zobVar.m45802fa())).byteValue());
        basePortionFormat.setFontUnderline(q9u.f48270kk.get_Item(Integer.valueOf(zobVar.m45817ks())).byteValue());
        if (!C14113y2.m67411k4(zobVar.m45829x1())) {
            basePortionFormat.getFillFormat().setFillType((byte) 1);
            ((ColorFormat) basePortionFormat.getFillFormat().getSolidFillColor()).m1080k4(wgi.m72698ck(zobVar.m45829x1()).Clone());
        }
        if (wgi.m72731kk(zobVar.m45833x6())) {
            basePortionFormat.m365m9().m1080k4(wgi.m72698ck(zobVar.m45833x6()).Clone());
        }
        if (wgi.m72731kk(zobVar.m45826up())) {
            if (C14113y2.m67363du("none", zobVar.m45826up())) {
                basePortionFormat.getEffectFormat().disableOuterShadowEffect();
            } else {
                basePortionFormat.getEffectFormat().enableOuterShadowEffect();
                IOuterShadow outerShadowEffect = basePortionFormat.getEffectFormat().getOuterShadowEffect();
                outerShadowEffect.setDistance(3.0d);
                outerShadowEffect.setDirection(45.0f);
                outerShadowEffect.setRectangleAlign((byte) 0);
                C12003du c12003duClone = C12003du.m56460uz().Clone();
                if (basePortionFormat.getFillFormat().getFillType() == 1) {
                    c12003duM67938m9 = ((ColorFormat) basePortionFormat.getFillFormat().getSolidFillColor()).m1084to();
                } else {
                    if (basePortionFormat.getParent_Immediate() != null && (portionFormat = (PortionFormat) C7019kk.m27452k4((Object) basePortionFormat, PortionFormat.class)) != null) {
                        c12003duM67938m9 = ((C14176nc) portionFormat.m2305bv().getFillFormat()).m67938m9();
                    }
                    ((ColorFormat) outerShadowEffect.getShadowColor()).m1080k4((C14116yg.m67477k4((double) c12003duClone.m56512m9(), 2) < 0.5d ? C12003du.m56460uz() : C12003du.m56397k4(196, 196, 196)).Clone());
                }
                c12003duM67938m9.CloneTo(c12003duClone);
                ((ColorFormat) outerShadowEffect.getShadowColor()).m1080k4((C14116yg.m67477k4((double) c12003duClone.m56512m9(), 2) < 0.5d ? C12003du.m56460uz() : C12003du.m56397k4(196, 196, 196)).Clone());
            }
        }
        String strM45804h4 = !C14113y2.m67411k4(zobVar.m45804h4()) ? zobVar.m45804h4() : !C14113y2.m67411k4(zobVar.m45796du()) ? zobVar.m45796du() : null;
        if (strM45804h4 != null) {
            String strM67401k4 = C14113y2.m67401k4(strM45804h4, "'", "");
            basePortionFormat.setLatinFont(new FontData(strM67401k4));
            basePortionFormat.setSymbolFont(m74509k4(((Presentation) C7019kk.m27452k4((Object) wxbVar.m72957k4().m69951k4(), Presentation.class)).m2385ks().m7124k4(strM67401k4, (byte) 2, 0, 18.0f, 0, false), strM67401k4));
        }
        if (!C14113y2.m67411k4(zobVar.m45818m9())) {
            basePortionFormat.setEastAsianFont(new FontData(C14113y2.m67401k4(zobVar.m45818m9(), "'", "")));
        }
        if (!C14113y2.m67411k4(zobVar.m45799dy())) {
            basePortionFormat.setComplexScriptFont(new FontData(C14113y2.m67401k4(zobVar.m45799dy(), "'", "")));
        }
        if (!C14113y2.m67411k4(zobVar.m45822to())) {
            basePortionFormat.setEscapement(wgi.m72743x6(zobVar.m45822to()));
        }
        if (zobVar.m45834yj() == 2) {
            basePortionFormat.setFontUnderline((byte) 2);
        } else if (zobVar.m45834yj() == 3) {
            basePortionFormat.setFontUnderline((byte) 3);
        }
        if (zobVar.m45814kk() == 2) {
            basePortionFormat.setStrikethroughType((byte) 1);
        }
        if (C14113y2.m67411k4(zobVar.m45794ck())) {
            return;
        }
        basePortionFormat.setSpacing(C14113y2.m67363du("normal", zobVar.m45794ck()) ? 0.0f : (float) wgi.m72739up(zobVar.m45794ck()));
    }
}
