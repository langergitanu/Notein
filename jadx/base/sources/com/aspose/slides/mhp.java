package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
final class mhp implements IGenericCollection<ipw> {

    /* JADX INFO: renamed from: k4 */
    private SortedList<String, ipw> f46240k4 = new SortedList<>();

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        ((ICollection) this.f46240k4.getValues()).copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ipw> iterator() {
        return this.f46240k4.getValues().iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ipw> iteratorJava() {
        return this.f46240k4.iteratorJavaValues();
    }

    /* JADX INFO: renamed from: k4 */
    public final ipw m64892k4(String str) {
        if (this.f46240k4.containsKey(str)) {
            return this.f46240k4.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f46240k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64893k4(String str, byte[] bArr, String str2, String str3, C11723d3 c11723d3) {
        if (this.f46240k4.containsKey(str)) {
            return;
        }
        this.f46240k4.addItem(str, new ipw(str, bArr, str2, str3, c11723d3));
    }
}
