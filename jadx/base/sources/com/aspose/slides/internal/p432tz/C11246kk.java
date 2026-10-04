package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.kk */
/* JADX INFO: loaded from: classes4.dex */
class C11246kk implements IDictionaryEnumerator {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11249x1 f38797k4;

    /* JADX INFO: renamed from: kk */
    private int f38798kk;

    /* JADX INFO: renamed from: to */
    private Iterator f38799to;

    /* JADX INFO: renamed from: x1 */
    private Map.Entry f38800x1 = null;

    public C11246kk(C11249x1 c11249x1) {
        this.f38797k4 = c11249x1;
        this.f38798kk = c11249x1.getVersion();
        this.f38799to = c11249x1.entrySet().iterator();
    }

    @Override // com.aspose.slides.Collections.IDictionaryEnumerator
    public DictionaryEntry getEntry() {
        Map.Entry entry = this.f38800x1;
        if (entry != null) {
            return new DictionaryEntry(entry.getKey(), this.f38800x1.getValue());
        }
        throw new InvalidOperationException("Enumeration has either not started or has already finished");
    }

    @Override // com.aspose.slides.Collections.IDictionaryEnumerator
    public Object getKey() {
        Map.Entry entry = this.f38800x1;
        if (entry != null) {
            return entry.getKey();
        }
        throw new InvalidOperationException("Enumeration has either not started or has already finished");
    }

    @Override // com.aspose.slides.Collections.IDictionaryEnumerator
    public Object getValue() {
        Map.Entry entry = this.f38800x1;
        if (entry != null) {
            return entry.getValue();
        }
        throw new InvalidOperationException("Enumeration has either not started or has already finished");
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        if (this.f38798kk == this.f38797k4.getVersion()) {
            return this.f38799to.hasNext();
        }
        throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public Object next() {
        Object next = this.f38799to.next();
        this.f38800x1 = (Map.Entry) next;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f38799to.remove();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f38799to = this.f38797k4.entrySet().iterator();
        this.f38800x1 = null;
    }
}
