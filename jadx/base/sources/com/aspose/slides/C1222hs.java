package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.hs */
/* JADX INFO: loaded from: classes3.dex */
class C1222hs {
    /* JADX INFO: renamed from: k4 */
    public static void m7285k4(IGradientFormatEffectiveData iGradientFormatEffectiveData, jlf jlfVar, OdpSerializationContext odpSerializationContext) {
        String strM72718k4;
        String strM72718k42;
        String strM72718k43;
        String strM72718k44;
        int i;
        if (iGradientFormatEffectiveData == null) {
            throw new ArgumentNullException("gradientFormat");
        }
        if (jlfVar == null) {
            throw new ArgumentNullException("fillFormatContext");
        }
        int size = iGradientFormatEffectiveData.getGradientStops().size();
        if (size <= 0 || (((size <= 2 || (size == 3 && C12003du.m56403k4(((GradientStopEffectiveData) iGradientFormatEffectiveData.getGradientStops().get_Item(0)).m1634k4(), ((GradientStopEffectiveData) iGradientFormatEffectiveData.getGradientStops().get_Item(2)).m1634k4()))) && iGradientFormatEffectiveData.getGradientStops().get_Item(0).getPosition() == 0.0f && iGradientFormatEffectiveData.getGradientStops().get_Item(size - 1).getPosition() == 1.0f) || odpSerializationContext.m2048fa())) {
            com.aspose.slides.internal.p332p7.mbw mbwVarM44347to = odpSerializationContext.m2066x1().m44347to();
            jlfVar.m63424kk(4);
            if (size == 0) {
                return;
            }
            String strM67402k4 = C14113y2.m67402k4("Gradient{0}", Integer.valueOf(mbwVarM44347to.m36786k4().size()));
            jlfVar.m63418c5(strM67402k4);
            com.aspose.slides.internal.p332p7.fp3 fp3Var = (com.aspose.slides.internal.p332p7.fp3) mbwVarM44347to.m36787k4("gradient").m29542x1();
            fp3Var.m31976x1(strM67402k4);
            fp3Var.m31968k4(strM67402k4);
            byte gradientShape = iGradientFormatEffectiveData.getGradientShape();
            if (gradientShape != 0) {
                if (gradientShape != 1) {
                    if (gradientShape != 2) {
                        i = gradientShape == 3 ? 6 : 5;
                    } else {
                        fp3Var.m31967k4(3);
                    }
                }
                fp3Var.m31967k4(i);
            } else {
                fp3Var.m31967k4(1);
            }
            IGradientStopEffectiveData iGradientStopEffectiveData = iGradientFormatEffectiveData.getLinearGradientAngle() == 90.0f ? iGradientFormatEffectiveData.getGradientStops().get_Item(0) : iGradientFormatEffectiveData.getGradientStops().get_Item(1);
            IGradientStopEffectiveData iGradientStopEffectiveData2 = iGradientFormatEffectiveData.getLinearGradientAngle() == 90.0f ? iGradientFormatEffectiveData.getGradientStops().get_Item(1) : iGradientFormatEffectiveData.getGradientStops().get_Item(0);
            if (size > 2) {
                if (iGradientFormatEffectiveData.getGradientShape() == 0) {
                    fp3Var.m31967k4(2);
                }
                fp3Var.m31972m9(wgi.m72720k4(((GradientStopEffectiveData) iGradientStopEffectiveData).m1634k4().Clone()));
                fp3Var.m31961dy(wgi.m72720k4(((GradientStopEffectiveData) iGradientStopEffectiveData2).m1634k4().Clone()));
                strM72718k4 = wgi.m72718k4(50);
            } else {
                fp3Var.m31972m9(wgi.m72720k4(((GradientStopEffectiveData) iGradientStopEffectiveData).m1634k4().Clone()));
                fp3Var.m31961dy(wgi.m72720k4(((GradientStopEffectiveData) iGradientStopEffectiveData2).m1634k4().Clone()));
                strM72718k4 = wgi.m72718k4(C7019kk.m27462to(Float.valueOf(100.0f - (iGradientFormatEffectiveData.getGradientStops().get_Item(1).getPosition() * 100.0f)), 13));
            }
            fp3Var.m31963h4(strM72718k4);
            if (iGradientFormatEffectiveData.getGradientShape() > 0) {
                int gradientDirection = iGradientFormatEffectiveData.getGradientDirection();
                if (gradientDirection == 0) {
                    strM72718k42 = wgi.m72718k4(20);
                } else if (gradientDirection != 1) {
                    if (gradientDirection == 2) {
                        strM72718k44 = wgi.m72718k4(20);
                    } else if (gradientDirection != 3) {
                        fp3Var.m31970kk(wgi.m72718k4(50));
                        strM72718k43 = wgi.m72718k4(50);
                        fp3Var.m31974to(strM72718k43);
                    } else {
                        strM72718k44 = wgi.m72718k4(80);
                    }
                    fp3Var.m31970kk(strM72718k44);
                    strM72718k43 = wgi.m72718k4(80);
                    fp3Var.m31974to(strM72718k43);
                } else {
                    strM72718k42 = wgi.m72718k4(80);
                }
                fp3Var.m31970kk(strM72718k42);
                strM72718k43 = wgi.m72718k4(20);
                fp3Var.m31974to(strM72718k43);
            }
            if (iGradientFormatEffectiveData.getLinearGradientAngle() != 270.0f) {
                fp3Var.m31959du(C13850af.m65103k4((C7019kk.m27462to(Float.valueOf(iGradientFormatEffectiveData.getLinearGradientAngle() + 270.0f), 13) % StyleIdentifier.LIST_TABLE_4_ACCENT_5) * 10));
            }
            if ((((GradientStopEffectiveData) iGradientStopEffectiveData).m1634k4().m56501c5() & 255) < 255 || (((GradientStopEffectiveData) iGradientStopEffectiveData2).m1634k4().m56501c5() & 255) < 255) {
                fp3Var.m31957c5(wgi.m72718k4(OooO.OooO00o(((r8.m1634k4().m56501c5() & 255) * 100) / 255.0f, 14)));
                fp3Var.m31965jd(wgi.m72718k4(OooO.OooO00o(((255 & ((GradientStopEffectiveData) iGradientStopEffectiveData2).m1634k4().m56501c5()) * 100) / 255.0f, 14)));
                String strM67402k42 = C14113y2.m67402k4("GradientOpacity{0}", Integer.valueOf(mbwVarM44347to.m36786k4().size()));
                jlfVar.m63420dy(strM67402k42);
                com.aspose.slides.internal.p332p7.rrr rrrVar = (com.aspose.slides.internal.p332p7.rrr) mbwVarM44347to.m36787k4("opacity").m29542x1();
                rrrVar.m40214x1(strM67402k42);
                rrrVar.m40209k4(strM67402k42);
                rrrVar.m40208k4(fp3Var.m31975x1());
                rrrVar.m40211kk(fp3Var.m31956c5());
                rrrVar.m40212to(fp3Var.m31964jd());
                return;
            }
            return;
        }
        jlfVar.m63424kk(3);
        int i2 = (iGradientFormatEffectiveData.getGradientShape() == 0 && iGradientFormatEffectiveData.getLinearGradientAngle() % 180.0f == 0.0f) ? 1 : 256;
        C12009k4 c12009k4 = new C12009k4(256, i2);
        try {
            c12009k4.m56332k4(96.0f, 96.0f);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
                AbstractC12024x1 abstractC12024x1M73548kk = C14814xq.m73548kk(new C14478sy(new ajz(new ShapeFrame(0.0f, 0.0f, c12009k4.mo15760yj(), i2, (byte) 0, (byte) 0, 0.0f).cloneT(), new C4317dy(), null, odpSerializationContext.m2047dy(), null), (C13787ln) iGradientFormatEffectiveData, false));
                try {
                    abstractC12008jdM56582k4.mo17526k4(abstractC12024x1M73548kk, 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                    if (abstractC12024x1M73548kk != null) {
                        abstractC12024x1M73548kk.dispose();
                    }
                    abstractC12008jdM56582k4.dispose();
                    jlfVar.m63422k4(3);
                    C3152yj c3152yj = new C3152yj();
                    try {
                        c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                        odpSerializationContext.m2060k4(jlfVar, ((ImageCollection) odpSerializationContext.m2051k4().getImages()).m1740x1(c3152yj.toArray()));
                        c12009k4.dispose();
                    } finally {
                        c3152yj.dispose();
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c12009k4.dispose();
            throw th;
        }
    }
}
