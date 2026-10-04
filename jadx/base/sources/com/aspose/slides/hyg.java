package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10374bs;
import com.aspose.slides.internal.p407st.C10424em;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
class hyg {
    /* JADX INFO: renamed from: k4 */
    private static double m7331k4(long j) {
        long j2 = j & 4294967295L;
        if (j2 == 65536) {
            return 0.0d;
        }
        if (j2 == 0) {
            return -100.0d;
        }
        return C14116yg.m67497to(j2 > 65536 ? 100.0d - (6553600.0d / j2) : (((j2 * 100) & 4294967295L) / 65536.0f) - 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m7332k4(double d) {
        if (d == 0.0d) {
            return 65536L;
        }
        if (d == 100.0d) {
            return 2147483647L;
        }
        return C7019kk.m27435du(Double.valueOf(d > 0.0d ? C14116yg.m67497to(6553600.0d / (100.0d - d)) : C14116yg.m67497to(((d + 100.0d) * 65536.0d) / 100.0d)), 14);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7333k4(IImageTransformOperationCollection iImageTransformOperationCollection, C10534m3 c10534m3, y2n y2nVar) {
        int i;
        long jM7332k4;
        long jM13238k4;
        int i2 = 0;
        while (true) {
            if (i2 >= iImageTransformOperationCollection.size()) {
                i = -1;
                break;
            }
            ColorChange colorChange = (ColorChange) C7019kk.m27452k4((Object) iImageTransformOperationCollection.get_Item(i2), ColorChange.class);
            if (colorChange != null) {
                long jM13075k4 = C3085sv.m13075k4(((ColorFormat) colorChange.getFromColor()).m1084to().Clone());
                if (jM13075k4 == C3085sv.m13075k4(((ColorFormat) colorChange.getToColor()).m1084to().Clone()) && (((ColorFormat) colorChange.getToColor()).m1084to().m56501c5() & 255) == 0) {
                    i = (int) jM13075k4;
                    break;
                }
            }
            i2++;
        }
        if (i > -1) {
            c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.INTENSE_REFERENCE, false, ((long) i) & 4294967295L));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= iImageTransformOperationCollection.size()) {
                jM7332k4 = 65536;
                jM13238k4 = 0;
                break;
            }
            if (((Luminance) C7019kk.m27452k4((Object) iImageTransformOperationCollection.get_Item(i3), Luminance.class)) != null) {
                jM13238k4 = C3110yd.m13238k4(r4.m1926to() / 200.0f);
                jM7332k4 = m7332k4(r4.m1925du());
                break;
            }
            i3++;
        }
        if ((jM13238k4 & 4294967295L) != 0) {
            c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.BIBLIOGRAPHY, false, jM13238k4));
        }
        if ((jM7332k4 & 4294967295L) != 65536) {
            c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.BOOK_TITLE, false, jM7332k4));
        }
        int i4 = 0;
        while (true) {
            if (i4 >= iImageTransformOperationCollection.size()) {
                break;
            }
            IAlphaModulateFixed iAlphaModulateFixed = (IAlphaModulateFixed) C7019kk.m27452k4((Object) iImageTransformOperationCollection.get_Item(i4), AlphaModulateFixed.class);
            if (iAlphaModulateFixed != null && iAlphaModulateFixed.getAmount() < 100.0f) {
                c10534m3.m51263x1().m50930x1(new C10609qn(386, false, C7019kk.m27435du(Float.valueOf((iAlphaModulateFixed.getAmount() * 65536.0f) / 100.0f), 13) & C18177fb.f54859s));
                break;
            }
            i4++;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i5 = 0; i5 < iImageTransformOperationCollection.size(); i5++) {
            IDuotone iDuotone = (IDuotone) C7019kk.m27452k4((Object) iImageTransformOperationCollection.get_Item(i5), IDuotone.class);
            if (iDuotone != null) {
                long jM69136k4 = C14294pm.m69136k4(iDuotone.getColor1(), y2nVar);
                long jM69136k42 = C14294pm.m69136k4(iDuotone.getColor2(), y2nVar);
                if ((jM69136k4 & 4294967295L) != 16777215) {
                    c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.GRID_TABLE_3_ACCENT_1, false, jM69136k4));
                    if ((jM69136k42 & 4294967295L) != 16777215) {
                        c10534m3.m51263x1().m50926k4(new C10609qn(StyleIdentifier.GRID_TABLE_4_ACCENT_1, false, jM69136k42));
                    }
                }
            }
            if (C7019kk.m27469x1(iImageTransformOperationCollection.get_Item(i5), GrayScale.class)) {
                z = true;
            }
            if (C7019kk.m27469x1(iImageTransformOperationCollection.get_Item(i5), BiLevel.class)) {
                z2 = true;
            }
        }
        if (z) {
            C10424em c10424em = (C10424em) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, C10424em.class);
            if (c10424em == null) {
                c10424em = new C10424em();
                c10534m3.m51263x1().m50926k4(c10424em);
            }
            c10424em.m50762h4(true);
            if (z2) {
                c10424em.m50765m9(true);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7334k4(ISlidesPicture iSlidesPicture, ri7 ri7Var) {
        byte[] bArrM51386x1;
        int iM5959to;
        C10711xc c10711xcMo50863m9;
        C10374bs c10374bs;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10534m3 c10534m3Mo50859du = c10462h9M70140fa.mo50859du();
        if (c10534m3Mo50859du != null && c10534m3Mo50859du.m51263x1() != null) {
            C10609qn c10609qn = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, 390, C10609qn.class);
            C10609qn c10609qn2 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, 386, C10609qn.class);
            if (c10609qn != null && c10609qn2 != null) {
                iSlidesPicture.getImageTransform().addAlphaModulateFixedEffect(((c10609qn2.m51597ar() & 4294967295L) * 100.0f) / 65536.0f);
            }
            C10609qn c10609qn3 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, C10609qn.class);
            if (c10609qn3 != null) {
                int iM51597ar = (int) (c10609qn3.m51597ar() & 6);
                if (iM51597ar == 4) {
                    iSlidesPicture.getImageTransform().addGrayScaleEffect();
                } else if (iM51597ar == 6) {
                    iSlidesPicture.getImageTransform().addGrayScaleEffect();
                    iSlidesPicture.getImageTransform().addBiLevelEffect(50.0f);
                }
            }
            C10609qn c10609qn4 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.INTENSE_REFERENCE, C10609qn.class);
            if (c10609qn4 != null) {
                C12003du c12003duClone = C3085sv.m13078k4(c10609qn4.m51597ar()).Clone();
                C12003du c12003duClone2 = C12003du.m56400k4(0, c12003duClone.Clone()).Clone();
                IColorChange iColorChangeAddColorChangeEffect = iSlidesPicture.getImageTransform().addColorChangeEffect();
                ((ColorFormat) iColorChangeAddColorChangeEffect.getFromColor()).m1080k4(c12003duClone.Clone());
                ((ColorFormat) iColorChangeAddColorChangeEffect.getToColor()).m1080k4(c12003duClone2.Clone());
            }
            C10609qn c10609qn5 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.BIBLIOGRAPHY, C10609qn.class);
            double dM67497to = c10609qn5 != null ? C14116yg.m67497to(C3110yd.m13237k4(c10609qn5.m51597ar()) * 200.0d) : 0.0d;
            C10609qn c10609qn6 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.BOOK_TITLE, C10609qn.class);
            double dM7331k4 = c10609qn6 != null ? m7331k4(c10609qn6.m51597ar()) : 0.0d;
            if (dM7331k4 != 0.0d || dM67497to != 0.0d) {
                iSlidesPicture.getImageTransform().addLuminanceEffect((float) dM67497to, (float) dM7331k4);
            }
            C10609qn c10609qn7 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.GRID_TABLE_3_ACCENT_1, C10609qn.class);
            C10609qn c10609qn8 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.GRID_TABLE_4_ACCENT_1, C10609qn.class);
            if (c10609qn7 == null && (c10711xcMo50863m9 = c10462h9M70140fa.mo50863m9()) != null && c10711xcMo50863m9.m51976x1() != null && (c10374bs = (C10374bs) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(447), C10374bs.class)) != null && c10374bs.m50497to()) {
                c10609qn7 = (C10609qn) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(StyleIdentifier.GRID_TABLE_3_ACCENT_1), C10609qn.class);
                c10609qn8 = (C10609qn) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(StyleIdentifier.GRID_TABLE_4_ACCENT_1), C10609qn.class);
            }
            if (c10609qn7 != null) {
                IDuotone iDuotoneAddDuotoneEffect = iSlidesPicture.getImageTransform().addDuotoneEffect();
                C14294pm.m69143k4(iDuotoneAddDuotoneEffect.getColor1(), c10462h9M70140fa, (C10462h9) null, c10609qn7.m51597ar(), 386, 8);
                if (c10609qn8 != null) {
                    C14294pm.m69143k4(iDuotoneAddDuotoneEffect.getColor2(), c10462h9M70140fa, (C10462h9) null, c10609qn8.m51597ar(), 386, 8);
                } else {
                    ((ColorFormat) iDuotoneAddDuotoneEffect.getColor2()).m1080k4(C12003du.m56385i5().Clone());
                }
            }
        }
        if (c10462h9M70140fa.mo50862jd() == null || c10462h9M70140fa.mo50862jd().m50429jd() == null || (bArrM51386x1 = c10462h9M70140fa.mo50862jd().m50429jd().m51386x1()) == null) {
            return;
        }
        int i = 12;
        if (bArrM51386x1.length >= 12) {
            int iM13257x1 = C3110yd.m13257x1(bArrM51386x1, 2);
            int iM13257x12 = C3110yd.m13257x1(bArrM51386x1, 4);
            if (iM13257x1 > 64 || iM13257x12 > 64 || Oooo0.OooO00o(iM13257x1, iM13257x12, 44, 12) != bArrM51386x1.length) {
                return;
            }
            int i2 = 0;
            while (i2 < 2) {
                while (iM13257x1 > 0) {
                    if ((C3110yd.m13257x1(bArrM51386x1, i) & 1) != 0) {
                        byte b = bArrM51386x1[i + 3];
                        byte b2 = bArrM51386x1[i + 5];
                        byte b3 = bArrM51386x1[i + 7];
                        long jM13253to = C3110yd.m13253to(bArrM51386x1, i + 8);
                        C12003du c12003duClone3 = C12003du.f40505to.Clone();
                        long j = jM13253to & C18177fb.f54859s;
                        if (j < 8) {
                            iM5959to = f6b.m5959to((int) j);
                        } else {
                            C12003du.m56397k4(b & 255, b2 & 255, b3 & 255).CloneTo(c12003duClone3);
                            iM5959to = -1;
                        }
                        byte b4 = bArrM51386x1[i + 13];
                        byte b5 = bArrM51386x1[i + 15];
                        byte b6 = bArrM51386x1[i + 17];
                        i += 44;
                        C12003du c12003duClone4 = C12003du.m56397k4(b4 & 255, b5 & 255, b6 & 255).Clone();
                        if (iM5959to != -1) {
                            iSlidesPicture.getImageTransform().addItem(new ColorChange(c12003duClone4.Clone(), iM5959to, false, (InterfaceC14397rj) null));
                        } else {
                            iSlidesPicture.getImageTransform().addItem(new ColorChange(c12003duClone4.Clone(), c12003duClone3.Clone(), false, (InterfaceC14397rj) null));
                        }
                    } else {
                        i += 44;
                    }
                    iM13257x1--;
                }
                i2++;
                iM13257x1 = iM13257x12;
            }
        }
    }
}
