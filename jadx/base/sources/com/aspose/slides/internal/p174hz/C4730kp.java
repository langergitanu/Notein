package com.aspose.slides.internal.p174hz;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.kp */
/* JADX INFO: loaded from: classes.dex */
public final class C4730kp implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private C4747ss f13190k4;

    /* JADX INFO: renamed from: x1 */
    private int f13191x1 = -1;

    public C4730kp(C4747ss c4747ss) {
        this.f13190k4 = c4747ss;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        int i = this.f13191x1 + 1;
        this.f13191x1 = i;
        if (i < this.f13190k4.size()) {
            return true;
        }
        this.f13191x1 = this.f13190k4.size() - 1;
        return false;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4763wp next() {
        int i = this.f13191x1;
        if (i >= 0) {
            return this.f13190k4.m19722k4(i);
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f13191x1 = -1;
    }
}
