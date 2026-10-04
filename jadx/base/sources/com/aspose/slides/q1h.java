package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class q1h implements InterfaceC0851ce {

    /* JADX INFO: renamed from: du */
    public Presentation f48221du;

    /* JADX INFO: renamed from: h4 */
    public final MathParagraph f48222h4;

    /* JADX INFO: renamed from: k4 */
    public final float f48223k4;

    /* JADX INFO: renamed from: kk */
    public final AbstractC4687to<String, C2132iq> f48224kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f48225m9;

    /* JADX INFO: renamed from: to */
    public final AbstractC14324k4 f48226to;

    /* JADX INFO: renamed from: x1 */
    public final AbstractC4687to<PortionFormat, AbstractC12024x1> f48227x1;

    /* JADX INFO: renamed from: com.aspose.slides.q1h$k4 */
    public static abstract class AbstractC14324k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract C12013m9 mo68876k4(MathematicalText mathematicalText, byte b, float f);
    }

    public q1h(MathParagraph mathParagraph, float f, AbstractC4687to<String, C2132iq> abstractC4687to, AbstractC4687to<PortionFormat, AbstractC12024x1> abstractC4687to2, AbstractC14324k4 abstractC14324k4) {
        this.f48222h4 = mathParagraph;
        this.f48223k4 = f;
        this.f48227x1 = abstractC4687to2;
        this.f48224kk = abstractC4687to;
        this.f48226to = abstractC14324k4;
    }

    /* JADX INFO: renamed from: x1 */
    private el1 m69382x1(IMathElement iMathElement, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        if (iMathElement == null) {
            return new C14201nu(interfaceC0851ce);
        }
        if (C7019kk.m27469x1(iMathElement, MathBlock.class)) {
            return new t8a((MathBlock) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathematicalText.class)) {
            return new b3e((MathematicalText) iMathElement, interfaceC0851ce, c14327q4.Clone(), null);
        }
        if (C7019kk.m27469x1(iMathElement, MathFraction.class)) {
            if (!this.f48222h4.m1999k4() && !c14327q4.f48238m9) {
                c14327q4.f48231du *= 0.772f;
                c14327q4.f48238m9 = true;
                c14327q4.f48233fa = 0.9f;
                c14327q4.f48240up = 1.0f;
            }
            MathFraction mathFraction = (MathFraction) iMathElement;
            int fractionType = mathFraction.getFractionType();
            return fractionType != 2 ? fractionType != 3 ? new C14431s3(mathFraction, interfaceC0851ce, c14327q4.Clone()) : new C0921dz(mathFraction, interfaceC0851ce, c14327q4.Clone()) : new C1144gh(mathFraction, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathLeftSubSuperscriptElement.class)) {
            return new i0a((MathLeftSubSuperscriptElement) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathRightSubSuperscriptElement.class)) {
            return new i0a((MathRightSubSuperscriptElement) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathSubscriptElement.class)) {
            return new dxs((MathSubscriptElement) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathSuperscriptElement.class)) {
            return new dxs((MathSuperscriptElement) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathRadical.class)) {
            return new w7g((MathRadical) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathFunction.class)) {
            return new C0877d1((MathFunction) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathDelimiter.class)) {
            return new C1138gb((MathDelimiter) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathArray.class)) {
            return new C13818m2((MathArray) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathMatrix.class)) {
            return new b0t((MathMatrix) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathLimit.class)) {
            return new m5e((MathLimit) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathNaryOperator.class)) {
            return new c7j((MathNaryOperator) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathAccent.class)) {
            return new C0842c5((MathAccent) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathBar.class)) {
            return new C14185nk((MathBar) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        if (C7019kk.m27469x1(iMathElement, MathBox.class)) {
            return new C1100fh((MathBox) iMathElement, interfaceC0851ce, c14327q4.Clone());
        }
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.InterfaceC0851ce
    /* JADX INFO: renamed from: du */
    public final q1h mo4555du() {
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final el1 m69384k4(IMathElement iMathElement, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        if (interfaceC0851ce == null) {
            throw new ArgumentNullException("parent");
        }
        el1 el1VarM69382x1 = m69382x1(iMathElement, interfaceC0851ce, c14327q4.Clone());
        el1VarM69382x1.m5576c5();
        return el1VarM69382x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m69385k4(MathematicalText mathematicalText, byte b, float f) {
        AbstractC14324k4 abstractC14324k4 = this.f48226to;
        return abstractC14324k4 != null ? abstractC14324k4.mo68876k4(mathematicalText, b, f) : C12013m9.m56630k4(mbw.m64822k4().m56651x1(), f, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69390x1() {
        return this.f48225m9;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m69383x1(IMathElement iMathElement) {
        for (IMathElement iMathElement2 : iMathElement.getChildren()) {
            if (!m69380k4(iMathElement2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13840mk m69386k4() {
        return ks2.f45848k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final nn2 m69387k4(float f) {
        return new nn2(f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69388k4(boolean z) {
        this.f48225m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m69380k4(IMathElement iMathElement) {
        if (C7019kk.m27469x1(iMathElement, MathematicalText.class)) {
            return true;
        }
        if (C7019kk.m27469x1(iMathElement, MathDelimiter.class)) {
            MathDelimiter mathDelimiter = (MathDelimiter) iMathElement;
            return C14695vo.m72379k4(mathDelimiter.getSeparatorCharacter()) && C14695vo.m72379k4(mathDelimiter.getBeginningCharacter()) && C14695vo.m72379k4(mathDelimiter.getEndingCharacter()) && m69383x1(iMathElement);
        }
        if (C7019kk.m27469x1(iMathElement, MathNaryOperator.class)) {
            return C14695vo.m72379k4(((MathNaryOperator) iMathElement).getOperator()) && m69383x1(iMathElement);
        }
        if (C7019kk.m27469x1(iMathElement, MathAccent.class)) {
            return C14695vo.m72379k4(((MathAccent) iMathElement).getCharacter()) && m69383x1(iMathElement);
        }
        if (C7019kk.m27469x1(iMathElement, MathBlock.class) || C7019kk.m27469x1(iMathElement, MathFraction.class) || C7019kk.m27469x1(iMathElement, BaseScript.class) || C7019kk.m27469x1(iMathElement, MathRadical.class) || C7019kk.m27469x1(iMathElement, MathFunction.class) || C7019kk.m27469x1(iMathElement, MathArray.class) || C7019kk.m27469x1(iMathElement, MathMatrix.class) || C7019kk.m27469x1(iMathElement, MathLimit.class) || C7019kk.m27469x1(iMathElement, MathBar.class) || C7019kk.m27469x1(iMathElement, MathBox.class)) {
            return m69383x1(iMathElement);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m69381k4(IMathParagraph iMathParagraph) {
        IGenericEnumerator<IMathBlock> it = iMathParagraph.iterator();
        while (it.hasNext()) {
            try {
                if (!m69380k4((MathBlock) it.next())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69389k4(InterfaceC14876z8 interfaceC14876z8, el1 el1Var, AbstractC12024x1[] abstractC12024x1Arr) {
        PortionFormat portionFormat = (PortionFormat) interfaceC14876z8.getControlCharacterProperties().m68977x1();
        if (portionFormat != null) {
            abstractC12024x1Arr[0] = this.f48227x1.invoke(portionFormat);
            return true;
        }
        if (C7019kk.m27469x1(el1Var, b3e.class)) {
            abstractC12024x1Arr[0] = ((b3e) C7019kk.m27452k4((Object) el1Var, b3e.class)).m3978kk();
            return true;
        }
        abstractC12024x1Arr[0] = null;
        return false;
    }
}
