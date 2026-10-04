package com.aspose.slides.internal.p158gz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gz.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4427x1<T> implements IGenericEnumerator<T> {

    /* JADX INFO: renamed from: k4 */
    private int f12147k4 = -1;

    /* JADX INFO: renamed from: kk */
    private int f12148kk;

    /* JADX INFO: renamed from: x1 */
    private final T[] f12149x1;

    public C4427x1(T[] tArr, int i) {
        this.f12149x1 = tArr;
        this.f12148kk = i;
        reset();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12147k4;
        if (i + 1 >= this.f12148kk) {
            return false;
        }
        this.f12147k4 = i + 1;
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final T next() {
        return this.f12149x1[this.f12147k4];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f12147k4 = -1;
    }
}
