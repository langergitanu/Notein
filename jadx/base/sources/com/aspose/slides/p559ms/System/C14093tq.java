package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.tq */
/* JADX INFO: loaded from: classes5.dex */
public class C14093tq<T> extends AbstractC7020m9<C14093tq<T>> {

    /* JADX INFO: renamed from: k4 */
    private T f47336k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f47337x1;

    public C14093tq() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        T t;
        boolean z = obj == null || ((obj instanceof C14093tq) && !((C14093tq) obj).m67302x1());
        if (!this.f47337x1) {
            return z;
        }
        if (z) {
            return false;
        }
        if (obj instanceof C14093tq) {
            t = this.f47336k4;
            obj = ((C14093tq) obj).f47336k4;
        } else {
            t = this.f47336k4;
        }
        return t.equals(obj);
    }

    public int hashCode() {
        if (this.f47337x1) {
            return this.f47336k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final T m67297k4() {
        if (this.f47337x1) {
            return this.f47336k4;
        }
        throw new InvalidOperationException("Nullable object must have a value.");
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C14093tq<T> Clone() {
        C14093tq<T> c14093tq = new C14093tq<>();
        CloneTo((C14093tq) c14093tq);
        return c14093tq;
    }

    public String toString() {
        return !this.f47337x1 ? "" : this.f47336k4.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m67302x1() {
        return this.f47337x1;
    }

    public C14093tq(T t) {
        if (t == null) {
            throw new InvalidOperationException("Nullable object must have a value.");
        }
        this.f47336k4 = t;
        this.f47337x1 = true;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67296x1(C14093tq c14093tq, C14093tq c14093tq2) {
        return !m67295k4(c14093tq, c14093tq2);
    }

    /* JADX INFO: renamed from: k4 */
    public final T m67298k4(Class<?> cls) {
        return m67302x1() ? this.f47336k4 : (T) C7019kk.m27467x1((Class) cls);
    }

    /* JADX INFO: renamed from: k4 */
    public final T m67299k4(T t) {
        return m67302x1() ? this.f47336k4 : t;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14093tq<T> c14093tq) {
        if (c14093tq == null) {
            c14093tq = new C14093tq<>();
        }
        c14093tq.f47337x1 = this.f47337x1;
        c14093tq.f47336k4 = this.f47336k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67295k4(C14093tq c14093tq, C14093tq c14093tq2) {
        if (c14093tq == null || c14093tq2 == null) {
            if (c14093tq == null && c14093tq2 == null) {
                return true;
            }
            return c14093tq == null ? !c14093tq2.f47337x1 : !c14093tq.f47337x1;
        }
        boolean z = c14093tq.f47337x1;
        if (!z && !c14093tq2.f47337x1) {
            return true;
        }
        if ((!z || c14093tq2.f47337x1) && (z || !c14093tq2.f47337x1)) {
            return c14093tq.f47336k4.equals(c14093tq2.f47336k4);
        }
        return false;
    }
}
