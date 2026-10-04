package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.u0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14611u0<T, TComparer> implements IGenericEqualityComparer<T> {
    /* JADX INFO: renamed from: kk */
    public static <TObj> int m71464kk(TObj tobj) {
        if (C14067j2.m66729x1(tobj, null)) {
            return 0;
        }
        return tobj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        if (obj == 0 && obj2 == 0) {
            return true;
        }
        if ((obj2 == 0) || (obj == 0)) {
            return false;
        }
        return mo4125k4(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equalsT(T t, T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        if ((t2 == null) || (t == null)) {
            return false;
        }
        return mo4125k4(t, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        if (C14067j2.m66729x1(obj, null)) {
            return 0;
        }
        return mo4124k4(obj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCodeT(T t) {
        if (C14067j2.m66729x1(t, null)) {
            return 0;
        }
        return mo4124k4(t);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo4124k4(T t);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo4125k4(T t, T t2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final int m71465x1(Object obj) {
        if (C14067j2.m66729x1(obj, null)) {
            return 0;
        }
        return mo4124k4(obj);
    }
}
