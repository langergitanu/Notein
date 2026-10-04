package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class nhv {
    /* JADX INFO: renamed from: k4 */
    private static String m68031k4(byte b, byte b2, byte b3, pkv pkvVar) {
        return m68034x1(b, b2, b3, pkvVar).m32114k4();
    }

    /* JADX INFO: renamed from: x1 */
    private static com.aspose.slides.internal.p332p7.fwr m68034x1(byte b, byte b2, byte b3, pkv pkvVar) {
        if (b == -1 || b == 0) {
            return null;
        }
        com.aspose.slides.internal.p332p7.xgo xgoVarM2066x1 = pkvVar.m69130x1().m2066x1();
        if (xgoVarM2066x1 == null) {
            throw new InvalidOperationException();
        }
        Object[] objArrM72729k4 = wgi.m72729k4(RequestParameters.MARKER, xgoVarM2066x1.m44347to().m36786k4());
        int length = objArrM72729k4.length;
        com.aspose.slides.internal.p332p7.fwr[] fwrVarArr = new com.aspose.slides.internal.p332p7.fwr[length];
        for (int i = 0; i < objArrM72729k4.length; i++) {
            fwrVarArr[i] = (com.aspose.slides.internal.p332p7.fwr) objArrM72729k4[i];
        }
        String strM6583k4 = C1142gf.m6583k4(b, b2, b3);
        String strM6587x1 = C1142gf.m6587x1(b, b2, b3);
        String strM67402k4 = C14113y2.m67402k4("{0}{1}", C1142gf.m6582k4(b), Integer.valueOf(length));
        for (int i2 = 0; i2 < length; i2++) {
            com.aspose.slides.internal.p332p7.fwr fwrVar = fwrVarArr[i2];
            if (C14113y2.m67363du(fwrVar.m32116kk(), strM6583k4) && !C14113y2.m67363du(fwrVar.m32118x1(), strM6587x1)) {
                return fwrVar;
            }
        }
        com.aspose.slides.internal.p332p7.fwr fwrVar2 = (com.aspose.slides.internal.p332p7.fwr) xgoVarM2066x1.m44347to().m36787k4(RequestParameters.MARKER).m29542x1();
        fwrVar2.m32117kk(strM6583k4);
        fwrVar2.m32119x1(strM6587x1);
        fwrVar2.m32115k4(strM67402k4);
        return fwrVar2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68032k4(ILineFormatEffectiveData iLineFormatEffectiveData, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        if (iLineFormatEffectiveData == null) {
            throw new ArgumentNullException("lineFormatEffectiveData");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        m68035x1(iLineFormatEffectiveData, rsvVar, pkvVar);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68035x1(ILineFormatEffectiveData iLineFormatEffectiveData, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        byte bM56501c5;
        if (iLineFormatEffectiveData.getFillFormat() == null || iLineFormatEffectiveData.getFillFormat().getFillType() == -1 || iLineFormatEffectiveData.getFillFormat().getFillType() == 0) {
            rsvVar.m40480k4(1);
            return;
        }
        rsvVar.m40520x1(wgi.m72717k4(C14044b3.m66437kk(iLineFormatEffectiveData.getWidth()) ? 0.0d : iLineFormatEffectiveData.getWidth()));
        if (iLineFormatEffectiveData.getFillFormat().getFillType() == 1) {
            rsvVar.m40485kk(wgi.m72720k4(((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().Clone()));
            if ((((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().m56501c5() & 255) < 255) {
                bM56501c5 = ((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().m56501c5();
                rsvVar.m40466dy(wgi.m72718k4(OooO.OooO00o(((bM56501c5 & 255) * 100) / 255.0f, 14)));
            }
        } else if (iLineFormatEffectiveData.getFillFormat().getFillType() == 2 && iLineFormatEffectiveData.getFillFormat().getGradientFormat().getGradientStops().size() > 0) {
            rsvVar.m40485kk(wgi.m72720k4(((GradientStopEffectiveData) iLineFormatEffectiveData.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).m1634k4().Clone()));
            if ((((GradientStopEffectiveData) iLineFormatEffectiveData.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).m1634k4().m56501c5() & 255) < 255) {
                bM56501c5 = ((GradientStopEffectiveData) iLineFormatEffectiveData.getFillFormat().getGradientFormat().getGradientStops().get_Item(0)).m1634k4().m56501c5();
                rsvVar.m40466dy(wgi.m72718k4(OooO.OooO00o(((bM56501c5 & 255) * 100) / 255.0f, 14)));
            }
        }
        if (iLineFormatEffectiveData.getBeginArrowheadStyle() != 0 && iLineFormatEffectiveData.getBeginArrowheadStyle() != -1) {
            rsvVar.m40500to(m68031k4(iLineFormatEffectiveData.getBeginArrowheadStyle(), iLineFormatEffectiveData.getBeginArrowheadLength(), iLineFormatEffectiveData.getBeginArrowheadWidth(), pkvVar));
            rsvVar.m40473h4(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * ((double) ((1 << C14116yg.m67482k4((int) iLineFormatEffectiveData.getBeginArrowheadWidth())) + 1)) * 1.2d));
        }
        if (iLineFormatEffectiveData.getEndArrowheadStyle() != 0 && iLineFormatEffectiveData.getEndArrowheadStyle() != -1) {
            rsvVar.m40463du(m68031k4(iLineFormatEffectiveData.getEndArrowheadStyle(), iLineFormatEffectiveData.getEndArrowheadLength(), iLineFormatEffectiveData.getEndArrowheadWidth(), pkvVar));
            rsvVar.m40491m9(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * ((double) ((1 << C14116yg.m67482k4((int) iLineFormatEffectiveData.getEndArrowheadWidth())) + 1)) * 1.2d));
        }
        if (iLineFormatEffectiveData.getDashStyle() == 0) {
            rsvVar.m40480k4(3);
            return;
        }
        if (iLineFormatEffectiveData.getDashStyle() != -1) {
            com.aspose.slides.internal.p332p7.xgo xgoVarM2066x1 = pkvVar.m69130x1().m2066x1();
            com.aspose.slides.internal.p332p7.ry2 ry2Var = (com.aspose.slides.internal.p332p7.ry2) xgoVarM2066x1.m44347to().m36787k4("stroke-dash").m29542x1();
            ry2Var.m40619k4(C14113y2.m67402k4("Dashes_{0}", Integer.valueOf(xgoVarM2066x1.m44347to().m36786k4().size())));
            ry2Var.m40618k4(1);
            rsvVar.m40481k4(ry2Var.m40617k4());
            rsvVar.m40480k4(2);
            m68033k4(iLineFormatEffectiveData, ry2Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68033k4(ILineFormatEffectiveData iLineFormatEffectiveData, com.aspose.slides.internal.p332p7.ry2 ry2Var) {
        switch (iLineFormatEffectiveData.getDashStyle()) {
            case 1:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                break;
            case 2:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 4.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                break;
            case 3:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 8.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                break;
            case 4:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 4.0d));
                ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                ry2Var.m40621kk(1);
                break;
            case 5:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 8.0d));
                ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                ry2Var.m40621kk(1);
                break;
            case 6:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 8.0d));
                ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40626x1(1);
                ry2Var.m40621kk(2);
                break;
            case 7:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40626x1(1);
                break;
            case 8:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40626x1(1);
                break;
            case 9:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40626x1(1);
                ry2Var.m40621kk(1);
                break;
            case 10:
                ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 3.0d));
                ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * 1.0d));
                ry2Var.m40626x1(1);
                ry2Var.m40621kk(2);
                break;
            case 11:
                if (iLineFormatEffectiveData.getCustomDashPattern() != null && iLineFormatEffectiveData.getCustomDashPattern().length >= 2) {
                    ry2Var.m40624to(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * ((double) iLineFormatEffectiveData.getCustomDashPattern()[1])));
                    ry2Var.m40626x1(0);
                    ry2Var.m40621kk(0);
                    ry2Var.m40627x1(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * ((double) iLineFormatEffectiveData.getCustomDashPattern()[0])));
                    float f = iLineFormatEffectiveData.getCustomDashPattern()[0];
                    char c = 1;
                    for (int i = 0; i < iLineFormatEffectiveData.getCustomDashPattern().length - 1; i += 2) {
                        if (iLineFormatEffectiveData.getCustomDashPattern()[i] == f && c == 1) {
                            ry2Var.m40626x1(ry2Var.m40625x1() + 1);
                        } else if (iLineFormatEffectiveData.getCustomDashPattern()[i] == f && c == 2) {
                            ry2Var.m40621kk(ry2Var.m40623to() + 1);
                        } else if (iLineFormatEffectiveData.getCustomDashPattern()[i] != f && c == 1) {
                            f = iLineFormatEffectiveData.getCustomDashPattern()[i];
                            ry2Var.m40622kk(wgi.m72717k4(iLineFormatEffectiveData.getWidth() * ((double) iLineFormatEffectiveData.getCustomDashPattern()[i])));
                            ry2Var.m40621kk(ry2Var.m40623to() + 1);
                            c = 2;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
