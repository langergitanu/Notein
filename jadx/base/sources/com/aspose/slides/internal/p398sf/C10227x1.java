package com.aspose.slides.internal.p398sf;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.sf.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10227x1 implements IGenericCollection<AbstractC10226k4>, IGenericEnumerable<AbstractC10226k4> {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f36667k4 = new ArrayList();

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        this.f36667k4.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public IGenericEnumerator<AbstractC10226k4> iterator() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void addItem(AbstractC10226k4 abstractC10226k4) {
        this.f36667k4.addItem(abstractC10226k4);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public boolean removeItem(AbstractC10226k4 abstractC10226k4) {
        for (AbstractC10226k4 abstractC10226k42 : this.f36667k4) {
            if (abstractC10226k42.equals(abstractC10226k4)) {
                this.f36667k4.removeItem(abstractC10226k42);
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f36667k4.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean containsItem(AbstractC10226k4 abstractC10226k4) {
        Iterator<E> it = this.f36667k4.iterator();
        while (it.hasNext()) {
            if (((AbstractC10226k4) it.next()).equals(abstractC10226k4)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void copyToTArray(AbstractC10226k4[] abstractC10226k4Arr, int i) {
        throw new NotImplementedException();
    }
}
