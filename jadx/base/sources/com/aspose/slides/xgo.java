package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13907h0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class xgo {
    /* JADX INFO: renamed from: k4 */
    public final void m73350k4(IMathBlock iMathBlock, AbstractC3150x6 abstractC3150x6) {
        aa8 aa8Var = new aa8();
        aa8Var.m3459k4(1);
        C13907h0 c13907h0 = new C13907h0();
        c13907h0.m65444x1(true);
        c13907h0.m65429k4("\t");
        c13907h0.m65428k4(AbstractC6747ar.m26635ix());
        AbstractC13958qb abstractC13958qbM65799k4 = AbstractC13958qb.m65799k4(abstractC3150x6, c13907h0);
        try {
            abstractC13958qbM65799k4.m65804kk("math", "http://www.w3.org/1998/Math/MathML");
            abstractC13958qbM65799k4.m65806to("display", aa8Var.m3458k4() == 1 ? "block" : "inline");
            aa8Var.m3460k4(true);
            try {
                new bz7(abstractC13958qbM65799k4, aa8Var).m4375k4(iMathBlock);
                abstractC13958qbM65799k4.mo21898jd();
                abstractC13958qbM65799k4.mo21896h4();
                abstractC13958qbM65799k4.dispose();
            } finally {
                aa8Var.m3461kk();
            }
        } catch (Throwable th) {
            if (abstractC13958qbM65799k4 != null) {
                abstractC13958qbM65799k4.dispose();
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final void m73351k4(IMathParagraph iMathParagraph, AbstractC3150x6 abstractC3150x6) {
        aa8 aa8Var = new aa8();
        aa8Var.m3459k4(1);
        C13907h0 c13907h0 = new C13907h0();
        c13907h0.m65444x1(true);
        c13907h0.m65429k4("\t");
        c13907h0.m65428k4(AbstractC6747ar.m26635ix());
        AbstractC13958qb abstractC13958qbM65799k4 = AbstractC13958qb.m65799k4(abstractC3150x6, c13907h0);
        try {
            abstractC13958qbM65799k4.m65804kk("math", "http://www.w3.org/1998/Math/MathML");
            abstractC13958qbM65799k4.m65806to("display", aa8Var.m3458k4() == 1 ? "block" : "inline");
            if (iMathParagraph.getCount() > 0) {
                int justification = iMathParagraph.getJustification();
                String str = justification != 1 ? justification != 2 ? (justification == 3 || justification == 4) ? "center" : null : "right" : "left";
                aa8Var.m3460k4(iMathParagraph.getCount() == 1);
                try {
                    bz7 bz7Var = new bz7(abstractC13958qbM65799k4, aa8Var);
                    if (iMathParagraph.getCount() > 1) {
                        abstractC13958qbM65799k4.m65807up("mtable");
                        abstractC13958qbM65799k4.m65806to("columnalign", str);
                        IGenericEnumerator<IMathBlock> it = iMathParagraph.iterator();
                        while (it.hasNext()) {
                            try {
                                IMathBlock next = it.next();
                                abstractC13958qbM65799k4.m65807up("mtr");
                                abstractC13958qbM65799k4.m65807up("mtd");
                                bz7Var.m4375k4(next);
                                abstractC13958qbM65799k4.mo21898jd();
                                abstractC13958qbM65799k4.mo21898jd();
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
                        abstractC13958qbM65799k4.mo21898jd();
                    } else {
                        bz7Var.m4375k4(iMathParagraph.get_Item(0));
                    }
                    aa8Var.m3461kk();
                } catch (Throwable th2) {
                    aa8Var.m3461kk();
                    throw th2;
                }
            }
            abstractC13958qbM65799k4.mo21898jd();
            abstractC13958qbM65799k4.mo21896h4();
            abstractC13958qbM65799k4.dispose();
        } catch (Throwable th3) {
            if (abstractC13958qbM65799k4 != null) {
                abstractC13958qbM65799k4.dispose();
            }
            throw th3;
        }
    }
}
