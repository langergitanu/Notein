package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class MathPortion extends Portion implements IMathPortion {

    /* JADX INFO: renamed from: kk */
    private final MathParagraph f2793kk;

    public MathPortion() {
        MathParagraph mathParagraph = new MathParagraph(this);
        this.f2793kk = mathParagraph;
        mathParagraph.m1998k4(true);
    }

    @Override // com.aspose.slides.IMathPortion
    public final IMathParagraph getMathParagraph() {
        return this.f2793kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2002k4() {
        ParagraphCollection paragraphCollection;
        PortionCollection portionCollection = (PortionCollection) C7019kk.m27452k4((Object) getParent_Immediate(), PortionCollection.class);
        if (portionCollection == null || portionCollection.m2300to() == null || (paragraphCollection = (ParagraphCollection) C7019kk.m27452k4((Object) portionCollection.m2300to().getParent_Immediate(), ParagraphCollection.class)) == null || paragraphCollection.m2179kk() == null) {
            return;
        }
        paragraphCollection.m2179kk().m2932x1(true);
    }

    public MathPortion(MathParagraph mathParagraph) {
        if (mathParagraph.getParent_Immediate() != null) {
            throw new PptxEditException("Can't set already used math paragraph");
        }
        mathParagraph.m1996k4(this);
        this.f2793kk = mathParagraph;
    }
}
