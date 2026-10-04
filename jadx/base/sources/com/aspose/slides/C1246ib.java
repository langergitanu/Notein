package com.aspose.slides;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3063jd;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7608ev;
import com.aspose.slides.internal.p332p7.C7670fk;
import com.aspose.slides.internal.p332p7.C7939il;
import com.aspose.slides.internal.p332p7.C8065k9;
import com.aspose.slides.internal.p332p7.C8082kf;
import com.aspose.slides.internal.p332p7.C8732s1;
import com.aspose.slides.internal.p332p7.C9052vm;
import com.aspose.slides.internal.p332p7.C9395zr;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ib */
/* JADX INFO: loaded from: classes3.dex */
class C1246ib {

    /* JADX INFO: renamed from: k4 */
    private static final C3068ks f5695k4 = new C3068ks("tint", "shade", "comp", "inv", "gray", "alpha", "alphaOff", "alphaMod", "hue", "hueOff", "hueMod", LocalePreferences.FirstDayOfWeek.SATURDAY, "satOff", "satMod", "lum", "lumOff", "lumMod", "red", "redOff", "redMod", "green", "greenOff", "greenMod", "blue", "blueOff", "blueMod", "gamma", "invGamma");

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f5696x1 = new C7017h4("scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private static String m7605k4(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "srgbClr" : "prstClr" : "sysClr" : "schemeClr" : "hslClr" : "scrgbClr";
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7612x1(IColorFormat iColorFormat, C7447cx c7447cx) {
        if (iColorFormat == null || iColorFormat.getColorType() == -1) {
            return;
        }
        m7608k4(iColorFormat, (c7447cx.m29964k4() == null ? c7447cx.m29965k4(m7605k4(iColorFormat.getColorType())) : c7447cx.m29964k4()).m29542x1());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7606k4(IColorFormat iColorFormat, IGenericEnumerable<C7394ca> iGenericEnumerable) {
        float fM31397k4;
        iColorFormat.getColorTransform().clear();
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM12963k4 = f5695k4.m12963k4(next.m29539k4());
                if (iM12963k4 == 2 || iM12963k4 == 3 || iM12963k4 == 4) {
                    fM31397k4 = 0.0f;
                } else if (iM12963k4 == 8 || iM12963k4 == 9) {
                    if (!C7019kk.m27469x1(next.m29542x1(), C7608ev.class)) {
                        throw new Exception();
                    }
                    fM31397k4 = ((C7608ev) C7019kk.m27452k4((Object) next.m29542x1(), C7608ev.class)).m31397k4();
                } else if (iM12963k4 != 26 && iM12963k4 != 27) {
                    if (!C7019kk.m27469x1(next.m29542x1(), C8082kf.class)) {
                        throw new Exception();
                    }
                    fM31397k4 = ((C8082kf) C7019kk.m27452k4((Object) next.m29542x1(), C8082kf.class)).m35325k4() / 100.0f;
                }
                iColorFormat.getColorTransform().add(iM12963k4, fM31397k4);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7607k4(IColorFormat iColorFormat, AbstractC4685kk<C7447cx> abstractC4685kk) {
        if (iColorFormat == null || iColorFormat.getColorType() == -1) {
            return;
        }
        m7612x1(iColorFormat, abstractC4685kk.invoke());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7608k4(IColorFormat iColorFormat, AbstractC7361bz abstractC7361bz) {
        C7394ca.k4 k4Var;
        int colorType = iColorFormat.getColorType();
        if (colorType == 1) {
            final C9395zr c9395zr = (C9395zr) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9395zr) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ScRgbColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c9395zr.m45923k4(str);
                }
            };
            float floatR = iColorFormat.getFloatR();
            float[] fArr = {floatR};
            float[] fArr2 = {iColorFormat.getFloatG()};
            float[] fArr3 = {iColorFormat.getFloatB()};
            C3063jd.m12959x1(fArr, fArr2, fArr3);
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr3[0];
            c9395zr.m45924k4(f * 100.0f);
            c9395zr.m45929x1(f2 * 100.0f);
            c9395zr.m45926kk(f3 * 100.0f);
        } else if (colorType == 2) {
            final C9052vm c9052vm = (C9052vm) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9052vm) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_HslColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c9052vm.m43173k4(str);
                }
            };
            float hue = iColorFormat.getHue() % 360.0f;
            if (hue < 0.0f) {
                hue += 360.0f;
            }
            c9052vm.m43174k4(hue);
            c9052vm.m43179x1(iColorFormat.getSaturation() * 100.0f);
            c9052vm.m43176kk(iColorFormat.getLuminance() * 100.0f);
        } else if (colorType == 3) {
            final C8732s1 c8732s1 = (C8732s1) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.6
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8732s1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_SchemeColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8732s1.m40715k4(str);
                }
            };
            c8732s1.m40716k4(iColorFormat.getSchemeColor());
        } else if (colorType == 4) {
            final C7939il c7939il = (C7939il) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7939il) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_SystemColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7939il.m34202k4(str);
                }
            };
            c7939il.m34203k4(iColorFormat.getSystemColor());
            C12003du c12003duClone = ((ColorFormat) iColorFormat).m1070du().m68878k4().Clone();
            c7939il.m34204k4(4294967295L & ((((((long) ((c12003duClone.m56507jd() & 255) << 16)) & 4294967295L) + (((long) ((c12003duClone.m56502ck() & 255) << 8)) & 4294967295L)) & 4294967295L) + ((long) (c12003duClone.m56505fa() & 255))));
        } else if (colorType != 5) {
            final C7670fk c7670fk = (C7670fk) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7670fk) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_SRgbColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7670fk.m31801k4(str);
                }
            };
            c7670fk.m31802k4(4294967295L & ((((((long) ((iColorFormat.getR() & 255) << 16)) & 4294967295L) + (((long) ((iColorFormat.getG() & 255) << 8)) & 4294967295L)) & 4294967295L) + ((long) (iColorFormat.getB() & 255))));
        } else {
            final C8065k9 c8065k9 = (C8065k9) abstractC7361bz;
            k4Var = new C7394ca.k4() { // from class: com.aspose.slides.ib.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8065k9) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_PresetColorElementData.AddColorTransform(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8065k9.m35213k4(str);
                }
            };
            c8065k9.m35214k4(iColorFormat.getPresetColor());
        }
        IGenericEnumerator<IColorOperation> it = iColorFormat.getColorTransform().iterator();
        while (it.hasNext()) {
            try {
                IColorOperation next = it.next();
                C7394ca c7394caMo2788k4 = k4Var.mo2788k4(f5695k4.m12964k4(next.getOperationType()));
                int operationType = next.getOperationType();
                if (operationType != 2 && operationType != 3 && operationType != 4) {
                    if (operationType == 8 || operationType == 9) {
                        ((C7608ev) c7394caMo2788k4.m29542x1()).m31398k4(next.getParameter());
                    } else if (operationType != 26 && operationType != 27) {
                        ((C8082kf) c7394caMo2788k4.m29542x1()).m35326k4(next.getParameter() * 100.0f);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7609k4(IColorFormat iColorFormat, C7394ca.k4 k4Var) {
        if (iColorFormat == null || iColorFormat.getColorType() == -1) {
            return;
        }
        m7608k4(iColorFormat, k4Var.mo2788k4(m7605k4(iColorFormat.getColorType())).m29542x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7610k4(IColorFormat iColorFormat, C7394ca c7394ca) {
        List<C7394ca> listM45927to;
        if (c7394ca == null) {
            return;
        }
        ColorFormat colorFormat = (ColorFormat) iColorFormat;
        C14256ov c14256ovM1070du = colorFormat.m1070du();
        int iM27428k4 = f5696x1.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 == 0) {
            C9395zr c9395zr = (C9395zr) c7394ca.m29542x1();
            float[] fArr = {c9395zr.m45922k4() / 100.0f};
            float[] fArr2 = {c9395zr.m45928x1() / 100.0f};
            float[] fArr3 = {c9395zr.m45925kk() / 100.0f};
            C3063jd.m12958k4(fArr, fArr2, fArr3);
            colorFormat.m1077k4(fArr[0], fArr2[0], fArr3[0], 1);
            listM45927to = c9395zr.m45927to();
        } else if (iM27428k4 == 1) {
            C7670fk c7670fk = (C7670fk) c7394ca.m29542x1();
            long jM31800k4 = c7670fk.m31800k4() & 4294967295L;
            colorFormat.m1077k4(((byte) (4294967295L & (jM31800k4 >> 16))) & 255, ((byte) ((jM31800k4 >> 8) & 255)) & 255, ((byte) (r3 & 255)) & 255, 0);
            listM45927to = c7670fk.m31804x1();
        } else if (iM27428k4 == 2) {
            C9052vm c9052vm = (C9052vm) c7394ca.m29542x1();
            float fM43172k4 = c9052vm.m43172k4() % 360.0f;
            if (fM43172k4 < 0.0f) {
                fM43172k4 += 360.0f;
            }
            colorFormat.m1077k4(fM43172k4, c9052vm.m43178x1() / 100.0f, c9052vm.m43175kk() / 100.0f, 2);
            listM45927to = c9052vm.m43177to();
        } else if (iM27428k4 == 3) {
            C7939il c7939il = (C7939il) c7394ca.m29542x1();
            colorFormat.setSystemColor(c7939il.m34201k4());
            int iM34206x1 = (int) c7939il.m34206x1();
            c14256ovM1070du.m68879k4(C12003du.m56397k4(((byte) (iM34206x1 >> 16)) & 255, ((byte) ((iM34206x1 >> 8) & 255)) & 255, ((byte) (iM34206x1 & 255)) & 255).Clone());
            listM45927to = c7939il.m34205kk();
        } else if (iM27428k4 == 4) {
            C8732s1 c8732s1 = (C8732s1) c7394ca.m29542x1();
            colorFormat.setSchemeColor(c8732s1.m40714k4());
            listM45927to = c8732s1.m40717x1();
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
            }
            C8065k9 c8065k9 = (C8065k9) c7394ca.m29542x1();
            colorFormat.setPresetColor(c8065k9.m35212k4());
            listM45927to = c8065k9.m35215x1();
        }
        m7606k4(colorFormat, listM45927to);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7611k4(IColorFormat iColorFormat, C7447cx c7447cx) {
        if (c7447cx == null) {
            return;
        }
        m7610k4(iColorFormat, c7447cx.m29964k4());
    }
}
