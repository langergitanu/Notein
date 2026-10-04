package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p077d8.C3073my;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.dti;
import com.aspose.slides.internal.p332p7.gc6;
import com.aspose.slides.internal.p332p7.hyf;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pb */
/* JADX INFO: loaded from: classes3.dex */
class C14273pb {

    /* JADX INFO: renamed from: k4 */
    private static final C3068ks f48020k4 = new C3068ks("solid", "dot", "dash", "longdash", "dashdot", "longdashdot", "longdashdotdot", "shortdash", "shortdot", "shortdashdot", "shortdashdotdot");

    /* JADX INFO: renamed from: x1 */
    private static final String[] f48021x1 = {"fill", "fillback", "line", "lineback"};

    /* JADX INFO: renamed from: k4 */
    private static int m68986k4(byte b) {
        return b == 1 ? 1 : 2;
    }

    /* JADX INFO: renamed from: x1 */
    private static float m69004x1(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        return new C3073my(str).m13004to();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m68987k4(int i, int i2) {
        return i != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m69005x1(int i, int i2) {
        return i != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.q0e m68988k4(AbstractC8917u4 abstractC8917u4) {
        return (com.aspose.slides.internal.p332p7.q0e) abstractC8917u4.mo29887h4("fill").m29542x1();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69006x1(com.aspose.slides.internal.p332p7.q0e q0eVar, IColorFormat iColorFormat) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        m68992k4(iColorFormat, strArr, strArr2);
        String str = strArr[0];
        String str2 = strArr2[0];
        q0eVar.m39263kk(str);
        q0eVar.m39249c5(str2);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC8917u4 m68989k4(AbstractC8917u4 abstractC8917u4, hyf hyfVar) {
        if (abstractC8917u4 == null || hyfVar == null) {
            if (abstractC8917u4 == null && hyfVar == null) {
                return null;
            }
            return abstractC8917u4;
        }
        dti dtiVar = new dti();
        dtiVar.mo29882du(m68991k4(abstractC8917u4.mo29883dy(), hyfVar.mo29883dy()));
        dtiVar.mo29894kk(m68987k4(abstractC8917u4.mo29897m9(), hyfVar.mo29897m9()));
        com.aspose.slides.internal.p332p7.q0e q0eVar = (com.aspose.slides.internal.p332p7.q0e) abstractC8917u4.m42084k4("fill");
        com.aspose.slides.internal.p332p7.q0e q0eVar2 = (com.aspose.slides.internal.p332p7.q0e) hyfVar.m42084k4("fill");
        if (q0eVar != null && q0eVar2 != null) {
            com.aspose.slides.internal.p332p7.q0e q0eVar3 = new com.aspose.slides.internal.p332p7.q0e();
            dtiVar.m30637k4(new C7394ca("fill", q0eVar3));
            q0eVar3.m39259k4(m69005x1(q0eVar.m39258k4(), q0eVar2.m39258k4()));
            q0eVar3.m39251du(m68991k4(q0eVar.m39264m9(), q0eVar2.m39264m9()));
            q0eVar3.m39260k4(m68991k4(q0eVar.m39261kk(), q0eVar2.m39261kk()));
            q0eVar3.m39263kk(m68991k4(q0eVar.m39250du(), q0eVar2.m39250du()));
            q0eVar3.m39268to(m68991k4(q0eVar.m39254h4(), q0eVar2.m39254h4()));
            q0eVar3.m39270x1(m68987k4(q0eVar.m39269x1(), q0eVar2.m39269x1()));
            q0eVar3.m39271x1(m68991k4(q0eVar.m39266to(), q0eVar2.m39266to()));
            q0eVar3.m39249c5(m68991k4(q0eVar.m39248c5(), q0eVar2.m39248c5()));
            q0eVar3.m39253dy(m68991k4(q0eVar.m39252dy(), q0eVar2.m39252dy()));
            q0eVar3.m39257jd(m68991k4(q0eVar.m39256jd(), q0eVar2.m39256jd()));
        } else if (q0eVar != null) {
            dtiVar.m30637k4(new C7394ca("fill", q0eVar));
        } else if (q0eVar2 != null) {
            dtiVar.m30637k4(new C7394ca("fill", q0eVar2));
        }
        dtiVar.mo29881du(m68987k4(abstractC8917u4.mo29879ck(), hyfVar.mo29879ck()));
        dtiVar.mo29899m9(m68991k4(abstractC8917u4.mo29885fa(), hyfVar.mo29885fa()));
        dtiVar.mo29884dy(m68991k4(abstractC8917u4.mo29903up(), hyfVar.mo29903up()));
        gc6 gc6Var = (gc6) abstractC8917u4.m42084k4("stroke");
        gc6 gc6Var2 = (gc6) hyfVar.m42084k4("stroke");
        if (gc6Var == null || gc6Var2 == null) {
            if (gc6Var != null) {
                dtiVar.m30637k4(new C7394ca("stroke", gc6Var));
                return dtiVar;
            }
            if (gc6Var2 != null) {
                dtiVar.m30637k4(new C7394ca("stroke", gc6Var2));
            }
            return dtiVar;
        }
        gc6 gc6Var3 = new gc6();
        dtiVar.m30637k4(new C7394ca("stroke", gc6Var3));
        gc6Var3.m32456x1(m69005x1(gc6Var.m32443jd(), gc6Var2.m32443jd()));
        gc6Var3.m32447k4(m68991k4(gc6Var.m32454x1(), gc6Var2.m32454x1()));
        gc6Var3.m32457x1(m68991k4(gc6Var.m32448kk(), gc6Var2.m32448kk()));
        gc6Var3.m32440du(m68991k4(gc6Var.m32438ck(), gc6Var2.m32438ck()));
        gc6Var3.m32453to(m68991k4(gc6Var.m32437c5(), gc6Var2.m32437c5()));
        gc6Var3.m32455x1(gc6Var.m32451m9() != -1 ? gc6Var.m32451m9() : gc6Var2.m32451m9());
        gc6Var3.m32445k4(gc6Var.m32439du() != -1 ? gc6Var.m32439du() : gc6Var2.m32439du());
        gc6Var3.m32449kk(gc6Var.m32441dy() != -1 ? gc6Var.m32441dy() : gc6Var2.m32441dy());
        gc6Var3.m32450kk(m68991k4(gc6Var.m32442h4(), gc6Var2.m32442h4()));
        gc6Var3.m32446k4(m68987k4(gc6Var.m32444k4(), gc6Var2.m32444k4()));
        return dtiVar;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69007x1(AbstractC8917u4 abstractC8917u4, IFillFormat iFillFormat) {
        com.aspose.slides.internal.p332p7.q0e q0eVarM68988k4 = m68988k4(abstractC8917u4);
        q0eVarM68988k4.m39270x1(1);
        GradientFormat gradientFormat = (GradientFormat) iFillFormat.getGradientFormat();
        if (gradientFormat.getGradientShape() == 0 || gradientFormat.getGradientShape() == -1) {
            q0eVarM68988k4.m39259k4(2);
            q0eVarM68988k4.m39267to(m68986k4(iFillFormat.getRotateWithShape()));
            q0eVarM68988k4.m39251du(C13850af.m65102k4(gradientFormat.getLinearGradientAngle()));
        } else {
            q0eVarM68988k4.m39259k4(3);
            ohe oheVarClone = gradientFormat.m1605h4().Clone();
            q0eVarM68988k4.m39253dy(C14113y2.m67402k4("{0},{1}", C13850af.m65102k4(oheVarClone.f47808k4.f47836k4), C13850af.m65102k4(oheVarClone.f47808k4.f47837x1)));
            q0eVarM68988k4.m39265m9(C14113y2.m67402k4("{0},{1}", C13850af.m65102k4(oheVarClone.f47809x1.f47836k4), C13850af.m65102k4(oheVarClone.f47809x1.f47837x1)));
        }
        if (gradientFormat.getGradientStops().size() > 0) {
            if (gradientFormat.getGradientStops().size() > 2) {
                C6765kp c6765kp = new C6765kp();
                if (gradientFormat.getGradientStops().size() > 0) {
                    c6765kp.m26792k4(C13850af.m65102k4(gradientFormat.getGradientStops().get_Item(0).getPosition()));
                    c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                    c6765kp.m26792k4(gradientFormat.getGradientStops().get_Item(0).getColor().toString(0));
                }
                for (int i = 1; i < gradientFormat.getGradientStops().size(); i++) {
                    c6765kp.m26792k4("; ");
                    c6765kp.m26792k4(C13850af.m65102k4(gradientFormat.getGradientStops().get_Item(i).getPosition()));
                    c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                    c6765kp.m26792k4(gradientFormat.getGradientStops().get_Item(i).getColor().toString(0));
                }
                q0eVarM68988k4.m39268to(c6765kp.toString());
            } else if (gradientFormat.getGradientStops().get_Item(0).getPosition() == 0.0f && gradientFormat.getGradientStops().get_Item(gradientFormat.getGradientStops().size() - 1).getPosition() == 1.0f) {
                q0eVarM68988k4.m39262kk(5);
            }
            m68997k4(q0eVarM68988k4, gradientFormat.getGradientStops().get_Item(0).getColor());
            m69006x1(q0eVarM68988k4, gradientFormat.getGradientStops().get_Item(gradientFormat.getGradientStops().size() - 1).getColor());
        }
        q0eVarM68988k4.m39255h4("100%");
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m68990k4(IColorFormat iColorFormat, C12003du c12003du) {
        if (iColorFormat.getColorType() != 3 || iColorFormat.getSchemeColor() != 12) {
            return ((ColorFormat) iColorFormat).m1084to();
        }
        iColorFormat.setR(C12003du.m56460uz().m56507jd());
        iColorFormat.setG(C12003du.m56460uz().m56502ck());
        iColorFormat.setB(C12003du.m56460uz().m56505fa());
        C12003du c12003duClone = ((ColorFormat) iColorFormat).m1084to().Clone();
        iColorFormat.setColorType(3);
        iColorFormat.setSchemeColor(12);
        return c12003duClone;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68991k4(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68992k4(IColorFormat iColorFormat, String[] strArr, String[] strArr2) {
        strArr[0] = iColorFormat.toString(0);
        strArr2[0] = null;
        IGenericEnumerator<IColorOperation> it = iColorFormat.getColorTransform().iterator();
        while (it.hasNext()) {
            try {
                IColorOperation next = it.next();
                if (next.getOperationType() == 5) {
                    strArr2[0] = C14113y2.m67408k4(C14057f9.m66591x1(C7019kk.m27462to(Float.valueOf(next.getParameter() * 65536.0f), 13)), "f");
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68993k4(IFillFormat iFillFormat, ILineFormat iLineFormat, AbstractC8917u4 abstractC8917u4, gnb gnbVar) {
        m68995k4(iFillFormat, iLineFormat, abstractC8917u4, true, true, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68994k4(IFillFormat iFillFormat, ILineFormat iLineFormat, AbstractC8917u4 abstractC8917u4, hyf hyfVar, gnb gnbVar) {
        m68993k4(iFillFormat, iLineFormat, m68989k4(abstractC8917u4, hyfVar), gnbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3 A[PHI: r2 r11 r13
      0x01c3: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v32 java.lang.String) binds: [B:51:0x014f, B:59:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r11v2 boolean) = (r11v1 boolean), (r11v14 boolean) binds: [B:51:0x014f, B:59:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v13 java.lang.String) binds: [B:51:0x014f, B:59:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m68995k4(IFillFormat iFillFormat, ILineFormat iLineFormat, AbstractC8917u4 abstractC8917u4, boolean z, boolean z2, gnb gnbVar) {
        float fM69004x1;
        String strM39250du;
        String str;
        float fM69004x12;
        float fM69004x13;
        String strM32438ck;
        byte b;
        String strM39254h4;
        float fM13004to;
        if (iFillFormat == null || iLineFormat == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.q0e q0eVar = (com.aspose.slides.internal.p332p7.q0e) abstractC8917u4.m42084k4("fill");
        String strMo29883dy = abstractC8917u4.mo29883dy();
        boolean zM42083k4 = AbstractC8917u4.m42083k4(abstractC8917u4.mo29897m9(), z);
        if (q0eVar != null) {
            if (q0eVar.m39261kk() != null) {
                strMo29883dy = q0eVar.m39261kk();
            }
            zM42083k4 = AbstractC8917u4.m42083k4(q0eVar.m39269x1(), zM42083k4);
            fM69004x12 = m69004x1(q0eVar.m39266to(), "1");
            if (zM42083k4) {
                switch (q0eVar.m39258k4()) {
                    case 0:
                    case 1:
                        iFillFormat.setFillType((byte) 1);
                        fM69004x1 = 1.0f;
                        strM39250du = null;
                        strM39254h4 = null;
                        break;
                    case 2:
                        iFillFormat.setFillType((byte) 2);
                        iFillFormat.getGradientFormat().setGradientShape((byte) 0);
                        iFillFormat.getGradientFormat().setLinearGradientAngle(m69004x1(q0eVar.m39264m9(), "0"));
                        iFillFormat.getGradientFormat().setLinearGradientScaled((byte) 1);
                        fM69004x1 = m69004x1(q0eVar.m39248c5(), "1");
                        String strM39250du2 = q0eVar.m39250du();
                        strM39254h4 = q0eVar.m39254h4();
                        strM39250du = strM39250du2;
                        break;
                    case 3:
                        iFillFormat.setFillType((byte) 2);
                        iFillFormat.getGradientFormat().setGradientShape((byte) 1);
                        fM69004x1 = m69004x1(q0eVar.m39248c5(), "1");
                        String strM39250du3 = q0eVar.m39250du();
                        strM39254h4 = q0eVar.m39254h4();
                        String strM39252dy = q0eVar.m39252dy();
                        if (strM39252dy == null) {
                            strM39252dy = "0.5,0.5";
                        }
                        C3073my c3073my = new C3073my(strM39252dy);
                        float fM13004to2 = c3073my.m13004to();
                        if (C14064he.m66715kk(fM13004to2)) {
                            fM13004to2 = 0.0f;
                        }
                        c3073my.m12993dy();
                        if (c3073my.m12994h4() > 0) {
                            c3073my.m13003m9();
                            fM13004to = c3073my.m13004to();
                        } else {
                            fM13004to = 0.0f;
                        }
                        if (C14064he.m66715kk(fM13004to)) {
                            fM13004to = 0.0f;
                        }
                        ((GradientFormat) iFillFormat.getGradientFormat()).m1607k4(fM13004to2, fM13004to, 0.0f, 0.0f);
                        strM39250du = strM39250du3;
                        break;
                    case 4:
                        m68998k4(q0eVar, iFillFormat, gnbVar);
                        iFillFormat.getPictureFillFormat().setPictureFillMode(0);
                        fM69004x1 = 1.0f;
                        strM39250du = null;
                        strM39254h4 = null;
                        break;
                    case 5:
                        iFillFormat.setFillType((byte) 3);
                        fM69004x1 = m69004x1(q0eVar.m39248c5(), "1");
                        strM39250du = q0eVar.m39250du();
                        strM39254h4 = null;
                        break;
                    case 6:
                        m68998k4(q0eVar, iFillFormat, gnbVar);
                        iFillFormat.getPictureFillFormat().setPictureFillMode(1);
                        fM69004x1 = 1.0f;
                        strM39250du = null;
                        strM39254h4 = null;
                        break;
                    default:
                        fM69004x1 = 1.0f;
                        strM39250du = null;
                        strM39254h4 = null;
                        break;
                }
                str = strM39254h4;
            } else {
                fM69004x1 = 1.0f;
                strM39250du = null;
                str = null;
            }
        } else {
            if (zM42083k4) {
                iFillFormat.setFillType((byte) 1);
            }
            fM69004x1 = 1.0f;
            strM39250du = null;
            str = null;
            fM69004x12 = 1.0f;
        }
        if (!zM42083k4) {
            iFillFormat.setFillType((byte) 0);
        }
        gc6 gc6Var = (gc6) abstractC8917u4.m42084k4("stroke");
        boolean zM42083k42 = AbstractC8917u4.m42083k4(abstractC8917u4.mo29879ck(), z2);
        String strMo29885fa = abstractC8917u4.mo29885fa();
        if (strMo29885fa == null) {
            strMo29885fa = "";
        }
        String strMo29903up = abstractC8917u4.mo29903up();
        if (strMo29903up == null) {
            strMo29903up = "1";
        }
        if (gc6Var == null) {
            fM69004x13 = 1.0f;
            strM32438ck = null;
        } else {
            if (gc6Var.m32454x1() != null) {
                strMo29903up = gc6Var.m32454x1();
            }
            if (gc6Var.m32448kk() != null) {
                strMo29885fa = gc6Var.m32448kk();
            }
            zM42083k42 = AbstractC8917u4.m42083k4(gc6Var.m32444k4(), zM42083k42);
            if (zM42083k42) {
                fM69004x13 = m69004x1(gc6Var.m32452to(), "1");
                strM32438ck = gc6Var.m32438ck();
                iLineFormat.setStyle(gc6Var.m32439du() != -1 ? gc6Var.m32439du() : (byte) 0);
                iLineFormat.setJoinStyle(gc6Var.m32451m9() != -1 ? gc6Var.m32451m9() : (byte) 0);
                if (iLineFormat.getJoinStyle() == 2) {
                    iLineFormat.setMiterLimit(m69004x1(gc6Var.m32442h4(), "8"));
                }
                iLineFormat.setCapStyle(gc6Var.m32441dy() != -1 ? gc6Var.m32441dy() : (byte) 2);
                m68996k4(gc6Var, iLineFormat);
            }
        }
        if (zM42083k42) {
            iLineFormat.getFillFormat().setFillType((byte) 1);
            iLineFormat.setWidth(new C3073my(strMo29903up).m12995jd());
        }
        int i = 4;
        IColorFormat[] iColorFormatArr = new IColorFormat[4];
        byte fillType = iFillFormat.getFillType();
        if (fillType == 1) {
            b = 1;
            iColorFormatArr[0] = iFillFormat.getSolidFillColor();
            iColorFormatArr[1] = iFillFormat.getPatternFormat().getBackColor();
        } else if (fillType != 2) {
            if (fillType == 3) {
                iColorFormatArr[0] = iFillFormat.getPatternFormat().getForeColor();
                iColorFormatArr[1] = iFillFormat.getPatternFormat().getBackColor();
            }
            b = 1;
        } else {
            iFillFormat.getGradientFormat().getGradientStops().addPresetColor(0.0f, 7);
            iFillFormat.getGradientFormat().getGradientStops().addPresetColor(1.0f, 136);
            iColorFormatArr[0] = iFillFormat.getGradientFormat().getGradientStops().get_Item(0).getColor();
            b = 1;
            iColorFormatArr[1] = iFillFormat.getGradientFormat().getGradientStops().get_Item(1).getColor();
        }
        if (iLineFormat.getFillFormat().getFillType() == b) {
            iColorFormatArr[2] = iLineFormat.getFillFormat().getSolidFillColor();
            iColorFormatArr[3] = iLineFormat.getFillFormat().getPatternFormat().getBackColor();
        }
        String[] strArr = {strMo29883dy, strM39250du, strMo29885fa, strM32438ck};
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            int i2 = 0;
            while (i2 < i) {
                int i3 = b3 & 255;
                int i4 = 1;
                int i5 = 1 << i2;
                if ((i3 & i5) == 0) {
                    String str2 = strArr[i2];
                    if (str2 == null || "".equals(str2)) {
                        b3 = (byte) ((((byte) i5) & 255) | i3);
                    } else {
                        int i6 = 0;
                        while (i6 < i) {
                            if (((i4 << i6) & i3) != 0 || C14113y2.m67364dy(strArr[i2], f48021x1[i6]) < 0) {
                                i6++;
                                i = 4;
                                i4 = 1;
                            }
                        }
                        if (iColorFormatArr[i2] != null) {
                            new C3073my(strArr[i2]).m13000k4(iColorFormatArr[i2], iColorFormatArr[0], iColorFormatArr[1], iColorFormatArr[2], iColorFormatArr[3]);
                        }
                        b3 = (byte) ((((byte) i5) & 255) | i3);
                    }
                }
                i2++;
                i = 4;
            }
            int i7 = b2 & 255;
            int i8 = b3 & 255;
            if (i7 == i8) {
                for (int i9 = 0; i9 < 4; i9++) {
                    if (((1 << i9) & i8) == 0) {
                        new C3073my(strArr[i9]).m12999k4(iColorFormatArr[i9]);
                    }
                }
                if (iFillFormat.getFillType() != 0) {
                    if (fM69004x12 < 1.0f) {
                        iColorFormatArr[0].getColorTransform().add(5, fM69004x12);
                    }
                    if (fM69004x1 < 1.0f) {
                        iColorFormatArr[1].getColorTransform().add(5, fM69004x1);
                    }
                }
                if (fM69004x13 < 1.0f) {
                    iColorFormatArr[2].getColorTransform().add(5, fM69004x13);
                }
                if (iFillFormat.getFillType() != 2 || str == null || "".equals(str)) {
                    return;
                }
                iFillFormat.getGradientFormat().getGradientStops().clear();
                C3073my c3073my2 = new C3073my(str);
                while (true) {
                    c3073my2.m12993dy();
                    if (c3073my2.m12994h4() <= 0) {
                        return;
                    }
                    float fM13004to3 = c3073my2.m13004to();
                    if (C14064he.m66715kk(fM13004to3)) {
                        return;
                    }
                    iFillFormat.getGradientFormat().getGradientStops().addPresetColor(fM13004to3, -1);
                    c3073my2.m13000k4(iFillFormat.getGradientFormat().getGradientStops().get_Item(iFillFormat.getGradientFormat().getGradientStops().size() - 1).getColor(), iColorFormatArr[0], iColorFormatArr[1], iColorFormatArr[2], iColorFormatArr[3]);
                    c3073my2.m12993dy();
                    if (c3073my2.m12994h4() > 0) {
                        c3073my2.m13003m9();
                    }
                }
            } else {
                b2 = b3;
                i = 4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68996k4(gc6 gc6Var, ILineFormat iLineFormat) {
        String strM32437c5 = gc6Var.m32437c5();
        if (strM32437c5 == null) {
            strM32437c5 = "solid";
        }
        String strM67398k4 = C14113y2.m67398k4(strM32437c5, C11697x1.m55250kk());
        C3073my c3073my = new C3073my(strM67398k4);
        c3073my.m12993dy();
        if (c3073my.m12992du() < '0' || c3073my.m12992du() > '9') {
            iLineFormat.setDashStyle((byte) f48020k4.m12963k4(strM67398k4));
            return;
        }
        List list = new List();
        while (true) {
            float fM13004to = c3073my.m13004to();
            if (C14064he.m66715kk(fM13004to)) {
                iLineFormat.setDashStyle((byte) 11);
                iLineFormat.setCustomDashPattern(C3085sv.m13067du((List<Float>) list));
                return;
            } else if (fM13004to > 0.0f) {
                list.addItem(Float.valueOf(fM13004to));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68997k4(com.aspose.slides.internal.p332p7.q0e q0eVar, IColorFormat iColorFormat) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        m68992k4(iColorFormat, strArr, strArr2);
        String str = strArr[0];
        String str2 = strArr2[0];
        q0eVar.m39260k4(str);
        q0eVar.m39271x1(str2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68998k4(com.aspose.slides.internal.p332p7.q0e q0eVar, IFillFormat iFillFormat, gnb gnbVar) {
        iFillFormat.setFillType((byte) 4);
        String strM39256jd = q0eVar.m39256jd();
        if (strM39256jd != null) {
            iFillFormat.getPictureFillFormat().getPicture().setImage(gnbVar.m6781k4(gnbVar.m55338u4().m55303k4(strM39256jd).m55296x1()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68999k4(AbstractC8917u4 abstractC8917u4, IFillFormat iFillFormat) {
        if ((m68990k4(iFillFormat.getSolidFillColor(), C12003du.m56385i5().Clone()).m56501c5() & 255) >= 255) {
            abstractC8917u4.mo29894kk(1);
            abstractC8917u4.mo29882du(iFillFormat.getSolidFillColor().toString(0));
        } else {
            com.aspose.slides.internal.p332p7.q0e q0eVarM68988k4 = m68988k4(abstractC8917u4);
            q0eVarM68988k4.m39270x1(1);
            q0eVarM68988k4.m39259k4(1);
            m68997k4(q0eVarM68988k4, iFillFormat.getSolidFillColor());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69000k4(AbstractC8917u4 abstractC8917u4, IFillFormat iFillFormat, ILineFormat iLineFormat, nml nmlVar, sdp sdpVar) {
        byte fillType = iFillFormat.getFillType();
        if (fillType == 1) {
            m68999k4(abstractC8917u4, iFillFormat);
        } else if (fillType == 2) {
            m69007x1(abstractC8917u4, iFillFormat);
        } else if (fillType == 3) {
            m69002k4(abstractC8917u4, iFillFormat, nmlVar, sdpVar);
        } else if (fillType != 4) {
            abstractC8917u4.mo29894kk(2);
        } else {
            m69003k4(abstractC8917u4, iFillFormat.getPictureFillFormat(), nmlVar, sdpVar);
        }
        if (iLineFormat.getFillFormat().getFillType() == 0 || iLineFormat.getFillFormat().getFillType() == -1) {
            abstractC8917u4.mo29881du(2);
            return;
        }
        if (!C14044b3.m66437kk(iLineFormat.getWidth())) {
            abstractC8917u4.mo29884dy(C14113y2.m67402k4("{0}pt", C13850af.m65101k4(iLineFormat.getWidth())));
        }
        abstractC8917u4.mo29881du(1);
        abstractC8917u4.mo29899m9(iLineFormat.getFillFormat().getSolidFillColor().toString(0));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69001k4(AbstractC8917u4 abstractC8917u4, IFillFormat iFillFormat, ILineFormat iLineFormat, sdp sdpVar) {
        m69000k4(abstractC8917u4, iFillFormat, iLineFormat, (nml) null, sdpVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69002k4(AbstractC8917u4 abstractC8917u4, IFillFormat iFillFormat, nml nmlVar, sdp sdpVar) {
        com.aspose.slides.internal.p332p7.q0e q0eVarM68988k4 = m68988k4(abstractC8917u4);
        q0eVarM68988k4.m39270x1(1);
        q0eVarM68988k4.m39259k4(5);
        q0eVarM68988k4.m39267to(m68986k4(iFillFormat.getRotateWithShape()));
        C12009k4 c12009k4M2215k4 = ((PatternFormat) iFillFormat.getPatternFormat()).m2215k4(C12003du.m56385i5().Clone(), C12003du.m56460uz().Clone());
        try {
            C11791os c11791osM71542k4 = sdpVar.m70580k4().m71542k4(c12009k4M2215k4);
            if (sdpVar.m70584m9() != null) {
                q0eVarM68988k4.m39257jd(sdpVar.m70584m9().m55377up().m55311x1(c11791osM71542k4).m55289du());
            } else if (nmlVar != null) {
                nmlVar.m68096to().addItem(q0eVarM68988k4, c11791osM71542k4);
            }
            if (c12009k4M2215k4 != null) {
                c12009k4M2215k4.dispose();
            }
            m68997k4(q0eVarM68988k4, iFillFormat.getPatternFormat().getForeColor());
            m69006x1(q0eVarM68988k4, iFillFormat.getPatternFormat().getBackColor());
        } catch (Throwable th) {
            if (c12009k4M2215k4 != null) {
                c12009k4M2215k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69003k4(AbstractC8917u4 abstractC8917u4, IPictureFillFormat iPictureFillFormat, nml nmlVar, sdp sdpVar) {
        com.aspose.slides.internal.p332p7.q0e q0eVarM68988k4 = m68988k4(abstractC8917u4);
        q0eVarM68988k4.m39270x1(1);
        q0eVarM68988k4.m39259k4(iPictureFillFormat.getPictureFillMode() == 0 ? 4 : 6);
        if (iPictureFillFormat.getPicture().getImage() != null) {
            C11791os c11791osM71567x1 = sdpVar.m70580k4().m71567x1(iPictureFillFormat.getPicture().getImage());
            if (sdpVar.m70584m9() != null) {
                q0eVarM68988k4.m39257jd(sdpVar.m70584m9().m55377up().m55311x1(c11791osM71567x1).m55289du());
            } else if (nmlVar != null) {
                nmlVar.m68096to().addItem(q0eVarM68988k4, c11791osM71567x1);
            }
        }
    }
}
