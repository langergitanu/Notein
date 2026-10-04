package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.e8 */
/* JADX INFO: loaded from: classes5.dex */
public class C13889e8 implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private C13956q3 f46453k4;

    /* JADX INFO: renamed from: kk */
    private int f46454kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13901ga f46455x1 = null;

    public C13889e8(C13956q3 c13956q3) {
        this.f46453k4 = c13956q3;
        this.f46454kk = c13956q3.m65789x1();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f46453k4.m65789x1() != this.f46454kk) {
            throw new InvalidOperationException(C13968ri.m65818k4("The element list has changed. The enumeration operation failed to continue."));
        }
        AbstractC13901ga abstractC13901gaM65786k4 = this.f46453k4.m65786k4(this.f46455x1);
        this.f46455x1 = abstractC13901gaM65786k4;
        return abstractC13901gaM65786k4 != null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final Object next() {
        return this.f46455x1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f46455x1 = null;
        this.f46454kk = this.f46453k4.m65789x1();
    }
}
