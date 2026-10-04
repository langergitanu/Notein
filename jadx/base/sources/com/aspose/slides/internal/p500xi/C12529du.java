package com.aspose.slides.internal.p500xi;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12529du implements IGenericList<C12535to> {

    /* JADX INFO: renamed from: k4 */
    private List<C12535to> f41964k4 = new List<>();

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f41964k4.clear();
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
        return m58320k4((C12529du) obj);
    }

    public int hashCode() {
        List<C12535to> list = this.f41964k4;
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
    public final IGenericEnumerator<C12535to> iterator() {
        return this.f41964k4.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int indexOfItem(C12535to c12535to) {
        return this.f41964k4.indexOf(c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(C12535to c12535to) {
        return this.f41964k4.containsItem(c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        this.f41964k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f41964k4.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(C12535to c12535to) {
        return this.f41964k4.removeItem(c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void set_Item(int i, C12535to c12535to) {
        this.f41964k4.set_Item(i, c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C12535to get_Item(int i) {
        return this.f41964k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void addItem(C12535to c12535to) {
        this.f41964k4.addItem(c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void insertItem(int i, C12535to c12535to) {
        this.f41964k4.insertItem(i, c12535to);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(C12535to[] c12535toArr, int i) {
        this.f41964k4.copyToTArray(c12535toArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58320k4(C12529du c12529du) {
        if (c12529du != null && size() == c12529du.size()) {
            for (int i = 0; i < size(); i++) {
                if (!get_Item(i).equals(c12529du.get_Item(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
