package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7211a4;
import com.aspose.slides.internal.p332p7.C7234ad;
import com.aspose.slides.internal.p332p7.C7330bl;
import com.aspose.slides.internal.p332p7.C7537e7;
import com.aspose.slides.internal.p332p7.C7577ej;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7834hb;
import com.aspose.slides.internal.p332p7.C8201ln;
import com.aspose.slides.internal.p332p7.C8362nn;
import com.aspose.slides.internal.p332p7.C8445oi;
import com.aspose.slides.internal.p332p7.C8518pf;
import com.aspose.slides.internal.p332p7.C8527pj;
import com.aspose.slides.internal.p332p7.C8539pp;
import com.aspose.slides.internal.p332p7.C8824sy;
import com.aspose.slides.internal.p332p7.C8842t8;
import com.aspose.slides.internal.p332p7.C8847ta;
import com.aspose.slides.internal.p332p7.C8947ue;
import com.aspose.slides.internal.p332p7.C9135ws;
import com.aspose.slides.internal.p332p7.C9281yf;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.x8 */
/* JADX INFO: loaded from: classes3.dex */
class C14768x8 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC7361bz m73179k4(IMathElement iMathElement, u8s u8sVar) {
        if (C7019kk.m27469x1(iMathElement, MathDelimiter.class)) {
            return C0925e3.m5337k4((MathDelimiter) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathArray.class)) {
            return C13673j5.m63214k4((MathArray) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathFraction.class)) {
            return C14210o0.m68295k4((MathFraction) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathFunction.class)) {
            return C14841yb.m73801k4((MathFunction) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathLimit.class)) {
            MathLimit mathLimit = (MathLimit) iMathElement;
            return mathLimit.getUpperLimit() ? pbm.m69011k4(mathLimit, u8sVar) : zm1.m74572k4(mathLimit, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathematicalText.class)) {
            MathematicalText mathematicalText = (MathematicalText) iMathElement;
            return m73179k4(new lv5(mathematicalText.getValue(), (PortionFormat) mathematicalText.getFormat()), u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathNaryOperator.class)) {
            return pyz.m69333k4((MathNaryOperator) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, MathRadical.class)) {
            return xxs.m73635k4((MathRadical) iMathElement, u8sVar);
        }
        if (C7019kk.m27469x1(iMathElement, lv5.class)) {
            lv5 lv5Var = (lv5) iMathElement;
            final C8362nn c8362nn = new C8362nn();
            r5t r5tVar = new r5t(lv5Var.m64604du());
            IGenericEnumerator<InterfaceC14740wj> it = lv5Var.m64607x1().iterator();
            while (it.hasNext()) {
                try {
                    c8362nn.m37723k4(r5tVar.m70025k4(it.next()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            h1b.m6959k4(lv5Var.m64604du(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.x8.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8362nn) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_RElementData.AddRPr2()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9135ws invoke() {
                    return c8362nn.m37726x1();
                }
            }, u8sVar);
            ldn ldnVar = new ldn();
            ldnVar.m64382x1(MathematicalText.m2005k4(lv5Var.m64604du()));
            if (!ldnVar.m64380m9()) {
                ab7.m3465k4(ldnVar, new AbstractC4685kk<C7330bl>() { // from class: com.aspose.slides.x8.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8362nn) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_RElementData.AddRPr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7330bl invoke() {
                        return c8362nn.m37722k4();
                    }
                }, u8sVar);
            }
            return c8362nn;
        }
        if (C7019kk.m27469x1(iMathElement, MathSubscriptElement.class)) {
            MathSubscriptElement mathSubscriptElement = (MathSubscriptElement) iMathElement;
            C8445oi c8445oi = new C8445oi();
            if (mathSubscriptElement.getBase() != null) {
                jz7.m63587k4(c8445oi.m38277kk(), mathSubscriptElement.getBase(), u8sVar);
            }
            if (mathSubscriptElement.getSubscript() != null) {
                jz7.m63587k4(c8445oi.m38278to(), mathSubscriptElement.getSubscript(), u8sVar);
            }
            p8h p8hVar = ((BaseScript) mathSubscriptElement).f1061k4;
            if (!p8hVar.m68975k4()) {
                final C8947ue c8947ueM38276k4 = c8445oi.m38276k4();
                C13727kg.m63826k4(p8hVar, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.x8.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8947ueM38276k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_SSubPrElementData.AddCtrlPr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7782go invoke() {
                        return c8947ueM38276k4.m42341k4();
                    }
                }, u8sVar);
            }
            return c8445oi;
        }
        if (C7019kk.m27469x1(iMathElement, MathSuperscriptElement.class)) {
            MathSuperscriptElement mathSuperscriptElement = (MathSuperscriptElement) iMathElement;
            C8518pf c8518pf = new C8518pf();
            if (mathSuperscriptElement.getBase() != null) {
                jz7.m63587k4(c8518pf.m38891kk(), mathSuperscriptElement.getBase(), u8sVar);
            }
            if (mathSuperscriptElement.getSuperscript() != null) {
                jz7.m63587k4(c8518pf.m38892to(), mathSuperscriptElement.getSuperscript(), u8sVar);
            }
            p8h p8hVar2 = ((BaseScript) mathSuperscriptElement).f1061k4;
            if (!p8hVar2.m68975k4()) {
                final C7577ej c7577ejM38890k4 = c8518pf.m38890k4();
                C13727kg.m63826k4(p8hVar2, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.x8.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c7577ejM38890k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_SSupPrElementData.AddCtrlPr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7782go invoke() {
                        return c7577ejM38890k4.m31109k4();
                    }
                }, u8sVar);
            }
            return c8518pf;
        }
        if (C7019kk.m27469x1(iMathElement, MathRightSubSuperscriptElement.class)) {
            MathRightSubSuperscriptElement mathRightSubSuperscriptElement = (MathRightSubSuperscriptElement) iMathElement;
            C8527pj c8527pj = new C8527pj();
            final C7834hb c7834hb = new C7834hb();
            c7834hb.m33263k4(diq.m5107k4(mathRightSubSuperscriptElement.getAlignScripts()));
            C13727kg.m63826k4(((BaseScript) mathRightSubSuperscriptElement).f1061k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.x8.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7834hb) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_SSubSupPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c7834hb.m33262k4();
                }
            }, u8sVar);
            c8527pj.m38938k4(c7834hb);
            if (mathRightSubSuperscriptElement.getBase() != null) {
                jz7.m63587k4(c8527pj.m38941x1(), mathRightSubSuperscriptElement.getBase(), u8sVar);
            }
            if (mathRightSubSuperscriptElement.getSubscript() != null) {
                jz7.m63587k4(c8527pj.m38939kk(), mathRightSubSuperscriptElement.getSubscript(), u8sVar);
            }
            if (mathRightSubSuperscriptElement.getSuperscript() != null) {
                jz7.m63587k4(c8527pj.m38940to(), mathRightSubSuperscriptElement.getSuperscript(), u8sVar);
            }
            return c8527pj;
        }
        if (C7019kk.m27469x1(iMathElement, MathLeftSubSuperscriptElement.class)) {
            MathLeftSubSuperscriptElement mathLeftSubSuperscriptElement = (MathLeftSubSuperscriptElement) iMathElement;
            C9281yf c9281yf = new C9281yf();
            if (mathLeftSubSuperscriptElement.getBase() != null) {
                jz7.m63587k4(c9281yf.m44986du(), mathLeftSubSuperscriptElement.getBase(), u8sVar);
            }
            if (mathLeftSubSuperscriptElement.getSubscript() != null) {
                jz7.m63587k4(c9281yf.m44988kk(), mathLeftSubSuperscriptElement.getSubscript(), u8sVar);
            }
            if (mathLeftSubSuperscriptElement.getSuperscript() != null) {
                jz7.m63587k4(c9281yf.m44989to(), mathLeftSubSuperscriptElement.getSuperscript(), u8sVar);
            }
            p8h p8hVar3 = ((BaseScript) mathLeftSubSuperscriptElement).f1061k4;
            if (!p8hVar3.m68975k4()) {
                final C7234ad c7234adM44987k4 = c9281yf.m44987k4();
                C13727kg.m63826k4(p8hVar3, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.x8.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c7234adM44987k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_SPrePrElementData.AddCtrlPr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7782go invoke() {
                        return c7234adM44987k4.m28130k4();
                    }
                }, u8sVar);
            }
            return c9281yf;
        }
        if (C7019kk.m27469x1(iMathElement, MathBlock.class)) {
            C7211a4 c7211a4 = new C7211a4();
            uf9.m71682k4((MathBlock) iMathElement, c7211a4, u8sVar);
            return c7211a4;
        }
        if (C7019kk.m27469x1(iMathElement, MathAccent.class)) {
            C8847ta c8847ta = new C8847ta();
            C13681jd.m63284k4((MathAccent) iMathElement, c8847ta, u8sVar);
            return c8847ta;
        }
        if (C7019kk.m27469x1(iMathElement, MathBar.class)) {
            C8824sy c8824sy = new C8824sy();
            C14579tw.m71340k4((MathBar) iMathElement, c8824sy, u8sVar);
            return c8824sy;
        }
        if (C7019kk.m27469x1(iMathElement, MathBox.class)) {
            C7537e7 c7537e7 = new C7537e7();
            C1096fd.m6118k4((MathBox) iMathElement, c7537e7, u8sVar);
            return c7537e7;
        }
        if (C7019kk.m27469x1(iMathElement, MathGroupingCharacter.class)) {
            C8539pp c8539pp = new C8539pp();
            C13843mn.m64925k4((MathGroupingCharacter) iMathElement, c8539pp, u8sVar);
            return c8539pp;
        }
        if (C7019kk.m27469x1(iMathElement, MathBorderBox.class)) {
            C8201ln c8201ln = new C8201ln();
            C14147mx.m67764k4((MathBorderBox) iMathElement, c8201ln, u8sVar);
            return c8201ln;
        }
        if (!C7019kk.m27469x1(iMathElement, MathMatrix.class)) {
            throw new NotImplementedException();
        }
        C8842t8 c8842t8 = new C8842t8();
        dac.m5023k4((MathMatrix) iMathElement, c8842t8, u8sVar);
        return c8842t8;
    }
}
