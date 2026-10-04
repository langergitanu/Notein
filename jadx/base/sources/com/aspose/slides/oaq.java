package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class oaq<T> implements IGenericEqualityComparer<T> {
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        return C14067j2.m66729x1(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equalsT(T t, T t2) {
        return C14067j2.m66729x1(t, t2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        return obj.hashCode();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCodeT(T t) {
        return t.hashCode();
    }
}
