package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EqualityComparer<T> implements IGenericEqualityComparer<T> {

    /* JADX INFO: renamed from: k4 */
    static EqualityComparer f1636k4 = new DefaultComparer();

    public static final class DefaultComparer<T> extends EqualityComparer<T> {
        @Override // com.aspose.slides.Collections.Generic.EqualityComparer, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public boolean equalsT(T t, T t2) {
            return t == null ? t2 == null : t.equals(t2);
        }

        @Override // com.aspose.slides.Collections.Generic.EqualityComparer, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public int hashCodeT(T t) {
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }
    }

    public static <T> EqualityComparer<T> getDefault() {
        return f1636k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == 0 || obj2 == 0) {
            return false;
        }
        return equalsT(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public abstract boolean equalsT(T t, T t2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        if (obj == 0) {
            return 0;
        }
        return hashCodeT(obj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public abstract int hashCodeT(T t);
}
