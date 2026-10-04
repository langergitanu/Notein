package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MathBlock extends MathElementBase implements IMathBlock, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final ulh f2724k4;

    /* JADX INFO: renamed from: to */
    private MathParagraph f2725to;

    public MathBlock() {
        this.f2724k4 = new ulh();
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: Y_ */
    public boolean mo1971Y_() {
        return true;
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void add(IMathElement iMathElement) {
        MathElementBase mathElementBase = (MathElementBase) iMathElement;
        if (mathElementBase.mo1971Y_()) {
            throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
        }
        mathElementBase.m1986k4(this);
        this.f2724k4.add(iMathElement);
        m1974kk();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void clear() {
        IGenericEnumerator<IMathElement> it = this.f2724k4.iterator();
        while (it.hasNext()) {
            try {
                ((MathElementBase) it.next()).m1987to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f2724k4.clear();
        m1974kk();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final boolean contains(IMathElement iMathElement) {
        return this.f2724k4.contains(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void copyTo(IMathElement[] iMathElementArr, int i) {
        this.f2724k4.copyTo(iMathElementArr, i);
    }

    @Override // com.aspose.slides.IMathBlock
    public final IMathDelimiter delimit(char c) {
        MathDelimiter mathDelimiter = new MathDelimiter(this.f2724k4, null);
        mathDelimiter.setSeparatorCharacter(c);
        mathDelimiter.setBeginningCharacter((char) 0);
        mathDelimiter.setEndingCharacter((char) 0);
        return mathDelimiter;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public IMathDelimiter enclose(char c, char c2) {
        return enclose(c, c2, (char) 0);
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        if (this.f2724k4.getCount() == 0) {
            return MathElementBase.f2751kk;
        }
        IMathElement[] iMathElementArr = new IMathElement[this.f2724k4.getCount()];
        this.f2724k4.copyTo(iMathElementArr, 0);
        return iMathElementArr;
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final int getCount() {
        return this.f2724k4.getCount();
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2725to;
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final IMathElement get_Item(int i) {
        return this.f2724k4.get_Item(i);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final int indexOf(IMathElement iMathElement) {
        return this.f2724k4.indexOf(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void insert(int i, IMathElement iMathElement) {
        if (((MathElementBase) iMathElement).mo1971Y_()) {
            throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
        }
        this.f2724k4.insert(i, iMathElement);
        try {
            ((MathElementBase) iMathElement).m1986k4(this);
            m1974kk();
        } catch (RuntimeException e) {
            this.f2724k4.removeAt(i);
            throw e;
        }
    }

    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IMathElement> iterator() {
        return this.f2724k4.iterator();
    }

    public final IEnumerator iteratorJava() {
        return this.f2724k4.m71730k4();
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public IMathBlock join(IMathElement iMathElement) {
        if (C7019kk.m27469x1(iMathElement, IMathBlock.class)) {
            return joinBlock((IMathBlock) iMathElement);
        }
        add(iMathElement);
        return this;
    }

    @Override // com.aspose.slides.IMathBlock
    public final IMathBlock joinBlock(IMathBlock iMathBlock) {
        int count = iMathBlock.getCount();
        IMathElement[] iMathElementArr = new IMathElement[count];
        iMathBlock.copyTo(iMathElementArr, 0);
        iMathBlock.clear();
        for (int i = 0; i < count; i++) {
            IMathElement iMathElement = iMathElementArr[i];
            this.f2724k4.add(iMathElement);
            ((MathElementBase) iMathElement).m1986k4(this);
        }
        m1974kk();
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1972k4(MathParagraph mathParagraph) {
        if (this.f2725to != null) {
            throw new PptxEditException("It is not possible to set a new math block parent without removing the old one.");
        }
        if (mathParagraph == null) {
            throw new ArgumentNullException("parentImmediate", "To set the value to null you need to call the method ResetParent");
        }
        this.f2725to = mathParagraph;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1974kk() {
        MathParagraph mathParagraph = (MathParagraph) C7019kk.m27452k4((Object) getParent_Immediate(), MathParagraph.class);
        if (mathParagraph != null) {
            mathParagraph.m2000kk();
        }
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final boolean remove(IMathElement iMathElement) {
        boolean zRemove = this.f2724k4.remove(iMathElement);
        if (zRemove) {
            ((MathElementBase) iMathElement).m1987to();
            m1974kk();
        }
        return zRemove;
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void removeAt(int i) {
        IMathElement iMathElement = this.f2724k4.get_Item(i);
        this.f2724k4.removeAt(i);
        ((MathElementBase) iMathElement).m1987to();
        m1974kk();
    }

    public final void set_Item(int i, IMathElement iMathElement) {
        MathElementBase mathElementBase = (MathElementBase) iMathElement;
        if (mathElementBase.mo1971Y_()) {
            throw new InvalidOperationException("Only simple elements that are not containers are allowed as child elements");
        }
        if (C14067j2.m66729x1(this.f2724k4.get_Item(i), iMathElement)) {
            return;
        }
        mathElementBase.m1986k4(this);
        ((MathElementBase) this.f2724k4.get_Item(i)).m1987to();
        this.f2724k4.m71731k4(i, iMathElement);
        m1974kk();
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public IMathArray toMathArray() {
        return new MathArray(this.f2724k4);
    }

    @Override // com.aspose.slides.IMathBlock
    public final void writeAsMathMl(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.MathBlock.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                MathBlock.this.m1973k4(abstractC3150x6);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1975x1() {
        this.f2725to = null;
    }

    public MathBlock(int i) {
        this.f2724k4 = new ulh(i);
    }

    @Override // com.aspose.slides.IMathBlock
    public final IMathDelimiter enclose(char c, char c2, char c3) {
        MathDelimiter mathDelimiter = new MathDelimiter(this.f2724k4, null);
        mathDelimiter.setBeginningCharacter(c);
        mathDelimiter.setSeparatorCharacter(c3);
        mathDelimiter.setEndingCharacter(c2);
        return mathDelimiter;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public IMathBlock join(String str) {
        return join(new MathematicalText(str));
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4379k4(this);
    }

    public MathBlock(IGenericEnumerable<IMathElement> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("mathElements");
        }
        IGenericEnumerator<IMathElement> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                ((MathElementBase) it.next()).m1986k4(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f2724k4 = new ulh(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1973k4(AbstractC3150x6 abstractC3150x6) {
        new xgo().m73350k4(this, abstractC3150x6);
    }

    public MathBlock(IMathElement iMathElement) {
        if (iMathElement == null) {
            throw new ArgumentNullException("mathElement");
        }
        ((MathElementBase) iMathElement).m1986k4(this);
        ulh ulhVar = new ulh();
        this.f2724k4 = ulhVar;
        ulhVar.add(iMathElement);
    }

    public MathBlock(IMathElement iMathElement, boolean z) {
        if (iMathElement == null) {
            throw new ArgumentNullException("mathElement");
        }
        MathElementBase mathElementBase = (MathElementBase) iMathElement;
        mathElementBase.m1987to();
        mathElementBase.m1986k4(this);
        ulh ulhVar = new ulh();
        this.f2724k4 = ulhVar;
        ulhVar.add(iMathElement);
    }
}
