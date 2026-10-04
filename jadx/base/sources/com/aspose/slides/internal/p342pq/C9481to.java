package com.aspose.slides.internal.p342pq;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.pq.to */
/* JADX INFO: loaded from: classes4.dex */
public final class C9481to implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator f34537k4;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.aspose.slides.Collections.IEnumerator, org.json.JSONStringer] */
    public C9481to(ArrayList arrayList) {
        this.f34537k4 = arrayList.endObject();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f34537k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C9482x1 next() {
        return (C9482x1) this.f34537k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f34537k4.reset();
    }

    /* JADX INFO: renamed from: x1 */
    public String m46673x1() {
        return next().m46675k4();
    }
}
