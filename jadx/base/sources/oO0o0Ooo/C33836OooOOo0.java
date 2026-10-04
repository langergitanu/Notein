package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0o0o0o.ExecutorC33872OooO00o;

/* JADX INFO: renamed from: oO0o0Ooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33836OooOOo0<T> {
    private volatile AtomicReferenceArray<T> array;

    public C33836OooOOo0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int OooO00o() {
        return this.array.length();
    }

    public final T OooO0O0(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void OooO0OO(int i, ExecutorC33872OooO00o.C20339OooO00o c20339OooO00o) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c20339OooO00o);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c20339OooO00o);
        this.array = atomicReferenceArray2;
    }
}
