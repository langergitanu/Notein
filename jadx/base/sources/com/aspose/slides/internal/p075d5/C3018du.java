package com.aspose.slides.internal.p075d5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.d5.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3018du implements IGenericList<C3023to> {

    /* JADX INFO: renamed from: k4 */
    private List<C3023to> f8848k4 = new List<>();

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f8848k4.clear();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m12696k4((C3018du) obj);
    }

    public int hashCode() {
        List<C3023to> list = this.f8848k4;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C3023to> iterator() {
        return this.f8848k4.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int indexOfItem(C3023to c3023to) {
        return this.f8848k4.indexOf(c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(C3023to c3023to) {
        return this.f8848k4.containsItem(c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        this.f8848k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f8848k4.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(C3023to c3023to) {
        return this.f8848k4.removeItem(c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void set_Item(int i, C3023to c3023to) {
        this.f8848k4.set_Item(i, c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C3023to get_Item(int i) {
        return this.f8848k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void addItem(C3023to c3023to) {
        this.f8848k4.addItem(c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void insertItem(int i, C3023to c3023to) {
        this.f8848k4.insertItem(i, c3023to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(C3023to[] c3023toArr, int i) {
        this.f8848k4.copyToTArray(c3023toArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m12696k4(C3018du c3018du) {
        if (c3018du != null && size() == c3018du.size()) {
            for (int i = 0; i < size(); i++) {
                if (!get_Item(i).equals(c3018du.get_Item(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
