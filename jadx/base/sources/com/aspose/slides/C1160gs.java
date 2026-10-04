package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10398dc;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10749ze;
import com.aspose.slides.internal.p475wh.C12003du;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.gs */
/* JADX INFO: loaded from: classes3.dex */
class C1160gs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.aspose.slides.ColorFormat] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.aspose.slides.IColorFormat] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.aspose.slides.IColorFormat] */
    /* JADX INFO: renamed from: k4 */
    public static void m6895k4(GradientFormat gradientFormat, C10534m3 c10534m3, y2n y2nVar) {
        boolean z;
        int i;
        IColorFormat color;
        IColorFormat color2;
        C10609qn c10609qn;
        C10480ii c10480iiM51263x1 = c10534m3.m51263x1();
        c10480iiM51263x1.m50928kk(384);
        c10480iiM51263x1.m50928kk(395);
        byte gradientShape = gradientFormat.getGradientShape();
        if (gradientShape != -1) {
            if (gradientShape != 0) {
                if (gradientShape == 1) {
                    c10609qn = new C10609qn(384, 5L);
                } else if (gradientShape == 2) {
                    y2nVar.m73707k4("Radial gradient is not implemented for saving to PPT yet.", 2);
                } else {
                    if (gradientShape != 3) {
                        throw new Exception();
                    }
                    c10609qn = new C10609qn(384, 6L);
                }
                c10480iiM51263x1.m50926k4(c10609qn);
            } else {
                c10480iiM51263x1.m50926k4(gradientFormat.getLinearGradientScaled() == 1 ? new C10609qn(384, 7L) : new C10609qn(384, 4L));
                if (gradientFormat.getLinearGradientAngle() != 90.0f) {
                    float linearGradientAngle = 90.0f - gradientFormat.getLinearGradientAngle();
                    if (linearGradientAngle < 0.0f) {
                        linearGradientAngle += 360.0f;
                    }
                    if (linearGradientAngle != 0.0f) {
                        c10480iiM51263x1.m50926k4(new C10609qn(395, C7019kk.m27435du(Float.valueOf(linearGradientAngle * 65536.0f), 13)));
                    }
                }
            }
        }
        c10480iiM51263x1.m50928kk(385);
        c10480iiM51263x1.m50928kk(386);
        c10480iiM51263x1.m50928kk(387);
        c10480iiM51263x1.m50928kk(388);
        c10480iiM51263x1.m50928kk(407);
        int size = gradientFormat.getGradientStops().size();
        if (size > 0) {
            ColorFormat colorFormat = new ColorFormat(null);
            if (gradientFormat.getGradientStops().get_Item(0).getColor().getColorTransform().size() > 1) {
                colorFormat.m1080k4(((ColorFormat) gradientFormat.getGradientStops().get_Item(0).getColor()).m1084to().Clone());
                color = colorFormat;
            } else {
                color = gradientFormat.getGradientStops().get_Item(0).getColor();
            }
            C14294pm.m69144k4(color, c10480iiM51263x1, 385, 386, y2nVar);
            ColorFormat colorFormat2 = new ColorFormat(null);
            int i2 = size - 1;
            if (gradientFormat.getGradientStops().get_Item(i2).getColor().getColorTransform().size() > 1) {
                colorFormat2.m1080k4(((ColorFormat) gradientFormat.getGradientStops().get_Item(i2).getColor()).m1084to().Clone());
                color2 = colorFormat2;
            } else {
                color2 = gradientFormat.getGradientStops().get_Item(i2).getColor();
            }
            C14294pm.m69144k4(color2, c10480iiM51263x1, 387, 388, y2nVar);
            z = gradientFormat.getGradientStops().get_Item(0).getPosition() == 0.0f;
            i = gradientFormat.getGradientStops().get_Item(i2).getPosition() == 1.0f ? 1 : 0;
        } else {
            z = false;
            i = 0;
        }
        if (!z || i == 0 || size != 2) {
            int i3 = size - i;
            C10749ze c10749ze = new C10749ze(407, 65535 & i3, 8);
            for (int i4 = 0; i4 < i3; i4++) {
                IGradientStop iGradientStop = gradientFormat.getGradientStops().get_Item(i4);
                ?? colorFormat3 = new ColorFormat(null);
                if (iGradientStop.getColor().getColorTransform().size() > 1) {
                    colorFormat3.m1080k4(((ColorFormat) iGradientStop.getColor()).m1084to().Clone());
                } else {
                    colorFormat3 = iGradientStop.getColor();
                }
                c10749ze.m52132k4(i4, C7019kk.m27461m9(Long.valueOf((C7019kk.m27461m9(Float.valueOf(iGradientStop.getPosition() * 65536.0f), 13) << 32) | C7019kk.m27461m9(Long.valueOf(C14294pm.m69136k4((IColorFormat) colorFormat3, y2nVar)), 10)), 12));
            }
            c10480iiM51263x1.m50926k4(c10749ze);
        }
        C22224Oooo0o0.OooO0O0(396, 100L, c10480iiM51263x1, 397);
        c10480iiM51263x1.m50928kk(398);
        c10480iiM51263x1.m50928kk(399);
        c10480iiM51263x1.m50928kk(400);
        if (gradientFormat.getGradientShape() == 1 || gradientFormat.getGradientShape() == 3) {
            ohe oheVarClone = gradientFormat.m1605h4().Clone();
            c10480iiM51263x1.m50926k4(new C10609qn(397, C7019kk.m27435du(Float.valueOf(oheVarClone.f47808k4.f47836k4 * 65536.0f), 13)));
            c10480iiM51263x1.m50926k4(new C10609qn(398, C7019kk.m27435du(Float.valueOf(oheVarClone.f47808k4.f47837x1 * 65536.0f), 13)));
            c10480iiM51263x1.m50926k4(new C10609qn(399, C7019kk.m27435du(Float.valueOf(oheVarClone.m68567k4().f47836k4 * 65536.0f), 13)));
            c10480iiM51263x1.m50926k4(new C10609qn(400, C7019kk.m27435du(Float.valueOf(oheVarClone.m68567k4().f47837x1 * 65536.0f), 13)));
        }
        if (gradientFormat.getTileFlip() == 0 || gradientFormat.getTileFlip() == -1) {
            return;
        }
        y2nVar.m73707k4("Non default GradientFormat.TileFlip is not implemented for saving to PPT yet.", 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0354  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6896k4(GradientFormat gradientFormat, ri7 ri7Var) {
        byte b;
        long j;
        byte b2;
        float f;
        long j2;
        IColorFormat color;
        int i;
        short s;
        long j3;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10462h9 c10462h9 = ri7Var.m70147rv() != null ? (C10462h9) ri7Var.m70147rv().m69489kk() : null;
        C10355ai c10355aiM50668x1 = C10398dc.m50668x1(c10462h9M70140fa, c10462h9, 407);
        C10609qn c10609qnM50666k4 = C10398dc.m50666k4(c10462h9M70140fa, c10462h9, 412);
        long j4 = 4294967295L;
        float f2 = 0.0f;
        if (c10355aiM50668x1 == null || c10355aiM50668x1.m50421kk() <= 6) {
            b = 0;
            j = 4294967295L;
            b2 = 1;
            f = 1.0f;
            if (c10609qnM50666k4 == null || (c10609qnM50666k4.m51597ar() & 4294967295L) == 1073741827) {
                ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(0.0f, C12003du.m56460uz().Clone());
                ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(1.0f, C12003du.m56385i5().Clone());
                j2 = 16777215;
                C14294pm.m69141k4(gradientFormat.getGradientStops().get_Item(0).getColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
                color = (ColorFormat) gradientFormat.getGradientStops().get_Item(1).getColor();
                i = 388;
            } else if ((c10609qnM50666k4.m51597ar() & 4294967295L) == 1073741835) {
                ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(0.0f, C12003du.m56460uz().Clone());
                ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(1.0f, C12003du.m56385i5().Clone());
                C14294pm.m69141k4(gradientFormat.getGradientStops().get_Item(0).getColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
                C10609qn c10609qnM50666k42 = C10398dc.m50666k4(c10462h9M70140fa, c10462h9, 387);
                ColorFormat colorFormat = (ColorFormat) gradientFormat.getGradientStops().get_Item(1).getColor();
                colorFormat.m1079k4((ColorFormat) gradientFormat.getGradientStops().get_Item(0).getColor());
                int i2 = 0;
                while (i2 < colorFormat.getColorTransform().size()) {
                    if (((ColorOperation) colorFormat.getColorTransform().get_Item(i2)).m1114k4()) {
                        colorFormat.getColorTransform().removeAt(i2);
                    } else {
                        i2++;
                    }
                }
                long jM50663k4 = C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 388, 65536L) & 4294967295L;
                if (jM50663k4 < 65536) {
                    colorFormat.getColorTransform().add(5, jM50663k4 / 65536.0f);
                }
                if (c10609qnM50666k42 != null) {
                    boolean z = (c10609qnM50666k42.m51597ar() & C18177fb.f54859s) == 496;
                    boolean z2 = (c10609qnM50666k42.m51597ar() & C18177fb.f54859s) == 752;
                    if (z || z2) {
                        colorFormat.getColorTransform().add(26, 0.0f);
                        int iM51597ar = (int) (((c10609qnM50666k42.m51597ar() & 4294967295L) >> 16) & 255);
                        if (z) {
                            colorFormat.getColorTransform().add(1, iM51597ar / 255.0f);
                        } else if (z2) {
                            colorFormat.getColorTransform().add(0, iM51597ar / 255.0f);
                        }
                        colorFormat.getColorTransform().add(27, 0.0f);
                    } else {
                        i = 388;
                        j2 = 16777215;
                        color = colorFormat;
                    }
                }
            }
            C14294pm.m69141k4(color, c10462h9M70140fa, c10462h9, 387, i, j2);
        } else {
            float f3 = 1.0f;
            float fM50663k4 = (C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 388, 65536L) & 4294967295L) / 65536.0f;
            float fM50663k42 = ((C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 386, 65536L) & 4294967295L) / 65536.0f) - fM50663k4;
            byte[] bArrMo50423x1 = c10355aiM50668x1.mo50423x1();
            short sM13241k4 = C3110yd.m13241k4(bArrMo50423x1, 0);
            short sM13241k42 = C3110yd.m13241k4(bArrMo50423x1, 4);
            if (c10355aiM50668x1.m50421kk() < (sM13241k42 * sM13241k4) + 6 || sM13241k42 != 8) {
                throw new PptReadException("Error reading gradient stops.");
            }
            int i3 = 0;
            while (i3 < sM13241k4) {
                int i4 = (sM13241k42 * i3) + 6;
                float fM13249kk = C3110yd.m13249kk(bArrMo50423x1, r12 + 10) / 65536.0f;
                if (fM13249kk < f2 || fM13249kk > f3) {
                    s = sM13241k42;
                    j3 = j4;
                } else {
                    float f4 = (fM13249kk * fM50663k42) + fM50663k4;
                    if (f4 > f3) {
                        f4 = f3;
                    }
                    float f5 = f4 < f2 ? f2 : f4;
                    long jM13253to = C3110yd.m13253to(bArrMo50423x1, i4);
                    s = sM13241k42;
                    long j5 = jM13253to & j4;
                    j3 = j4;
                    IGradientStop iGradientStopM1628to = ((GradientStopCollection) gradientFormat.getGradientStops()).m1628to();
                    iGradientStopM1628to.setPosition(fM13249kk);
                    C14294pm.m69139k4(iGradientStopM1628to.getColor(), j5, f5);
                }
                i3++;
                sM13241k42 = s;
                j4 = j3;
                f3 = 1.0f;
                f2 = 0.0f;
            }
            j = j4;
            if (((GradientStopCollection) gradientFormat.getGradientStops()).m1624k4(0.0f) == null) {
                IGradientStop iGradientStopM1628to2 = ((GradientStopCollection) gradientFormat.getGradientStops()).m1628to();
                iGradientStopM1628to2.setPosition(0.0f);
                b = 0;
                b2 = 1;
                f = 1.0f;
                C14294pm.m69141k4(iGradientStopM1628to2.getColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
            } else {
                b = 0;
                b2 = 1;
                f = 1.0f;
            }
            if (((GradientStopCollection) gradientFormat.getGradientStops()).m1624k4(f) == null) {
                IGradientStop iGradientStopM1628to3 = ((GradientStopCollection) gradientFormat.getGradientStops()).m1628to();
                iGradientStopM1628to3.setPosition(f);
                color = iGradientStopM1628to3.getColor();
                i = 388;
                j2 = 16777215;
                C14294pm.m69141k4(color, c10462h9M70140fa, c10462h9, 387, i, j2);
            }
        }
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) C10398dc.m50669x1(c10462h9M70140fa, 384), C10609qn.class);
        C10480ii c10480iiM50664k4 = C10398dc.m50664k4(c10462h9M70140fa);
        float fM50663k43 = ((int) C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 396, 0L)) / 100.0f;
        if (c10609qn != null) {
            int iM51597ar2 = (int) c10609qn.m51597ar();
            if (iM51597ar2 == 4) {
                gradientFormat.setGradientShape(b);
                float fM50662k4 = C10398dc.m50662k4(c10462h9M70140fa, c10462h9, 395, (int) b) / 65536.0f;
                if (fM50662k4 < 0.0f) {
                    fM50662k4 += 180.0f;
                    if (fM50663k43 != 0.0f && fM50663k43 != f && gradientFormat.getGradientStops().size() > b2) {
                        GradientStopCollection gradientStopCollection = new GradientStopCollection(gradientFormat);
                        for (int size = gradientFormat.getGradientStops().size() - b2; size >= 0; size--) {
                            IGradientStop iGradientStopM1628to4 = gradientStopCollection.m1628to();
                            iGradientStopM1628to4.setPosition(f - gradientFormat.getGradientStops().get_Item(size).getPosition());
                            iGradientStopM1628to4.getColor().copyFrom(gradientFormat.getGradientStops().get_Item(size).getColor());
                        }
                        gradientFormat.m1610k4((IGradientStopCollection) gradientStopCollection);
                    }
                }
                gradientFormat.setLinearGradientAngle(90.0f - fM50662k4);
                if (gradientFormat.getLinearGradientAngle() < 0.0f) {
                    gradientFormat.setLinearGradientAngle(gradientFormat.getLinearGradientAngle() + 360.0f);
                }
                if ((c10609qn.m51597ar() & j) == 7) {
                    gradientFormat.setLinearGradientScaled(b2);
                }
            } else if (iM51597ar2 == 5) {
                gradientFormat.setGradientShape(b2);
                C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM50664k4.m50923k4(397), C10609qn.class);
                C10609qn c10609qn3 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM50664k4.m50923k4(398), C10609qn.class);
                float fM51597ar = ((c10609qn2 != null ? c10609qn2.m51597ar() : 0L) & j) / 65536.0f;
                float fM51597ar2 = ((c10609qn3 != null ? c10609qn3.m51597ar() : 0L) & j) / 65536.0f;
                gradientFormat.m1607k4(fM51597ar, fM51597ar2, (((((C10609qn) C7019kk.m27452k4((Object) c10480iiM50664k4.m50923k4(399), C10609qn.class)) != null ? r3.m51597ar() : 0L) & j) / 65536.0f) - fM51597ar, (((((C10609qn) C7019kk.m27452k4((Object) c10480iiM50664k4.m50923k4(400), C10609qn.class)) != null ? r4.m51597ar() : 0L) & j) / 65536.0f) - fM51597ar2);
            } else if (iM51597ar2 == 6) {
                gradientFormat.setGradientShape((byte) 3);
                gradientFormat.m1607k4(0.5f, 0.5f, 0.0f, 0.0f);
                gradientFormat.setGradientDirection(4);
            } else if (iM51597ar2 == 7) {
            }
            if (fM50663k43 == f) {
                return;
            }
            if (fM50663k43 >= 0.0f) {
                GradientStopCollection gradientStopCollection2 = new GradientStopCollection(gradientFormat);
                if (fM50663k43 > 0.0f) {
                    for (int i5 = b; i5 < gradientFormat.getGradientStops().size() - b2; i5++) {
                        IGradientStop iGradientStopM1628to5 = gradientStopCollection2.m1628to();
                        iGradientStopM1628to5.setPosition(gradientFormat.getGradientStops().get_Item(i5).getPosition() * fM50663k43);
                        iGradientStopM1628to5.getColor().copyFrom(gradientFormat.getGradientStops().get_Item(i5).getColor());
                    }
                }
                for (int size2 = gradientFormat.getGradientStops().size() - b2; size2 >= 0; size2--) {
                    IGradientStop iGradientStopM1628to6 = gradientStopCollection2.m1628to();
                    iGradientStopM1628to6.setPosition(f - ((f - fM50663k43) * gradientFormat.getGradientStops().get_Item(size2).getPosition()));
                    iGradientStopM1628to6.getColor().copyFrom(gradientFormat.getGradientStops().get_Item(size2).getColor());
                }
                gradientFormat.m1610k4((IGradientStopCollection) gradientStopCollection2);
                return;
            }
            if (fM50663k43 < 0.0f) {
                GradientStopCollection gradientStopCollection3 = new GradientStopCollection(gradientFormat);
                if (fM50663k43 > -1.0f) {
                    for (int size3 = gradientFormat.getGradientStops().size() - b2; size3 > 0; size3--) {
                        IGradientStop iGradientStopM1628to7 = gradientStopCollection3.m1628to();
                        iGradientStopM1628to7.setPosition((fM50663k43 + f) * (f - gradientFormat.getGradientStops().get_Item(size3).getPosition()));
                        iGradientStopM1628to7.getColor().copyFrom(gradientFormat.getGradientStops().get_Item(size3).getColor());
                    }
                }
                for (int i6 = b; i6 < gradientFormat.getGradientStops().size(); i6++) {
                    IGradientStop iGradientStopM1628to8 = gradientStopCollection3.m1628to();
                    iGradientStopM1628to8.setPosition(f - ((f - gradientFormat.getGradientStops().get_Item(i6).getPosition()) * (-fM50663k43)));
                    iGradientStopM1628to8.getColor().copyFrom(gradientFormat.getGradientStops().get_Item(i6).getColor());
                }
                gradientFormat.m1610k4((IGradientStopCollection) gradientStopCollection3);
            }
        }
    }
}
