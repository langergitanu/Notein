package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class FontFallBackRulesCollection implements IFontFallBackRulesCollection {

    /* JADX INFO: renamed from: k4 */
    private AbstractC0415k4 f2305k4 = null;

    /* JADX INFO: renamed from: x1 */
    private List<IFontFallBackRule> f2306x1 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.FontFallBackRulesCollection$k4 */
    public static abstract class AbstractC0415k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo1504k4();
    }

    @Override // com.aspose.slides.IFontFallBackRulesCollection
    public final void add(IFontFallBackRule iFontFallBackRule) {
        if (iFontFallBackRule == null) {
            throw new ArgumentNullException("sourceRule", "The FallBack rule for addition wasn't specified!");
        }
        if (this.f2306x1.containsItem(iFontFallBackRule)) {
            throw new ArgumentException("sourceRule", "Same rule can't be added twise!");
        }
        this.f2306x1.addItem(iFontFallBackRule);
        if (this.f2305k4 != null) {
            ((FontFallBackRule) iFontFallBackRule).m1496k4(this);
            m1502k4();
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2306x1.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IFontFallBackRulesCollection
    public final IFontFallBackRule get_Item(int i) {
        return this.f2306x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IFontFallBackRule> iterator() {
        return this.f2306x1.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IFontFallBackRule> iteratorJava() {
        return this.f2306x1.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1502k4() {
        AbstractC0415k4 abstractC0415k4 = this.f2305k4;
        if (abstractC0415k4 != null) {
            abstractC0415k4.mo1504k4();
        }
    }

    @Override // com.aspose.slides.IFontFallBackRulesCollection
    public final void remove(IFontFallBackRule iFontFallBackRule) {
        if (this.f2306x1.containsItem(iFontFallBackRule)) {
            ((FontFallBackRule) iFontFallBackRule).m1501x1(this);
            this.f2306x1.removeItem(iFontFallBackRule);
            m1502k4();
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2306x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1503k4(AbstractC0415k4 abstractC0415k4) {
        this.f2305k4 = abstractC0415k4;
        if (abstractC0415k4 != null) {
            return;
        }
        List.Enumerator<IFontFallBackRule> it = this.f2306x1.iterator();
        while (it.hasNext()) {
            try {
                ((FontFallBackRule) it.next()).m1499to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
