package com.aspose.slides.internal.p368qq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.v4 */
/* JADX INFO: loaded from: classes4.dex */
class C9935v4 implements IGenericEnumerator<InterfaceC12359fa> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12359fa f35816k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC9925lr f35817kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC12359fa f35818to;

    /* JADX INFO: renamed from: x1 */
    private int f35819x1;

    public C9935v4(InterfaceC12359fa interfaceC12359fa, AbstractC9925lr abstractC9925lr) {
        this.f35816k4 = interfaceC12359fa;
        this.f35817kk = abstractC9925lr;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f35816k4 = null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f35819x1 >= this.f35816k4.mo57925k4()) {
            return false;
        }
        while (this.f35819x1 < this.f35816k4.mo57925k4()) {
            InterfaceC12359fa interfaceC12359fa = this.f35816k4;
            int i = this.f35819x1;
            this.f35819x1 = i + 1;
            InterfaceC12359fa interfaceC12359faMo57926k4 = interfaceC12359fa.mo57926k4(i);
            AbstractC9925lr abstractC9925lr = this.f35817kk;
            if (abstractC9925lr == null) {
                this.f35818to = interfaceC12359faMo57926k4;
                return true;
            }
            if (!abstractC9925lr.mo48870k4(interfaceC12359faMo57926k4)) {
                this.f35818to = interfaceC12359faMo57926k4;
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final InterfaceC12359fa next() {
        return this.f35818to;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f35819x1 = 0;
    }
}
