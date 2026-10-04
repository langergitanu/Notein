package com.aspose.slides.internal.p505xn;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p353q7.C9800x6;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12562jd implements IGenericCollection<C9800x6> {

    /* JADX INFO: renamed from: k4 */
    private final SortedDictionary<C9800x6, C9800x6> f42073k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xn.jd$k4 */
    public static class k4 implements Comparator<C9800x6> {

        /* JADX INFO: renamed from: k4 */
        private final Comparator<String> f42074k4;

        public k4(Comparator<String> comparator) {
            this.f42074k4 = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(C9800x6 c9800x6, C9800x6 c9800x62) {
            int iCompare = this.f42074k4.compare(c9800x6.m48303k4(), c9800x62.m48303k4());
            return iCompare != 0 ? iCompare : this.f42074k4.compare(c9800x6.m48309x1(), c9800x62.m48309x1());
        }
    }

    public C12562jd(Comparator<String> comparator) {
        this.f42073k4 = new SortedDictionary<>(new k4(comparator));
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return true;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C9800x6> iterator() {
        return this.f42073k4.getKeys().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addItem(C9800x6 c9800x6) {
        boolean z;
        C9800x6[] c9800x6Arr = {null};
        if (this.f42073k4.tryGetValue(c9800x6, c9800x6Arr)) {
            z = c9800x6Arr[0].m48308to();
        }
        if (z) {
            this.f42073k4.set_Item(c9800x6, c9800x6);
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(C9800x6 c9800x6) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f42073k4.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(C9800x6 c9800x6) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(C9800x6[] c9800x6Arr, int i) {
        throw new NotImplementedException();
    }
}
