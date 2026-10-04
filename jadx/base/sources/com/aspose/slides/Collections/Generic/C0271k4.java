package com.aspose.slides.Collections.Generic;

/* JADX INFO: renamed from: com.aspose.slides.Collections.Generic.k4 */
/* JADX INFO: loaded from: classes3.dex */
class C0271k4<T> extends Comparer<T> {
    @Override // com.aspose.slides.Collections.Generic.Comparer, java.util.Comparator
    public int compare(T t, T t2) {
        return com.aspose.slides.Collections.Comparer.Default.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C0271k4;
    }

    public int hashCode() {
        return getClass().getName().hashCode();
    }
}
