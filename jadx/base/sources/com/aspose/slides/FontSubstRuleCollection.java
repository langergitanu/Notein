package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class FontSubstRuleCollection implements IFontSubstRuleCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IFontSubstRule> f2327k4 = new List<>();

    @Override // com.aspose.slides.IFontSubstRuleCollection
    public final void add(IFontSubstRule iFontSubstRule) {
        this.f2327k4.addItem(iFontSubstRule);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2327k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IFontSubstRuleCollection
    public final IFontSubstRule get_Item(int i) {
        return this.f2327k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IFontSubstRule> iterator() {
        return this.f2327k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IFontSubstRule> iteratorJava() {
        return this.f2327k4.iteratorJava();
    }

    @Override // com.aspose.slides.IFontSubstRuleCollection
    public final void remove(IFontSubstRule iFontSubstRule) {
        if (this.f2327k4.containsItem(iFontSubstRule)) {
            this.f2327k4.removeItem(iFontSubstRule);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2327k4.size();
    }
}
