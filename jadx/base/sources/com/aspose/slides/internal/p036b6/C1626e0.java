package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.e0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1626e0 extends C1634k4 {
    public C1626e0(long j, long j2, long j3) {
        super("OS/2", j, j2, j3);
        m8773h4();
    }

    /* JADX INFO: renamed from: h4 */
    public void m8773h4() {
        this.f6308h4 = new Dictionary<>();
        this.f6311m9 = new Dictionary<>();
        this.f6308h4.addItem("version", 3);
        this.f6308h4.addItem("xAvgCharWidth", 2);
        this.f6308h4.addItem("usWeightClass", 3);
        this.f6308h4.addItem("usWidthClass", 3);
        this.f6308h4.addItem("fsType", 3);
        this.f6308h4.addItem("ySubscriptXSize", 3);
        this.f6308h4.addItem("ySubscriptYSize", 3);
        this.f6308h4.addItem("ySubscriptXOffset", 3);
        this.f6308h4.addItem("ySubscriptYOffset", 3);
        this.f6308h4.addItem("ySuperscriptXSize", 3);
        this.f6308h4.addItem("ySuperscriptYSize", 3);
        this.f6308h4.addItem("ySuperscriptXOffset", 3);
        this.f6308h4.addItem("ySuperscriptYOffset", 3);
        this.f6308h4.addItem("yStrikeoutSize", 3);
        this.f6308h4.addItem("yStrikeoutPosition", 3);
        this.f6308h4.addItem("sFamilyClass", 3);
        this.f6308h4.addItem("bFamilyType", 1);
        this.f6308h4.addItem("bSerifStyle", 1);
        this.f6308h4.addItem("bWeight", 1);
        this.f6308h4.addItem("bProportion", 1);
        this.f6308h4.addItem("bContrast", 1);
        this.f6308h4.addItem("bStrokeVariation", 1);
        this.f6308h4.addItem("bArmStyle", 1);
        this.f6308h4.addItem("bLetterform", 1);
        this.f6308h4.addItem("bMidline", 1);
        this.f6308h4.addItem("bXHeight", 1);
        this.f6308h4.addItem("ulUnicodeRange1", 5);
        this.f6308h4.addItem("ulUnicodeRange2", 5);
        this.f6308h4.addItem("ulUnicodeRange3", 5);
        this.f6308h4.addItem("ulUnicodeRange4", 5);
        this.f6308h4.addItem("achVendID", 11);
        this.f6311m9.addItem("achVendID", 4L);
        this.f6308h4.addItem("fsSelection", 3);
        this.f6308h4.addItem("usFirstCharIndex", 3);
        this.f6308h4.addItem("usLastCharIndex", 3);
        this.f6308h4.addItem("sTypoAscender", 2);
        this.f6308h4.addItem("sTypoDescender", 2);
        this.f6308h4.addItem("sTypoLineGap", 2);
        this.f6308h4.addItem("usWinAscent", 3);
        this.f6308h4.addItem("usWinDescent", 3);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        Integer num;
        int i;
        int i2;
        Integer num2;
        List.Enumerator<C1624du> it;
        int i3;
        C1625dy[] c1625dyArrM8785m9 = c1627f9.m8785m9();
        int length = c1625dyArrM8785m9.length;
        double d = 16384.0d;
        Integer num3 = 0;
        double d2 = 16384.0d;
        double d3 = 16384.0d;
        double d4 = -16384.0d;
        double dM8767m9 = -16384.0d;
        double dM8753du = -16384.0d;
        int i4 = -1;
        double dM8751c5 = 0.0d;
        int i5 = 1114111;
        int i6 = 0;
        int iM67483k4 = 0;
        int iM67483k42 = 0;
        int iM67483k43 = 0;
        int i7 = 0;
        int i8 = 0;
        double d5 = 16384.0d;
        int iM67483k44 = -1;
        int iM67483k45 = 0;
        while (i6 < length) {
            C1625dy c1625dy = c1625dyArrM8785m9[i6];
            int i9 = 65535;
            if (c1625dy.m8757jd()) {
                i = i6;
                List.Enumerator<C1620c5> it2 = c1625dy.m8770x1().iterator();
                i2 = length;
                num2 = num3;
                int i10 = 0;
                int iM8748k4 = 0;
                while (it2.hasNext()) {
                    try {
                        C1625dy c1625dy2 = c1627f9.m8785m9()[it2.next().m8715k4()];
                        int size = i10 + c1625dy2.m8758k4().size();
                        if (c1625dy2.m8758k4().size() > 0) {
                            i3 = size;
                            it = c1625dy2.m8758k4().iterator();
                            while (it.hasNext()) {
                                try {
                                    iM8748k4 += it.next().m8748k4();
                                } finally {
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        } else {
                            i3 = size;
                        }
                        i10 = i3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                i8++;
                iM67483k42 = C14116yg.m67483k4(iM67483k42, iM8748k4);
                iM67483k43 = C14116yg.m67483k4(iM67483k43, i10);
            } else {
                i = i6;
                i2 = length;
                num2 = num3;
                if (c1625dy.m8758k4().size() > 0) {
                    iM67483k45 = C14116yg.m67483k4(iM67483k45, c1625dy.m8758k4().size());
                    List.Enumerator<C1624du> it3 = c1625dy.m8758k4().iterator();
                    int iM8748k42 = 0;
                    while (it3.hasNext()) {
                        try {
                            iM8748k42 += it3.next().m8748k4();
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                    iM67483k4 = C14116yg.m67483k4(iM67483k4, iM8748k42);
                }
            }
            if (c1625dy.m8757jd() || c1625dy.m8758k4().size() > 0) {
                double dM8768to = c1625dy.m8768to() < d2 ? c1625dy.m8768to() : d2;
                double dM8756h4 = c1625dy.m8756h4() < d3 ? c1625dy.m8756h4() : d3;
                if (c1625dy.m8753du() > dM8753du) {
                    dM8753du = c1625dy.m8753du();
                }
                if (c1625dy.m8767m9() > dM8767m9) {
                    dM8767m9 = c1625dy.m8767m9();
                }
                iM67483k44 = C14116yg.m67483k4(iM67483k44, c1625dy.m8751c5() & 65535);
                double d6 = dM8768to;
                double dM67491kk = C14116yg.m67491kk(d, c1625dy.m8755dy());
                double dM67491kk2 = C14116yg.m67491kk(d5, ((double) (c1625dy.m8751c5() & 65535)) - c1625dy.m8753du());
                double dM67502x1 = C14116yg.m67502x1(d4, c1625dy.m8753du());
                dM8751c5 += (double) ((short) c1625dy.m8751c5());
                i7++;
                d4 = dM67502x1;
                d3 = dM8756h4;
                d2 = d6;
                d5 = dM67491kk2;
                d = dM67491kk;
            }
            it = c1625dy.m8764kk().iterator();
            int iM67483k46 = i4;
            int iM67507x1 = i5;
            while (it.hasNext()) {
                try {
                    double d7 = d;
                    int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                    if (iIntValue != i9) {
                        iM67507x1 = C14116yg.m67507x1(iM67507x1, iIntValue);
                        iM67483k46 = C14116yg.m67483k4(iM67483k46, iIntValue);
                    }
                    d = d7;
                    i9 = 65535;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            double d8 = d;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            i6 = i + 1;
            i4 = iM67483k46;
            i5 = iM67507x1;
            length = i2;
            num3 = num2;
            d = d8;
        }
        Integer num4 = num3;
        c1627f9.m8777k4("OS/2").set_Item("version", 4);
        double d9 = d;
        double d10 = d5;
        c1627f9.m8777k4("OS/2").set_Item("achVendID", C14113y2.m67443x1(C14113y2.m67407k4(c1627f9.m8777k4("OS/2").get_Item("achVendID"), "    "), 0, 4));
        c1627f9.m8777k4("OS/2").set_Item("xAvgCharWidth", Short.valueOf(C7019kk.m27468x1(Double.valueOf(dM8751c5 / ((double) (i7 != 0 ? i7 : 1))), 14)));
        c1627f9.m8777k4("OS/2").set_Item("ulUnicodeRange2", 268435456L);
        c1627f9.m8777k4("OS/2").set_Item("usFirstCharIndex", Integer.valueOf(i5 & 65535));
        c1627f9.m8777k4("OS/2").set_Item("usLastCharIndex", Integer.valueOf(i4 & 65535));
        if (c1627f9.m8777k4("hhea").get_Item("version") == null) {
            c1627f9.m8777k4("hhea").set_Item("version", Double.valueOf(1.0d));
        }
        c1627f9.m8777k4("hhea").set_Item("advanceWidthMax", Integer.valueOf(iM67483k44 & 65535));
        c1627f9.m8777k4("hhea").set_Item("minLeftSideBearing", Short.valueOf(C7019kk.m27468x1(Double.valueOf(d9), 14)));
        c1627f9.m8777k4("hhea").set_Item("minRightSideBearing", Short.valueOf(C7019kk.m27468x1(Double.valueOf(d10), 14)));
        c1627f9.m8777k4("hhea").set_Item("xMaxExtent", Short.valueOf(C7019kk.m27468x1(Double.valueOf(d4), 14)));
        if (c1627f9.m8777k4("head").get_Item("version") == null) {
            c1627f9.m8777k4("head").set_Item("version", Double.valueOf(1.0d));
        }
        if (c1627f9.m8777k4("head").get_Item("lowestRecPPEM") == null) {
            c1627f9.m8777k4("head").set_Item("lowestRecPPEM", 8);
        }
        c1627f9.m8777k4("head").set_Item("xMin", Short.valueOf(C7019kk.m27468x1(Double.valueOf(d2), 14)));
        c1627f9.m8777k4("head").set_Item("yMin", Short.valueOf(C7019kk.m27468x1(Double.valueOf(d3), 14)));
        c1627f9.m8777k4("head").set_Item("xMax", Short.valueOf(C7019kk.m27468x1(Double.valueOf(dM8753du), 14)));
        c1627f9.m8777k4("head").set_Item("yMax", Short.valueOf(C7019kk.m27468x1(Double.valueOf(dM8767m9), 14)));
        C1634k4 c1634k4 = c1627f9.m8775h4().get_Item("maxp");
        c1634k4.m8840k4("version", Double.valueOf(1.0d));
        c1634k4.m8840k4("numGlyphs", Integer.valueOf(c1627f9.m8785m9().length & 65535));
        c1634k4.m8840k4("maxPoints", Integer.valueOf(iM67483k4 & 65535));
        c1634k4.m8840k4("maxContours", Integer.valueOf(iM67483k45 & 65535));
        c1634k4.m8840k4("maxCompositePoints", Integer.valueOf(iM67483k42 & 65535));
        c1634k4.m8840k4("maxCompositeContours", Integer.valueOf(iM67483k43 & 65535));
        if (c1634k4.m8837k4("maxZones") == null) {
            num = num4;
            c1634k4.m8840k4("maxZones", num);
        } else {
            num = num4;
        }
        if (c1634k4.m8837k4("maxTwilightPoints") == null) {
            c1634k4.m8840k4("maxTwilightPoints", num);
        }
        if (c1634k4.m8837k4("maxStorage") == null) {
            c1634k4.m8840k4("maxStorage", num);
        }
        if (c1634k4.m8837k4("maxFunctionDefs") == null) {
            c1634k4.m8840k4("maxFunctionDefs", num);
        }
        if (c1634k4.m8837k4("maxStackElements") == null) {
            c1634k4.m8840k4("maxStackElements", num);
        }
        c1634k4.m8840k4("maxSizeOfInstructions", num);
        c1634k4.m8840k4("maxComponentElements", Integer.valueOf(i8 & 65535));
        c1634k4.m8840k4("maxComponentDepth", Short.valueOf(i8 > 0 ? (short) 1 : (short) 0));
        return super.mo8701k4(c1627f9);
    }

    public C1626e0(Dictionary<String, Object> dictionary) {
        super("OS/2");
        m8773h4();
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        Dictionary<String, Object> dictionaryMo8703k4 = super.mo8703k4(c1636kp, c1627f9);
        if (!dictionaryMo8703k4.containsKey("ulCodePageRange1")) {
            dictionaryMo8703k4.addItem("ulCodePageRange1", 1);
        }
        if (!dictionaryMo8703k4.containsKey("ulCodePageRange2")) {
            dictionaryMo8703k4.addItem("ulCodePageRange2", 0);
        }
        if (!dictionaryMo8703k4.containsKey("sxHeight")) {
            dictionaryMo8703k4.addItem("sxHeight", 0);
        }
        if (!dictionaryMo8703k4.containsKey("sCapHeight")) {
            dictionaryMo8703k4.addItem("sCapHeight", 0);
        }
        if (!dictionaryMo8703k4.containsKey("usDefaultChar")) {
            dictionaryMo8703k4.addItem("usDefaultChar", 0);
        }
        if (!dictionaryMo8703k4.containsKey("usBreakChar")) {
            dictionaryMo8703k4.addItem("usBreakChar", 32);
        }
        if (!dictionaryMo8703k4.containsKey("usMaxContext")) {
            dictionaryMo8703k4.addItem("usMaxContext", 0);
        }
        return dictionaryMo8703k4;
    }
}
