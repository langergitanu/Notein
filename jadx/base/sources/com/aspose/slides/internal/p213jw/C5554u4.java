package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p199j5.InterfaceC5192du;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C5554u4 implements IGenericEnumerator<InterfaceC12777qq> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC5192du f15286k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12777qq f15287x1;

    public C5554u4(InterfaceC5192du interfaceC5192du) {
        if (interfaceC5192du == null) {
            throw new ArgumentNullException("treeWalker");
        }
        this.f15286k4 = interfaceC5192du;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f15286k4.dispose();
        this.f15286k4 = null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        InterfaceC12777qq interfaceC12777qqMo22183du = this.f15286k4.mo22183du();
        this.f15287x1 = interfaceC12777qqMo22183du;
        return interfaceC12777qqMo22183du != null;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final InterfaceC12777qq next() {
        return this.f15286k4.mo22188x1();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        InterfaceC5192du interfaceC5192du = this.f15286k4;
        interfaceC5192du.mo22185k4(interfaceC5192du.mo22184k4());
    }
}
