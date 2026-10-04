package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
public final class MathArray extends MathElementBase implements IMathArray {

    /* JADX INFO: renamed from: k4 */
    private IMathElementCollection f2719k4;

    /* JADX INFO: renamed from: to */
    private wo2 f2720to;

    public MathArray(IGenericEnumerable<IMathElement> iGenericEnumerable) {
        this(iGenericEnumerable, null);
    }

    @Override // com.aspose.slides.IMathArray
    public final IMathElementCollection getArguments() {
        return this.f2719k4;
    }

    @Override // com.aspose.slides.IMathArray
    public final int getBaseJustification() {
        return this.f2720to.mo72845k4();
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        if (getArguments().getCount() == 0) {
            return MathElementBase.f2751kk;
        }
        IMathElement[] iMathElementArr = new IMathElement[getArguments().getCount()];
        getArguments().copyTo(iMathElementArr, 0);
        return iMathElementArr;
    }

    @Override // com.aspose.slides.IMathArray
    public final boolean getMaximumDistribution() {
        return this.f2720to.mo72854x1();
    }

    @Override // com.aspose.slides.IMathArray
    public final boolean getObjectDistribution() {
        return this.f2720to.mo72849kk();
    }

    @Override // com.aspose.slides.IMathArray
    public final long getRowSpacing() {
        return this.f2720to.mo72843du();
    }

    @Override // com.aspose.slides.IMathArray
    public final int getRowSpacingRule() {
        return this.f2720to.mo72851to();
    }

    /* JADX INFO: renamed from: k4 */
    public final p8h m1968k4() {
        return this.f2720to.m72844h4();
    }

    @Override // com.aspose.slides.IMathArray
    public final void setBaseJustification(int i) {
        this.f2720to.m72846k4(i);
    }

    @Override // com.aspose.slides.IMathArray
    public final void setMaximumDistribution(boolean z) {
        this.f2720to.m72848k4(z);
    }

    @Override // com.aspose.slides.IMathArray
    public final void setObjectDistribution(boolean z) {
        this.f2720to.m72853x1(z);
    }

    @Override // com.aspose.slides.IMathArray
    public final void setRowSpacing(long j) {
        this.f2720to.m72847k4(j);
    }

    @Override // com.aspose.slides.IMathArray
    public final void setRowSpacingRule(int i) {
        this.f2720to.m72852x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1969x1() {
        return this.f2720to.m72850m9();
    }

    public MathArray(IGenericEnumerable<IMathElement> iGenericEnumerable, InterfaceC14779xa interfaceC14779xa) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("elements");
        }
        m1967k4(new ulh(iGenericEnumerable));
        this.f2720to = interfaceC14779xa != null ? new wo2(interfaceC14779xa) : new wo2();
    }

    /* JADX INFO: renamed from: k4 */
    private void m1967k4(IMathElementCollection iMathElementCollection) {
        this.f2719k4 = iMathElementCollection;
    }

    public MathArray(IMathElement iMathElement) {
        if (iMathElement != null && ((MathElementBase) iMathElement).mo1971Y_()) {
            throw new InvalidOperationException("You should use the constructor with an argument for containers (IEnumerable<IMathElement>)");
        }
        m1967k4(new ulh());
        getArguments().add(iMathElement);
        this.f2720to = new wo2();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4377k4(this);
    }
}
