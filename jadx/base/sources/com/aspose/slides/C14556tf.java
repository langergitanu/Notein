package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.tf */
/* JADX INFO: loaded from: classes3.dex */
class C14556tf extends C0859cl {
    public C14556tf(C13726kf c13726kf) {
        super(c13726kf);
    }

    /* JADX INFO: renamed from: k4 */
    private IColorFormat m71119k4(jbq jbqVar, IColorFormat iColorFormat, InterfaceC14397rj interfaceC14397rj, int i, int i2) {
        return jbqVar.m63277k4() ? iColorFormat : m4613dy().m63800k4(interfaceC14397rj, jbqVar.m63278kk(), i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final IFormat m71124k4(InterfaceC14397rj interfaceC14397rj, int i, int i2) {
        InterfaceC14397rj interfaceC14397rj2;
        int i3;
        int i4;
        Format format = new Format(interfaceC14397rj);
        ColorFormat colorFormatM63800k4 = m4613dy().m63800k4(interfaceC14397rj, i, i2);
        fuq fuqVar = (fuq) m4613dy().m63812to().createThemeEffective();
        if (m4620x1().getFill().getFillType() == -1) {
            C14176nc c14176ncM6306k4 = fuqVar.m6306k4(m4615k4().m2664x1(), m4615k4().getFillStyleIndex(), (ColorFormat) m4615k4().getFillColor());
            if (c14176ncM6306k4 != null) {
                ((FillFormat) format.getFill()).m1457k4((IFillFormatEffectiveData) c14176ncM6306k4);
            }
        } else {
            ((FillFormat) format.getFill()).m1456k4(m4620x1().getFill());
        }
        if (!m4620x1().getLine().isFormatNotDefined()) {
            ((LineFormat) format.getLine()).m1896k4(m4620x1().getLine());
        } else if (m4619to().m63279x1()) {
            format.getLine().getFillFormat().setFillType((byte) 0);
        } else {
            skr skrVarM6313x1 = fuqVar.m6313x1(m4615k4().m2664x1(), m4615k4().getLineStyleIndex() & 65535, (ColorFormat) m4615k4().getLineColor());
            if (skrVarM6313x1 != null) {
                ((LineFormat) format.getLine()).m1897k4((ILineFormatEffectiveData) skrVarM6313x1);
            }
        }
        if (m4612du().m63279x1()) {
            interfaceC14397rj2 = interfaceC14397rj;
            i3 = i;
            i4 = i2;
        } else {
            interfaceC14397rj2 = interfaceC14397rj;
            i3 = i;
            i4 = i2;
            m71122k4(format.getFill(), m71119k4(m4612du(), colorFormatM63800k4, interfaceC14397rj2, i3, i4));
        }
        if (!m4619to().m63279x1()) {
            m71123k4(format.getLine().getFillFormat(), m71119k4(m4619to(), colorFormatM63800k4, interfaceC14397rj2, i3, i4));
        }
        ((EffectFormat) format.getEffect()).m1387k4(m4620x1().getEffect());
        if (!m4614h4().m63279x1()) {
            m71121k4(format.getEffect(), m71119k4(m4614h4(), colorFormatM63800k4, interfaceC14397rj2, i3, i4));
        }
        ((ThreeDFormat) format.getEffect3D()).m3007k4(m4620x1().getEffect3D());
        m71121k4(format.getEffect(), colorFormatM63800k4);
        m4616k4(format, i3);
        return format;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71120k4(IColorFormat iColorFormat, IColorFormat iColorFormat2) {
        if (iColorFormat.getSchemeColor() == 12 || iColorFormat.getSchemeColor() == -1) {
            iColorFormat.setSchemeColor(iColorFormat2.getSchemeColor());
            for (int size = iColorFormat2.getColorTransform().size() - 1; size >= 0; size--) {
                IColorOperation iColorOperation = iColorFormat2.getColorTransform().get_Item(size);
                iColorFormat.getColorTransform().insert(0, iColorOperation.getOperationType(), iColorOperation.getParameter());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71121k4(IEffectFormat iEffectFormat, IColorFormat iColorFormat) {
        if (iColorFormat != null) {
            if (iEffectFormat.getGlowEffect() != null) {
                m71120k4(iEffectFormat.getGlowEffect().getColor(), iColorFormat);
            }
            if (iEffectFormat.getInnerShadowEffect() != null) {
                m71120k4(iEffectFormat.getInnerShadowEffect().getShadowColor(), iColorFormat);
            }
            if (iEffectFormat.getOuterShadowEffect() != null) {
                m71120k4(iEffectFormat.getOuterShadowEffect().getShadowColor(), iColorFormat);
            }
            if (iEffectFormat.getPresetShadowEffect() != null) {
                m71120k4(iEffectFormat.getPresetShadowEffect().getShadowColor(), iColorFormat);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71122k4(IFillFormat iFillFormat, IColorFormat iColorFormat) {
        IColorFormat solidFillColor;
        boolean zM27456k4;
        byte fillType = iFillFormat.getFillType();
        if (fillType == 1) {
            solidFillColor = iFillFormat.getSolidFillColor();
        } else {
            if (fillType == 2) {
                IGenericEnumerator<IGradientStop> it = iFillFormat.getGradientFormat().getGradientStops().iterator();
                while (it.hasNext()) {
                    try {
                        m71120k4(it.next().getColor(), iColorFormat);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return;
                } else {
                    return;
                }
            }
            if (fillType != 3) {
                return;
            }
            m71120k4(iFillFormat.getPatternFormat().getForeColor(), iColorFormat);
            solidFillColor = iFillFormat.getPatternFormat().getBackColor();
        }
        m71120k4(solidFillColor, iColorFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71123k4(ILineFillFormat iLineFillFormat, IColorFormat iColorFormat) {
        IColorFormat solidFillColor;
        boolean zM27456k4;
        if (iColorFormat != null) {
            byte fillType = iLineFillFormat.getFillType();
            if (fillType == 1) {
                solidFillColor = iLineFillFormat.getSolidFillColor();
            } else {
                if (fillType == 2) {
                    IGenericEnumerator<IGradientStop> it = iLineFillFormat.getGradientFormat().getGradientStops().iterator();
                    while (it.hasNext()) {
                        try {
                            m71120k4(it.next().getColor(), iColorFormat);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
                }
                if (fillType != 3) {
                    return;
                }
                m71120k4(iLineFillFormat.getPatternFormat().getForeColor(), iColorFormat);
                solidFillColor = iLineFillFormat.getPatternFormat().getBackColor();
            }
            m71120k4(solidFillColor, iColorFormat);
        }
    }
}
